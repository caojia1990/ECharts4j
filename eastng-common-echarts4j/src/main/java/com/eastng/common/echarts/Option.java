package com.eastng.common.echarts;

import java.util.ArrayList;
import java.util.List;

/**
 * Echarts4J
 * @author caojia
 *
 */
public class Option {
	
	private Title title;
	
	private Tooltip tooltip;
	
	private Legend legend;
	
	private List<XAxis> xAxis;
	
	private List<Series> series;
	
	public static class Title{
		private String text;
		private String subtext;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getSubtext() {
			return subtext;
		}
		public void setSubtext(String subtext) {
			this.subtext = subtext;
		}
	}
	
	public class Tooltip{
		private String trigger;

		public String getTrigger() {
			return trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}
	}
	
	public static class Legend{
		private List<String> data;

		public List<String> getData() {
			return data;
		}

		public void setData(List<String> data) {
			this.data = data;
		}
	}
	
	public class XAxis{
		private String type;
		private Boolean boundaryGap;
		private List<String> data;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Boolean getBoundaryGap() {
			return boundaryGap;
		}
		public void setBoundaryGap(Boolean boundaryGap) {
			this.boundaryGap = boundaryGap;
		}
		public List<String> getData() {
			return data;
		}
		public void setData(List<String> data) {
			this.data = data;
		}
	}
	
	public static class Series{
		private String name;
		private String type;
		private List<String> data;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<String> getData() {
			return data;
		}
		public void setData(List<String> data) {
			this.data = data;
		}
	}
	
	public Title createTitle(){
		if(this.title == null){
			this.title = new Title();
		}
		return this.title;
	}
	
	public Legend createLegend(){
		if(this.legend == null){
			this.legend = new Legend();
		}
		return this.legend;
	}
	
	public Tooltip createTooltip(){
		if(this.tooltip == null){
			this.tooltip = new Tooltip();
		}
		return this.tooltip;
	}
	
	public void addXAxis(XAxis xaxis){
		this.createXAxis().add(xaxis);
	}

	protected List<XAxis> createXAxis(){
		if(this.xAxis == null){
			xAxis = new ArrayList<Option.XAxis>();
		}
		return xAxis;
	}
	
	public void addSeries(Series series){
		this.createSeries().add(series);
	}
	
	protected List<Series> createSeries(){
		if(this.series == null){
			this.series = new ArrayList<Series>();
		}
		return this.series;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public List<XAxis> getxAxis() {
		return xAxis;
	}

	public void setxAxis(List<XAxis> xAxis) {
		this.xAxis = xAxis;
	}

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}
	
}
