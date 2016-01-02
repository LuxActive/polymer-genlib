/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-tabs project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * 
 */
@JsType
public interface IronItemsChangedEvent extends Event {

    static final String NAME = "iron-items-changed";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronItemsChangedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronItemsChangedEvent) event);
        }
    }
}
