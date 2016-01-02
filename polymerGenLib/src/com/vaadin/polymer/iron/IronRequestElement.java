/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

/**
 * 
 */
@JsType
public interface IronRequestElement extends HTMLElement {

    public static final String TAG = "iron-request";
    public static final String SRC = "iron-ajax/iron-ajax.html";


    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    @JsProperty boolean getAborted();
    /**
     * <p>Aborted will be true if an abort of the request is attempted.</p>
     *
     * JavaScript Info:
     * @property aborted
     * @type Boolean
     * 
     */
    @JsProperty void setAborted(boolean value);

    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getCompletes();
    /**
     * <p>A promise that resolves when the <code>xhr</code> response comes back, or rejects<br>if there is an error before the <code>xhr</code> completes.</p>
     *
     * JavaScript Info:
     * @property completes
     * @type Object
     * 
     */
    @JsProperty void setCompletes(JavaScriptObject value);

    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getProgress();
    /**
     * <p>An object that contains progress information emitted by the XHR if<br>available.</p>
     *
     * JavaScript Info:
     * @property progress
     * @type Object
     * 
     */
    @JsProperty void setProgress(JavaScriptObject value);

    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getResponse();
    /**
     * <p>A reference to the parsed response body, if the <code>xhr</code> has completely<br>resolved.</p>
     *
     * JavaScript Info:
     * @property response
     * @type Object
     * 
     */
    @JsProperty void setResponse(JavaScriptObject value);

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getXhr();
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the<br>network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type Object
     * 
     */
    @JsProperty void setXhr(JavaScriptObject value);


    /**
     * <p>Sends an HTTP request to the server and returns the XHR object.</p>
     *
     * JavaScript Info:
     * @method send
     * @param {{url: string, method: (string|undefined), async: (boolean|undefined), body: (ArrayBuffer|ArrayBufferView|Blob|Document|FormData|null|string|undefined), headers: (Object|undefined), handleAs: (string|undefined), withCredentials: (boolean|undefined)}} options  
     * 
     * 
     */
    void send(Object options);

    /**
     * 
     *
     * JavaScript Info:
     * @method abort
     * 
     * 
     */
    void abort();

    /**
     * 
     *
     * JavaScript Info:
     * @method parseResponse
     * 
     * 
     */
    void parseResponse();

}
