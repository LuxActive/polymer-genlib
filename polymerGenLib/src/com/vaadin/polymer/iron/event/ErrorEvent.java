/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when an error is received.</p>
 */
@JsType
public interface ErrorEvent extends Event {

    static final String NAME = "error";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ErrorEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ErrorEvent) event);
        }
    }
}
