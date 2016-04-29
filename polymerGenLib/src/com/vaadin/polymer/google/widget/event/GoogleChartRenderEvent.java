/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when the graph is displayed.</p>
 */
public class GoogleChartRenderEvent extends DomEvent<GoogleChartRenderEventHandler> {

    public static Type<GoogleChartRenderEventHandler> TYPE = new Type<GoogleChartRenderEventHandler>(
       com.vaadin.polymer.google.event.GoogleChartRenderEvent.NAME, new GoogleChartRenderEvent());


    public GoogleChartRenderEvent() {
    }

    public Type<GoogleChartRenderEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleChartRenderEventHandler handler) {
        handler.onGoogleChartRender(this);
    }

    public com.vaadin.polymer.google.event.GoogleChartRenderEvent getPolymerEvent() {
        return (com.vaadin.polymer.google.event.GoogleChartRenderEvent)super.getNativeEvent();
    }


}
