/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from bwt-uploader project by Raju Maisnam,Dmytro Hrytsenko,Bhargav Konkathi,Blue Water Tracks Team
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.bwt.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when a response is received.</p>
 */
public class BwtUploaderResponseEvent extends DomEvent<BwtUploaderResponseEventHandler> {

    public static Type<BwtUploaderResponseEventHandler> TYPE = new Type<BwtUploaderResponseEventHandler>(
       com.vaadin.polymer.bwt.event.BwtUploaderResponseEvent.NAME, new BwtUploaderResponseEvent());


    public BwtUploaderResponseEvent() {
    }

    public Type<BwtUploaderResponseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(BwtUploaderResponseEventHandler handler) {
        handler.onBwtUploaderResponse(this);
    }

    public com.vaadin.polymer.bwt.event.BwtUploaderResponseEvent getPolymerEvent() {
        return (com.vaadin.polymer.bwt.event.BwtUploaderResponseEvent)super.getNativeEvent();
    }


}
