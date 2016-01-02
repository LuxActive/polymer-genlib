/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the user makes a selection in the chart.</p>
 */
@JsType
public interface GoogleChartSelectEvent extends Event {

    static final String NAME = "google-chart-select";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        /**
         * 
         */
        @JsProperty JavaScriptObject getDetail();

        /**
         * <p>The user-defined selection.</p>
         */
        @JsProperty JsArray getSelection();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(GoogleChartSelectEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((GoogleChartSelectEvent) event);
        }
    }
}
