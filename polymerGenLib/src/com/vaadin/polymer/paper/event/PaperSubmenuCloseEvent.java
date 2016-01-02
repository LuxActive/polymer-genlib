/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-menu project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.event;

import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;

/**
 * <p>Fired when the submenu is closed.</p>
 */
@JsType
public interface PaperSubmenuCloseEvent extends Event {

    static final String NAME = "paper-submenu-close";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperSubmenuCloseEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperSubmenuCloseEvent) event);
        }
    }
}
