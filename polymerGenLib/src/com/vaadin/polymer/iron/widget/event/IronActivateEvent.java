/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 */
public class IronActivateEvent extends GwtEvent<IronActivateEventHandler> {

    public static Type<IronActivateEventHandler> TYPE = new Type<IronActivateEventHandler>();

    private com.vaadin.polymer.iron.event.IronActivateEvent nativeEvent;

    public IronActivateEvent(com.vaadin.polymer.iron.event.IronActivateEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronActivateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronActivateEventHandler handler) {
        handler.onIronActivate(this);
    }

    public com.vaadin.polymer.iron.event.IronActivateEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>the item element</p>
     */
    public JavaScriptObject getItem() {
        return getNativeEvent().getDetail().getItem();
    }

}
