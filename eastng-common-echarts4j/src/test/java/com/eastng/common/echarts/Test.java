package com.eastng.common.echarts;

import com.alibaba.fastjson.JSON;
import com.eastng.common.echarts.Option.Title;
import com.eastng.common.echarts.Option.Tooltip;

public class Test{
    
    public static void main(String[] args) {
        Option option = new Option();
        Title title= option.createTitle();
        Tooltip tooltip = option.createTooltip();
        String s = JSON.toJSONString(option, true);
        System.out.println(s);
    }
    
}