/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.iron.IronAjaxElement;
import com.vaadin.polymer.iron.widget.event.ErrorEvent;
import com.vaadin.polymer.iron.widget.event.ErrorEventHandler;
import com.vaadin.polymer.iron.widget.event.RequestEvent;
import com.vaadin.polymer.iron.widget.event.RequestEventHandler;
import com.vaadin.polymer.iron.widget.event.ResponseEvent;
import com.vaadin.polymer.iron.widget.event.ResponseEventHandler;

/**
 * <p>The <code>iron-ajax</code> element exposes network request functionality.</p>
 * <pre><code>&lt;iron-ajax
 *     auto
 *     url=&quot;http://gdata.youtube.com/feeds/api/videos/&quot;
 *     params=&#39;{&quot;alt&quot;:&quot;json&quot;, &quot;q&quot;:&quot;chrome&quot;}&#39;
 *     handle-as=&quot;json&quot;
 *     on-response=&quot;handleResponse&quot;
 *     debounce-duration=&quot;300&quot;&gt;&lt;/iron-ajax&gt;
 * 
 * 
 * </code></pre><p>With <code>auto</code> set to <code>true</code>, the element performs a request whenever<br>its <code>url</code>, <code>params</code> or <code>body</code> properties are changed. Automatically generated<br>requests will be debounced in the case that multiple attributes are changed<br>sequentially.</p>
 * <p>Note: The <code>params</code> attribute must be double quoted JSON.</p>
 * <p>You can trigger a request explicitly by calling <code>generateRequest</code> on the<br>element.</p>
 */
public class IronAjax extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronAjax() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronAjax(String html) {
        super(IronAjaxElement.TAG, IronAjaxElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.event.ErrorEvent.NAME,
                new com.vaadin.polymer.iron.event.ErrorEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.event.ErrorEvent event) {
                fireEvent(new ErrorEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.event.RequestEvent.NAME,
                new com.vaadin.polymer.iron.event.RequestEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.event.RequestEvent event) {
                fireEvent(new RequestEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.event.ResponseEvent.NAME,
                new com.vaadin.polymer.iron.event.ResponseEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.event.ResponseEvent event) {
                fireEvent(new ResponseEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronAjaxElement getPolymerElement() {
        try {
            return (IronAjaxElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    public JsArray getActiveRequests() {
        return getPolymerElement().getActiveRequests();
    }
    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    public void setActiveRequests(JsArray value) {
        getPolymerElement().setActiveRequests(value);
    }

    /**
     * <p>Length of time in milliseconds to debounce multiple requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    public double getDebounceDuration() {
        return getPolymerElement().getDebounceDuration();
    }
    /**
     * <p>Length of time in milliseconds to debounce multiple requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    public void setDebounceDuration(double value) {
        getPolymerElement().setDebounceDuration(value);
    }

    /**
     * <p>HTTP request headers to send.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax
     *     auto
     *     url=&quot;http://somesite.com&quot;
     *     headers=&#39;{&quot;X-Requested-With&quot;: &quot;XMLHttpRequest&quot;}&#39;
     *     handle-as=&quot;json&quot;
     *     last-response-changed=&quot;{{handleResponse}}&quot;&gt;&lt;/iron-ajax&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    public JavaScriptObject getHeaders() {
        return getPolymerElement().getHeaders();
    }
    /**
     * <p>HTTP request headers to send.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax
     *     auto
     *     url=&quot;http://somesite.com&quot;
     *     headers=&#39;{&quot;X-Requested-With&quot;: &quot;XMLHttpRequest&quot;}&#39;
     *     handle-as=&quot;json&quot;
     *     last-response-changed=&quot;{{handleResponse}}&quot;&gt;&lt;/iron-ajax&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    public void setHeaders(JavaScriptObject value) {
        getPolymerElement().setHeaders(value);
    }

    /**
     * <p>Will be set to the most recent error that resulted from a request<br>that originated from this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    public JavaScriptObject getLastError() {
        return getPolymerElement().getLastError();
    }
    /**
     * <p>Will be set to the most recent error that resulted from a request<br>that originated from this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    public void setLastError(JavaScriptObject value) {
        getPolymerElement().setLastError(value);
    }

    /**
     * <p>Will be set to the most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    public JavaScriptObject getLastRequest() {
        return getPolymerElement().getLastRequest();
    }
    /**
     * <p>Will be set to the most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    public void setLastRequest(JavaScriptObject value) {
        getPolymerElement().setLastRequest(value);
    }

    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    public JavaScriptObject getParams() {
        return getPolymerElement().getParams();
    }
    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    public void setParams(JavaScriptObject value) {
        getPolymerElement().setParams(value);
    }

    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    public boolean getVerbose() {
        return getPolymerElement().getVerbose();
    }
    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    public void setVerbose(boolean value) {
        getPolymerElement().setVerbose(value);
    }

    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    public boolean getAuto() {
        return getPolymerElement().getAuto();
    }
    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    public void setAuto(boolean value) {
        getPolymerElement().setAuto(value);
    }

    /**
     * <p>Will be set to true if there is at least one in-flight request<br>associated with this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public boolean getLoading() {
        return getPolymerElement().getLoading();
    }
    /**
     * <p>Will be set to true if there is at least one in-flight request<br>associated with this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    public void setLoading(boolean value) {
        getPolymerElement().setLoading(value);
    }

    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    public boolean getSync() {
        return getPolymerElement().getSync();
    }
    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    public void setSync(boolean value) {
        getPolymerElement().setSync(value);
    }

    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    public boolean getWithCredentials() {
        return getPolymerElement().getWithCredentials();
    }
    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    public void setWithCredentials(boolean value) {
        getPolymerElement().setWithCredentials(value);
    }

    /**
     * <p>Will be set to the most recent response received by a request<br>that originated from this iron-ajax element. The type of the response<br>is determined by the value of <code>handleas</code> at the time that the request<br>was generated.</p>
     *
     * JavaScript Info:
     * @property lastResponse
     * @type Object
     * 
     */
    public JavaScriptObject getLastResponse() {
        return getPolymerElement().getLastResponse();
    }
    /**
     * <p>Will be set to the most recent response received by a request<br>that originated from this iron-ajax element. The type of the response<br>is determined by the value of <code>handleas</code> at the time that the request<br>was generated.</p>
     *
     * JavaScript Info:
     * @property lastResponse
     * @type Object
     * 
     */
    public void setLastResponse(JavaScriptObject value) {
        getPolymerElement().setLastResponse(value);
    }

    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    public String getMethod() {
        return getPolymerElement().getMethod();
    }
    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    public void setMethod(String value) {
        getPolymerElement().setMethod(value);
    }

    /**
     * <p>Specifies what data to store in the <code>response</code> property, and<br>to deliver as <code>event.response</code> in <code>response</code> events.</p>
     * <p>One of:</p>
     * <p>   <code>text</code>: uses <code>XHR.responseText</code>.</p>
     * <p>   <code>xml</code>: uses <code>XHR.responseXML</code>.</p>
     * <p>   <code>json</code>: uses <code>XHR.responseText</code> parsed as JSON.</p>
     * <p>   <code>arraybuffer</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>blob</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>document</code>: uses <code>XHR.response</code>.</p>
     *
     * JavaScript Info:
     * @property handleAs
     * @type String
     * 
     */
    public String getHandleAs() {
        return getPolymerElement().getHandleAs();
    }
    /**
     * <p>Specifies what data to store in the <code>response</code> property, and<br>to deliver as <code>event.response</code> in <code>response</code> events.</p>
     * <p>One of:</p>
     * <p>   <code>text</code>: uses <code>XHR.responseText</code>.</p>
     * <p>   <code>xml</code>: uses <code>XHR.responseXML</code>.</p>
     * <p>   <code>json</code>: uses <code>XHR.responseText</code> parsed as JSON.</p>
     * <p>   <code>arraybuffer</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>blob</code>: uses <code>XHR.response</code>.</p>
     * <p>   <code>document</code>: uses <code>XHR.response</code>.</p>
     *
     * JavaScript Info:
     * @property handleAs
     * @type String
     * 
     */
    public void setHandleAs(String value) {
        getPolymerElement().setHandleAs(value);
    }

    /**
     * <p>Content type to use when sending data. If the contenttype is set<br>and a <code>Content-Type</code> header is specified in the <code>headers</code> attribute,<br>the <code>headers</code> attribute value will take precedence.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public String getContentType() {
        return getPolymerElement().getContentType();
    }
    /**
     * <p>Content type to use when sending data. If the contenttype is set<br>and a <code>Content-Type</code> header is specified in the <code>headers</code> attribute,<br>the <code>headers</code> attribute value will take precedence.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    public void setContentType(String value) {
        getPolymerElement().setContentType(value);
    }

    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    public String getUrl() {
        return getPolymerElement().getUrl();
    }
    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    public void setUrl(String value) {
        getPolymerElement().setUrl(value);
    }

    /**
     * <p>Optional raw body content to send when method === “POST”.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax method=&quot;POST&quot; auto url=&quot;http://somesite.com&quot;
     *     body=&#39;{&quot;foo&quot;:1, &quot;bar&quot;:2}&#39;&gt;
     * &lt;/iron-ajax&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property body
     * @type String
     * 
     */
    public String getBody() {
        return getPolymerElement().getBody();
    }
    /**
     * <p>Optional raw body content to send when method === “POST”.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax method=&quot;POST&quot; auto url=&quot;http://somesite.com&quot;
     *     body=&#39;{&quot;foo&quot;:1, &quot;bar&quot;:2}&#39;&gt;
     * &lt;/iron-ajax&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property body
     * @type String
     * 
     */
    public void setBody(String value) {
        getPolymerElement().setBody(value);
    }


    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @attribute active-requests
     * 
     */
    public void setActiveRequests(String value) {
        getPolymerElement().setAttribute("active-requests", value);
    }

    /**
     * <p>Length of time in milliseconds to debounce multiple requests.</p>
     *
     * JavaScript Info:
     * @attribute debounce-duration
     * 
     */
    public void setDebounceDuration(String value) {
        getPolymerElement().setAttribute("debounce-duration", value);
    }

    /**
     * <p>Will be set to the most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @attribute last-request
     * 
     */
    public void setLastRequest(String value) {
        getPolymerElement().setAttribute("last-request", value);
    }

    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request.</p>
     *
     * JavaScript Info:
     * @attribute params
     * 
     */
    public void setParams(String value) {
        getPolymerElement().setAttribute("params", value);
    }

    /**
     * <p>Will be set to the most recent response received by a request<br>that originated from this iron-ajax element. The type of the response<br>is determined by the value of <code>handleas</code> at the time that the request<br>was generated.</p>
     *
     * JavaScript Info:
     * @attribute last-response
     * 
     */
    public void setLastResponse(String value) {
        getPolymerElement().setAttribute("last-response", value);
    }

    /**
     * <p>Will be set to the most recent error that resulted from a request<br>that originated from this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @attribute last-error
     * 
     */
    public void setLastError(String value) {
        getPolymerElement().setAttribute("last-error", value);
    }

    /**
     * <p>HTTP request headers to send.</p>
     * <p>Example:</p>
     * <pre><code>&lt;iron-ajax
     *     auto
     *     url=&quot;http://somesite.com&quot;
     *     headers=&#39;{&quot;X-Requested-With&quot;: &quot;XMLHttpRequest&quot;}&#39;
     *     handle-as=&quot;json&quot;
     *     last-response-changed=&quot;{{handleResponse}}&quot;&gt;&lt;/iron-ajax&gt;
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute headers
     * 
     */
    public void setHeaders(String value) {
        getPolymerElement().setAttribute("headers", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method handleError
     * @param {} request  
     * @param {} error  
     * 
     * 
     */
    public void handleError(Object request, Object error) {
        getPolymerElement().handleError(request, error);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method discardRequest
     * @param {} request  
     * 
     * 
     */
    public void discardRequest(Object request) {
        getPolymerElement().discardRequest(request);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method handleResponse
     * @param {} request  
     * 
     * 
     */
    public void handleResponse(Object request) {
        getPolymerElement().handleResponse(request);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method requestOptionsChanged
     * 
     * 
     */
    public void requestOptionsChanged() {
        getPolymerElement().requestOptionsChanged();
    }

    /**
     * 
     *
     * JavaScript Info:
     * @method toRequestOptions
     * 
     * 
     */
    public void toRequestOptions() {
        getPolymerElement().toRequestOptions();
    }

    /**
     * <p>Performs an AJAX request to the specified URL.</p>
     *
     * JavaScript Info:
     * @method generateRequest
     * 
     * 
     */
    public void generateRequest() {
        getPolymerElement().generateRequest();
    }


    /**
     * <p>Fired when an error is received.</p>
     *
     * JavaScript Info:
     * @event error
     */
    public HandlerRegistration addErrorHandler(ErrorEventHandler handler) {
        return addHandler(handler, ErrorEvent.TYPE);
    }

    /**
     * <p>Fired when a request is sent.</p>
     *
     * JavaScript Info:
     * @event request
     */
    public HandlerRegistration addRequestHandler(RequestEventHandler handler) {
        return addHandler(handler, RequestEvent.TYPE);
    }

    /**
     * <p>Fired when a response is received.</p>
     *
     * JavaScript Info:
     * @event response
     */
    public HandlerRegistration addResponseHandler(ResponseEventHandler handler) {
        return addHandler(handler, ResponseEvent.TYPE);
    }

}
