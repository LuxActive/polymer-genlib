/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from pdf-browser-viewer project by Andrew Willard (https://github.com/andrew-silva-movile)
 * that is licensed with unknown license.
 */
package com.vaadin.polymer.pdf.widget;

import com.vaadin.polymer.pdf.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

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
public class PdfBrowserViewer extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PdfBrowserViewer() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PdfBrowserViewer(String html) {
        super(PdfBrowserViewerElement.TAG, PdfBrowserViewerElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PdfBrowserViewerElement getPolymerElement() {
        return (PdfBrowserViewerElement) getElement();
    }


    /**
     * <p>PDF viewer as a card with download button.</p>
     *
     * JavaScript Info:
     * @property card
     * @type Boolean
     * 
     */
    public boolean getCard() {
        return getPolymerElement().getCard();
    }
    /**
     * <p>PDF viewer as a card with download button.</p>
     *
     * JavaScript Info:
     * @property card
     * @type Boolean
     * 
     */
    public void setCard(boolean value) {
        getPolymerElement().setCard(value);
    }

    /**
     * <p>Download button label.</p>
     *
     * JavaScript Info:
     * @property downloadLabel
     * @type String
     * 
     */
    public String getDownloadLabel() {
        return getPolymerElement().getDownloadLabel();
    }
    /**
     * <p>Download button label.</p>
     *
     * JavaScript Info:
     * @property downloadLabel
     * @type String
     * 
     */
    public void setDownloadLabel(String value) {
        getPolymerElement().setDownloadLabel(value);
    }

    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type String
     * 
     */
    public String getElevation() {
        return getPolymerElement().getElevation();
    }
    /**
     * <p>The z-depth of the card, from 0-5.</p>
     *
     * JavaScript Info:
     * @property elevation
     * @type String
     * 
     */
    public void setElevation(String value) {
        getPolymerElement().setElevation(value);
    }

    /**
     * <p>The location of the PDF file.</p>
     *
     * JavaScript Info:
     * @property file
     * @type String
     * 
     */
    public String getFile() {
        return getPolymerElement().getFile();
    }
    /**
     * <p>The location of the PDF file.</p>
     *
     * JavaScript Info:
     * @property file
     * @type String
     * 
     */
    public void setFile(String value) {
        getPolymerElement().setFile(value);
    }

    /**
     * <p>The height of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property height
     * @type String
     * 
     */
    public String getHeight() {
        return getPolymerElement().getHeight();
    }
    /**
     * <p>The height of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property height
     * @type String
     * 
     */
    public void setHeight(String value) {
        getPolymerElement().setHeight(value);
    }

    /**
     * <p>The PDF link message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedLinkMessage
     * @type String
     * 
     */
    public String getNotSupportedLinkMessage() {
        return getPolymerElement().getNotSupportedLinkMessage();
    }
    /**
     * <p>The PDF link message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedLinkMessage
     * @type String
     * 
     */
    public void setNotSupportedLinkMessage(String value) {
        getPolymerElement().setNotSupportedLinkMessage(value);
    }

    /**
     * <p>The message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedMessage
     * @type String
     * 
     */
    public String getNotSupportedMessage() {
        return getPolymerElement().getNotSupportedMessage();
    }
    /**
     * <p>The message when browser doesn’t support pdf object</p>
     *
     * JavaScript Info:
     * @property notSupportedMessage
     * @type String
     * 
     */
    public void setNotSupportedMessage(String value) {
        getPolymerElement().setNotSupportedMessage(value);
    }

    /**
     * <p>The width of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property width
     * @type String
     * 
     */
    public String getWidth() {
        return getPolymerElement().getWidth();
    }
    /**
     * <p>The width of the PDF viewer.</p>
     *
     * JavaScript Info:
     * @property width
     * @type String
     * 
     */
    public void setWidth(String value) {
        getPolymerElement().setWidth(value);
    }



    /**
     * <p>Clear PDF container</p>
     *
     * JavaScript Info:
     * @method clear
     * 
     * 
     */
    public void clear() {
        getPolymerElement().clear();
    }


}
