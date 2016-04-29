/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget;

import com.vaadin.polymer.google.*;

import com.vaadin.polymer.google.widget.event.GoogleApiLoadEvent;
import com.vaadin.polymer.google.widget.event.GoogleApiLoadEventHandler;

import com.vaadin.polymer.google.widget.event.GoogleApiLoadErrorEvent;
import com.vaadin.polymer.google.widget.event.GoogleApiLoadErrorEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class GoogleClientLoader extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleClientLoader() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleClientLoader(String html) {
        super(GoogleClientLoaderElement.TAG, GoogleClientLoaderElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleClientLoaderElement getPolymerElement() {
        try {
            return (GoogleClientLoaderElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>Root URL where to load the API from, e.g. ‘<a href="http://host/apis">http://host/apis</a>‘.<br>For App Engine dev server this would be something like:<br>‘<a href="http://localhost:8080/_ah/api">http://localhost:8080/_ah/api</a>‘.<br>Overrides ‘appId’ if both are specified.</p>
     *
     * JavaScript Info:
     * @property apiRoot
     * @type string
     * 
     */
    public String getApiRoot() {
        return getPolymerElement().getApiRoot();
    }
    /**
     * <p>Root URL where to load the API from, e.g. ‘<a href="http://host/apis">http://host/apis</a>‘.<br>For App Engine dev server this would be something like:<br>‘<a href="http://localhost:8080/_ah/api">http://localhost:8080/_ah/api</a>‘.<br>Overrides ‘appId’ if both are specified.</p>
     *
     * JavaScript Info:
     * @property apiRoot
     * @type string
     * 
     */
    public void setApiRoot(String value) {
        getPolymerElement().setApiRoot(value);
    }

    /**
     * <p>App Engine application ID for loading a Google Cloud Endpoints API.</p>
     *
     * JavaScript Info:
     * @property appId
     * @type string
     * 
     */
    public String getAppId() {
        return getPolymerElement().getAppId();
    }
    /**
     * <p>App Engine application ID for loading a Google Cloud Endpoints API.</p>
     *
     * JavaScript Info:
     * @property appId
     * @type string
     * 
     */
    public void setAppId(String value) {
        getPolymerElement().setAppId(value);
    }

    /**
     * <p>Name of the event fired when there is an error loading the library.</p>
     *
     * JavaScript Info:
     * @property errorEventName
     * @type String
     * 
     */
    public String getErrorEventName() {
        return getPolymerElement().getErrorEventName();
    }
    /**
     * <p>Name of the event fired when there is an error loading the library.</p>
     *
     * JavaScript Info:
     * @property errorEventName
     * @type String
     * 
     */
    public void setErrorEventName(String value) {
        getPolymerElement().setErrorEventName(value);
    }

    /**
     * <p>Name of the API to load, e.g. ‘urlshortener’.</p>
     * <p>You can find the full list of APIs on the<br><a href="https://developers.google.com/apis-explorer"> Google APIs<br>Explorer</a>.</p>
     *
     * JavaScript Info:
     * @property name
     * @type string
     * 
     */
    public String getName() {
        return getPolymerElement().getName();
    }
    /**
     * <p>Name of the API to load, e.g. ‘urlshortener’.</p>
     * <p>You can find the full list of APIs on the<br><a href="https://developers.google.com/apis-explorer"> Google APIs<br>Explorer</a>.</p>
     *
     * JavaScript Info:
     * @property name
     * @type string
     * 
     */
    public void setName(String value) {
        getPolymerElement().setName(value);
    }

    /**
     * <p>Name of the event fired when API library is loaded.</p>
     *
     * JavaScript Info:
     * @property successEventName
     * @type String
     * 
     */
    public String getSuccessEventName() {
        return getPolymerElement().getSuccessEventName();
    }
    /**
     * <p>Name of the event fired when API library is loaded.</p>
     *
     * JavaScript Info:
     * @property successEventName
     * @type String
     * 
     */
    public void setSuccessEventName(String value) {
        getPolymerElement().setSuccessEventName(value);
    }

    /**
     * <p>Version of the API to load, e.g. ‘v1’.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    public String getVersion() {
        return getPolymerElement().getVersion();
    }
    /**
     * <p>Version of the API to load, e.g. ‘v1’.</p>
     *
     * JavaScript Info:
     * @property version
     * @type string
     * 
     */
    public void setVersion(String value) {
        getPolymerElement().setVersion(value);
    }




    /**
     * <p>Fired when the requested API is loaded. Override this name<br>by setting <code>successEventName</code>.</p>
     *
     * JavaScript Info:
     * @event google-api-load
     */
    public HandlerRegistration addGoogleApiLoadHandler(GoogleApiLoadEventHandler handler) {
        return addDomHandler(handler, GoogleApiLoadEvent.TYPE);
    }

    /**
     * <p>Fired if an error occurs while loading the requested API. Override this name<br>by setting <code>errorEventName</code>.</p>
     *
     * JavaScript Info:
     * @event google-api-load-error
     */
    public HandlerRegistration addGoogleApiLoadErrorHandler(GoogleApiLoadErrorEventHandler handler) {
        return addDomHandler(handler, GoogleApiLoadErrorEvent.TYPE);
    }

}
