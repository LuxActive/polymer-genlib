/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from zdkelt-time-picker project by zeDesk <dev@zedesk.net>
 * that is licensed with https://github.com/zedesk/zdkElt-time-picker/LICENCE license.
 */
package com.vaadin.polymer.zdkelt;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>A time picker component</p>
 * <p>version : <strong>2.0.0</strong></p>
 * <p>A time picker component ‘à la’ material design</p>
 * <p>This is a complete rewrite of the version 1, that doesn’t work on firefox.</p>
 * <blockquote>
 * <p><strong>Warning</strong> component does not yet support the meridiem hours, and is based only on 24-hour clock.</p>
 * </blockquote>
 * <p>Example:</p>
 * <pre><code>&lt;zdkelt-time-picker value=&quot;17:00&quot;&gt;&lt;/zdkelt-time-picker&gt;
 * 
 * 
 * </code></pre><p><img src="hero-timer.png" alt=""></p>
 * <blockquote>
 * <p><strong>Warning</strong> component does not yet support the meridiem hours, and is based only on 24-hour clock.</p>
 * </blockquote>
 */
@JsType(isNative=true)
public interface ZdkeltTimePickerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "zdkelt-time-picker";
    @JsOverlay public static final String SRC = "zdkelt-time-picker/zdkelt-time-picker.html";


    /**
     * <p>not yet implemented<br>Boolean flag indicates to draw our clock with 12 hours</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Boolean
     * 
     */
    @JsProperty boolean getHour12();
    /**
     * <p>not yet implemented<br>Boolean flag indicates to draw our clock with 12 hours</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Boolean
     * 
     */
    @JsProperty void setHour12(boolean value);

    /**
     * <p>The hours value</p>
     *
     * JavaScript Info:
     * @property hours
     * @type String
     * 
     */
    @JsProperty String getHours();
    /**
     * <p>The hours value</p>
     *
     * JavaScript Info:
     * @property hours
     * @type String
     * 
     */
    @JsProperty void setHours(String value);

    /**
     * <p>The minutes value</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type String
     * 
     */
    @JsProperty String getMinutes();
    /**
     * <p>The minutes value</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type String
     * 
     */
    @JsProperty void setMinutes(String value);

    /**
     * <p>The value formated as ‘HH:MM’</p>
     * <p>The time is given in 24-hours time</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty String getValue();
    /**
     * <p>The value formated as ‘HH:MM’</p>
     * <p>The time is given in 24-hours time</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    @JsProperty void setValue(String value);

    /**
     * <p>Define the view</p>
     * <p>available value are <code>hours</code> (default) or <code>minutes</code></p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    @JsProperty String getView();
    /**
     * <p>Define the view</p>
     * <p>available value are <code>hours</code> (default) or <code>minutes</code></p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    @JsProperty void setView(String value);


    /**
     * <p>Force the redraw of the clock</p>
     *
     * JavaScript Info:
     * @method refresh
     * 
     * 
     */
    void refresh();

}
