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
 * <p>Fired when the confirm button is clicked on delete</p>
 */
public class BwtUploaderDeleteEvent extends DomEvent<BwtUploaderDeleteEventHandler> {

    public static Type<BwtUploaderDeleteEventHandler> TYPE = new Type<BwtUploaderDeleteEventHandler>(
       com.vaadin.polymer.bwt.event.BwtUploaderDeleteEvent.NAME, new BwtUploaderDeleteEvent());


    public BwtUploaderDeleteEvent() {
    }

    public Type<BwtUploaderDeleteEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(BwtUploaderDeleteEventHandler handler) {
        handler.onBwtUploaderDelete(this);
    }

    public com.vaadin.polymer.bwt.event.BwtUploaderDeleteEvent getPolymerEvent() {
        return (com.vaadin.polymer.bwt.event.BwtUploaderDeleteEvent)super.getNativeEvent();
    }


}
