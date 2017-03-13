/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-date-picker project by Ben Davis <bendavis78@gmail.com>
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.paper;

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
public interface PaperCalendarElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-calendar";
    @JsOverlay public static final String SRC = "paper-date-picker/paper-calendar.html";


    /**
     * <p>The currently selected month (1-12)</p>
     *
     * JavaScript Info:
     * @property currentMonth
     * @type Number
     * 
     */
    @JsProperty double getCurrentMonth();
    /**
     * <p>The currently selected month (1-12)</p>
     *
     * JavaScript Info:
     * @property currentMonth
     * @type Number
     * 
     */
    @JsProperty void setCurrentMonth(double value);

    /**
     * <p>The currently selected year</p>
     *
     * JavaScript Info:
     * @property currentYear
     * @type Number
     * 
     */
    @JsProperty double getCurrentYear();
    /**
     * <p>The currently selected year</p>
     *
     * JavaScript Info:
     * @property currentYear
     * @type Number
     * 
     */
    @JsProperty void setCurrentYear(double value);

    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMaxDate();
    /**
     * <p>The maximum allowed date</p>
     *
     * JavaScript Info:
     * @property maxDate
     * @type Date
     * 
     */
    @JsProperty void setMaxDate(JavaScriptObject value);

    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getMinDate();
    /**
     * <p>The minimum allowed date</p>
     *
     * JavaScript Info:
     * @property minDate
     * @type Date
     * 
     */
    @JsProperty void setMinDate(JavaScriptObject value);

    /**
     * <p>The selected date</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getDate();
    /**
     * <p>The selected date</p>
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty void setDate(JavaScriptObject value);

    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    @JsProperty String getLocale();
    /**
     * <p>The current locale</p>
     *
     * JavaScript Info:
     * @property locale
     * @type String
     * 
     */
    @JsProperty void setLocale(String value);


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior PaperTimePicker
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior PaperTimePicker
     * 
     */
    void assignParentResizable(Object parentResizable);

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
    void dateFormat(Object date, Object format, Object locale);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior PaperTimePicker
     * 
     */
    void notifyResize();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior PaperTimePicker
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}
