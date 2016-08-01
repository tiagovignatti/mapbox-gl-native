// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.*;

/**
 * Basic smoke tests for CircleLayer
 */
@RunWith(AndroidJUnit4.class)
public class CircleLayerTest {
    private static final String TAG = CircleLayerTest.class.getSimpleName();

    @Rule
    public final ActivityTestRule<RuntimeStyleTestActivity> rule = new ActivityTestRule<>(RuntimeStyleTestActivity.class);

    private CircleLayer layer;

    @Before
    public void setUp() throws Exception {
        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                Log.i(TAG, "Adding layer");
                layer = new CircleLayer("my-layer", "composite");
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
    public void testCircleRadius() {
        Log.i(TAG, "circle-radius");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circleRadius(0.3f));
                assertEquals((Float) layer.getCircleRadius().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testCircleColor() {
        Log.i(TAG, "circle-color");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circleColor("#000000"));
                assertEquals((String) layer.getCircleColor().getValue(), (String) "#000000");
            }
        });
    }

    @Test
    public void testCircleBlur() {
        Log.i(TAG, "circle-blur");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circleBlur(0.3f));
                assertEquals((Float) layer.getCircleBlur().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testCircleOpacity() {
        Log.i(TAG, "circle-opacity");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circleOpacity(0.3f));
                assertEquals((Float) layer.getCircleOpacity().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testCircleTranslate() {
        Log.i(TAG, "circle-translate");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circleTranslate(new Float[]{0f,0f}));
                assertEquals((Float[]) layer.getCircleTranslate().getValue(), (Float[]) new Float[]{0f,0f});
            }
        });
    }

    @Test
    public void testCircleTranslateAnchor() {
        Log.i(TAG, "circle-translate-anchor");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circleTranslateAnchor(CIRCLE_TRANSLATE_ANCHOR_MAP));
                assertEquals((String) layer.getCircleTranslateAnchor().getValue(), (String) CIRCLE_TRANSLATE_ANCHOR_MAP);
            }
        });
    }

    @Test
    public void testCirclePitchScale() {
        Log.i(TAG, "circle-pitch-scale");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(circlePitchScale(CIRCLE_PITCH_SCALE_MAP));
                assertEquals((String) layer.getCirclePitchScale().getValue(), (String) CIRCLE_PITCH_SCALE_MAP);
            }
        });
    }

}
