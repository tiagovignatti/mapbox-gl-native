// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Symbol Layer
 */
public class SymbolLayer extends Layer {

    public SymbolLayer(long nativePtr) {
        super(nativePtr);
    }

    public SymbolLayer(String layerId, String sourceId) {
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
    public PropertyValue<String> getSymbolPlacement() {
        return (PropertyValue<String>) new PropertyValue(nativeGetSymbolPlacement());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getSymbolSpacing() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetSymbolSpacing());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getSymbolAvoidEdges() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetSymbolAvoidEdges());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getIconAllowOverlap() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetIconAllowOverlap());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getIconIgnorePlacement() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetIconIgnorePlacement());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getIconOptional() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetIconOptional());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getIconRotationAlignment() {
        return (PropertyValue<String>) new PropertyValue(nativeGetIconRotationAlignment());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getIconSize() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetIconSize());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getIconTextFit() {
        return (PropertyValue<String>) new PropertyValue(nativeGetIconTextFit());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getIconTextFitPadding() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetIconTextFitPadding());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getIconImage() {
        return (PropertyValue<String>) new PropertyValue(nativeGetIconImage());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getIconRotate() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetIconRotate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getIconPadding() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetIconPadding());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getIconKeepUpright() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetIconKeepUpright());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getIconOffset() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetIconOffset());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextPitchAlignment() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextPitchAlignment());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextRotationAlignment() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextRotationAlignment());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextField() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextField());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String[]> getTextFont() {
        return (PropertyValue<String[]>) new PropertyValue(nativeGetTextFont());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextSize() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextSize());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextMaxWidth() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextMaxWidth());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextLineHeight() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextLineHeight());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextLetterSpacing() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextLetterSpacing());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextJustify() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextJustify());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextAnchor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextAnchor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextMaxAngle() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextMaxAngle());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextRotate() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextRotate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextPadding() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextPadding());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getTextKeepUpright() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetTextKeepUpright());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextTransform() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextTransform());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getTextOffset() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetTextOffset());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getTextAllowOverlap() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetTextAllowOverlap());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getTextIgnorePlacement() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetTextIgnorePlacement());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Boolean> getTextOptional() {
        return (PropertyValue<Boolean>) new PropertyValue(nativeGetTextOptional());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getIconOpacity() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetIconOpacity());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getIconColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetIconColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getIconHaloColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetIconHaloColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getIconHaloWidth() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetIconHaloWidth());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getIconHaloBlur() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetIconHaloBlur());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getIconTranslate() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetIconTranslate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getIconTranslateAnchor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetIconTranslateAnchor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextOpacity() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextOpacity());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextHaloColor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextHaloColor());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextHaloWidth() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextHaloWidth());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float> getTextHaloBlur() {
        return (PropertyValue<Float>) new PropertyValue(nativeGetTextHaloBlur());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<Float[]> getTextTranslate() {
        return (PropertyValue<Float[]>) new PropertyValue(nativeGetTextTranslate());
    }

    @SuppressWarnings("unchecked")
    public PropertyValue<String> getTextTranslateAnchor() {
        return (PropertyValue<String>) new PropertyValue(nativeGetTextTranslateAnchor());
    }

    private native Object nativeGetSymbolPlacement();

    private native Object nativeGetSymbolSpacing();

    private native Object nativeGetSymbolAvoidEdges();

    private native Object nativeGetIconAllowOverlap();

    private native Object nativeGetIconIgnorePlacement();

    private native Object nativeGetIconOptional();

    private native Object nativeGetIconRotationAlignment();

    private native Object nativeGetIconSize();

    private native Object nativeGetIconTextFit();

    private native Object nativeGetIconTextFitPadding();

    private native Object nativeGetIconImage();

    private native Object nativeGetIconRotate();

    private native Object nativeGetIconPadding();

    private native Object nativeGetIconKeepUpright();

    private native Object nativeGetIconOffset();

    private native Object nativeGetTextPitchAlignment();

    private native Object nativeGetTextRotationAlignment();

    private native Object nativeGetTextField();

    private native Object nativeGetTextFont();

    private native Object nativeGetTextSize();

    private native Object nativeGetTextMaxWidth();

    private native Object nativeGetTextLineHeight();

    private native Object nativeGetTextLetterSpacing();

    private native Object nativeGetTextJustify();

    private native Object nativeGetTextAnchor();

    private native Object nativeGetTextMaxAngle();

    private native Object nativeGetTextRotate();

    private native Object nativeGetTextPadding();

    private native Object nativeGetTextKeepUpright();

    private native Object nativeGetTextTransform();

    private native Object nativeGetTextOffset();

    private native Object nativeGetTextAllowOverlap();

    private native Object nativeGetTextIgnorePlacement();

    private native Object nativeGetTextOptional();

    private native Object nativeGetIconOpacity();

    private native Object nativeGetIconColor();

    private native Object nativeGetIconHaloColor();

    private native Object nativeGetIconHaloWidth();

    private native Object nativeGetIconHaloBlur();

    private native Object nativeGetIconTranslate();

    private native Object nativeGetIconTranslateAnchor();

    private native Object nativeGetTextOpacity();

    private native Object nativeGetTextColor();

    private native Object nativeGetTextHaloColor();

    private native Object nativeGetTextHaloWidth();

    private native Object nativeGetTextHaloBlur();

    private native Object nativeGetTextTranslate();

    private native Object nativeGetTextTranslateAnchor();

}
