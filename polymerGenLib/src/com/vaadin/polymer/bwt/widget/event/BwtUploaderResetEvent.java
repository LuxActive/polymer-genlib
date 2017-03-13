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
 * <p>Fired when the whole component is reset to initial state</p>
 */
public class BwtUploaderResetEvent extends DomEvent<BwtUploaderResetEventHandler> {

    public static Type<BwtUploaderResetEventHandler> TYPE = new Type<BwtUploaderResetEventHandler>(
       com.vaadin.polymer.bwt.event.BwtUploaderResetEvent.NAME, new BwtUploaderResetEvent());


    public BwtUploaderResetEvent() {
    }

    public Type<BwtUploaderResetEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(BwtUploaderResetEventHandler handler) {
        handler.onBwtUploaderReset(this);
    }

    public com.vaadin.polymer.bwt.event.BwtUploaderResetEvent getPolymerEvent() {
        return (com.vaadin.polymer.bwt.event.BwtUploaderResetEvent)super.getNativeEvent();
    }


}
