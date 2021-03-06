// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.

#pragma once

#include "layer.hpp"
#include <mbgl/style/layers/circle_layer.hpp>
#include <jni/jni.hpp>

namespace mbgl {
namespace android {

class CircleLayer : public Layer {
public:

    static constexpr auto Name() { return "com/mapbox/mapboxsdk/style/layers/CircleLayer"; };

    static jni::Class<CircleLayer> javaClass;

    static void registerNative(jni::JNIEnv&);

    CircleLayer(jni::JNIEnv&, jni::String, jni::String);

    CircleLayer(mbgl::Map&, mbgl::style::CircleLayer&);

    ~CircleLayer();

    jni::jobject* createJavaPeer(jni::JNIEnv&);
};

} // namespace android
} // namespace mbgl
