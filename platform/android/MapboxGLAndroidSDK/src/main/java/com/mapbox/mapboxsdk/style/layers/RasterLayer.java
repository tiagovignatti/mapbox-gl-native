// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Raster Layer
 */
public class RasterLayer extends Layer {

    public RasterLayer(long nativePtr) {
        super(nativePtr);
    }

    public RasterLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

    public void setSourceLayer(String sourceLayer) {
        nativeSetSourceLayer(sourceLayer);
    }


    // Property getters

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterOpacity() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterOpacity());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterHueRotate() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterHueRotate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterBrightnessMin() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterBrightnessMin());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterBrightnessMax() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterBrightnessMax());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterSaturation() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterSaturation());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterContrast() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterContrast());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getRasterFadeDuration() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetRasterFadeDuration());
    }

    private native Object nativeGetRasterOpacity();

    private native Object nativeGetRasterHueRotate();

    private native Object nativeGetRasterBrightnessMin();

    private native Object nativeGetRasterBrightnessMax();

    private native Object nativeGetRasterSaturation();

    private native Object nativeGetRasterContrast();

    private native Object nativeGetRasterFadeDuration();

}
