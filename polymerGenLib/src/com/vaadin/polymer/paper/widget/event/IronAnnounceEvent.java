/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when <code>paper-toast</code> is opened.</p>
 */
public class IronAnnounceEvent extends GwtEvent<IronAnnounceEventHandler> {

    public static Type<IronAnnounceEventHandler> TYPE = new Type<IronAnnounceEventHandler>();

    private com.vaadin.polymer.paper.event.IronAnnounceEvent nativeEvent;

    public IronAnnounceEvent(com.vaadin.polymer.paper.event.IronAnnounceEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<IronAnnounceEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(IronAnnounceEventHandler handler) {
        handler.onIronAnnounce(this);
    }

    public com.vaadin.polymer.paper.event.IronAnnounceEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * 
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

    /**
     * <p>The text that will be announced.</p>
     */
    public String getText() {
        return getNativeEvent().getDetail().getText();
    }

}
