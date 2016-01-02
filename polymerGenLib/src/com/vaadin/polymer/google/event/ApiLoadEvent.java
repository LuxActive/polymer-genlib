/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the API library is loaded and available.</p>
 */
@JsType
public interface ApiLoadEvent extends Event {

    static final String NAME = "api-load";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ApiLoadEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ApiLoadEvent) event);
        }
    }
}
