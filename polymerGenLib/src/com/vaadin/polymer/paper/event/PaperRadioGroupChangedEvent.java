/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-radio-group project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the radio group selection changes.</p>
 */
@JsType
public interface PaperRadioGroupChangedEvent extends Event {

    static final String NAME = "paper-radio-group-changed";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperRadioGroupChangedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperRadioGroupChangedEvent) event);
        }
    }
}
