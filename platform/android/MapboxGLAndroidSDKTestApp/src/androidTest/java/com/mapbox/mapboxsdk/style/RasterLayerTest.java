// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.RasterLayer;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.*;

/**
 * Basic smoke tests for RasterLayer
 */
@RunWith(AndroidJUnit4.class)
public class RasterLayerTest {
    private static final String TAG = RasterLayerTest.class.getSimpleName();

    @Rule
    public final ActivityTestRule<RuntimeStyleTestActivity> rule = new ActivityTestRule<>(RuntimeStyleTestActivity.class);

    private RasterLayer layer;

    @Before
    public void setUp() throws Exception {
        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                Log.i(TAG, "Adding layer");
                layer = new RasterLayer("my-layer", "composite");
                layer.setSourceLayer("composite");
                mapboxMap.addLayer(layer);
                //Layer reference is now stale, get new reference
                layer = mapboxMap.getLayerAs("my-layer");
            }
        });
    }

    @Test
    public void testSetVisibility() {
        Log.i(TAG, "visibility");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {

                //Get initial
                assertEquals(layer.getVisibility().getValue(), VISIBLE);

                //Set
                layer.set(visibility(NONE));
                assertEquals(layer.getVisibility().getValue(), NONE);
            }
        });
    }

    @Test
    public void testRasterOpacity() {
        Log.i(TAG, "raster-opacity");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterOpacity(0.3f));
                assertEquals((Float) layer.getRasterOpacity().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testRasterHueRotate() {
        Log.i(TAG, "raster-hue-rotate");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterHueRotate(0.3f));
                assertEquals((Float) layer.getRasterHueRotate().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testRasterBrightnessMin() {
        Log.i(TAG, "raster-brightness-min");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterBrightnessMin(0.3f));
                assertEquals((Float) layer.getRasterBrightnessMin().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testRasterBrightnessMax() {
        Log.i(TAG, "raster-brightness-max");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterBrightnessMax(0.3f));
                assertEquals((Float) layer.getRasterBrightnessMax().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testRasterSaturation() {
        Log.i(TAG, "raster-saturation");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterSaturation(0.3f));
                assertEquals((Float) layer.getRasterSaturation().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testRasterContrast() {
        Log.i(TAG, "raster-contrast");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterContrast(0.3f));
                assertEquals((Float) layer.getRasterContrast().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testRasterFadeDuration() {
        Log.i(TAG, "raster-fade-duration");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(rasterFadeDuration(0.3f));
                assertEquals((Float) layer.getRasterFadeDuration().getValue(), (Float) 0.3f);
            }
        });
    }

}
