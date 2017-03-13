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
public class BwtImagePreview extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public BwtImagePreview() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public BwtImagePreview(String html) {
        super(BwtImagePreviewElement.TAG, BwtImagePreviewElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public BwtImagePreviewElement getPolymerElement() {
        return (BwtImagePreviewElement) getElement();
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setCustomClass(boolean value) {
        getPolymerElement().setCustomClass(value);
    }

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setError(JavaScriptObject value) {
        getPolymerElement().setError(value);
    }

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setFile(JavaScriptObject value) {
        getPolymerElement().setFile(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setPlaceHolderRemoved(boolean value) {
        getPolymerElement().setPlaceHolderRemoved(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property className
     * @type String
     * 
     */
    public String getClassName() {
        return getPolymerElement().getClassName();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property className
     * @type String
     * 
     */
    public void setClassName(String value) {
        getPolymerElement().setClassName(value);
    }

    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setImage(String value) {
        getPolymerElement().setImage(value);
    }

    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }

    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * @behavior BwtUploader
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
     * @behavior BwtUploader
     */
    public void setTheme(String value) {
        getPolymerElement().setTheme(value);
    }


    // Needed in UIBinder
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @attribute error
     * @behavior BwtUploader
     */
    public void setError(String value) {
        Polymer.property(this.getPolymerElement(), "error", value);
    }

    // Needed in UIBinder
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @attribute file
     * @behavior BwtUploader
     */
    public void setFile(String value) {
        Polymer.property(this.getPolymerElement(), "file", value);
    }



}
