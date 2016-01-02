/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-scroll-header-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the header is transformed.</p>
 */
@JsType
public interface PaperHeaderTransformEvent extends Event {

    static final String NAME = "paper-header-transform";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperHeaderTransformEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperHeaderTransformEvent) event);
        }
    }
}
