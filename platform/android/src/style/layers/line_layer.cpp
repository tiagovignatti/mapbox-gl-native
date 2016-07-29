// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.

#include "line_layer.hpp"

#include <string>

#include "../conversion/property_value.hpp"

//XXX
#include <mbgl/platform/log.hpp>

namespace mbgl {
namespace android {

    LineLayer::LineLayer(jni::JNIEnv& env, jni::String layerId, jni::String sourceId)
        : Layer(env, std::make_unique<mbgl::style::LineLayer>(jni::Make<std::string>(env, layerId), jni::Make<std::string>(env, sourceId))) {
        mbgl::Log::Debug(mbgl::Event::JNI, "LineLayer constructed, owning reference");
    }

    LineLayer::LineLayer(mbgl::Map& map, mbgl::style::LineLayer& coreLayer)
        : Layer(map, coreLayer) {

        mbgl::Log::Debug(mbgl::Event::JNI, "LineLayer Non-owning reference constructor");
    }

    LineLayer::~LineLayer() = default;

    // Property getters

    jni::Object<jni::ObjectTag> LineLayer::getLineCap(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineCap());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-cap': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineJoin(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineJoin());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-join': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineMiterLimit(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineMiterLimit());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-miter-limit': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineRoundLimit(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineRoundLimit());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-round-limit': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineOpacity(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineOpacity());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-opacity': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineColor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineColor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-color': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineTranslate(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineTranslate());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-translate': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineTranslateAnchor(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineTranslateAnchor());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-translate-anchor': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineWidth(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineWidth());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-width': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineGapWidth(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineGapWidth());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-gap-width': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineOffset(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineOffset());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-offset': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineBlur(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineBlur());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-blur': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLineDasharray(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLineDasharray());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-dasharray': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> LineLayer::getLinePattern(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::LineLayer>()->LineLayer::getLinePattern());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'line-pattern': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Class<LineLayer> LineLayer::javaClass;

    jni::jobject* LineLayer::createJavaPeer(jni::JNIEnv& env) {
        static auto constructor = LineLayer::javaClass.template GetConstructor<jni::jlong>(env);
        return LineLayer::javaClass.New(env, constructor, reinterpret_cast<jni::jlong>(this));
    }

    void LineLayer::registerNative(jni::JNIEnv& env) {
        mbgl::Log::Debug(mbgl::Event::JNI, "Registering native background layer");

        //Lookup the class
        LineLayer::javaClass = *jni::Class<LineLayer>::Find(env).NewGlobalRef(env).release();

        #define METHOD(MethodPtr, name) jni::MakeNativePeerMethod<decltype(MethodPtr), (MethodPtr)>(name)

        //Register the peer
        jni::RegisterNativePeer<LineLayer>(
            env, LineLayer::javaClass, "nativePtr",
            std::make_unique<LineLayer, JNIEnv&, jni::String, jni::String>,
            "initialize",
            "finalize",
            METHOD(&LineLayer::getLineCap, "nativeGetLineCap"),
            METHOD(&LineLayer::getLineJoin, "nativeGetLineJoin"),
            METHOD(&LineLayer::getLineMiterLimit, "nativeGetLineMiterLimit"),
            METHOD(&LineLayer::getLineRoundLimit, "nativeGetLineRoundLimit"),
            METHOD(&LineLayer::getLineOpacity, "nativeGetLineOpacity"),
            METHOD(&LineLayer::getLineColor, "nativeGetLineColor"),
            METHOD(&LineLayer::getLineTranslate, "nativeGetLineTranslate"),
            METHOD(&LineLayer::getLineTranslateAnchor, "nativeGetLineTranslateAnchor"),
            METHOD(&LineLayer::getLineWidth, "nativeGetLineWidth"),
            METHOD(&LineLayer::getLineGapWidth, "nativeGetLineGapWidth"),
            METHOD(&LineLayer::getLineOffset, "nativeGetLineOffset"),
            METHOD(&LineLayer::getLineBlur, "nativeGetLineBlur"),
            METHOD(&LineLayer::getLineDasharray, "nativeGetLineDasharray"),
            METHOD(&LineLayer::getLinePattern, "nativeGetLinePattern"));
    }

} // namespace android
} // namespace mbgl
