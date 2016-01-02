/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer.widget;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.polymer.DomBindElement;

/**
 * 
 */
public class DomBind extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public DomBind() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public DomBind(String html) {
        super(DomBindElement.TAG, DomBindElement.SRC, html);

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public DomBindElement getPolymerElement() {
        try {
            return (DomBindElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }




    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    public void render() {
        getPolymerElement().render();
    }


}
