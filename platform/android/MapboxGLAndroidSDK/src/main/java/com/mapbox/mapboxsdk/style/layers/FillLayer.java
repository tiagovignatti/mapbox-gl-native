// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Fill Layer
 */
public class FillLayer extends Layer {

    public FillLayer(long nativePtr) {
        super(nativePtr);
    }

    public FillLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

    public void setSourceLayer(String sourceLayer) {
        nativeSetSourceLayer(sourceLayer);
    }

    public void setFilter(Filter.Statement filter) {
        this.setFilter(filter.toArray());
    }

    public void setFilter(Object[] filter) {
        nativeSetFilter(filter);
    }


    // Property getters

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getFillAntialias() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetFillAntialias());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getFillOpacity() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetFillOpacity());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getFillColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetFillColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getFillOutlineColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetFillOutlineColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getFillTranslate() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetFillTranslate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getFillTranslateAnchor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetFillTranslateAnchor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getFillPattern() {
        return (PropertyValue<String>) new PropertyValue(nativeGetFillPattern());
    }

    private native Object nativeGetFillAntialias();

    private native Object nativeGetFillOpacity();

    private native Object nativeGetFillColor();

    private native Object nativeGetFillOutlineColor();

    private native Object nativeGetFillTranslate();

    private native Object nativeGetFillTranslateAnchor();

    private native Object nativeGetFillPattern();

}
