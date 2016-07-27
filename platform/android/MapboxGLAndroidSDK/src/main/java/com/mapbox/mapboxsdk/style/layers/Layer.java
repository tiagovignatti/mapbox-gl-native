package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Base class for the different Layer types
 */
public abstract class Layer {

    private long nativePtr;

    public Layer(long nativePtr) {
        Log.i(Layer.class.getSimpleName(), "Native pointer constructor: " + nativePtr);
        this.nativePtr = nativePtr;
    }

    public Layer() {
        Log.i(Layer.class.getSimpleName(), "Default constructor");
    }

    public void set(@NonNull Property<?>... properties) {
        if (properties.length == 0) {
            return;
        }

        boolean updateClasses = false;
        for (Property<?> property : properties) {
            if (property instanceof PaintProperty) {
                updateClasses = true;
                nativeSetPaintProperty(property.name, convertValue(property.value));
            } else {
                nativeSetLayoutProperty(property.name, convertValue(property.value));
            }
        }

        nativeUpdateStyle(updateClasses);
    }

    public String getId() {
        return nativeGetId();
    }

    public float getMinZoom() {
        return nativeGetMinZoom();
    }

    public float getMaxZoom() {
        return nativeGetMaxZoom();
    }

    public void setMinZoom(float zoom) {
        nativeSetMinZoom(zoom);
    }

    public void setMaxZoom(float zoom) {
        nativeSetMaxZoom(zoom);
    }

    @Override
    protected native void finalize() throws Throwable;

    protected native String nativeGetId();

    protected native void nativeSetLayoutProperty(String name, Object value);

    protected native void nativeSetPaintProperty(String name, Object value);

    protected native void nativeSetFilter(Object[] filter);

    protected native void nativeSetSourceLayer(String sourceLayer);

    protected native void nativeUpdateStyle(boolean updateClasses);

    protected native float nativeGetMinZoom();

    protected native float nativeGetMaxZoom();

    protected native void nativeSetMinZoom(float zoom);

    protected native void nativeSetMaxZoom(float zoom);

    @Override
    public String toString() {
        return "Layer: " + getId();
    }

    public long getNativePtr() {
        return nativePtr;
    }

    private Object convertValue(Object value) {
        return value != null && value instanceof Function ? ((Function) value).toValueObject() : value;
    }

}
