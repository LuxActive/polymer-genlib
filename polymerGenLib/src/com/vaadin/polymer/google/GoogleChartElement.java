/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Wes Alvaro,Sérgio Gomes
 * that is licensed with Apache-2.0 license.
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
 * </code></pre><p>Note: if you’re passing JSON as attributes, single quotes are necessary to be valid JSON.<br>See <a href="https://www.polymer-project.org/1.0/docs/devguide/properties#configuring-object-and-array-properties">https://www.polymer-project.org/1.0/docs/devguide/properties#configuring-object-and-array-properties</a>.</p>
 * <p>Height and width are specified as style attributes:</p>
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
 * <li><p>Via the <code>data</code> attribute, passing in a Google DataTable object:</p>
 * <p>  data=’{{dataTable}}’</p>
 * </li>
 * <li><p>Via the <code>view</code> attribute, passing in a Google DataView object:</p>
 * <p>  view=’{{dataView}}’</p>
 * </li>
 * </ul>
 * <p>You can display the charts in locales other than “en” by setting the <code>lang</code> attribute<br>on the <code>html</code> tag of your document.</p>
 * <pre><code>&lt;html lang=&quot;ja&quot;&gt;
 * 
 * 
 * </code></pre>
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
     * @type (!Array|undefined)
     * 
     */
    @JsProperty Object getCols();
    /**
     * <p>Sets the data columns for this object.</p>
     * <p>When specifying data with <code>cols</code> you must also specify <code>rows</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[{label: “Categories”, type: “string”},<br> {label: “Value”, type: “number”}]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#DataTable_addColumn">Google Visualization API reference (addColumn)</a><br>for column definition format.</p>
     *
     * JavaScript Info:
     * @property cols
     * @type (!Array|undefined)
     * 
     */
    @JsProperty void setCols(Object value);

    /**
     * <p>Whether the chart is currently rendered.</p>
     *
     * JavaScript Info:
     * @property drawn
     * @type Boolean
     * 
     */
    @JsProperty boolean getDrawn();
    /**
     * <p>Whether the chart is currently rendered.</p>
     *
     * JavaScript Info:
     * @property drawn
     * @type Boolean
     * 
     */
    @JsProperty void setDrawn(boolean value);

    /**
     * <p>Enumerates the chart events that should be fired.</p>
     * <p>Charts support a variety of events. By default, this element only<br>fires on <code>ready</code> and <code>select</code>. If you would like to be notified of<br>other chart events, use this property to list them.<br>Events <code>ready</code> and <code>select</code> are always fired.<br>Changes to this property are <em>not</em> observed. Events are attached only<br>at chart construction time.</p>
     *
     * JavaScript Info:
     * @property events
     * @type Array
     * 
     */
    @JsProperty JsArray getEvents();
    /**
     * <p>Enumerates the chart events that should be fired.</p>
     * <p>Charts support a variety of events. By default, this element only<br>fires on <code>ready</code> and <code>select</code>. If you would like to be notified of<br>other chart events, use this property to list them.<br>Events <code>ready</code> and <code>select</code> are always fired.<br>Changes to this property are <em>not</em> observed. Events are attached only<br>at chart construction time.</p>
     *
     * JavaScript Info:
     * @property events
     * @type Array
     * 
     */
    @JsProperty void setEvents(JsArray value);

    /**
     * <p>Sets the entire dataset for this object to a Google DataView.</p>
     * <p>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#dataview-class">Google Visualization API reference (DataView)</a><br>for details.</p>
     * <p>When specifying data with <code>view</code> you must not specify <code>data</code>, <code>cols</code> or <code>rows</code>.</p>
     *
     * JavaScript Info:
     * @property view
     * @type (!google.visualization.DataView|undefined)
     * 
     */
    @JsProperty Object getView();
    /**
     * <p>Sets the entire dataset for this object to a Google DataView.</p>
     * <p>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#dataview-class">Google Visualization API reference (DataView)</a><br>for details.</p>
     * <p>When specifying data with <code>view</code> you must not specify <code>data</code>, <code>cols</code> or <code>rows</code>.</p>
     *
     * JavaScript Info:
     * @property view
     * @type (!google.visualization.DataView|undefined)
     * 
     */
    @JsProperty void setView(Object value);

    /**
     * <p>Sets the options for the chart.</p>
     * <p>Example:</p>
     * <p><pre>{<br>  title: “Chart title goes here”,<br>  hAxis: {title: “Categories”},<br>  vAxis: {title: “Values”, minValue: 0, maxValue: 2},<br>  legend: “none”<br>};</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for the options available to each chart type.</p>
     * <p>This property is observed via a deep object observer.<br>If you would like to make changes to a sub-property, be sure to use the<br>Polymer method <code>set</code>: <code>googleChart.set(&#39;options.vAxis.logScale&#39;, true)</code><br>(Note: Missing parent properties are not automatically created.)</p>
     *
     * JavaScript Info:
     * @property options
     * @type (!Object|undefined)
     * 
     */
    @JsProperty Object getOptions();
    /**
     * <p>Sets the options for the chart.</p>
     * <p>Example:</p>
     * <p><pre>{<br>  title: “Chart title goes here”,<br>  hAxis: {title: “Categories”},<br>  vAxis: {title: “Values”, minValue: 0, maxValue: 2},<br>  legend: “none”<br>};</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for the options available to each chart type.</p>
     * <p>This property is observed via a deep object observer.<br>If you would like to make changes to a sub-property, be sure to use the<br>Polymer method <code>set</code>: <code>googleChart.set(&#39;options.vAxis.logScale&#39;, true)</code><br>(Note: Missing parent properties are not automatically created.)</p>
     *
     * JavaScript Info:
     * @property options
     * @type (!Object|undefined)
     * 
     */
    @JsProperty void setOptions(Object value);

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
     * @type (!google.visualization.DataTable|!Array.<!Array>|!{cols: !Array, rows: (!Array.<!Array>|undefined)}|string|undefined)
     * 
     */
    @JsProperty Object getData();
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
     * @type (!google.visualization.DataTable|!Array.<!Array>|!{cols: !Array, rows: (!Array.<!Array>|undefined)}|string|undefined)
     * 
     */
    @JsProperty void setData(Object value);

    /**
     * <p>Sets the data rows for this object.</p>
     * <p>When specifying data with <code>rows</code> you must also specify <code>cols</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[[“Category 1”, 1.0],<br> [“Category 2”, 1.1]]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#addrow">Google Visualization API reference (addRow)</a><br>for row format.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type (!Array.<!Array>|undefined)
     * 
     */
    @JsProperty Object getRows();
    /**
     * <p>Sets the data rows for this object.</p>
     * <p>When specifying data with <code>rows</code> you must also specify <code>cols</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[[“Category 1”, 1.0],<br> [“Category 2”, 1.1]]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#addrow">Google Visualization API reference (addRow)</a><br>for row format.</p>
     *
     * JavaScript Info:
     * @property rows
     * @type (!Array.<!Array>|undefined)
     * 
     */
    @JsProperty void setRows(Object value);

    /**
     * <p>Selected datapoint(s) in the chart.</p>
     * <p>An array of objects, each with a numeric row and/or column property.<br><code>row</code> and <code>column</code> are the zero-based row or column number of an item<br>in the data table to select.</p>
     * <p>To select a whole column, set row to null;<br>to select a whole row, set column to null.</p>
     * <p>Example:</p>
     * <pre>
     *   [{row:0,column:1}, {row:1, column:null}]
     * </pre>
     *
     * JavaScript Info:
     * @property selection
     * @type (!Array|undefined)
     * 
     */
    @JsProperty Object getSelection();
    /**
     * <p>Selected datapoint(s) in the chart.</p>
     * <p>An array of objects, each with a numeric row and/or column property.<br><code>row</code> and <code>column</code> are the zero-based row or column number of an item<br>in the data table to select.</p>
     * <p>To select a whole column, set row to null;<br>to select a whole row, set column to null.</p>
     * <p>Example:</p>
     * <pre>
     *   [{row:0,column:1}, {row:1, column:null}]
     * </pre>
     *
     * JavaScript Info:
     * @property selection
     * @type (!Array|undefined)
     * 
     */
    @JsProperty void setSelection(Object value);

    /**
     * <p>Sets the type of the chart.</p>
     * <p>Should be one of:</p>
     * <ul>
     * <li><code>area</code></li>
     * <li><code>(md-)bar</code></li>
     * <li><code>bubble</code></li>
     * <li><code>calendar</code></li>
     * <li><code>candlestick</code></li>
     * <li><code>column</code></li>
     * <li><code>combo</code></li>
     * <li><code>gauge</code></li>
     * <li><code>geo</code></li>
     * <li><code>histogram</code></li>
     * <li><code>(md-)line</code></li>
     * <li><code>org</code></li>
     * <li><code>pie</code></li>
     * <li><code>sankey</code></li>
     * <li><code>(md-)scatter</code></li>
     * <li><code>stepped-area</code></li>
     * <li><code>table</code></li>
     * <li><code>timeline</code></li>
     * <li><code>treemap</code></li>
     * <li><code>wordtree</code></li>
     * </ul>
     * <p>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for details.</p>
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
     * <li><code>area</code></li>
     * <li><code>(md-)bar</code></li>
     * <li><code>bubble</code></li>
     * <li><code>calendar</code></li>
     * <li><code>candlestick</code></li>
     * <li><code>column</code></li>
     * <li><code>combo</code></li>
     * <li><code>gauge</code></li>
     * <li><code>geo</code></li>
     * <li><code>histogram</code></li>
     * <li><code>(md-)line</code></li>
     * <li><code>org</code></li>
     * <li><code>pie</code></li>
     * <li><code>sankey</code></li>
     * <li><code>(md-)scatter</code></li>
     * <li><code>stepped-area</code></li>
     * <li><code>table</code></li>
     * <li><code>timeline</code></li>
     * <li><code>treemap</code></li>
     * <li><code>wordtree</code></li>
     * </ul>
     * <p>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for details.</p>
     *
     * JavaScript Info:
     * @property type
     * @type String
     * 
     */
    @JsProperty void setType(String value);


    /**
     * <p>Redraws the chart.</p>
     * <p>Called automatically when data/type/selection attributes change.<br>Call manually to handle view updates, page resizes, etc.</p>
     *
     * JavaScript Info:
     * @method redraw
     * 
     * 
     */
    void redraw();

}
