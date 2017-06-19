/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from bwt-uploader project by Raju Maisnam,Dmytro Hrytsenko,Bhargav Konkathi,Blue Water Tracks Team
 * that is licensed with MIT license.
 */
package com.vaadin.polymer.bwt;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
@JsType(isNative=true)
public interface BwtUploaderElement extends HTMLElement {

    @JsOverlay public static final String TAG = "bwt-uploader";
    @JsOverlay public static final String SRC = "bwt-uploader/bwt-uploader.html";


    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getError();
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property error
     * @type Object
     * 
     */
    @JsProperty void setError(JavaScriptObject value);

    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getFile();
    /**
     * <p> private variable</p>
     *
     * JavaScript Info:
     * @property file
     * @type Object
     * 
     */
    @JsProperty void setFile(JavaScriptObject value);

    /**
     * <p>Additional Headers, empty by default</p>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getHeaders();
    /**
     * <p>Additional Headers, empty by default</p>
     *
     * JavaScript Info:
     * @property headers
     * @type Object
     * 
     */
    @JsProperty void setHeaders(JavaScriptObject value);

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
    @JsProperty double getHeight();
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
    @JsProperty void setHeight(double value);

    /**
     * <p>Maximum accepted File size in Kilo Bytes *</p>
     *
     * JavaScript Info:
     * @property maxFileSize
     * @type Number
     * 
     */
    @JsProperty double getMaxFileSize();
    /**
     * <p>Maximum accepted File size in Kilo Bytes *</p>
     *
     * JavaScript Info:
     * @property maxFileSize
     * @type Number
     * 
     */
    @JsProperty void setMaxFileSize(double value);

    /**
     * <p> Object which contains the response as well as any other properties to be passed on to the api</p>
     *
     * JavaScript Info:
     * @property body
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getBody();
    /**
     * <p> Object which contains the response as well as any other properties to be passed on to the api</p>
     *
     * JavaScript Info:
     * @property body
     * @type Object
     * 
     */
    @JsProperty void setBody(JavaScriptObject value);

    /**
     * <p>a value that the uploader expects to be data binded to</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getValue();
    /**
     * <p>a value that the uploader expects to be data binded to</p>
     *
     * JavaScript Info:
     * @property value
     * @type Object
     * 
     */
    @JsProperty void setValue(JavaScriptObject value);

    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * 
     */
    @JsProperty boolean getCustomClass();
    /**
     * 
     *
     * JavaScript Info:
     * @property customClass
     * @type Boolean
     * 
     */
    @JsProperty void setCustomClass(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * @behavior BwtProgressBar
     */
    @JsProperty boolean getPlaceHolderRemoved();
    /**
     * 
     *
     * JavaScript Info:
     * @property placeHolderRemoved
     * @type Boolean
     * @behavior BwtProgressBar
     */
    @JsProperty void setPlaceHolderRemoved(boolean value);

    /**
     * <p> Set to true if the image uploaded is to be resized if the height is found to be greater than the height property below</p>
     *
     * JavaScript Info:
     * @property resize
     * @type Boolean
     * 
     */
    @JsProperty boolean getResize();
    /**
     * <p> Set to true if the image uploaded is to be resized if the height is found to be greater than the height property below</p>
     *
     * JavaScript Info:
     * @property resize
     * @type Boolean
     * 
     */
    @JsProperty void setResize(boolean value);

    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty String getTheme();
    /**
     * <p>The type of placeholder, accepts either one of two arguments; square or circle</p>
     *
     * JavaScript Info:
     * @property theme
     * @type String
     * 
     */
    @JsProperty void setTheme(String value);

    /**
     * <p>Plceholder text, not a lot to do but we thought it might be nice to have something just in case *</p>
     *
     * JavaScript Info:
     * @property uploadText
     * @type String
     * 
     */
    @JsProperty String getUploadText();
    /**
     * <p>Plceholder text, not a lot to do but we thought it might be nice to have something just in case *</p>
     *
     * JavaScript Info:
     * @property uploadText
     * @type String
     * 
     */
    @JsProperty void setUploadText(String value);

    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty String getPlaceholder();
    /**
     * <p>location of the placeholder image</p>
     *
     * JavaScript Info:
     * @property placeholder
     * @type String
     * 
     */
    @JsProperty void setPlaceholder(String value);

    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    @JsProperty String getImage();
    /**
     * <p> url of the image to be displayed, this can be used mixed with the placeholder</p>
     *
     * JavaScript Info:
     * @property image
     * @type String
     * 
     */
    @JsProperty void setImage(String value);

    /**
     * <p>Accepted File Types, The uploader is meant only for images and documents </p>
     *
     * JavaScript Info:
     * @property acceptedFileTypes
     * @type String
     * 
     */
    @JsProperty String getAcceptedFileTypes();
    /**
     * <p>Accepted File Types, The uploader is meant only for images and documents </p>
     *
     * JavaScript Info:
     * @property acceptedFileTypes
     * @type String
     * 
     */
    @JsProperty void setAcceptedFileTypes(String value);

    /**
     * <p>Request type, PUT Method can be placed instead of POST</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty String getMethod();
    /**
     * <p>Request type, PUT Method can be placed instead of POST</p>
     *
     * JavaScript Info:
     * @property method
     * @type String
     * 
     */
    @JsProperty void setMethod(String value);

    /**
     * <p>Ajax end point where the file should upload to eg: /api/image/upload</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    @JsProperty String getTarget();
    /**
     * <p>Ajax end point where the file should upload to eg: /api/image/upload</p>
     *
     * JavaScript Info:
     * @property target
     * @type String
     * 
     */
    @JsProperty void setTarget(String value);


    /**
     * 
     *
     * JavaScript Info:
     * @method reset
     * 
     * 
     */
    void reset();

}
