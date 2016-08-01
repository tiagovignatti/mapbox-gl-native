// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make style-code-android`.
package com.mapbox.mapboxsdk.style;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.LineLayer;
import com.mapbox.mapboxsdk.testapp.activity.style.RuntimeStyleTestActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static com.mapbox.mapboxsdk.style.layers.Property.*;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.*;

/**
 * Basic smoke tests for LineLayer
 */
@RunWith(AndroidJUnit4.class)
public class LineLayerTest {
    private static final String TAG = LineLayerTest.class.getSimpleName();

    @Rule
    public final ActivityTestRule<RuntimeStyleTestActivity> rule = new ActivityTestRule<>(RuntimeStyleTestActivity.class);

    private LineLayer layer;

    @Before
    public void setUp() throws Exception {
        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                Log.i(TAG, "Adding layer");
                layer = new LineLayer("my-layer", "composite");
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
    public void testLineCap() {
        Log.i(TAG, "line-cap");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineCap(LINE_CAP_BUTT));
                assertEquals((String) layer.getLineCap().getValue(), (String) LINE_CAP_BUTT);
            }
        });
    }

    @Test
    public void testLineJoin() {
        Log.i(TAG, "line-join");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineJoin(LINE_JOIN_BEVEL));
                assertEquals((String) layer.getLineJoin().getValue(), (String) LINE_JOIN_BEVEL);
            }
        });
    }

    @Test
    public void testLineMiterLimit() {
        Log.i(TAG, "line-miter-limit");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineMiterLimit(0.3f));
                assertEquals((Float) layer.getLineMiterLimit().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineRoundLimit() {
        Log.i(TAG, "line-round-limit");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineRoundLimit(0.3f));
                assertEquals((Float) layer.getLineRoundLimit().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineOpacity() {
        Log.i(TAG, "line-opacity");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineOpacity(0.3f));
                assertEquals((Float) layer.getLineOpacity().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineColor() {
        Log.i(TAG, "line-color");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineColor("#000000"));
                assertEquals((String) layer.getLineColor().getValue(), (String) "#000000");
            }
        });
    }

    @Test
    public void testLineTranslate() {
        Log.i(TAG, "line-translate");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineTranslate(new Float[]{0f,0f}));
                assertEquals((Float[]) layer.getLineTranslate().getValue(), (Float[]) new Float[]{0f,0f});
            }
        });
    }

    @Test
    public void testLineTranslateAnchor() {
        Log.i(TAG, "line-translate-anchor");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineTranslateAnchor(LINE_TRANSLATE_ANCHOR_MAP));
                assertEquals((String) layer.getLineTranslateAnchor().getValue(), (String) LINE_TRANSLATE_ANCHOR_MAP);
            }
        });
    }

    @Test
    public void testLineWidth() {
        Log.i(TAG, "line-width");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineWidth(0.3f));
                assertEquals((Float) layer.getLineWidth().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineGapWidth() {
        Log.i(TAG, "line-gap-width");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineGapWidth(0.3f));
                assertEquals((Float) layer.getLineGapWidth().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineOffset() {
        Log.i(TAG, "line-offset");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineOffset(0.3f));
                assertEquals((Float) layer.getLineOffset().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineBlur() {
        Log.i(TAG, "line-blur");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineBlur(0.3f));
                assertEquals((Float) layer.getLineBlur().getValue(), (Float) 0.3f);
            }
        });
    }

    @Test
    public void testLineDasharray() {
        Log.i(TAG, "line-dasharray");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(lineDasharray(new Float[]{}));
                assertEquals((Float[]) layer.getLineDasharray().getValue(), (Float[]) new Float[]{});
            }
        });
    }

    @Test
    public void testLinePattern() {
        Log.i(TAG, "line-pattern");
        assertNotNull(layer);

        rule.getActivity().mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                //Set and Get
                layer.set(linePattern("pedestrian-polygon"));
                assertEquals((String) layer.getLinePattern().getValue(), (String) "pedestrian-polygon");
            }
        });
    }

}
