/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from pdf-browser-viewer project by Andrew Willard (https://github.com/andrew-silva-movile)
 * that is licensed with unknown license.
 */
package com.vaadin.polymer.pdf;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Example:</p>
 * <pre><code class="lang-html">    &lt;pdf-browser-viewer id=&quot;pdfViewer&quot; file=&quot;[[pdfUrl]]&quot; width=&quot;100%&quot;&gt;&lt;/pdf-browser-viewer&gt;
 * </code></pre>
 * <p>Data Bind with Blob example:</p>
 * <pre><code class="lang-js">    this.pdfUrl = URL.createObjectURL(blob);
 * </code></pre>
 * <p>Clear PDF container example:</p>
 * <pre><code class="lang-js">    this.$.pdfViewer.clear();
 * </code></pre>
 * <p>Message example:</p>
 * <pre><code class="lang-html">    &lt;pdf-browser-viewer
 *         file=&quot;[[pdfUrl]]&quot;
 *         not-supported-message=&quot;Not supported by your browser&quot;
 *         not-supported-link-message=&quot;see the file here!&quot;&gt;
 *     &lt;/pdf-browser-viewer&gt;
 * </code></pre>
 * <p>Card example:</p>
 * <pre><code class="lang-html">    &lt;pdf-browser-viewer
 *         file=&quot;[[pdfUrl]]&quot;
 *         card elevation=&quot;3&quot;
 *         download-label=&quot;Baixar&quot;&gt;
 *     &lt;/pdf-browser-viewer&gt;
 * </code></pre>
 */
@JsType(isNative=true)
public interface PdfBrowserViewerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "pdf-browser-viewer";
    @JsOverlay public static final String SRC = "pdf-browser-viewer/pdf-browser-viewer.html";


    /**
     * <p>PDF viewer as a card with download button.</p>
     *
     * JavaScript Info:
     * @property card
     * @type Boolean
     * 
     */
    @JsProperty boolean getCard();
    /**
     * <p>PDF viewer as a card with download button.</p>
     *
     * JavaScript Info:
     * @property card
     * @type Boolean
     * 
     */
    @JsProperty void setCard(boolean value);

    /**
     * <p>Download button label.</p>
     *
     * JavaScript Info:
     * @property downloadLabel
     * @type String
     * 
     */
    @JsProperty String getDownloadLabel();
    /**
     * <p>Download button label.</p>
     *
     * JavaScript Info:
     * @property downloadLabel
     * @type String
     * 
     */
    @JsProperty void setDownloadLabel(String value);

    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type String
     * 
     */
    @JsProperty String getElevation();
    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type String
     * 
     */
    @JsProperty void setElevation(String value);

    /**
     * <p>The location of the PDF file.</p>
     *
     * JavaScript Info:
     * @property file
     * @type String
     * 
     */
    @JsProperty String getFile();
    /**
     * <p>The location of the PDF file.</p>
     *
     * JavaScript Info:
     * @property file
     * @type String
     * 
     */
    @JsProperty void setFile(String value);

    /**
     * <p>The height of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property height
     * @type String
     * 
     */
    @JsProperty String getHeight();
    /**
     * <p>The height of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property height
     * @type String
     * 
     */
    @JsProperty void setHeight(String value);

    /**
     * <p>The PDF link message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedLinkMessage
     * @type String
     * 
     */
    @JsProperty String getNotSupportedLinkMessage();
    /**
     * <p>The PDF link message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedLinkMessage
     * @type String
     * 
     */
    @JsProperty void setNotSupportedLinkMessage(String value);

    /**
     * <p>The message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedMessage
     * @type String
     * 
     */
    @JsProperty String getNotSupportedMessage();
    /**
     * <p>The message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedMessage
     * @type String
     * 
     */
    @JsProperty void setNotSupportedMessage(String value);

    /**
     * <p>The width of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property width
     * @type String
     * 
     */
    @JsProperty String getWidth();
    /**
     * <p>The width of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property width
     * @type String
     * 
     */
    @JsProperty void setWidth(String value);


    /**
     * <p>Clear PDF container</p>
     *
     * JavaScript Info:
     * @method clear
     * 
     * 
     */
    void clear();

}
