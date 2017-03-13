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
public interface PaperYearListElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-year-list";
    @JsOverlay public static final String SRC = "paper-date-picker/paper-year-list.html";


    /**
     * <p>Maximum allowed year.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * 
     */
    @JsProperty double getMax();
    /**
     * <p>Maximum allowed year.</p>
     *
     * JavaScript Info:
     * @property max
     * @type Number
     * 
     */
    @JsProperty void setMax(double value);

    /**
     * <p>Minimum allowed year.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * 
     */
    @JsProperty double getMin();
    /**
     * <p>Minimum allowed year.</p>
     *
     * JavaScript Info:
     * @property min
     * @type Number
     * 
     */
    @JsProperty void setMin(double value);

    /**
     * <p>The selected year, sync with the year of the given date<br>or null if year isn’t within range.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Number
     * 
     */
    @JsProperty double getSelected();
    /**
     * <p>The selected year, sync with the year of the given date<br>or null if year isn’t within range.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type Number
     * 
     */
    @JsProperty void setSelected(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getDate();
    /**
     * 
     *
     * JavaScript Info:
     * @property date
     * @type Date
     * 
     */
    @JsProperty void setDate(JavaScriptObject value);


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
     * <p>Scroll in the years list to center the selected year.</p>
     *
     * JavaScript Info:
     * @method centerSelected
     * 
     * 
     */
    void centerSelected();

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
