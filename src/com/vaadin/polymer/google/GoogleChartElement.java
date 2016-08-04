/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p><code>google-chart</code> encapsulates Google Charts as a web component, allowing you to easily visualize<br>data. From simple line charts to complex hierarchical tree maps, the chart element provides a<br>number of ready-to-use chart types.</p>
 * <pre><code>&lt;google-chart
 *   type=&#39;pie&#39;
 *   options=&#39;{&quot;title&quot;: &quot;Distribution of days in 2001Q1&quot;}&#39;
 *   cols=&#39;[{&quot;label&quot;:&quot;Month&quot;, &quot;type&quot;:&quot;string&quot;}, {&quot;label&quot;:&quot;Days&quot;, &quot;type&quot;:&quot;number&quot;}]&#39;
 *   rows=&#39;[[&quot;Jan&quot;, 31],[&quot;Feb&quot;, 28],[&quot;Mar&quot;, 31]]&#39;&gt;
 * &lt;/google-chart&gt;
 * 
 * 
 * </code></pre><p>Height and width are specified as style attributes:</p>
 * <pre><code>google-chart {
 *   height: 300px;
 *   width: 50em;
 * }
 * 
 * 
 * </code></pre><p>Data can be provided in one of three ways:</p>
 * <ul>
 * <li><p>Via the <code>cols</code> and <code>rows</code> attributes:</p>
 * <p>  cols=’[{“label”:”Mth”, “type”:”string”}, {“label”:”Days”, “type”:”number”}]’<br>  rows=’[[“Jan”, 31],[“Feb”, 28],[“Mar”, 31]]’</p>
 * </li>
 * <li><p>Via the <code>data</code> attribute, passing in the data directly:</p>
 * <p>  data=’[[“Month”, “Days”], [“Jan”, 31], [“Feb”, 28], [“Mar”, 31]]’</p>
 * </li>
 * <li><p>Via the <code>data</code> attribute, passing in the URL to a resource containing the<br>data, in JSON format:</p>
 * <p>  data=’<a href="http://example.com/chart-data.json">http://example.com/chart-data.json</a>‘</p>
 * </li>
 * </ul>
 */
@JsType(isNative=true)
public interface GoogleChartElement extends HTMLElement {

    @JsOverlay public static final String TAG = "google-chart";
    @JsOverlay public static final String SRC = "google-chart/google-chart.html";


    /**
     * <p>Sets the data columns for this object.</p>
     * <p>When specifying data with <code>cols</code> you must also specify <code>rows</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[{label: “Categories”, type: “string”},<br> {label: “Value”, type: “number”}]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#DataTable_addColumn">Google Visualization API reference (addColumn)</a><br>for column definition format.</p>
     *
     * JavaScript Info:
     * @property cols
     * @type Array
     * 
     */
    @JsProperty JsArray getCols();
    /**
     * <p>Sets the data columns for this object.</p>
     * <p>When specifying data with <code>cols</code> you must also specify <code>rows</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[{label: “Categories”, type: “string”},<br> {label: “Value”, type: “number”}]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#DataTable_addColumn">Google Visualization API reference (addColumn)</a><br>for column definition format.</p>
     *
     * JavaScript Info:
     * @property cols
     * @type Array
     * 
     */
    @JsProperty void setCols(JsArray value);

    /**
     * <p>Sets the entire dataset for this object.<br>Can be used to provide the data directly, or to provide a URL from<br>which to request the data.</p>
     * <p>The data format can be a two-dimensional array or the DataTable format<br>expected by Google Charts.<br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#DataTable">Google Visualization API reference (DataTable constructor)</a><br>for data table format details.</p>
     * <p>When specifying data with <code>data</code> you must not specify <code>cols</code> or <code>rows</code>.</p>
     * <p>Example:</p>
     * <pre>[["Categories", "Value"],
     *  ["Category 1", 1.0],
     *  ["Category 2", 1.1]]</pre>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getData();
    /**
     * <p>Sets the entire dataset for this object.<br>Can be used to provide the data directly, or to provide a URL from<br>which to request the data.</p>
     * <p>The data format can be a two-dimensional array or the DataTable format<br>expected by Google Charts.<br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#DataTable">Google Visualization API reference (DataTable constructor)</a><br>for data table format details.</p>
     * <p>When specifying data with <code>data</code> you must not specify <code>cols</code> or <code>rows</code>.</p>
     * <p>Example:</p>
     * <pre>[["Categories", "Value"],
     *  ["Category 1", 1.0],
     *  ["Category 2", 1.1]]</pre>
     *
     * JavaScript Info:
     * @property data
     * @type Object
     * 
     */
    @JsProperty void setData(JavaScriptObject value);

    /**
     * <p>Sets the options for the chart.</p>
     * <p>Example:</p>
     * <p><pre>{<br>  title: “Chart title goes here”,<br>  hAxis: {title: “Categories”},<br>  vAxis: {title: “Values”, minValue: 0, maxValue: 2},<br>  legend: “none”<br>};</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for the options available to each chart type.</p>
     *
     * JavaScript Info:
     * @property options
     * @type Object
     * 
     */
    @JsProperty JavaScriptObject getOptions();
    /**
     * <p>Sets the options for the chart.</p>
     * <p>Example:</p>
     * <p><pre>{<br>  title: “Chart title goes here”,<br>  hAxis: {title: “Categories”},<br>  vAxis: {title: “Values”, minValue: 0, maxValue: 2},<br>  legend: “none”<br>};</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for the options available to each chart type.</p>
     *
     * JavaScript Info:
     * @property options
     * @type Object
     * 
     */
    @JsProperty void setOptions(JavaScriptObject value);

    /**
     * <p>Sets the data rows for this object.</p>
     * <p>When specifying data with <code>rows</code> you must also specify <code>cols</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[[“Category 1”, 1.0],<br> [“Category 2”, 1.1]]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#addrow">Google Visualization API reference (addRow)</a><br>for row format.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Array
     * 
     */
    @JsProperty JsArray getRows();
    /**
     * <p>Sets the data rows for this object.</p>
     * <p>When specifying data with <code>rows</code> you must also specify <code>cols</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[[“Category 1”, 1.0],<br> [“Category 2”, 1.1]]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#addrow">Google Visualization API reference (addRow)</a><br>for row format.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type Array
     * 
     */
    @JsProperty void setRows(JsArray value);

    /**
     * <p>Selected datapoint(s) in the map.</p>
     * <p>An array of objects, each with a numeric row and/or column property.<br><code>row</code> and <code>column</code> are the zero-based row or column number of an item<br>in the data table to select.</p>
     * <p>To select a whole column, set row to null;<br>to select a whole row, set column to null.</p>
     * <p>Example:</p>
     * <pre>
     *   [{row:0,column:1}, {row:1, column:null}]
     * </pre>
     *
     * JavaScript Info:
     * @property selection
     * @type Array
     * 
     */
    @JsProperty JsArray getSelection();
    /**
     * <p>Selected datapoint(s) in the map.</p>
     * <p>An array of objects, each with a numeric row and/or column property.<br><code>row</code> and <code>column</code> are the zero-based row or column number of an item<br>in the data table to select.</p>
     * <p>To select a whole column, set row to null;<br>to select a whole row, set column to null.</p>
     * <p>Example:</p>
     * <pre>
     *   [{row:0,column:1}, {row:1, column:null}]
     * </pre>
     *
     * JavaScript Info:
     * @property selection
     * @type Array
     * 
     */
    @JsProperty void setSelection(JsArray value);

    /**
     * <p>Sets the type of the chart.</p>
     * <p>Should be one of:</p>
     * <ul>
     * <li><code>area</code>, <code>bar</code>, <code>bubble</code>, <code>candlestick</code>, <code>column</code>, <code>combo</code>, <code>geo</code>,<br><code>histogram</code>, <code>line</code>, <code>pie</code>, <code>scatter</code>, <code>stepped-area</code>, <code>treemap</code></li>
     * </ul>
     * <p>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a> for details.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty String getType();
    /**
     * <p>Sets the type of the chart.</p>
     * <p>Should be one of:</p>
     * <ul>
     * <li><code>area</code>, <code>bar</code>, <code>bubble</code>, <code>candlestick</code>, <code>column</code>, <code>combo</code>, <code>geo</code>,<br><code>histogram</code>, <code>line</code>, <code>pie</code>, <code>scatter</code>, <code>stepped-area</code>, <code>treemap</code></li>
     * </ul>
     * <p>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a> for details.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty void setType(String value);


    /**
     * <p>Draws the chart.</p>
     * <p>Called automatically on first load and whenever one of the attributes<br>changes. Can be called manually to handle e.g. page resizes.</p>
     *
     * JavaScript Info:
     * @method drawChart
     * 
     * @return {JavaScriptObject}
     */
    JavaScriptObject drawChart();

    /**
     * <p>Returns the chart serialized as an image URI.</p>
     * <p>Call this after the chart is drawn (google-chart-render event).</p>
     *
     * JavaScript Info:
     * @method getImageURI
     * 
     * @return {String}
     */
    String getImageURI();

}
