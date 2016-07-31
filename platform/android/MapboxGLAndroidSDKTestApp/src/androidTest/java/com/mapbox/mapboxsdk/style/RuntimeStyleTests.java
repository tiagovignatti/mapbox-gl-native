package com.mapbox.mapboxsdk.style;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.FillLayer;
import com.mapbox.mapboxsdk.style.layers.NoSuchLayerException;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.sources.VectorSource;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Basic smoke tests for Layer and Source
 */
@RunWith(AndroidJUnit4.class)
public class RuntimeStyleTests {

    @Rule
    public final ActivityTestRule<RuntimeStyleTestActivity> rule = new ActivityTestRule<>(RuntimeStyleTestActivity.class);

    @Test
    public void testGetAddRemoveLayer() {
        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Get initial
                assertNotNull(mapboxMap.getLayer("building"));

                //Remove
                try {
                    mapboxMap.removeLayer("building");
                } catch (NoSuchLayerException e) {
                    assertFalse(true);
                }
                assertNull(mapboxMap.getLayer("building"));

                //Add
                FillLayer layer = new FillLayer("building", "composite");
                layer.setSourceLayer("building");
                mapboxMap.addLayer(layer);

                assertNotNull(mapboxMap.getLayer("building"));

                try {
                    layer.set(PropertyFactory.visibility(Property.VISIBLE));
                    assertTrue("Never reached as the reference is invalid after adding", false);
                } catch (Exception e) {
                    //Expected, reference is no longer valid
                }
            }
        });
    }

    @Test
    public void testAddRemoveSource() {
        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mapboxMap.addSource(new VectorSource("my-source", "mapbox://mapbox.mapbox-terrain-v2"));
                mapboxMap.removeSource("my-source");
            }
        });
    }
}
