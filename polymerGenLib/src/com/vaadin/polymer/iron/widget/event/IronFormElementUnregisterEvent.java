/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the element is removed from an <code>iron-form</code>.</p>
 */
public class IronFormElementUnregisterEvent extends GwtEvent<IronFormElementUnregisterEventHandler> {

    public static Type<IronFormElementUnregisterEventHandler> TYPE = new Type<IronFormElementUnregisterEventHandler>();

    private com.vaadin.polymer.iron.event.IronFormElementUnregisterEvent nativeEvent;

    public IronFormElementUnregisterEvent(com.vaadin.polymer.iron.event.IronFormElementUnregisterEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronFormElementUnregisterEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronFormElementUnregisterEventHandler handler) {
        handler.onIronFormElementUnregister(this);
    }

    public com.vaadin.polymer.iron.event.IronFormElementUnregisterEvent getNativeEvent() {
        return nativeEvent;
    }

}
