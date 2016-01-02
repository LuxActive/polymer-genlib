/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

/**
 * 
 */
@JsType
public interface DomIfElement extends HTMLElement {

    public static final String TAG = "dom-if";
    public static final String SRC = "polymer/polymer.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property if
     * @type Boolean
     * 
     */
    @JsProperty boolean getIf();
    /**
     * 
     *
     * JavaScript Info:
     * @property if
     * @type Boolean
     * 
     */
    @JsProperty void setIf(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property restamp
     * @type Boolean
     * 
     */
    @JsProperty boolean getRestamp();
    /**
     * 
     *
     * JavaScript Info:
     * @property restamp
     * @type Boolean
     * 
     */
    @JsProperty void setRestamp(boolean value);


    /**
     * 
     *
     * JavaScript Info:
     * @method modelForElement
     * @param {} el  
     * 
     * 
     */
    void modelForElement(Object el);

    /**
     * 
     *
     * JavaScript Info:
     * @method templatize
     * @param {} template  
     * @behavior DomIf
     * 
     */
    void templatize(Object template);

    /**
     * 
     *
     * JavaScript Info:
     * @method stamp
     * @param {} model  
     * 
     * 
     */
    void stamp(Object model);

    /**
     * 
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    void render();

}
