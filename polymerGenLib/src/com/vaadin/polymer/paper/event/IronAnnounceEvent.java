/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toast project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when <code>paper-toast</code> is opened.</p>
 */
@JsType
public interface IronAnnounceEvent extends Event {

    static final String NAME = "iron-announce";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        /**
         * 
         */
        @JsProperty JavaScriptObject getDetail();

        /**
         * <p>The text that will be announced.</p>
         */
        @JsProperty String getText();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(IronAnnounceEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((IronAnnounceEvent) event);
        }
    }
}
