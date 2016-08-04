/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Element for loading a specific client Google API with the JavaScript client library.</p>
 * <p>For loading <code>gapi.client</code> libraries</p>
 * <h5 id="example">Example</h5>
 * <pre><code>&lt;google-client-loader id=&quot;shortener&quot;
 *   name=&quot;urlshortener&quot;
 *   version=&quot;v1&quot;&gt;&lt;/google-client-loader&gt;
 * 
 * &lt;script&gt;
 *   var shortener = document.getElementById(&#39;shortener&#39;);
 *   shortener.addEventListener(&#39;google-api-load&#39;, function(event) {
 *     var request = shortener.api.url.get({
 *        shortUrl: &#39;http://goo.gl/fbsS&#39;
 *     });
 *     request.execute(function(resp) {
 *       console.log(resp);
 *     });
 *   });
 * &lt;/script&gt;
 * 
 * 
 * </code></pre>
 */
@JsType(isNative=true)
public interface GoogleClientLoaderElement extends HTMLElement {

    @JsOverlay public static final String TAG = "google-client-loader";
    @JsOverlay public static final String SRC = "google-apis/google-apis.html";


    /**
     * <p>Root URL where to load the API from, e.g. ‘<a href="http://host/apis">http://host/apis</a>‘.<br>For App Engine dev server this would be something like:<br>‘<a href="http://localhost:8080/_ah/api">http://localhost:8080/_ah/api</a>‘.<br>Overrides ‘appId’ if both are specified.</p>
     *
     * JavaScript Info:
     * @property apiRoot
     * @type string
     * 
     */
    @JsProperty String getApiRoot();
    /**
     * <p>Root URL where to load the API from, e.g. ‘<a href="http://host/apis">http://host/apis</a>‘.<br>For App Engine dev server this would be something like:<br>‘<a href="http://localhost:8080/_ah/api">http://localhost:8080/_ah/api</a>‘.<br>Overrides ‘appId’ if both are specified.</p>
     *
     * JavaScript Info:
     * @property apiRoot
     * @type string
     * 
     */
    @JsProperty void setApiRoot(String value);

    /**
     * <p>App Engine application ID for loading a Google Cloud Endpoints API.</p>
     *
     * JavaScript Info:
     * @property appId
     * @type string
     * 
     */
    @JsProperty String getAppId();
    /**
     * <p>App Engine application ID for loading a Google Cloud Endpoints API.</p>
     *
     * JavaScript Info:
     * @property appId
     * @type string
     * 
     */
    @JsProperty void setAppId(String value);

    /**
     * <p>Name of the event fired when there is an error loading the library.</p>
     *
     * JavaScript Info:
     * @property errorEventName
     * @type String
     * 
     */
    @JsProperty String getErrorEventName();
    /**
     * <p>Name of the event fired when there is an error loading the library.</p>
     *
     * JavaScript Info:
     * @property errorEventName
     * @type String
     * 
     */
    @JsProperty void setErrorEventName(String value);

    /**
     * <p>Name of the API to load, e.g. ‘urlshortener’.</p>
     * <p>You can find the full list of APIs on the<br><a href="https://developers.google.com/apis-explorer"> Google APIs<br>Explorer</a>.</p>
     *
     * JavaScript Info:
     * @property name
     * @type string
     * 
     */
    @JsProperty String getName();
    /**
     * <p>Name of the API to load, e.g. ‘urlshortener’.</p>
     * <p>You can find the full list of APIs on the<br><a href="https://developers.google.com/apis-explorer"> Google APIs<br>Explorer</a>.</p>
     *
     * JavaScript Info:
     * @property name
     * @type string
     * 
     */
    @JsProperty void setName(String value);

    /**
     * <p>Name of the event fired when API library is loaded.</p>
     *
     * JavaScript Info:
     * @property successEventName
     * @type String
     * 
     */
    @JsProperty String getSuccessEventName();
    /**
     * <p>Name of the event fired when API library is loaded.</p>
     *
     * JavaScript Info:
     * @property successEventName
     * @type String
     * 
     */
    @JsProperty void setSuccessEventName(String value);

    /**
     * <p>Version of the API to load, e.g. ‘v1’.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    @JsProperty String getVersion();
    /**
     * <p>Version of the API to load, e.g. ‘v1’.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    @JsProperty void setVersion(String value);


}
