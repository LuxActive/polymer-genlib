/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin.widget;

import com.vaadin.polymer.vaadin.*;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class VaadinMonthCalendar extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public VaadinMonthCalendar() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public VaadinMonthCalendar(String html) {
        super(VaadinMonthCalendarElement.TAG, VaadinMonthCalendarElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public VaadinMonthCalendarElement getPolymerElement() {
        try {
            return (VaadinMonthCalendarElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    public JavaScriptObject getFocusedDate() {
        return getPolymerElement().getFocusedDate();
    }
    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    public void setFocusedDate(JavaScriptObject value) {
        getPolymerElement().setFocusedDate(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public JavaScriptObject getI18n() {
        return getPolymerElement().getI18n();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    public void setI18n(JavaScriptObject value) {
        getPolymerElement().setI18n(value);
    }

    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    public JavaScriptObject getMonth() {
        return getPolymerElement().getMonth();
    }
    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @property month
     * @type Date
     * 
     */
    public void setMonth(JavaScriptObject value) {
        getPolymerElement().setMonth(value);
    }

    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    public JavaScriptObject getSelectedDate() {
        return getPolymerElement().getSelectedDate();
    }
    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    public void setSelectedDate(JavaScriptObject value) {
        getPolymerElement().setSelectedDate(value);
    }


    /**
     * <p>A <code>Date</code> object for the currently focused date.</p>
     *
     * JavaScript Info:
     * @attribute focused-date
     * 
     */
    public void setFocusedDate(String value) {
        getPolymerElement().setAttribute("focused-date", value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @attribute i18n
     * 
     */
    public void setI18n(String value) {
        getPolymerElement().setAttribute("i18n", value);
    }

    /**
     * <p>A <code>Date</code> object defining the month to be displayed. Only year and<br>month properties are actually used.</p>
     *
     * JavaScript Info:
     * @attribute month
     * 
     */
    public void setMonth(String value) {
        getPolymerElement().setAttribute("month", value);
    }

    /**
     * <p>A <code>Date</code> object for the currently selected date.</p>
     *
     * JavaScript Info:
     * @attribute selected-date
     * 
     */
    public void setSelectedDate(String value) {
        getPolymerElement().setAttribute("selected-date", value);
    }



}
