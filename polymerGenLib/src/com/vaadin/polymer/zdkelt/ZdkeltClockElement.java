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
 * <p>Internal component that display the hour or minute selector</p>
 * <p>version : <strong>2.0.0</strong></p>
 * <p>This is a complete rewrite of the version 1, that doesn’t work on firefox. it’s now based on pure HTML and doesn’t use SVG.</p>
 * <p>Example:</p>
 * <pre><code>  &lt;zdkelt-clock minutes id=&quot;minuteClock&quot; value=&quot;{{minutes}}&quot;
 *         on-update=&quot;_minutesChange&quot; on-change=&quot;_setMinutes&quot;&gt;&lt;/zdkelt-clock2&gt;
 * 
 * 
 * </code></pre><p><img src="hero-clock.png" alt=""></p>
 * <p>The component has been tested on :</p>
 * <ul>
 * <li>chrome 47 ( desktop &amp; tablet )</li>
 * <li>firefox 44</li>
 * <li>ipad2  </li>
 * </ul>
 */
@JsType(isNative=true)
public interface ZdkeltClockElement extends HTMLElement {

    @JsOverlay public static final String TAG = "zdkelt-clock";
    @JsOverlay public static final String SRC = "zdkelt-time-picker/zdkelt-time-picker.html";


    /**
     * <p>Boolean flag indicates to draw our clock with 12 hours</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Boolean
     * 
     */
    @JsProperty boolean getHour12();
    /**
     * <p>Boolean flag indicates to draw our clock with 12 hours</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Boolean
     * 
     */
    @JsProperty void setHour12(boolean value);

    /**
     * <p>Boolean flag indicates to draw minutes clock</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type Boolean
     * 
     */
    @JsProperty boolean getMinutes();
    /**
     * <p>Boolean flag indicates to draw minutes clock</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type Boolean
     * 
     */
    @JsProperty void setMinutes(boolean value);

    /**
     * <p>The value selected</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * 
     */
    @JsProperty double getValue();
    /**
     * <p>The value selected</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * 
     */
    @JsProperty void setValue(double value);

    /**
     * <p>the meridiem value : ‘AM’|’PM’</p>
     * <p><strong>Nota :</strong> not yet implemented</p>
     *
     * JavaScript Info:
     * @property meridiem
     * @type String
     * 
     */
    @JsProperty String getMeridiem();
    /**
     * <p>the meridiem value : ‘AM’|’PM’</p>
     * <p><strong>Nota :</strong> not yet implemented</p>
     *
     * JavaScript Info:
     * @property meridiem
     * @type String
     * 
     */
    @JsProperty void setMeridiem(String value);


}
