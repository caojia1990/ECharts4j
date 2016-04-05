package com.eastng.common.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Echarts4J
 * @author caojia
 *
 */
public class Option {
    @JSONField(ordinal=1)
    private Title title;
    @JSONField(ordinal=2)
    private Tooltip tooltip;
    @JSONField(ordinal=3)
    private Legend legend;
    @JSONField(ordinal=4)
    private List<XAxis> xAxis;
    @JSONField(ordinal=5)
    private List<Series> series;
    
    public static class Title{
        private String text;
        private String subtext;
        private String x;
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
        public String getX() {
            return x;
        }
        public void setX(String x) {
            this.x = x;
        }
        
    }
    
    public class Tooltip{
        private String trigger;
        private String formatter;

        public String getTrigger() {
            return trigger;
        }

        public void setTrigger(String trigger) {
            this.trigger = trigger;
        }

        public String getFormatter() {
            return formatter;
        }

        public void setFormatter(String formatter) {
            this.formatter = formatter;
        }
        
    }
    
    public static class Legend{
        private String orient;
        private String left;
        private List<String> data;

        /**
         * @return the orient
         */
        public String getOrient() {
            return orient;
        }

        /**
         * @param orient the orient to set
         */
        public void setOrient(String orient) {
            this.orient = orient;
        }
        
        /**
         * @return the left
         */
        public String getLeft() {
            return left;
        }

        /**
         * @param left the left to set
         */
        public void setLeft(String left) {
            this.left = left;
        }

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
        @JSONField(ordinal=1)
        private String name;
        @JSONField(ordinal=2)
        private String type;
        @JSONField(ordinal=3)
        private String radius;
        @JSONField(ordinal=4)
        private List<Data> data;
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
        public String getRadius() {
            return radius;
        }
        public void setRadius(String radius) {
            this.radius = radius;
        }
        public List<Data> getData() {
            return data;
        }
        public void setData(List<Data> data) {
            this.data = data;
        }
        
        public List<Data> createData(){
            if(this.data == null){
                this.data = new ArrayList<Option.Series.Data>();
            }
            return this.data;
        }
        
        public void addData(Data data){
            this.createData().add(data);
        }
        
        public static class Data{
            private Integer value;
            
            private String name;

            public Integer getValue() {
                return value;
            }

            public void setValue(Integer value) {
                this.value = value;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
            
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
