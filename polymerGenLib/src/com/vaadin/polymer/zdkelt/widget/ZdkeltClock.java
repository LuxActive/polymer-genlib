/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from zdkelt-time-picker project by zeDesk <dev@zedesk.net>
 * that is licensed with https://github.com/zedesk/zdkElt-time-picker/LICENCE license.
 */
package com.vaadin.polymer.zdkelt.widget;

import com.vaadin.polymer.zdkelt.*;

import com.vaadin.polymer.zdkelt.widget.event.ChangeEvent;
import com.vaadin.polymer.zdkelt.widget.event.ChangeEventHandler;

import com.vaadin.polymer.zdkelt.widget.event.UpdateEvent;
import com.vaadin.polymer.zdkelt.widget.event.UpdateEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class ZdkeltClock extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public ZdkeltClock() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public ZdkeltClock(String html) {
        super(ZdkeltClockElement.TAG, ZdkeltClockElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public ZdkeltClockElement getPolymerElement() {
        return (ZdkeltClockElement) getElement();
    }


    /**
     * <p>Boolean flag indicates to draw our clock with 12 hours</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Boolean
     * 
     */
    public boolean getHour12() {
        return getPolymerElement().getHour12();
    }
    /**
     * <p>Boolean flag indicates to draw our clock with 12 hours</p>
     *
     * JavaScript Info:
     * @property hour12
     * @type Boolean
     * 
     */
    public void setHour12(boolean value) {
        getPolymerElement().setHour12(value);
    }

    /**
     * <p>Boolean flag indicates to draw minutes clock</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type Boolean
     * 
     */
    public boolean getMinutes() {
        return getPolymerElement().getMinutes();
    }
    /**
     * <p>Boolean flag indicates to draw minutes clock</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type Boolean
     * 
     */
    public void setMinutes(boolean value) {
        getPolymerElement().setMinutes(value);
    }

    /**
     * <p>The value selected</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * 
     */
    public double getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value selected</p>
     *
     * JavaScript Info:
     * @property value
     * @type Number
     * 
     */
    public void setValue(double value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>the meridiem value : ‘AM’|’PM’</p>
     * <p><strong>Nota :</strong> not yet implemented</p>
     *
     * JavaScript Info:
     * @property meridiem
     * @type String
     * 
     */
    public String getMeridiem() {
        return getPolymerElement().getMeridiem();
    }
    /**
     * <p>the meridiem value : ‘AM’|’PM’</p>
     * <p><strong>Nota :</strong> not yet implemented</p>
     *
     * JavaScript Info:
     * @property meridiem
     * @type String
     * 
     */
    public void setMeridiem(String value) {
        getPolymerElement().setMeridiem(value);
    }


    // Needed in UIBinder
    /**
     * <p>The value selected</p>
     *
     * JavaScript Info:
     * @attribute value
     * 
     */
    public void setValue(String value) {
        Polymer.property(this.getPolymerElement(), "value", value);
    }



    /**
     * <p>an <code>change</code> event is emitted when the mouse is released</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addDomHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>an <code>update</code> event is emitted when the value change by dragging the mouse</p>
     *
     * JavaScript Info:
     * @event update
     */
    public HandlerRegistration addUpdateHandler(UpdateEventHandler handler) {
        return addDomHandler(handler, UpdateEvent.TYPE);
    }

}
