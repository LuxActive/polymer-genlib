/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from bwt-uploader project by Raju Maisnam,Dmytro Hrytsenko,Bhargav Konkathi,Blue Water Tracks Team
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.bwt.widget;

import com.vaadin.polymer.bwt.*;

import com.vaadin.polymer.bwt.widget.event.BwtUploaderDeleteEvent;
import com.vaadin.polymer.bwt.widget.event.BwtUploaderDeleteEventHandler;

import com.vaadin.polymer.bwt.widget.event.BwtUploaderResetEvent;
import com.vaadin.polymer.bwt.widget.event.BwtUploaderResetEventHandler;

import com.vaadin.polymer.bwt.widget.event.BwtUploaderResponseEvent;
import com.vaadin.polymer.bwt.widget.event.BwtUploaderResponseEventHandler;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>bwt-uploader</code> is a drag and drop upload component for images and pdfs file with support for preview of uploaded files.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties are available for styling:</p>
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
 * <td><code>--preview-border</code></td>
 * <td>Border of preview</td>
 * <td><code>1px dahsed #dbdbdb</code></td>
 * </tr>
 * <tr>
 * <td><code>--preview-width</code></td>
 * <td>Width of preview area</td>
 * <td><code>250px</code></td>
 * </tr>
 * <tr>
 * <td><code>--preview-height</code></td>
 * <td>Height of preview area</td>
 * <td><code>250px</code></td>
 * </tr>
 * <tr>
 * <td><code>--progress-bar-color</code></td>
 * <td>Progress bar color</td>
 * <td><code>#03a9f4</code></td>
 * </tr>
 * <tr>
 * <td><code>--progress-bar-height</code></td>
 * <td>Progress bar color</td>
 * <td><code>5px</code></td>
 * </tr>
 * <tr>
 * <td><code>--primary-text-color</code></td>
 * <td>Description text color</td>
 * <td><code>#9b9b9b</code></td>
 * </tr>
 * <tr>
 * <td><code>--secondary-text-color</code></td>
 * <td>Browse text color</td>
 * <td><code>#1976d3</code>,</td>
 * </tr>
 * <tr>
 * <td><code>--progress-error-color</code></td>
 * <td>Progress bar error and error text color</td>
 * <td><code>#f40303</code></td>
 * </tr>
 * </tbody>
 * </table>
 * <h3 id="installation">Installation</h3>
 * <p>Install with bower</p>
 * <pre><code>bower install bwt-uploader
 * 
 * 
 * </code></pre><p>If you want to save it in bower.json file, remember to add flag –save</p>
 * <pre><code>bower install --save bwt-uploader
 * 
 * 
 * </code></pre>
 */
public class BwtUploader extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public BwtUploader() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public BwtUploader(String html) {
        super(BwtUploaderElement.TAG, BwtUploaderElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public BwtUploaderElement getPolymerElement() {
        return (BwtUploaderElement) getElement();
    }


    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * 
     */
    public JavaScriptObject getError() {
        return getPolymerElement().getError();
    }
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * 
     */
    public void setError(JavaScriptObject value) {
        getPolymerElement().setError(value);
    }

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    public JavaScriptObject getFile() {
        return getPolymerElement().getFile();
    }
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    public void setFile(JavaScriptObject value) {
        getPolymerElement().setFile(value);
    }

    /**
     * <p>Additional Headers, empty by default</p>
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
     * <p>Additional Headers, empty by default</p>
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
     * <pre><code>      Height of resized image in pixels, width will be adjusted proptionally
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    public double getHeight() {
        return getPolymerElement().getHeight();
    }
    /**
     * <pre><code>      Height of resized image in pixels, width will be adjusted proptionally
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @property height
     * @type Number
     * 
     */
    public void setHeight(double value) {
        getPolymerElement().setHeight(value);
    }

    /**
     * <p>Maximum accepted File size in Kilo Bytes *</p>
     *
     * JavaScript Info:
     * @property maxFileSize
     * @type Number
     * 
     */
    public double getMaxFileSize() {
        return getPolymerElement().getMaxFileSize();
    }
    /**
     * <p>Maximum accepted File size in Kilo Bytes *</p>
     *
     * JavaScript Info:
     * @property maxFileSize
     * @type Number
     * 
     */
    public void setMaxFileSize(double value) {
        getPolymerElement().setMaxFileSize(value);
    }

    /**
     * <p> Object which contains the response as well as any other properties to be passed on to the api</p>
     *
     * JavaScript Info:
     * @property body
     * @type Object
     * 
     */
    public JavaScriptObject getBody() {
        return getPolymerElement().getBody();
    }
    /**
     * <p> Object which contains the response as well as any other properties to be passed on to the api</p>
     *
     * JavaScript Info:
     * @property body
     * @type Object
     * 
     */
    public void setBody(JavaScriptObject value) {
        getPolymerElement().setBody(value);
    }

    /**
     * <p>a value that the uploader expects to be data binded to</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    public JavaScriptObject getValue() {
        return getPolymerElement().getValue();
    }
    /**
     * <p>a value that the uploader expects to be data binded to</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    public void setValue(JavaScriptObject value) {
        getPolymerElement().setValue(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * 
     */
    public boolean getCustomClass() {
        return getPolymerElement().getCustomClass();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * 
     */
    public void setCustomClass(boolean value) {
        getPolymerElement().setCustomClass(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * @behavior BwtProgressBar
     */
    public boolean getPlaceHolderRemoved() {
        return getPolymerElement().getPlaceHolderRemoved();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * @behavior BwtProgressBar
     */
    public void setPlaceHolderRemoved(boolean value) {
        getPolymerElement().setPlaceHolderRemoved(value);
    }

    /**
     * <p> Set to true if the image uploaded is to be resized if the height is found to be greater than the height property below</p>
     *
     * JavaScript Info:
     * @property resize
     * @type Boolean
     * 
     */
    public boolean getResize() {
        return getPolymerElement().getResize();
    }
    /**
     * <p> Set to true if the image uploaded is to be resized if the height is found to be greater than the height property below</p>
     *
     * JavaScript Info:
     * @property resize
     * @type Boolean
     * 
     */
    public void setResize(boolean value) {
        getPolymerElement().setResize(value);
    }

    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    public String getTheme() {
        return getPolymerElement().getTheme();
    }
    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    public void setTheme(String value) {
        getPolymerElement().setTheme(value);
    }

    /**
     * <p>Plceholder text, not a lot to do but we thought it might be nice to have something just in case *</p>
     *
     * JavaScript Info:
     * @property uploadText
     * @type String
     * 
     */
    public String getUploadText() {
        return getPolymerElement().getUploadText();
    }
    /**
     * <p>Plceholder text, not a lot to do but we thought it might be nice to have something just in case *</p>
     *
     * JavaScript Info:
     * @property uploadText
     * @type String
     * 
     */
    public void setUploadText(String value) {
        getPolymerElement().setUploadText(value);
    }

    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public String getPlaceholder() {
        return getPolymerElement().getPlaceholder();
    }
    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    public void setPlaceholder(String value) {
        getPolymerElement().setPlaceholder(value);
    }

    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    public String getImage() {
        return getPolymerElement().getImage();
    }
    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    public void setImage(String value) {
        getPolymerElement().setImage(value);
    }

    /**
     * <p>Accepted File Types, The uploader is meant only for images and documents </p>
     *
     * JavaScript Info:
     * @property acceptedFileTypes
     * @type String
     * 
     */
    public String getAcceptedFileTypes() {
        return getPolymerElement().getAcceptedFileTypes();
    }
    /**
     * <p>Accepted File Types, The uploader is meant only for images and documents </p>
     *
     * JavaScript Info:
     * @property acceptedFileTypes
     * @type String
     * 
     */
    public void setAcceptedFileTypes(String value) {
        getPolymerElement().setAcceptedFileTypes(value);
    }

    /**
     * <p>Request type, PUT Method can be placed instead of POST</p>
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
     * <p>Request type, PUT Method can be placed instead of POST</p>
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
     * <p>Ajax end point where the file should upload to eg: /api/image/upload</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    public String getTarget() {
        return getPolymerElement().getTarget();
    }
    /**
     * <p>Ajax end point where the file should upload to eg: /api/image/upload</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    public void setTarget(String value) {
        getPolymerElement().setTarget(value);
    }


    // Needed in UIBinder
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @attribute file
     * 
     */
    public void setFile(String value) {
        Polymer.property(this.getPolymerElement(), "file", value);
    }

    // Needed in UIBinder
    /**
     * <p>Additional Headers, empty by default</p>
     *
     * JavaScript Info:
     * @attribute headers
     * 
     */
    public void setHeaders(String value) {
        Polymer.property(this.getPolymerElement(), "headers", value);
    }

    // Needed in UIBinder
    /**
     * <pre><code>      Height of resized image in pixels, width will be adjusted proptionally
     * 
     * </code></pre>
     *
     * JavaScript Info:
     * @attribute height
     * 
     */
    public void setHeight(String value) {
        Polymer.property(this.getPolymerElement(), "height", value);
    }

    // Needed in UIBinder
    /**
     * <p>Maximum accepted File size in Kilo Bytes *</p>
     *
     * JavaScript Info:
     * @attribute max-file-size
     * 
     */
    public void setMaxFileSize(String value) {
        Polymer.property(this.getPolymerElement(), "maxFileSize", value);
    }

    // Needed in UIBinder
    /**
     * <p> Object which contains the response as well as any other properties to be passed on to the api</p>
     *
     * JavaScript Info:
     * @attribute body
     * 
     */
    public void setBody(String value) {
        Polymer.property(this.getPolymerElement(), "body", value);
    }

    // Needed in UIBinder
    /**
     * <p>a value that the uploader expects to be data binded to</p>
     *
     * JavaScript Info:
     * @attribute value
     * 
     */
    public void setValue(String value) {
        Polymer.property(this.getPolymerElement(), "value", value);
    }

    // Needed in UIBinder
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @attribute error
     * @behavior BwtProgressBar
     */
    public void setError(String value) {
        Polymer.property(this.getPolymerElement(), "error", value);
    }


    /**
     * 
     *
     * JavaScript Info:
     * @method reset
     * 
     * 
     */
    public void reset() {
        getPolymerElement().reset();
    }


    /**
     * <p>Fired when the confirm button is clicked on delete</p>
     *
     * JavaScript Info:
     * @event bwt-uploader-delete
     */
    public HandlerRegistration addBwtUploaderDeleteHandler(BwtUploaderDeleteEventHandler handler) {
        return addDomHandler(handler, BwtUploaderDeleteEvent.TYPE);
    }

    /**
     * <p>Fired when the whole component is reset to initial state</p>
     *
     * JavaScript Info:
     * @event bwt-uploader-reset
     */
    public HandlerRegistration addBwtUploaderResetHandler(BwtUploaderResetEventHandler handler) {
        return addDomHandler(handler, BwtUploaderResetEvent.TYPE);
    }

    /**
     * <p>Fired when a response is received.</p>
     *
     * JavaScript Info:
     * @event bwt-uploader-response
     */
    public HandlerRegistration addBwtUploaderResponseHandler(BwtUploaderResponseEventHandler handler) {
        return addDomHandler(handler, BwtUploaderResponseEvent.TYPE);
    }

}
