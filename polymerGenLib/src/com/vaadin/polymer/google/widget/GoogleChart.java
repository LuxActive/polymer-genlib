/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Sérgio Gomes
 * that is licensed with Apache2 license.
 */
package com.vaadin.polymer.google.widget;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.google.GoogleChartElement;
import com.vaadin.polymer.google.widget.event.GoogleChartRenderEvent;
import com.vaadin.polymer.google.widget.event.GoogleChartRenderEventHandler;
import com.vaadin.polymer.google.widget.event.GoogleChartSelectEvent;
import com.vaadin.polymer.google.widget.event.GoogleChartSelectEventHandler;

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
public class GoogleChart extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleChart() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleChart(String html) {
        super(GoogleChartElement.TAG, GoogleChartElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.google.event.GoogleChartRenderEvent.NAME,
                new com.vaadin.polymer.google.event.GoogleChartRenderEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.google.event.GoogleChartRenderEvent event) {
                fireEvent(new GoogleChartRenderEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.google.event.GoogleChartSelectEvent.NAME,
                new com.vaadin.polymer.google.event.GoogleChartSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.google.event.GoogleChartSelectEvent event) {
                fireEvent(new GoogleChartSelectEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleChartElement getPolymerElement() {
        try {
            return (GoogleChartElement) getElement();
        } catch (ClassCastException e) {
            jsinteropError();
            return null;
        }
    }


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
    public JsArray getCols() {
        return getPolymerElement().getCols();
    }
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
    public void setCols(JsArray value) {
        getPolymerElement().setCols(value);
    }

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
    public JavaScriptObject getData() {
        return getPolymerElement().getData();
    }
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
    public void setData(JavaScriptObject value) {
        getPolymerElement().setData(value);
    }

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
    public JavaScriptObject getOptions() {
        return getPolymerElement().getOptions();
    }
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
    public void setOptions(JavaScriptObject value) {
        getPolymerElement().setOptions(value);
    }

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
    public JsArray getRows() {
        return getPolymerElement().getRows();
    }
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
    public void setRows(JsArray value) {
        getPolymerElement().setRows(value);
    }

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
    public JsArray getSelection() {
        return getPolymerElement().getSelection();
    }
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
    public void setSelection(JsArray value) {
        getPolymerElement().setSelection(value);
    }

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
    public String getType() {
        return getPolymerElement().getType();
    }
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
    public void setType(String value) {
        getPolymerElement().setType(value);
    }


    /**
     * <p>Sets the data columns for this object.</p>
     * <p>When specifying data with <code>cols</code> you must also specify <code>rows</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[{label: “Categories”, type: “string”},<br> {label: “Value”, type: “number”}]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#DataTable_addColumn">Google Visualization API reference (addColumn)</a><br>for column definition format.</p>
     *
     * JavaScript Info:
     * @attribute cols
     * 
     */
    public void setCols(String value) {
        getPolymerElement().setAttribute("cols", value);
    }

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
     * @attribute data
     * 
     */
    public void setData(String value) {
        getPolymerElement().setAttribute("data", value);
    }

    /**
     * <p>Sets the options for the chart.</p>
     * <p>Example:</p>
     * <p><pre>{<br>  title: “Chart title goes here”,<br>  hAxis: {title: “Categories”},<br>  vAxis: {title: “Values”, minValue: 0, maxValue: 2},<br>  legend: “none”<br>};</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/gallery">Google Visualization API reference (Chart Gallery)</a><br>for the options available to each chart type.</p>
     *
     * JavaScript Info:
     * @attribute options
     * 
     */
    public void setOptions(String value) {
        getPolymerElement().setAttribute("options", value);
    }

    /**
     * <p>Sets the data rows for this object.</p>
     * <p>When specifying data with <code>rows</code> you must also specify <code>cols</code>, and<br>not specify <code>data</code>.</p>
     * <p>Example:</p>
     * <p><pre>[[“Category 1”, 1.0],<br> [“Category 2”, 1.1]]</pre><br>See <a href="https://google-developers.appspot.com/chart/interactive/docs/reference#addrow">Google Visualization API reference (addRow)</a><br>for row format.</p>
     *
     * JavaScript Info:
     * @attribute rows
     * 
     */
    public void setRows(String value) {
        getPolymerElement().setAttribute("rows", value);
    }

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
     * @attribute selection
     * 
     */
    public void setSelection(String value) {
        getPolymerElement().setAttribute("selection", value);
    }


    /**
     * <p>Draws the chart.</p>
     * <p>Called automatically on first load and whenever one of the attributes<br>changes. Can be called manually to handle e.g. page resizes.</p>
     *
     * JavaScript Info:
     * @method drawChart
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject drawChart() {
        return getPolymerElement().drawChart();
    }

    /**
     * <p>Returns the chart serialized as an image URI.</p>
     * <p>Call this after the chart is drawn (google-chart-render event).</p>
     *
     * JavaScript Info:
     * @method getImageURI
     * 
     * @return {String}
     */
    public String getImageURI() {
        return getPolymerElement().getImageURI();
    }


    /**
     * <p>Fired when the graph is displayed.</p>
     *
     * JavaScript Info:
     * @event google-chart-render
     */
    public HandlerRegistration addGoogleChartRenderHandler(GoogleChartRenderEventHandler handler) {
        return addHandler(handler, GoogleChartRenderEvent.TYPE);
    }

    /**
     * <p>Fired when the user makes a selection in the chart.</p>
     *
     * JavaScript Info:
     * @event google-chart-select
     */
    public HandlerRegistration addGoogleChartSelectHandler(GoogleChartSelectEventHandler handler) {
        return addHandler(handler, GoogleChartSelectEvent.TYPE);
    }

}
