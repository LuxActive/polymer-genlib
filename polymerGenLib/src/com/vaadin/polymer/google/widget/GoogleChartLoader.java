/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from google-chart project by Wes Alvaro,Sérgio Gomes
 * that is licensed with Apache-2.0 license.
 */
package com.vaadin.polymer.google.widget;

import com.vaadin.polymer.google.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.elemental.*;
import com.vaadin.polymer.PolymerWidget;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class GoogleChartLoader extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public GoogleChartLoader() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public GoogleChartLoader(String html) {
        super(GoogleChartLoaderElement.TAG, GoogleChartLoaderElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public GoogleChartLoaderElement getPolymerElement() {
        return (GoogleChartLoaderElement) getElement();
    }


    /**
     * <p>Adds packages to the list of packages to load.</p>
     * <p>This is an array consisting of any Google Visualization package names.</p>
     *
     * JavaScript Info:
     * @property packages
     * @type !Array.<string>
     * 
     */
    public JavaScriptObject getPackages() {
        return getPolymerElement().getPackages();
    }
    /**
     * <p>Adds packages to the list of packages to load.</p>
     * <p>This is an array consisting of any Google Visualization package names.</p>
     *
     * JavaScript Info:
     * @property packages
     * @type !Array.<string>
     * 
     */
    public void setPackages(JavaScriptObject value) {
        getPolymerElement().setPackages(value);
    }

    /**
     * <p>Loads the package for the chart type specified.</p>
     * <p>This may be any of the supported <code>google-chart</code> types.<br>This is mainly used by the <code>google-chart</code> element internally.</p>
     *
     * JavaScript Info:
     * @property type
     * @type string
     * 
     */
    public String getType() {
        return getPolymerElement().getType();
    }
    /**
     * <p>Loads the package for the chart type specified.</p>
     * <p>This may be any of the supported <code>google-chart</code> types.<br>This is mainly used by the <code>google-chart</code> element internally.</p>
     *
     * JavaScript Info:
     * @property type
     * @type string
     * 
     */
    public void setType(String value) {
        getPolymerElement().setType(value);
    }


    // Needed in UIBinder
    /**
     * <p>Adds packages to the list of packages to load.</p>
     * <p>This is an array consisting of any Google Visualization package names.</p>
     *
     * JavaScript Info:
     * @attribute packages
     * 
     */
    public void setPackages(String value) {
        Polymer.property(this.getPolymerElement(), "packages", value);
    }


    /**
     * <p>Creates a DataTable object for use with a chart.</p>
     * <p>Multiple different argument types are supported. This is because the<br>result of loading the JSON data URL is fed into this function for<br>DataTable construction and its format is unknown.</p>
     * <p>The data argument can be one of a few options:</p>
     * <ul>
     * <li>null/undefined: An empty DataTable is created. Columns must be added</li>
     * <li>!DataTable: The object is simply returned</li>
     * <li>{{cols: !Array, rows: !Array}}: A DataTable in object format</li>
     * <li>{{cols: !Array}}: A DataTable in object format without rows</li>
     * <li>!Array&lt;!Array&gt;: A DataTable in 2D array format</li>
     * </ul>
     * <p>Un-supported types:</p>
     * <ul>
     * <li>Empty !Array&lt;!Array&gt;: (e.g. <code>[]</code>) While technically a valid data<br>format, this is rejected as charts will not render empty DataTables.<br>DataTables must at least have columns specified. An empty array is most<br>likely due to a bug or bad data. If one wants an empty DataTable, pass<br>no arguments.</li>
     * <li>Anything else</li>
     * </ul>
     * <p>See <a href="https://developers.google.com/chart/interactive/docs/reference#datatable-class">the docs</a> for more details.</p>
     *
     * JavaScript Info:
     * @method dataTable
     * @param {(Array|{cols: !Array, rows: (!Array.<!Array>|undefined)}|undefined)} data  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject dataTable(Object data) {
        return getPolymerElement().dataTable(data);
    }

    /**
     * <p>Creates a Query object to be sent to a DataSource protocol implementation.</p>
     * <p>See <a href="https://developers.google.com/chart/interactive/docs/reference#query-classes">the docs</a> for more details.</p>
     *
     * JavaScript Info:
     * @method query
     * @param {string} url  
     * @param {!Object=} opt_options  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject query(String url, JavaScriptObject opt_options) {
        return getPolymerElement().query(url, opt_options);
    }

    /**
     * <p>Begins firing Polymer events for the requested chart event.<br>Use <em>only</em> if you have control of a chart object.<br>Most should just use the <code>google-chart</code> element.</p>
     * <p>Events fired all have the same detail object:<br>  {{<br>    chart: !Object,  // The chart target object<br>    data: (Object|undefined),  // The chart event details<br>  }}</p>
     *
     * JavaScript Info:
     * @method fireOnChartEvent
     * @param {!Object} chart  
     * @param {string} eventName  
     * @param {boolean=} opt_once  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject fireOnChartEvent(JavaScriptObject chart, String eventName, boolean opt_once) {
        return getPolymerElement().fireOnChartEvent(chart, eventName, opt_once);
    }

    /**
     * <p>Creates a DataView object from a DataTable for use with a chart.</p>
     * <p>See <a href="https://developers.google.com/chart/interactive/docs/reference#dataview-class">the docs</a> for more details.</p>
     *
     * JavaScript Info:
     * @method dataView
     * @param {!google.visualization.DataTable} data  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject dataView(JavaScriptObject data) {
        return getPolymerElement().dataView(data);
    }

    /**
     * <p>Creates a chart object by type in the specified element.<br>Use <em>only</em> if you need total control of a chart object.<br>Most should just use the <code>google-chart</code> element.</p>
     *
     * JavaScript Info:
     * @method create
     * @param {string} type  
     * @param {!Element} el  
     * 
     * @return {JavaScriptObject}
     */
    public JavaScriptObject create(String type, JavaScriptObject el) {
        return getPolymerElement().create(type, el);
    }


}
