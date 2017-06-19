/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from bwt-uploader project by Raju Maisnam,Dmytro Hrytsenko,Bhargav Konkathi,Blue Water Tracks Team
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.bwt;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * 
 */
@JsType(isNative=true)
public interface BwtProgressBarElement extends HTMLElement {

    @JsOverlay public static final String TAG = "bwt-progress-bar";
    @JsOverlay public static final String SRC = "bwt-uploader/bwt-uploader.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * @behavior BwtProgressBar
     */
    @JsProperty boolean getCustomClass();
    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * @behavior BwtProgressBar
     */
    @JsProperty void setCustomClass(boolean value);

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getFile();
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    @JsProperty void setFile(JavaScriptObject value);

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * @behavior BwtProgressBar
     */
    @JsProperty JavaScriptObject getError();
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * @behavior BwtProgressBar
     */
    @JsProperty void setError(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * 
     */
    @JsProperty boolean getPlaceHolderRemoved();
    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * 
     */
    @JsProperty void setPlaceHolderRemoved(boolean value);

    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty String getTheme();
    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty void setTheme(String value);

    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * @behavior BwtProgressBar
     */
    @JsProperty String getImage();
    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * @behavior BwtProgressBar
     */
    @JsProperty void setImage(String value);


}
