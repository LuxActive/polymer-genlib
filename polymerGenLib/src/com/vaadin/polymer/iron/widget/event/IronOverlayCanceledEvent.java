/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the <code>iron-overlay</code> is canceled, but before it is closed.<br>Cancel the event to prevent the <code>iron-overlay</code> from closing.</p>
 */
public class IronOverlayCanceledEvent extends GwtEvent<IronOverlayCanceledEventHandler> {

    public static Type<IronOverlayCanceledEventHandler> TYPE = new Type<IronOverlayCanceledEventHandler>();

    private com.vaadin.polymer.iron.event.IronOverlayCanceledEvent nativeEvent;

    public IronOverlayCanceledEvent(com.vaadin.polymer.iron.event.IronOverlayCanceledEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronOverlayCanceledEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronOverlayCanceledEventHandler handler) {
        handler.onIronOverlayCanceled(this);
    }

    public com.vaadin.polymer.iron.event.IronOverlayCanceledEvent getNativeEvent() {
        return nativeEvent;
    }

}
