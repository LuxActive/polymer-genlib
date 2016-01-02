/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-ajax project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.polymer.elemental.HTMLElement;

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
@JsType
public interface IronAjaxElement extends HTMLElement {

    public static final String TAG = "iron-ajax";
    public static final String SRC = "iron-ajax/iron-ajax.html";


    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    @JsProperty JsArray getActiveRequests();
    /**
     * <p>An Array of all in-flight requests originating from this iron-ajax<br>element.</p>
     *
     * JavaScript Info:
     * @property activeRequests
     * @type Array
     * 
     */
    @JsProperty void setActiveRequests(JsArray value);

    /**
     * <p>Length of time in milliseconds to debounce multiple requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    @JsProperty double getDebounceDuration();
    /**
     * <p>Length of time in milliseconds to debounce multiple requests.</p>
     *
     * JavaScript Info:
     * @property debounceDuration
     * @type Number
     * 
     */
    @JsProperty void setDebounceDuration(double value);

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
    @JsProperty JavaScriptObject getHeaders();
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
    @JsProperty void setHeaders(JavaScriptObject value);

    /**
     * <p>Will be set to the most recent error that resulted from a request<br>that originated from this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getLastError();
    /**
     * <p>Will be set to the most recent error that resulted from a request<br>that originated from this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastError
     * @type Object
     * 
     */
    @JsProperty void setLastError(JavaScriptObject value);

    /**
     * <p>Will be set to the most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getLastRequest();
    /**
     * <p>Will be set to the most recent request made by this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property lastRequest
     * @type Object
     * 
     */
    @JsProperty void setLastRequest(JavaScriptObject value);

    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getParams();
    /**
     * <p>An object that contains query parameters to be appended to the<br>specified <code>url</code> when generating a request.</p>
     *
     * JavaScript Info:
     * @property params
     * @type Object
     * 
     */
    @JsProperty void setParams(JavaScriptObject value);

    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    @JsProperty boolean getVerbose();
    /**
     * <p>If true, error messages will automatically be logged to the console.</p>
     *
     * JavaScript Info:
     * @property verbose
     * @type Boolean
     * 
     */
    @JsProperty void setVerbose(boolean value);

    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    @JsProperty boolean getAuto();
    /**
     * <p>If true, automatically performs an Ajax request when either <code>url</code> or<br><code>params</code> changes.</p>
     *
     * JavaScript Info:
     * @property auto
     * @type Boolean
     * 
     */
    @JsProperty void setAuto(boolean value);

    /**
     * <p>Will be set to true if there is at least one in-flight request<br>associated with this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty boolean getLoading();
    /**
     * <p>Will be set to true if there is at least one in-flight request<br>associated with this iron-ajax element.</p>
     *
     * JavaScript Info:
     * @property loading
     * @type Boolean
     * 
     */
    @JsProperty void setLoading(boolean value);

    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    @JsProperty boolean getSync();
    /**
     * <p>Toggle whether XHR is synchronous or asynchronous. Don’t change this<br>to true unless You Know What You Are Doing™.</p>
     *
     * JavaScript Info:
     * @property sync
     * @type Boolean
     * 
     */
    @JsProperty void setSync(boolean value);

    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    @JsProperty boolean getWithCredentials();
    /**
     * <p>Set the withCredentials flag on the request.</p>
     *
     * JavaScript Info:
     * @property withCredentials
     * @type Boolean
     * 
     */
    @JsProperty void setWithCredentials(boolean value);

    /**
     * <p>Will be set to the most recent response received by a request<br>that originated from this iron-ajax element. The type of the response<br>is determined by the value of <code>handleas</code> at the time that the request<br>was generated.</p>
     *
     * JavaScript Info:
     * @property lastResponse
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getLastResponse();
    /**
     * <p>Will be set to the most recent response received by a request<br>that originated from this iron-ajax element. The type of the response<br>is determined by the value of <code>handleas</code> at the time that the request<br>was generated.</p>
     *
     * JavaScript Info:
     * @property lastResponse
     * @type Object
     * 
     */
    @JsProperty void setLastResponse(JavaScriptObject value);

    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty String getMethod();
    /**
     * <p>The HTTP method to use such as ‘GET’, ‘POST’, ‘PUT’, or ‘DELETE’.<br>Default is ‘GET’.</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty void setMethod(String value);

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
    @JsProperty String getHandleAs();
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
    @JsProperty void setHandleAs(String value);

    /**
     * <p>Content type to use when sending data. If the contenttype is set<br>and a <code>Content-Type</code> header is specified in the <code>headers</code> attribute,<br>the <code>headers</code> attribute value will take precedence.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    @JsProperty String getContentType();
    /**
     * <p>Content type to use when sending data. If the contenttype is set<br>and a <code>Content-Type</code> header is specified in the <code>headers</code> attribute,<br>the <code>headers</code> attribute value will take precedence.</p>
     *
     * JavaScript Info:
     * @property contentType
     * @type String
     * 
     */
    @JsProperty void setContentType(String value);

    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    @JsProperty String getUrl();
    /**
     * <p>The URL target of the request.</p>
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    @JsProperty void setUrl(String value);

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
    @JsProperty String getBody();
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
    @JsProperty void setBody(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method discardRequest
     * @param {} request  
     * 
     * 
     */
    void discardRequest(Object request);

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
    void handleError(Object request, Object error);

    /**
     * 
     *
     * JavaScript Info:
     * @method handleResponse
     * @param {} request  
     * 
     * 
     */
    void handleResponse(Object request);

    /**
     * 
     *
     * JavaScript Info:
     * @method toRequestOptions
     * 
     * 
     */
    void toRequestOptions();

    /**
     * 
     *
     * JavaScript Info:
     * @method requestOptionsChanged
     * 
     * 
     */
    void requestOptionsChanged();

    /**
     * <p>Performs an AJAX request to the specified URL.</p>
     *
     * JavaScript Info:
     * @method generateRequest
     * 
     * 
     */
    void generateRequest();

}
