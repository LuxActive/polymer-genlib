/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the graph is displayed.</p>
 */
@JsType
public interface GoogleChartRenderEvent extends Event {

    static final String NAME = "google-chart-render";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(GoogleChartRenderEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((GoogleChartRenderEvent) event);
        }
    }
}
