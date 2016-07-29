// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Circle Layer
 */
public class CircleLayer extends Layer {

    public CircleLayer(long nativePtr) {
        super(nativePtr);
    }

    public CircleLayer(String layerId, String sourceId) {
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
    public PropertyValue<Float> getCircleRadius() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetCircleRadius());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getCircleColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetCircleColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getCircleBlur() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetCircleBlur());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getCircleOpacity() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetCircleOpacity());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getCircleTranslate() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetCircleTranslate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getCircleTranslateAnchor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetCircleTranslateAnchor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getCirclePitchScale() {
        return (PropertyValue<String>) new PropertyValue(nativeGetCirclePitchScale());
    }

    private native Object nativeGetCircleRadius();

    private native Object nativeGetCircleColor();

    private native Object nativeGetCircleBlur();

    private native Object nativeGetCircleOpacity();

    private native Object nativeGetCircleTranslate();

    private native Object nativeGetCircleTranslateAnchor();

    private native Object nativeGetCirclePitchScale();

}
