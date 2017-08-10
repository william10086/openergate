package com.componet;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by william on 17-8-10.
 */
public class TimerWatcher {

    private static final ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(5);
    private static final Map<String, KeyFutureTask> cancelableFutureMap = Maps.newConcurrentMap();

    public static void main(String[] args) {

        final String uniqueKey1 = getUUID() + "_1";
        String result1 = null;
        KeyFutureTask futureTask1 = new KeyFutureTask<String>(uniqueKey1, new Runnable(){
            public void run() {
                System.out.println(uniqueKey1 + " ---- start to run ... ");
            }
        }, result1);

        cancelableFutureMap.put(uniqueKey1, futureTask1);
        scheduledExecutor.schedule(futureTask1, 10, TimeUnit.SECONDS);

        final String uniqueKey2 = getUUID() + "_2";
        String result2 = null;
        final KeyFutureTask futureTask2 = new KeyFutureTask<String>(uniqueKey2, new Runnable(){
            public void run() {
                System.out.println(uniqueKey2 + " ---- start to run ... ");
            }
        }, result2);

        cancelableFutureMap.put(uniqueKey2, futureTask2);
        scheduledExecutor.schedule(futureTask2, 10, TimeUnit.SECONDS);

        final String uniqueKey3 = getUUID() + "_3";
        Callable<String> caller = new Callable<String>(){
            public String call() throws Exception {
                System.out.println(uniqueKey3 + " ----caller start to run ...");
                return uniqueKey3 + " ----caller return ok !!!";
            }
        };
        final KeyFutureTask futureTask3 = new KeyFutureTask<String>(uniqueKey3, caller);

        cancelableFutureMap.put(uniqueKey3, futureTask3);
        scheduledExecutor.schedule(futureTask3, 10, TimeUnit.SECONDS);

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cancelableFutureMap.remove(uniqueKey2).cancel(true);
                System.out.println(uniqueKey2 + " ---- canceled 5s later... ");
            }
        }).start();

        new Thread(new Runnable() {
            AtomicInteger counter = new AtomicInteger(0);
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(counter.incrementAndGet() + "s ...");
                    System.out.println("FutureMap size: " + cancelableFutureMap.size());
                    System.out.println("FutureMap: " + cancelableFutureMap.keySet());
                }
            }
        }).start();
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    static class KeyFutureTask<V> extends FutureTask<V> {

        private String uniqueKey;

        public KeyFutureTask(String uniqueKey, Callable<V> callable) {
            super(callable);
            this.uniqueKey = uniqueKey;
        }

        public KeyFutureTask(String uniqueKey, Runnable runnable, V result) {
            super(runnable, result);
            this.uniqueKey = uniqueKey;
        }

        public String getUniqueKey() {
            return uniqueKey;
        }
    }
}
