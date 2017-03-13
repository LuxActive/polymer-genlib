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
 * <p>Fired when the user makes a selection in the chart.</p>
 */
public class GoogleChartSelectEvent extends DomEvent<GoogleChartSelectEventHandler> {

    public static Type<GoogleChartSelectEventHandler> TYPE = new Type<GoogleChartSelectEventHandler>(
       com.vaadin.polymer.google.event.GoogleChartSelectEvent.NAME, new GoogleChartSelectEvent());


    public GoogleChartSelectEvent() {
    }

    public Type<GoogleChartSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(GoogleChartSelectEventHandler handler) {
        handler.onGoogleChartSelect(this);
    }

    public com.vaadin.polymer.google.event.GoogleChartSelectEvent getPolymerEvent() {
        return (com.vaadin.polymer.google.event.GoogleChartSelectEvent)super.getNativeEvent();
    }


    /**
     * <p>raw chart object.</p>
     */
    public JavaScriptObject getThe() {
        return getPolymerEvent().getDetail().getThe();
    }

}
