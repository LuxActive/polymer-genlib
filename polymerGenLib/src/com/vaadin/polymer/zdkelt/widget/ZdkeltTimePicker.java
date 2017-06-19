/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from zdkelt-time-picker project by zeDesk <dev@zedesk.net>
 * that is licensed with https://github.com/zedesk/zdkElt-time-picker/LICENCE license.
 */
package com.vaadin.polymer.zdkelt.widget;

import com.vaadin.polymer.zdkelt.*;

import com.vaadin.polymer.zdkelt.widget.event.UpdateEvent;
import com.vaadin.polymer.zdkelt.widget.event.UpdateEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class ZdkeltTimePicker extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public ZdkeltTimePicker() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public ZdkeltTimePicker(String html) {
        super(ZdkeltTimePickerElement.TAG, ZdkeltTimePickerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public ZdkeltTimePickerElement getPolymerElement() {
        return (ZdkeltTimePickerElement) getElement();
    }


    /**
     * <p>not yet implemented<br>Boolean flag indicates to draw our clock with 12 hours</p>
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
     * <p>not yet implemented<br>Boolean flag indicates to draw our clock with 12 hours</p>
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
     * <p>The hours value</p>
     *
     * JavaScript Info:
     * @property hours
     * @type String
     * 
     */
    public String getHours() {
        return getPolymerElement().getHours();
    }
    /**
     * <p>The hours value</p>
     *
     * JavaScript Info:
     * @property hours
     * @type String
     * 
     */
    public void setHours(String value) {
        getPolymerElement().setHours(value);
    }

    /**
     * <p>The minutes value</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type String
     * 
     */
    public String getMinutes() {
        return getPolymerElement().getMinutes();
    }
    /**
     * <p>The minutes value</p>
     *
     * JavaScript Info:
     * @property minutes
     * @type String
     * 
     */
    public void setMinutes(String value) {
        getPolymerElement().setMinutes(value);
    }

    /**
     * <p>The value formated as ‘HH:MM’</p>
     * <p>The time is given in 24-hours time</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    public String getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>The value formated as ‘HH:MM’</p>
     * <p>The time is given in 24-hours time</p>
     *
     * JavaScript Info:
     * @property value
     * @type String
     * 
     */
    public void setValue(String value) {
        getPolymerElement().setValue(value);
    }

    /**
     * <p>Define the view</p>
     * <p>available value are <code>hours</code> (default) or <code>minutes</code></p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    public String getView() {
        return getPolymerElement().getView();
    }
    /**
     * <p>Define the view</p>
     * <p>available value are <code>hours</code> (default) or <code>minutes</code></p>
     *
     * JavaScript Info:
     * @property view
     * @type String
     * 
     */
    public void setView(String value) {
        getPolymerElement().setView(value);
    }



    /**
     * <p>Force the redraw of the clock</p>
     *
     * JavaScript Info:
     * @method refresh
     * 
     * 
     */
    public void refresh() {
        getPolymerElement().refresh();
    }


    /**
     * <p>The <code>update</code> event is emitted when the mouse is dragged</p>
     *
     * JavaScript Info:
     * @event update
     */
    public HandlerRegistration addUpdateHandler(UpdateEventHandler handler) {
        return addDomHandler(handler, UpdateEvent.TYPE);
    }

}
