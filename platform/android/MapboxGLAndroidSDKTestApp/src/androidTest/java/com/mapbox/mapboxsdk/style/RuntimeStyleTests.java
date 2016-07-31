package com.mapbox.mapboxsdk.style;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.FillLayer;
import com.mapbox.mapboxsdk.style.layers.NoSuchLayerException;
import com.mapbox.mapboxsdk.style.sources.VectorSource;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Basic smoke tests for Layer and Source
 */
@RunWith(AndroidJUnit4.class)
public class RuntimeStyleTests
        extends ActivityInstrumentationTestCase2<RuntimeStyleTestActivity> {

    public RuntimeStyleTests() {
        super(RuntimeStyleTestActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void testGetAddRemoveLayer() {
        getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
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
            }
        });
    }

    @Test
    public void testAddRemoveSource() {
        getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                mapboxMap.addSource(new VectorSource("my-source", "mapbox://mapbox.mapbox-terrain-v2"));
                mapboxMap.removeSource("my-source");
            }
        });
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
