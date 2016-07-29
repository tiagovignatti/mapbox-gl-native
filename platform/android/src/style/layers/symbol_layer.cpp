// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.

#include "symbol_layer.hpp"

#include <string>

#include "../conversion/property_value.hpp"

//XXX
#include <mbgl/platform/log.hpp>

namespace mbgl {
namespace android {

    SymbolLayer::SymbolLayer(jni::JNIEnv& env, jni::String layerId, jni::String sourceId)
        : Layer(env, std::make_unique<mbgl::style::SymbolLayer>(jni::Make<std::string>(env, layerId), jni::Make<std::string>(env, sourceId))) {
        mbgl::Log::Debug(mbgl::Event::JNI, "SymbolLayer constructed, owning reference");
    }

    SymbolLayer::SymbolLayer(mbgl::Map& map, mbgl::style::SymbolLayer& coreLayer)
        : Layer(map, coreLayer) {

        mbgl::Log::Debug(mbgl::Event::JNI, "SymbolLayer Non-owning reference constructor");
    }

    SymbolLayer::~SymbolLayer() = default;

    // Property getters

    jni::Object<jni::ObjectTag> SymbolLayer::getSymbolPlacement(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getSymbolPlacement());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'symbol-placement': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getSymbolSpacing(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getSymbolSpacing());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'symbol-spacing': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getSymbolAvoidEdges(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getSymbolAvoidEdges());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'symbol-avoid-edges': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconAllowOverlap(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconAllowOverlap());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-allow-overlap': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconIgnorePlacement(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconIgnorePlacement());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-ignore-placement': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconOptional(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconOptional());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-optional': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconRotationAlignment(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconRotationAlignment());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-rotation-alignment': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconSize(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconSize());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-size': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconTextFit(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconTextFit());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-text-fit': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconTextFitPadding(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconTextFitPadding());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-text-fit-padding': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconImage(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconImage());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-image': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconRotate(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconRotate());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-rotate': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconPadding(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconPadding());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-padding': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconKeepUpright(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconKeepUpright());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-keep-upright': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconOffset(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconOffset());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-offset': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextPitchAlignment(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextPitchAlignment());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-pitch-alignment': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextRotationAlignment(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextRotationAlignment());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-rotation-alignment': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextField(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextField());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-field': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextFont(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextFont());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-font': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextSize(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextSize());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-size': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextMaxWidth(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextMaxWidth());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-max-width': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextLineHeight(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextLineHeight());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-line-height': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextLetterSpacing(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextLetterSpacing());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-letter-spacing': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextJustify(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextJustify());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-justify': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextAnchor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextAnchor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-anchor': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextMaxAngle(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextMaxAngle());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-max-angle': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextRotate(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextRotate());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-rotate': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextPadding(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextPadding());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-padding': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextKeepUpright(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextKeepUpright());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-keep-upright': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextTransform(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextTransform());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-transform': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextOffset(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextOffset());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-offset': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextAllowOverlap(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextAllowOverlap());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-allow-overlap': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextIgnorePlacement(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextIgnorePlacement());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-ignore-placement': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextOptional(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextOptional());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-optional': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconOpacity(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconOpacity());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-opacity': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconColor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconColor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-color': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconHaloColor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconHaloColor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-halo-color': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconHaloWidth(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconHaloWidth());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-halo-width': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconHaloBlur(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconHaloBlur());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-halo-blur': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconTranslate(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconTranslate());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-translate': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getIconTranslateAnchor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getIconTranslateAnchor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'icon-translate-anchor': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextOpacity(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextOpacity());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-opacity': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextColor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextColor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-color': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextHaloColor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextHaloColor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-halo-color': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextHaloWidth(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextHaloWidth());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-halo-width': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextHaloBlur(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextHaloBlur());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-halo-blur': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextTranslate(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextTranslate());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-translate': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> SymbolLayer::getTextTranslateAnchor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::SymbolLayer>()->SymbolLayer::getTextTranslateAnchor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'text-translate-anchor': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Class<SymbolLayer> SymbolLayer::javaClass;

    jni::jobject* SymbolLayer::createJavaPeer(jni::JNIEnv& env) {
        static auto constructor = SymbolLayer::javaClass.template GetConstructor<jni::jlong>(env);
        return SymbolLayer::javaClass.New(env, constructor, reinterpret_cast<jni::jlong>(this));
    }

    void SymbolLayer::registerNative(jni::JNIEnv& env) {
        mbgl::Log::Debug(mbgl::Event::JNI, "Registering native background layer");

        //Lookup the class
        SymbolLayer::javaClass = *jni::Class<SymbolLayer>::Find(env).NewGlobalRef(env).release();

        #define METHOD(MethodPtr, name) jni::MakeNativePeerMethod<decltype(MethodPtr), (MethodPtr)>(name)

        //Register the peer
        jni::RegisterNativePeer<SymbolLayer>(
            env, SymbolLayer::javaClass, "nativePtr",
            std::make_unique<SymbolLayer, JNIEnv&, jni::String, jni::String>,
            "initialize",
            "finalize",
            METHOD(&SymbolLayer::getSymbolPlacement, "nativeGetSymbolPlacement"),
            METHOD(&SymbolLayer::getSymbolSpacing, "nativeGetSymbolSpacing"),
            METHOD(&SymbolLayer::getSymbolAvoidEdges, "nativeGetSymbolAvoidEdges"),
            METHOD(&SymbolLayer::getIconAllowOverlap, "nativeGetIconAllowOverlap"),
            METHOD(&SymbolLayer::getIconIgnorePlacement, "nativeGetIconIgnorePlacement"),
            METHOD(&SymbolLayer::getIconOptional, "nativeGetIconOptional"),
            METHOD(&SymbolLayer::getIconRotationAlignment, "nativeGetIconRotationAlignment"),
            METHOD(&SymbolLayer::getIconSize, "nativeGetIconSize"),
            METHOD(&SymbolLayer::getIconTextFit, "nativeGetIconTextFit"),
            METHOD(&SymbolLayer::getIconTextFitPadding, "nativeGetIconTextFitPadding"),
            METHOD(&SymbolLayer::getIconImage, "nativeGetIconImage"),
            METHOD(&SymbolLayer::getIconRotate, "nativeGetIconRotate"),
            METHOD(&SymbolLayer::getIconPadding, "nativeGetIconPadding"),
            METHOD(&SymbolLayer::getIconKeepUpright, "nativeGetIconKeepUpright"),
            METHOD(&SymbolLayer::getIconOffset, "nativeGetIconOffset"),
            METHOD(&SymbolLayer::getTextPitchAlignment, "nativeGetTextPitchAlignment"),
            METHOD(&SymbolLayer::getTextRotationAlignment, "nativeGetTextRotationAlignment"),
            METHOD(&SymbolLayer::getTextField, "nativeGetTextField"),
            METHOD(&SymbolLayer::getTextFont, "nativeGetTextFont"),
            METHOD(&SymbolLayer::getTextSize, "nativeGetTextSize"),
            METHOD(&SymbolLayer::getTextMaxWidth, "nativeGetTextMaxWidth"),
            METHOD(&SymbolLayer::getTextLineHeight, "nativeGetTextLineHeight"),
            METHOD(&SymbolLayer::getTextLetterSpacing, "nativeGetTextLetterSpacing"),
            METHOD(&SymbolLayer::getTextJustify, "nativeGetTextJustify"),
            METHOD(&SymbolLayer::getTextAnchor, "nativeGetTextAnchor"),
            METHOD(&SymbolLayer::getTextMaxAngle, "nativeGetTextMaxAngle"),
            METHOD(&SymbolLayer::getTextRotate, "nativeGetTextRotate"),
            METHOD(&SymbolLayer::getTextPadding, "nativeGetTextPadding"),
            METHOD(&SymbolLayer::getTextKeepUpright, "nativeGetTextKeepUpright"),
            METHOD(&SymbolLayer::getTextTransform, "nativeGetTextTransform"),
            METHOD(&SymbolLayer::getTextOffset, "nativeGetTextOffset"),
            METHOD(&SymbolLayer::getTextAllowOverlap, "nativeGetTextAllowOverlap"),
            METHOD(&SymbolLayer::getTextIgnorePlacement, "nativeGetTextIgnorePlacement"),
            METHOD(&SymbolLayer::getTextOptional, "nativeGetTextOptional"),
            METHOD(&SymbolLayer::getIconOpacity, "nativeGetIconOpacity"),
            METHOD(&SymbolLayer::getIconColor, "nativeGetIconColor"),
            METHOD(&SymbolLayer::getIconHaloColor, "nativeGetIconHaloColor"),
            METHOD(&SymbolLayer::getIconHaloWidth, "nativeGetIconHaloWidth"),
            METHOD(&SymbolLayer::getIconHaloBlur, "nativeGetIconHaloBlur"),
            METHOD(&SymbolLayer::getIconTranslate, "nativeGetIconTranslate"),
            METHOD(&SymbolLayer::getIconTranslateAnchor, "nativeGetIconTranslateAnchor"),
            METHOD(&SymbolLayer::getTextOpacity, "nativeGetTextOpacity"),
            METHOD(&SymbolLayer::getTextColor, "nativeGetTextColor"),
            METHOD(&SymbolLayer::getTextHaloColor, "nativeGetTextHaloColor"),
            METHOD(&SymbolLayer::getTextHaloWidth, "nativeGetTextHaloWidth"),
            METHOD(&SymbolLayer::getTextHaloBlur, "nativeGetTextHaloBlur"),
            METHOD(&SymbolLayer::getTextTranslate, "nativeGetTextTranslate"),
            METHOD(&SymbolLayer::getTextTranslateAnchor, "nativeGetTextTranslateAnchor"));
    }

} // namespace android
} // namespace mbgl
