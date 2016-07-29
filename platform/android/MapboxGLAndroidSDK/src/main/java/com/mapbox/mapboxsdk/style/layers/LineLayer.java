// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Line Layer
 */
public class LineLayer extends Layer {

    public LineLayer(long nativePtr) {
        super(nativePtr);
    }

    public LineLayer(String layerId, String sourceId) {
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
    public PropertyValue<String> getLineCap() {
        return (PropertyValue<String>) new PropertyValue(nativeGetLineCap());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getLineJoin() {
        return (PropertyValue<String>) new PropertyValue(nativeGetLineJoin());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineMiterLimit() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineMiterLimit());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineRoundLimit() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineRoundLimit());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineOpacity() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineOpacity());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getLineColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetLineColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getLineTranslate() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetLineTranslate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getLineTranslateAnchor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetLineTranslateAnchor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineWidth() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineWidth());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineGapWidth() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineGapWidth());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineOffset() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineOffset());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getLineBlur() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetLineBlur());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getLineDasharray() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetLineDasharray());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getLinePattern() {
        return (PropertyValue<String>) new PropertyValue(nativeGetLinePattern());
    }

    private native Object nativeGetLineCap();

    private native Object nativeGetLineJoin();

    private native Object nativeGetLineMiterLimit();

    private native Object nativeGetLineRoundLimit();

    private native Object nativeGetLineOpacity();

    private native Object nativeGetLineColor();

    private native Object nativeGetLineTranslate();

    private native Object nativeGetLineTranslateAnchor();

    private native Object nativeGetLineWidth();

    private native Object nativeGetLineGapWidth();

    private native Object nativeGetLineOffset();

    private native Object nativeGetLineBlur();

    private native Object nativeGetLineDasharray();

    private native Object nativeGetLinePattern();

}
