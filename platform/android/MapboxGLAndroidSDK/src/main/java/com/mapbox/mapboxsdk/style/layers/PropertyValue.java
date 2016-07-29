package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Properties for Layer
 */
public class PropertyValue<T> {
    private static final String TAG = PropertyValue.class.getSimpleName();

    public final Object value;

    /* package */ PropertyValue(Object value) {
        this.value = value;
    }

    boolean isNull() {
        return value == null;
    }

    boolean isFunction() {
        return !isNull() && value instanceof Function;
    }

    boolean isValue() {
        return !isNull() && !isFunction();
    }

    @Nullable
    Function<T> getFunction() {
        if (isFunction()) {
            return (Function<T>) value;
        } else {
            Log.w(TAG, "not a function, try value");
            return null;
        }
    }

    @Nullable
    T getValue() {
        if (isFunction()) {
            return (T) value;
        } else {
            Log.w(TAG, "not a value, try function");
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getClass().getSimpleName(), value != null ? value.getClass().getSimpleName() : null);
    }
}
