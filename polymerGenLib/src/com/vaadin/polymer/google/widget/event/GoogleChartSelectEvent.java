/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the user makes a selection in the chart.</p>
 */
public class GoogleChartSelectEvent extends GwtEvent<GoogleChartSelectEventHandler> {

    public static Type<GoogleChartSelectEventHandler> TYPE = new Type<GoogleChartSelectEventHandler>();

    private com.vaadin.polymer.google.event.GoogleChartSelectEvent nativeEvent;

    public GoogleChartSelectEvent(com.vaadin.polymer.google.event.GoogleChartSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<GoogleChartSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleChartSelectEventHandler handler) {
        handler.onGoogleChartSelect(this);
    }

    public com.vaadin.polymer.google.event.GoogleChartSelectEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>The user-defined selection.</p>
     */
    public JsArray getSelection() {
        return getNativeEvent().getDetail().getSelection();
    }

}
