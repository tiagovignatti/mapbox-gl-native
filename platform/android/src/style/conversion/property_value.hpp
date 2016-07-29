#pragma once

#include <mbgl/style/property_value.hpp>
#include "../../conversion/conversion.hpp"
#include "../../conversion/constant.hpp"
#include "types.hpp"

#pragma clang diagnostic ignored "-Wunused-parameter"

//XXX
#include <mbgl/platform/log.hpp>

namespace mbgl {
namespace android {
namespace conversion {

template <class T>
struct Converter<jni::jobject*, mbgl::style::PropertyValue<T>> {

    Result<jni::jobject*> operator()(jni::JNIEnv& env, const mbgl::style::PropertyValue<T>& value) const {

        if(value.isUndefined()) {
            //Return a nullptr representing a Java null value
            mbgl::Log::Debug(mbgl::Event::JNI, "PropertyValue: undefined");
            return {nullptr};
        } else if (value.isConstant()) {
            //Time to convert the constant value
            Result<jni::jobject*> result = convert<jni::jobject*, T>(env, value.asConstant());
            return {*result};
            //return converted;
        } else {
            //Must be a function than
            //TODO
            mbgl::Log::Error(mbgl::Event::JNI, "PropertyValue: Function properties not yet implemented");
            return {nullptr};
        }

    }
};

} // namespace conversion
} // namespace android
} // namespace mbgl