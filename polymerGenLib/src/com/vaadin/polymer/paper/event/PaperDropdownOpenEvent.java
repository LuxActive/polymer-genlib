/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu-button project by The Polymer Authors
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the dropdown opens.</p>
 */
@JsType
public interface PaperDropdownOpenEvent extends Event {

    static final String NAME = "paper-dropdown-open";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperDropdownOpenEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperDropdownOpenEvent) event);
        }
    }
}
