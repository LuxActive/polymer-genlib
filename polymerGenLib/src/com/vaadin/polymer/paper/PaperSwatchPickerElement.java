/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-swatch-picker project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>This is a simple color picker element that will allow you to choose one<br>of the Material Design colors from a list of available swatches.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-swatch-picker&gt;&lt;/paper-swatch-picker&gt;
 * 
 * &lt;paper-swatch-picker color=&quot;{{selectedColor}}&quot;&gt;&lt;/paper-swatch-picker&gt;
 * 
 * 
 * </code></pre><p>You can configure the color palette being used using the <code>colorList</code> array and<br>the <code>columnCount</code> property, which specifies how many “generic” colours (i.e. columns<br>in the picker) you want to display.</p>
 * <pre><code>&lt;paper-swatch-picker column-count=5 color-list=&#39;[&quot;#65a5f2&quot;, &quot;#83be54&quot;, &quot;#f0d551&quot;, &quot;#e5943c&quot;, &quot;#a96ddb&quot;]&#39;&gt;&lt;/paper-swatch-picker&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
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
 * <td><code>--paper-swatch-picker-color-size</code></td>
 * <td>The size of each of the color boxes</td>
 * <td><code>20px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-swatch-picker-icon-size</code></td>
 * <td>The size of the color picker icon</td>
 * <td><code>24px</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-swatch-picker-icon</code></td>
 * <td>Mixin applied to the color picker icon</td>
 * <td><code>{}</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperSwatchPickerElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-swatch-picker";
    @JsOverlay public static final String SRC = "paper-swatch-picker/paper-swatch-picker.html";


    /**
     * <p>The colors to be displayed. By default, these are the Material Design<br>colors. This array is arranged by “generic color”, so for example,<br>all the reds (from light to dark), then the pinks, then the blues, etc.<br>Depending on how many of these generic colors you have, you should<br>update the <code>columnCount</code> property.</p>
     *
     * JavaScript Info:
     * @property colorList
     * @type Array
     * 
     */
    @JsProperty JsArray getColorList();
    /**
     * <p>The colors to be displayed. By default, these are the Material Design<br>colors. This array is arranged by “generic color”, so for example,<br>all the reds (from light to dark), then the pinks, then the blues, etc.<br>Depending on how many of these generic colors you have, you should<br>update the <code>columnCount</code> property.</p>
     *
     * JavaScript Info:
     * @property colorList
     * @type Array
     * 
     */
    @JsProperty void setColorList(JsArray value);

    /**
     * <p> The number of columns to display in the picker. This corresponds to<br>the number of generic colors (i.e. not counting the light/dark) variants<br>of a specific color) you are using in your <code>colorList</code>. For example,<br>the Material Design palette has 18 colors </p>
     *
     * JavaScript Info:
     * @property columnCount
     * @type Number
     * 
     */
    @JsProperty double getColumnCount();
    /**
     * <p> The number of columns to display in the picker. This corresponds to<br>the number of generic colors (i.e. not counting the light/dark) variants<br>of a specific color) you are using in your <code>colorList</code>. For example,<br>the Material Design palette has 18 colors </p>
     *
     * JavaScript Info:
     * @property columnCount
     * @type Number
     * 
     */
    @JsProperty void setColumnCount(double value);

    /**
     * <p>If true, the color picker button will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty boolean getNoink();
    /**
     * <p>If true, the color picker button will not produce a ripple effect when interacted<br>with via the pointer.</p>
     *
     * JavaScript Info:
     * @property noink
     * @type Boolean
     * 
     */
    @JsProperty void setNoink(boolean value);

    /**
     * <p>The selected color, as hex (i.e. #ffffff).<br>value.</p>
     *
     * JavaScript Info:
     * @property color
     * @type String
     * 
     */
    @JsProperty String getColor();
    /**
     * <p>The selected color, as hex (i.e. #ffffff).<br>value.</p>
     *
     * JavaScript Info:
     * @property color
     * @type String
     * 
     */
    @JsProperty void setColor(String value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty String getHorizontalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>horizontally relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property horizontalAlign
     * @type String
     * 
     */
    @JsProperty void setHorizontalAlign(String value);

    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty String getVerticalAlign();
    /**
     * <p>The orientation against which to align the menu dropdown<br>vertically relative to the dropdown trigger.</p>
     *
     * JavaScript Info:
     * @property verticalAlign
     * @type String
     * 
     */
    @JsProperty void setVerticalAlign(String value);


}
