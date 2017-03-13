/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Wes Alvaro,Sérgio Gomes
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.event;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Fired when the user makes a selection in the chart.</p>
 */
@JsType(isNative=true)
public interface GoogleChartSelectEvent extends Event {

    @JsOverlay static final String NAME = "google-chart-select";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType(isNative=true)
    interface Detail extends Event.Detail {

        /**
         * <p>raw chart object.</p>
         */
        @JsProperty JavaScriptObject getThe();

    }

}
