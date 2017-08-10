package com.william.domain.model;

import java.io.Serializable;

/**
 * Created by william on 17-7-28.
 */
public interface ValueObject<T> extends Serializable {

    boolean sameValueAs(T other);

}
