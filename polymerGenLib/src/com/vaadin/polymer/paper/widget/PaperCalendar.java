/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-date-picker project by Ben Davis <bendavis78@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class PaperCalendar extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperCalendar() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperCalendar(String html) {
        super(PaperCalendarElement.TAG, PaperCalendarElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperCalendarElement getPolymerElement() {
        return (PaperCalendarElement) getElement();
    }


    /**
     * <p>The currently selected month (1-12)</p>
     *
     * JavaScript Info:
     * @property currentMonth
     * @type Number
     * 
     */
    public double getCurrentMonth() {
        return getPolymerElement().getCurrentMonth();
    }
    /**
     * <p>The currently selected month (1-12)</p>
     *
     * JavaScript Info:
     * @property currentMonth
     * @type Number
     * 
     */
    public void setCurrentMonth(double value) {
        getPolymerElement().setCurrentMonth(value);
    }

    /**
     * <p>The currently selected year</p>
     *
     * JavaScript Info:
     * @property currentYear
     * @type Number
     * 
     */
    public double getCurrentYear() {
        return getPolymerElement().getCurrentYear();
    }
    /**
     * <p>The currently selected year</p>
     *
     * JavaScript Info:
     * @property currentYear
     * @type Number
     * 
     */
    public void setCurrentYear(double value) {
        getPolymerElement().setCurrentYear(value);
    }

    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    public JavaScriptObject getMaxDate() {
        return getPolymerElement().getMaxDate();
    }
    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    public void setMaxDate(JavaScriptObject value) {
        getPolymerElement().setMaxDate(value);
    }

    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    public JavaScriptObject getMinDate() {
        return getPolymerElement().getMinDate();
    }
    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    public void setMinDate(JavaScriptObject value) {
        getPolymerElement().setMinDate(value);
    }

    /**
     * <p>The selected date</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    public JavaScriptObject getDate() {
        return getPolymerElement().getDate();
    }
    /**
     * <p>The selected date</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    public void setDate(JavaScriptObject value) {
        getPolymerElement().setDate(value);
    }

    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    public String getLocale() {
        return getPolymerElement().getLocale();
    }
    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    public void setLocale(String value) {
        getPolymerElement().setLocale(value);
    }


    // Needed in UIBinder
    /**
     * <p>The currently selected month (1-12)</p>
     *
     * JavaScript Info:
     * @attribute current-month
     * 
     */
    public void setCurrentMonth(String value) {
        Polymer.property(this.getPolymerElement(), "currentMonth", value);
    }

    // Needed in UIBinder
    /**
     * <p>The currently selected year</p>
     *
     * JavaScript Info:
     * @attribute current-year
     * 
     */
    public void setCurrentYear(String value) {
        Polymer.property(this.getPolymerElement(), "currentYear", value);
    }

    // Needed in UIBinder
    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @attribute max-date
     * 
     */
    public void setMaxDate(String value) {
        Polymer.property(this.getPolymerElement(), "maxDate", value);
    }

    // Needed in UIBinder
    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @attribute min-date
     * 
     */
    public void setMinDate(String value) {
        Polymer.property(this.getPolymerElement(), "minDate", value);
    }

    // Needed in UIBinder
    /**
     * <p>The selected date</p>
     *
     * JavaScript Info:
     * @attribute date
     * 
     */
    public void setDate(String value) {
        Polymer.property(this.getPolymerElement(), "date", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method dateFormat
     * @param {} date  
     * @param {} format  
     * @param {} locale  
     * 
     * 
     */
    public void dateFormat(Object date, Object format, Object locale) {
        getPolymerElement().dateFormat(date, format, locale);
    }

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperClockSelector
     * 
     */
    public void stopResizeNotificationsFor(Object target) {
        getPolymerElement().stopResizeNotificationsFor(target);
    }

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperClockSelector
     * 
     */
    public void assignParentResizable(Object parentResizable) {
        getPolymerElement().assignParentResizable(parentResizable);
    }

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperClockSelector
     * 
     */
    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperClockSelector
     * @return {boolean}
     */
    public boolean resizerShouldNotify(JavaScriptObject element) {
        return getPolymerElement().resizerShouldNotify(element);
    }


}
