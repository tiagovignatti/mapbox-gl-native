// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.*;

/**
 * Basic smoke tests for SymbolLayer
 */
@RunWith(AndroidJUnit4.class)
public class SymbolLayerTest {
    private static final String TAG = SymbolLayerTest.class.getSimpleName();

    @Rule
    public final ActivityTestRule<RuntimeStyleTestActivity> rule = new ActivityTestRule<>(RuntimeStyleTestActivity.class);

    private SymbolLayer layer;

    @Before
    public void setUp() throws Exception {
        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                Log.i(TAG, "Adding layer");
                layer = new SymbolLayer("my-layer", "composite");
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
}
