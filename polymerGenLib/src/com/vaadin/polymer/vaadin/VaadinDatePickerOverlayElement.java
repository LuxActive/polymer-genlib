/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-date-picker project by Vaadin Ltd
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.vaadin;

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
public interface VaadinDatePickerOverlayElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-date-picker-overlay";
    @JsOverlay public static final String SRC = "vaadin-date-picker/vaadin-date-picker.html";


    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getFocusedDate();
    /**
     * <p>Date value which is focused using keyboard.</p>
     *
     * JavaScript Info:
     * @property focusedDate
     * @type Date
     * 
     */
    @JsProperty void setFocusedDate(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getI18n();
    /**
     * 
     *
     * JavaScript Info:
     * @property i18n
     * @type Object
     * 
     */
    @JsProperty void setI18n(JavaScriptObject value);

    /**
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getInitialPosition();
    /**
     * <p>Date which should be visible when there is no value selected.</p>
     *
     * JavaScript Info:
     * @property initialPosition
     * @type Date
     * 
     */
    @JsProperty void setInitialPosition(JavaScriptObject value);

    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty JavaScriptObject getSelectedDate();
    /**
     * <p>The value for this element.</p>
     *
     * JavaScript Info:
     * @property selectedDate
     * @type Date
     * 
     */
    @JsProperty void setSelectedDate(JavaScriptObject value);


    /**
     * <p>Scrolls the list to the given Date.</p>
     *
     * JavaScript Info:
     * @method scrollToDate
     * @param {} date  
     * @param {} animate  
     * 
     * 
     */
    void scrollToDate(Object date, Object animate);

}
