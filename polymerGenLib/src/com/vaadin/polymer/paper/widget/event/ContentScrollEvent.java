/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * <p>Fired when the content has been scrolled.</p>
 */
public class ContentScrollEvent extends GwtEvent<ContentScrollEventHandler> {

    public static Type<ContentScrollEventHandler> TYPE = new Type<ContentScrollEventHandler>();

    private com.vaadin.polymer.paper.event.ContentScrollEvent nativeEvent;

    public ContentScrollEvent(com.vaadin.polymer.paper.event.ContentScrollEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }

    public Type<ContentScrollEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ContentScrollEventHandler handler) {
        handler.onContentScroll(this);
    }

    public com.vaadin.polymer.paper.event.ContentScrollEvent getNativeEvent() {
        return nativeEvent;
    }

}
