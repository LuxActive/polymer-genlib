/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

/**
 * <p>Dynamically loads Google JavaScript API <code>gapi</code>, firing the <code>js-api-load</code> event when ready.</p>
 * <p>Any number of components can use <code>&lt;google-js-api&gt;</code> elements, and the library will only be loaded once.</p>
 * <h5 id="example">Example</h5>
 * <pre><code>&lt;google-js-api&gt;&lt;/google-js-api&gt;
 * &lt;script&gt;
 *   var api = document.querySelector(&#39;google-js-api&#39;);
 *   api.addEventListener(&#39;js-api-load&#39;, function(e) {
 *     console.log(&#39;API loaded&#39;, gapi);
 *   });
 * &lt;/script&gt;
 * 
 * </code></pre>
 */
@JsType
public interface GoogleJsApiElement extends HTMLElement {

    public static final String TAG = "google-js-api";
    public static final String SRC = "google-apis/google-apis.html";


    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    @JsProperty String getNotifyEvent();
    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    @JsProperty void setNotifyEvent(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    @JsProperty String getLibraryUrl();
    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    @JsProperty void setLibraryUrl(String value);


}
