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
 * <p>Dynamically loads the Google Maps JavaScript API, firing the <code>api-load</code> event when ready.</p>
 * <h4 id="example">Example</h4>
 * <pre><code>&lt;google-maps-api api-key=&quot;abc123&quot; version=&quot;3.exp&quot;&gt;&lt;/google-maps-api&gt;
 * &lt;script&gt;
 *   var mapsAPI = document.querySelector(&#39;google-maps-api&#39;);
 *   mapsAPI.addEventListener(&#39;api-load&#39;, function(e) {
 *     // this.api === google.maps
 *   });
 * &lt;/script&gt;
 * 
 * 
 * </code></pre><p>Any number of components can use <code>&lt;google-maps-api&gt;</code> elements, and the library will only be loaded once.</p>
 */
@JsType(isNative=true)
public interface GoogleMapsApiElement extends HTMLElement {

    @JsOverlay public static final String TAG = "google-maps-api";
    @JsOverlay public static final String SRC = "google-apis/google-maps-api.html";


    /**
     * <p>If true, sign-in is enabled.<br>See <a href="https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in">https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in</a></p>
     *
     * JavaScript Info:
     * @property signedIn
     * @type Boolean
     * 
     */
    @JsProperty boolean getSignedIn();
    /**
     * <p>If true, sign-in is enabled.<br>See <a href="https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in">https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in</a></p>
     *
     * JavaScript Info:
     * @property signedIn
     * @type Boolean
     * 
     */
    @JsProperty void setSignedIn(boolean value);

    /**
     * <p>A Maps API key. To obtain an API key, see developers.google.com/maps/documentation/javascript/tutorial#api_key.</p>
     *
     * JavaScript Info:
     * @property apiKey
     * @type String
     * 
     */
    @JsProperty String getApiKey();
    /**
     * <p>A Maps API key. To obtain an API key, see developers.google.com/maps/documentation/javascript/tutorial#api_key.</p>
     *
     * JavaScript Info:
     * @property apiKey
     * @type String
     * 
     */
    @JsProperty void setApiKey(String value);

    /**
     * <p>A Maps API for Business Client ID. To obtain a Maps API for Business Client ID, see developers.google.com/maps/documentation/business/.<br>If set, a Client ID will take precedence over an API Key.</p>
     *
     * JavaScript Info:
     * @property clientId
     * @type String
     * 
     */
    @JsProperty String getClientId();
    /**
     * <p>A Maps API for Business Client ID. To obtain a Maps API for Business Client ID, see developers.google.com/maps/documentation/business/.<br>If set, a Client ID will take precedence over an API Key.</p>
     *
     * JavaScript Info:
     * @property clientId
     * @type String
     * 
     */
    @JsProperty void setClientId(String value);

    /**
     * <p>The localized language to load the Maps API with. For more information<br>see <a href="https://developers.google.com/maps/documentation/javascript/basics#Language">https://developers.google.com/maps/documentation/javascript/basics#Language</a></p>
     * <p>Note: the Maps API defaults to the preffered language setting of the browser.<br>Use this parameter to override that behavior.</p>
     *
     * JavaScript Info:
     * @property language
     * @type String
     * 
     */
    @JsProperty String getLanguage();
    /**
     * <p>The localized language to load the Maps API with. For more information<br>see <a href="https://developers.google.com/maps/documentation/javascript/basics#Language">https://developers.google.com/maps/documentation/javascript/basics#Language</a></p>
     * <p>Note: the Maps API defaults to the preffered language setting of the browser.<br>Use this parameter to override that behavior.</p>
     *
     * JavaScript Info:
     * @property language
     * @type String
     * 
     */
    @JsProperty void setLanguage(String value);

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
     * <p>Version of the Maps API to use.</p>
     *
     * JavaScript Info:
     * @property version
     * @type String
     * 
     */
    @JsProperty String getVersion();
    /**
     * <p>Version of the Maps API to use.</p>
     *
     * JavaScript Info:
     * @property version
     * @type String
     * 
     */
    @JsProperty void setVersion(String value);

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

    /**
     * 
     *
     * JavaScript Info:
     * @property mapsUrl
     * @type String
     * 
     */
    @JsProperty String getMapsUrl();
    /**
     * 
     *
     * JavaScript Info:
     * @property mapsUrl
     * @type String
     * 
     */
    @JsProperty void setMapsUrl(String value);


}
