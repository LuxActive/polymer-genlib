/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;

/**
 * <pre><code>Fired when the animation finishes.
 * This is useful if you want to wait until
 * the ripple animation finishes to perform some action.
 * 
 * 
 * </code></pre>
 */
public class TransitionendEvent extends GwtEvent<TransitionendEventHandler> {

    public static Type<TransitionendEventHandler> TYPE = new Type<TransitionendEventHandler>();

    private com.vaadin.polymer.paper.event.TransitionendEvent nativeEvent;

    public TransitionendEvent(com.vaadin.polymer.paper.event.TransitionendEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<TransitionendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(TransitionendEventHandler handler) {
        handler.onTransitionend(this);
    }

    public com.vaadin.polymer.paper.event.TransitionendEvent getNativeEvent() {
        return nativeEvent;
    }

    /**
     * <p>Contains the animated node.</p>
     */
    public JavaScriptObject getDetail() {
        return getNativeEvent().getDetail().getDetail();
    }

}
