/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.widget;

import com.vaadin.polymer.google.*;

import com.vaadin.polymer.google.widget.event.ApiLoadEvent;
import com.vaadin.polymer.google.widget.event.ApiLoadEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class GoogleMapsApi extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleMapsApi() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleMapsApi(String html) {
        super(GoogleMapsApiElement.TAG, GoogleMapsApiElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleMapsApiElement getPolymerElement() {
        return (GoogleMapsApiElement) getElement();
    }


    /**
     * <p>If true, sign-in is enabled.<br>See <a href="https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in">https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in</a></p>
     *
     * JavaScript Info:
     * @property signedIn
     * @type Boolean
     * 
     */
    public boolean getSignedIn() {
        return getPolymerElement().getSignedIn();
    }
    /**
     * <p>If true, sign-in is enabled.<br>See <a href="https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in">https://developers.google.com/maps/documentation/javascript/signedin#enable_sign_in</a></p>
     *
     * JavaScript Info:
     * @property signedIn
     * @type Boolean
     * 
     */
    public void setSignedIn(boolean value) {
        getPolymerElement().setSignedIn(value);
    }

    /**
     * <p>A Maps API key. To obtain an API key, see developers.google.com/maps/documentation/javascript/tutorial#api_key.</p>
     *
     * JavaScript Info:
     * @property apiKey
     * @type String
     * 
     */
    public String getApiKey() {
        return getPolymerElement().getApiKey();
    }
    /**
     * <p>A Maps API key. To obtain an API key, see developers.google.com/maps/documentation/javascript/tutorial#api_key.</p>
     *
     * JavaScript Info:
     * @property apiKey
     * @type String
     * 
     */
    public void setApiKey(String value) {
        getPolymerElement().setApiKey(value);
    }

    /**
     * <p>A Maps API for Business Client ID. To obtain a Maps API for Business Client ID, see developers.google.com/maps/documentation/business/.<br>If set, a Client ID will take precedence over an API Key.</p>
     *
     * JavaScript Info:
     * @property clientId
     * @type String
     * 
     */
    public String getClientId() {
        return getPolymerElement().getClientId();
    }
    /**
     * <p>A Maps API for Business Client ID. To obtain a Maps API for Business Client ID, see developers.google.com/maps/documentation/business/.<br>If set, a Client ID will take precedence over an API Key.</p>
     *
     * JavaScript Info:
     * @property clientId
     * @type String
     * 
     */
    public void setClientId(String value) {
        getPolymerElement().setClientId(value);
    }

    /**
     * <p>The localized language to load the Maps API with. For more information<br>see <a href="https://developers.google.com/maps/documentation/javascript/basics#Language">https://developers.google.com/maps/documentation/javascript/basics#Language</a></p>
     * <p>Note: the Maps API defaults to the preffered language setting of the browser.<br>Use this parameter to override that behavior.</p>
     *
     * JavaScript Info:
     * @property language
     * @type String
     * 
     */
    public String getLanguage() {
        return getPolymerElement().getLanguage();
    }
    /**
     * <p>The localized language to load the Maps API with. For more information<br>see <a href="https://developers.google.com/maps/documentation/javascript/basics#Language">https://developers.google.com/maps/documentation/javascript/basics#Language</a></p>
     * <p>Note: the Maps API defaults to the preffered language setting of the browser.<br>Use this parameter to override that behavior.</p>
     *
     * JavaScript Info:
     * @property language
     * @type String
     * 
     */
    public void setLanguage(String value) {
        getPolymerElement().setLanguage(value);
    }

    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    public String getNotifyEvent() {
        return getPolymerElement().getNotifyEvent();
    }
    /**
     * <p>Name of event fired when library is loaded and available.</p>
     *
     * JavaScript Info:
     * @property notifyEvent
     * @type String
     * 
     */
    public void setNotifyEvent(String value) {
        getPolymerElement().setNotifyEvent(value);
    }

    /**
     * <p>Version of the Maps API to use.</p>
     *
     * JavaScript Info:
     * @property version
     * @type String
     * 
     */
    public String getVersion() {
        return getPolymerElement().getVersion();
    }
    /**
     * <p>Version of the Maps API to use.</p>
     *
     * JavaScript Info:
     * @property version
     * @type String
     * 
     */
    public void setVersion(String value) {
        getPolymerElement().setVersion(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    public String getLibraryUrl() {
        return getPolymerElement().getLibraryUrl();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property libraryUrl
     * @type String
     * 
     */
    public void setLibraryUrl(String value) {
        getPolymerElement().setLibraryUrl(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property mapsUrl
     * @type String
     * 
     */
    public String getMapsUrl() {
        return getPolymerElement().getMapsUrl();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property mapsUrl
     * @type String
     * 
     */
    public void setMapsUrl(String value) {
        getPolymerElement().setMapsUrl(value);
    }




    /**
     * <p>Fired when the Maps API library is loaded and ready.</p>
     *
     * JavaScript Info:
     * @event api-load
     */
    public HandlerRegistration addApiLoadHandler(ApiLoadEventHandler handler) {
        return addDomHandler(handler, ApiLoadEvent.TYPE);
    }

}
