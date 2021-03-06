/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-overlay-behavior project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>iron-overlay-backdrop</code> is a backdrop used by <code>Polymer.IronOverlayBehavior</code>. It should be a<br>singleton.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling.</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--iron-overlay-backdrop-background-color</code></td>
 * <td>Backdrop background color</td>
 * <td>#000</td>
 * </tr>
 * <tr>
 * <td><code>--iron-overlay-backdrop-opacity</code></td>
 * <td>Backdrop opacity</td>
 * <td>0.6</td>
 * </tr>
 * <tr>
 * <td><code>--iron-overlay-backdrop</code></td>
 * <td>Mixin applied to <code>iron-overlay-backdrop</code>.</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--iron-overlay-backdrop-opened</code></td>
 * <td>Mixin applied to <code>iron-overlay-backdrop</code> when it is displayed</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface IronOverlayBackdropElement extends HTMLElement {

    @JsOverlay public static final String TAG = "iron-overlay-backdrop";
    @JsOverlay public static final String SRC = "iron-overlay-behavior/iron-overlay-behavior.html";


    /**
     * <p>Returns true if the backdrop is opened.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty boolean getOpened();
    /**
     * <p>Returns true if the backdrop is opened.</p>
     *
     * JavaScript Info:
     * @property opened
     * @type Boolean
     * 
     */
    @JsProperty void setOpened(boolean value);


    /**
     * <p>Hides the backdrop.</p>
     *
     * JavaScript Info:
     * @method close
     * 
     * 
     */
    void close();

    /**
     * <p>Removes the backdrop from document body if needed.</p>
     *
     * JavaScript Info:
     * @method complete
     * 
     * 
     */
    void complete();

    /**
     * <p>Shows the backdrop.</p>
     *
     * JavaScript Info:
     * @method open
     * 
     * 
     */
    void open();

    /**
     * <p>Appends the backdrop to document body if needed.</p>
     *
     * JavaScript Info:
     * @method prepare
     * 
     * 
     */
    void prepare();

}
