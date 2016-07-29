// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.

#include "raster_layer.hpp"

#include <string>

#include "../conversion/property_value.hpp"

//XXX
#include <mbgl/platform/log.hpp>

namespace mbgl {
namespace android {

    RasterLayer::RasterLayer(jni::JNIEnv& env, jni::String layerId, jni::String sourceId)
        : Layer(env, std::make_unique<mbgl::style::RasterLayer>(jni::Make<std::string>(env, layerId), jni::Make<std::string>(env, sourceId))) {
        mbgl::Log::Debug(mbgl::Event::JNI, "RasterLayer constructed, owning reference");
    }

    RasterLayer::RasterLayer(mbgl::Map& map, mbgl::style::RasterLayer& coreLayer)
        : Layer(map, coreLayer) {

        mbgl::Log::Debug(mbgl::Event::JNI, "RasterLayer Non-owning reference constructor");
    }

    RasterLayer::~RasterLayer() = default;

    // Property getters

    jni::Object<jni::ObjectTag> RasterLayer::getRasterOpacity(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterOpacity());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-opacity': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> RasterLayer::getRasterHueRotate(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterHueRotate());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-hue-rotate': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> RasterLayer::getRasterBrightnessMin(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterBrightnessMin());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-brightness-min': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> RasterLayer::getRasterBrightnessMax(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterBrightnessMax());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-brightness-max': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> RasterLayer::getRasterSaturation(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterSaturation());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-saturation': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> RasterLayer::getRasterContrast(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterContrast());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-contrast': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Object<jni::ObjectTag> RasterLayer::getRasterFadeDuration(jni::JNIEnv& env) {
        using namespace mbgl::android::conversion;

        Result<jni::jobject*> converted = convert<jni::jobject*>(env, layer.as<mbgl::style::RasterLayer>()->RasterLayer::getRasterFadeDuration());

        if (!converted) {
            mbgl::Log::Error(mbgl::Event::JNI, "Error getting property 'raster-fade-duration': " + converted.error().message);
        }

        return jni::Object<jni::ObjectTag>(*converted);
    }

    jni::Class<RasterLayer> RasterLayer::javaClass;

    jni::jobject* RasterLayer::createJavaPeer(jni::JNIEnv& env) {
        static auto constructor = RasterLayer::javaClass.template GetConstructor<jni::jlong>(env);
        return RasterLayer::javaClass.New(env, constructor, reinterpret_cast<jni::jlong>(this));
    }

    void RasterLayer::registerNative(jni::JNIEnv& env) {
        mbgl::Log::Debug(mbgl::Event::JNI, "Registering native background layer");

        //Lookup the class
        RasterLayer::javaClass = *jni::Class<RasterLayer>::Find(env).NewGlobalRef(env).release();

        #define METHOD(MethodPtr, name) jni::MakeNativePeerMethod<decltype(MethodPtr), (MethodPtr)>(name)

        //Register the peer
        jni::RegisterNativePeer<RasterLayer>(
            env, RasterLayer::javaClass, "nativePtr",
            std::make_unique<RasterLayer, JNIEnv&, jni::String, jni::String>,
            "initialize",
            "finalize",
            METHOD(&RasterLayer::getRasterOpacity, "nativeGetRasterOpacity"),
            METHOD(&RasterLayer::getRasterHueRotate, "nativeGetRasterHueRotate"),
            METHOD(&RasterLayer::getRasterBrightnessMin, "nativeGetRasterBrightnessMin"),
            METHOD(&RasterLayer::getRasterBrightnessMax, "nativeGetRasterBrightnessMax"),
            METHOD(&RasterLayer::getRasterSaturation, "nativeGetRasterSaturation"),
            METHOD(&RasterLayer::getRasterContrast, "nativeGetRasterContrast"),
            METHOD(&RasterLayer::getRasterFadeDuration, "nativeGetRasterFadeDuration"));
    }

} // namespace android
} // namespace mbgl
