/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-time-picker project by Ben Davis <bendavis78@gmail.com>
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
public interface PaperClockSelectorElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-clock-selector";
    @JsOverlay public static final String SRC = "paper-time-picker/paper-clock-selector.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty boolean getAnimated();
    /**
     * 
     *
     * JavaScript Info:
     * @property animated
     * @type Boolean
     * 
     */
    @JsProperty void setAnimated(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * 
     */
    @JsProperty double getStep();
    /**
     * 
     *
     * JavaScript Info:
     * @property step
     * @type Number
     * 
     */
    @JsProperty void setStep(double value);

    /**
     * 
     *
     * JavaScript Info:
     * @property useZero
     * @type Boolean
     * 
     */
    @JsProperty boolean getUseZero();
    /**
     * 
     *
     * JavaScript Info:
     * @property useZero
     * @type Boolean
     * 
     */
    @JsProperty void setUseZero(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property zeroPad
     * @type Boolean
     * 
     */
    @JsProperty boolean getZeroPad();
    /**
     * 
     *
     * JavaScript Info:
     * @property zeroPad
     * @type Boolean
     * 
     */
    @JsProperty void setZeroPad(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property selected
     * @type Number
     * 
     */
    @JsProperty double getSelected();
    /**
     * 
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
     * @property count
     * @type Number
     * 
     */
    @JsProperty double getCount();
    /**
     * 
     *
     * JavaScript Info:
     * @property count
     * @type Number
     * 
     */
    @JsProperty void setCount(double value);


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
     * @method setClockHand
     * @param {} deg  
     * @param {} animate  
     * @param {} callback  
     * 
     * 
     */
    void setClockHand(Object deg, Object animate, Object callback);

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
