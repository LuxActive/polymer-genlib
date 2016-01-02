/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the graph is displayed.</p>
 */
public class GoogleChartRenderEvent extends GwtEvent<GoogleChartRenderEventHandler> {

    public static Type<GoogleChartRenderEventHandler> TYPE = new Type<GoogleChartRenderEventHandler>();

    private com.vaadin.polymer.google.event.GoogleChartRenderEvent nativeEvent;

    public GoogleChartRenderEvent(com.vaadin.polymer.google.event.GoogleChartRenderEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<GoogleChartRenderEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleChartRenderEventHandler handler) {
        handler.onGoogleChartRender(this);
    }

    public com.vaadin.polymer.google.event.GoogleChartRenderEvent getNativeEvent() {
        return nativeEvent;
    }

}
