// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.style.layers.FillLayer;
import com.mapbox.mapboxsdk.testapp.R;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;
import com.mapbox.mapboxsdk.testapp.espresso.BaseTest;
import com.mapbox.mapboxsdk.testapp.espresso.utils.OnMapReadyIdlingResource;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.*;

/**
 * Basic smoke tests for FillLayer
 */
@RunWith(AndroidJUnit4.class)
public class FillLayerTest extends BaseTest {
    private static final String TAG = FillLayerTest.class.getSimpleName();

    @Rule
    public final ActivityTestRule<RuntimeStyleTestActivity> rule = new ActivityTestRule<>(RuntimeStyleTestActivity.class);

    private FillLayer layer;

    private OnMapReadyIdlingResource idlingResource;

    private MapboxMap mapboxMap;

    @Before
    public void setup() {
        idlingResource = new OnMapReadyIdlingResource(rule.getActivity());
        Espresso.registerIdlingResources(idlingResource);
    }

    @Test
    public void testSetVisibility() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "visibility");
        assertNotNull(layer);

        //Get initial
        assertEquals(layer.getVisibility().getValue(), VISIBLE);

        //Set
        layer.set(visibility(NONE));
        assertEquals(layer.getVisibility().getValue(), NONE);
    }

    @Test
    public void testFillAntialias() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-antialias");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillAntialias(true));
        assertEquals((Boolean) layer.getFillAntialias().getValue(), (Boolean) true);
    }

    @Test
    public void testFillOpacity() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-opacity");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillOpacity(0.3f));
        assertEquals((Float) layer.getFillOpacity().getValue(), (Float) 0.3f);
    }

    @Test
    public void testFillColor() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-color");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillColor("#000000"));
        assertEquals((String) layer.getFillColor().getValue(), (String) "#000000");
    }

    @Test
    public void testFillOutlineColor() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-outline-color");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillOutlineColor("undefined"));
        assertEquals((String) layer.getFillOutlineColor().getValue(), (String) "undefined");
    }

    @Test
    public void testFillTranslate() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-translate");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillTranslate(new Float[]{0f,0f}));
        assertEquals((Float[]) layer.getFillTranslate().getValue(), (Float[]) new Float[]{0f,0f});
    }

    @Test
    public void testFillTranslateAnchor() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-translate-anchor");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillTranslateAnchor(FILL_TRANSLATE_ANCHOR_MAP));
        assertEquals((String) layer.getFillTranslateAnchor().getValue(), (String) FILL_TRANSLATE_ANCHOR_MAP);
    }

    @Test
    public void testFillPattern() {
        checkViewIsDisplayed(R.id.mapView);

        mapboxMap = rule.getActivity().getMapboxMap();

        if ((layer = mapboxMap.getLayerAs("my-layer")) == null) {
            Log.i(TAG, "Adding layer");
            layer = new FillLayer("my-layer", "composite");
            layer.setSourceLayer("composite");
            mapboxMap.addLayer(layer);
            //Layer reference is now stale, get new reference
            layer = mapboxMap.getLayerAs("my-layer");
        }
        Log.i(TAG, "fill-pattern");
        assertNotNull(layer);

        //Set and Get
        layer.set(fillPattern("pedestrian-polygon"));
        assertEquals((String) layer.getFillPattern().getValue(), (String) "pedestrian-polygon");
    }


   @After
   public void unregisterIntentServiceIdlingResource() {
       Espresso.unregisterIdlingResources(idlingResource);
   }
}
