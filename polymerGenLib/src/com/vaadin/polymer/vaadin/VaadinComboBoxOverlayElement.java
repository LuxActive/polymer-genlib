/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from vaadin-combo-box project by Vaadin Ltd
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
public interface VaadinComboBoxOverlayElement extends HTMLElement {

    @JsOverlay public static final String TAG = "vaadin-combo-box-overlay";
    @JsOverlay public static final String SRC = "vaadin-combo-box/vaadin-combo-box.html";


    /**
     * <p>True if the device supports touch events.</p>
     *
     * JavaScript Info:
     * @property touchDevice
     * @type Boolean
     * 
     */
    @JsProperty boolean getTouchDevice();
    /**
     * <p>True if the device supports touch events.</p>
     *
     * JavaScript Info:
     * @property touchDevice
     * @type Boolean
     * 
     */
    @JsProperty void setTouchDevice(boolean value);

    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty double getVerticalOffset();
    /**
     * <p>Vertical offset for the overlay position.</p>
     *
     * JavaScript Info:
     * @property verticalOffset
     * @type Number
     * 
     */
    @JsProperty void setVerticalOffset(double value);

    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * @behavior VaadinComboBoxOverlay
     */
    @JsProperty JavaScriptObject getPositionTarget();
    /**
     * <p>The element to position/align the dropdown by.</p>
     *
     * JavaScript Info:
     * @property positionTarget
     * @type Object
     * @behavior VaadinComboBoxOverlay
     */
    @JsProperty void setPositionTarget(JavaScriptObject value);


    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>Gets the index of the item with the provided label.</p>
     *
     * JavaScript Info:
     * @method indexOfLabel
     * @param {} label  
     * 
     * @return {double}
     */
    double indexOfLabel(Object label);

    /**
     * <p>Gets the label string for the item based on the <code>_itemLabelPath</code>.</p>
     *
     * JavaScript Info:
     * @method getItemLabel
     * @param {} item  
     * 
     * @return {String}
     */
    String getItemLabel(Object item);

    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * 
     *
     * JavaScript Info:
     * @method adjustScrollPosition
     * 
     * 
     */
    void adjustScrollPosition();

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinComboBoxOverlay
     * 
     */
    void notifyResize();

    /**
     * 
     *
     * JavaScript Info:
     * @method updateViewportBoundaries
     * 
     * 
     */
    void updateViewportBoundaries();

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinComboBoxOverlay
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

}