/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Wes Alvaro,Sérgio Gomes
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired after a chart type is rendered and ready for interaction.</p>
 */
public class GoogleChartReadyEvent extends DomEvent<GoogleChartReadyEventHandler> {

    public static Type<GoogleChartReadyEventHandler> TYPE = new Type<GoogleChartReadyEventHandler>(
       com.vaadin.polymer.google.event.GoogleChartReadyEvent.NAME, new GoogleChartReadyEvent());


    public GoogleChartReadyEvent() {
    }

    public Type<GoogleChartReadyEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleChartReadyEventHandler handler) {
        handler.onGoogleChartReady(this);
    }

    public com.vaadin.polymer.google.event.GoogleChartReadyEvent getPolymerEvent() {
        return (com.vaadin.polymer.google.event.GoogleChartReadyEvent)super.getNativeEvent();
    }


    /**
     * <p>raw chart object.</p>
     */
    public JavaScriptObject getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
