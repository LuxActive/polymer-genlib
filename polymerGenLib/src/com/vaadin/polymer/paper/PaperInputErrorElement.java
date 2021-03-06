/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-input project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>&lt;paper-input-error&gt;</code> is an error message for use with <code>&lt;paper-input-container&gt;</code>. The error is<br>displayed when the <code>&lt;paper-input-container&gt;</code> is <code>invalid</code>.</p>
 * <pre><code>&lt;paper-input-container&gt;
 *   &lt;input pattern=&quot;[0-9]*&quot;&gt;
 *   &lt;paper-input-error slot=&quot;add-on&quot;&gt;Only numbers are allowed!&lt;/paper-input-error&gt;
 * &lt;/paper-input-container&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
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
 * <td><code>--paper-input-container-invalid-color</code></td>
 * <td>The foreground color of the error</td>
 * <td><code>--error-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-input-error</code></td>
 * <td>Mixin applied to the error</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperInputErrorElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-input-error";
    @JsOverlay public static final String SRC = "paper-input/paper-textarea.html";


    /**
     * <p>True if the error is showing.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty boolean getInvalid();
    /**
     * <p>True if the error is showing.</p>
     *
     * JavaScript Info:
     * @property invalid
     * @type Boolean
     * 
     */
    @JsProperty void setInvalid(boolean value);


    /**
     * <p>This overrides the update function in PaperInputAddonBehavior.</p>
     *
     * JavaScript Info:
     * @method update
     * @param {{inputElement: (Element|undefined), value: (string|undefined), invalid: boolean}} state  
     * 
     * 
     */
    void update(Object state);

}
