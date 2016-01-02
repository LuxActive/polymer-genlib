/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-apis project by Scott Miles <sjmiles@google.com>,Eric Bidelman <ebidel@gmail.com>
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.google.GoogleJsApiElement;
import com.vaadin.polymer.google.widget.event.JsApiLoadEvent;
import com.vaadin.polymer.google.widget.event.JsApiLoadEventHandler;

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
public class GoogleJsApi extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleJsApi() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleJsApi(String html) {
        super(GoogleJsApiElement.TAG, GoogleJsApiElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.google.event.JsApiLoadEvent.NAME,
                new com.vaadin.polymer.google.event.JsApiLoadEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.google.event.JsApiLoadEvent event) {
                fireEvent(new JsApiLoadEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleJsApiElement getPolymerElement() {
        try {
            return (GoogleJsApiElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
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
     * <p>Fired when the API library is loaded and available.</p>
     *
     * JavaScript Info:
     * @event js-api-load
     */
    public HandlerRegistration addJsApiLoadHandler(JsApiLoadEventHandler handler) {
        return addHandler(handler, JsApiLoadEvent.TYPE);
    }

}
