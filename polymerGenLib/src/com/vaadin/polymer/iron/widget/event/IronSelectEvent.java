/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-swipeable-pages project by Pascal Gula aka MeTaNoV <pascal.gula@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Fired when an item is selected</p>
 */
public class IronSelectEvent extends DomEvent<IronSelectEventHandler> {

    public static Type<IronSelectEventHandler> TYPE = new Type<IronSelectEventHandler>(
       com.vaadin.polymer.iron.event.IronSelectEvent.NAME, new IronSelectEvent());


    public IronSelectEvent() {
    }

    public Type<IronSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronSelectEventHandler handler) {
        handler.onIronSelect(this);
    }

    public com.vaadin.polymer.iron.event.IronSelectEvent getPolymerEvent() {
        return (com.vaadin.polymer.iron.event.IronSelectEvent)super.getNativeEvent();
    }


    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getPolymerEvent().getDetail().getDetail();
    }

    /**
     * <p>the item element</p>
     */
    public JavaScriptObject getItem() {
        return getPolymerEvent().getDetail().getItem();
    }

}
