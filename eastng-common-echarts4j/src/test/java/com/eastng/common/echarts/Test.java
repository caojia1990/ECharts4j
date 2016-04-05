package com.eastng.common.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.eastng.common.echarts.Option.Legend;
import com.eastng.common.echarts.Option.Series;
import com.eastng.common.echarts.Option.Title;
import com.eastng.common.echarts.Option.Tooltip;
import com.eastng.common.echarts.Option.Series.Data;

public class Test{
    
    public static void main(String[] args) {
    	Option option = new Option();
		Title title = option.createTitle();
		//标题
		title.setText("近10场交锋");
		//标题居中
		title.setX("center");
		Tooltip tooltip = option.createTooltip();
		tooltip.setTrigger("item");
		tooltip.setFormatter("{a} <br/>{b} : {c} ({d}%)");
		
		Legend legend = option.createLegend();
		legend.setOrient("vertical");
		List<String> data = new ArrayList<String>();
		data.add("胜");
		data.add("平");
		data.add("负");
		legend.setData(data);
		
		Series series = new Series();
		series.setName("胜平负比");
		series.setType("pie");
		
		Data data2 = new Data();
		data2.setName("胜");
		data2.setValue(7);
		series.addData(data2);
		Data data3 = new Data();
		data3.setName("平");
		data3.setValue(2);
		series.addData(data3);
		Data data4 = new Data();
		data4.setName("负");
		data4.setValue(1);
		series.addData(data4);
		option.addSeries(series);
        String s = JSON.toJSONString(option, true);
        System.out.println(s);
    }
    
}