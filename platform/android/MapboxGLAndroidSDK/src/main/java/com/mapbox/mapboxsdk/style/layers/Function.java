package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.NonNull;
import android.support.annotation.Size;

import java.util.HashMap;
import java.util.Map;

public class Function<T> {

    public static class Stop<I, O> {
        public final I in;
        public final Property<O> out;

        Stop(I in, Property<O> out) {
            this.in = in;
            this.out = out;
        }

        Object[] toValueObject() {
            return new Object[]{in, out.value};
        }
    }

    @SafeVarargs
    public static <T> Function<T> zoom(@NonNull @Size(min = 1) Stop<Float, T>... stops) {
        return new Function<T>(stops);
    }

    public static <T> Stop<Float, T> stop(float in, Property<T> output) {
        return new Stop<>(in, output);
    }

    private final Stop<Float, T>[] stops;

    Function(@NonNull @Size(min = 1) Stop<Float, T>[] stops) {
        this.stops = stops;
    }

    Map<String, Object> toValueObject() {
        Object[] stopsValue = new Object[stops.length];

        for (int i = 0; i < stopsValue.length; i++) {
            Stop stop = stops[i];
            stopsValue[i] = stop.toValueObject();
        }

        Map<String, Object> value = new HashMap<>();
        value.put("stops", stopsValue);
        return value;
    }
}
