/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from bwt-uploader project by Raju Maisnam,Dmytro Hrytsenko,Bhargav Konkathi,Blue Water Tracks Team
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.bwt.widget;

import com.vaadin.polymer.bwt.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class BwtProgressBar extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public BwtProgressBar() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public BwtProgressBar(String html) {
        super(BwtProgressBarElement.TAG, BwtProgressBarElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public BwtProgressBarElement getPolymerElement() {
        return (BwtProgressBarElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * @behavior BwtProgressBar
     */
    public boolean getCustomClass() {
        return getPolymerElement().getCustomClass();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * @behavior BwtProgressBar
     */
    public void setCustomClass(boolean value) {
        getPolymerElement().setCustomClass(value);
    }

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    public JavaScriptObject getFile() {
        return getPolymerElement().getFile();
    }
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    public void setFile(JavaScriptObject value) {
        getPolymerElement().setFile(value);
    }

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * @behavior BwtProgressBar
     */
    public JavaScriptObject getError() {
        return getPolymerElement().getError();
    }
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * @behavior BwtProgressBar
     */
    public void setError(JavaScriptObject value) {
        getPolymerElement().setError(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * 
     */
    public boolean getPlaceHolderRemoved() {
        return getPolymerElement().getPlaceHolderRemoved();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * 
     */
    public void setPlaceHolderRemoved(boolean value) {
        getPolymerElement().setPlaceHolderRemoved(value);
    }

    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    public String getTheme() {
        return getPolymerElement().getTheme();
    }
    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    public void setTheme(String value) {
        getPolymerElement().setTheme(value);
    }

    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public String getPlaceholder() {
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }

    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * @behavior BwtProgressBar
     */
    public String getImage() {
        return getPolymerElement().getImage();
    }
    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * @behavior BwtProgressBar
     */
    public void setImage(String value) {
        getPolymerElement().setImage(value);
    }


    // Needed in UIBinder
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @attribute file
     * @behavior BwtProgressBar
     */
    public void setFile(String value) {
        Polymer.property(this.getPolymerElement(), "file", value);
    }

    // Needed in UIBinder
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @attribute error
     * @behavior BwtProgressBar
     */
    public void setError(String value) {
        Polymer.property(this.getPolymerElement(), "error", value);
    }



}
