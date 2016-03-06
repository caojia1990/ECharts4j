package com.eastng.common.echarts;

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
	
	
	public class Title{
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
	
	private class Legend{
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

}
