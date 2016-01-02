/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the checked state changes due to user interaction.</p>
 */
@JsType
public interface ChangeEvent extends Event {

    static final String NAME = "change";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ChangeEvent) event);
        }
    }
}
