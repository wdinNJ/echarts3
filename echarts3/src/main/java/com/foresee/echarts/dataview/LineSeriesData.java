package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

public class LineSeriesData extends Option{
	private String name;
	private String value;
//	private String symbol;
//	private String symbolSize;
//	private String symbolRotate;
//	private String sybolOffset[];
//	private Label label;
//	private ItemStyle itemStyle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isOnlyValue(){
		if((name != null && !"".equals(name.trim())) )
			return false;
		else
			return true;
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		this.addAttribute("value", value);
		if(name !=null && !"".equals(name))
			this.addAttribute("name", name);
		return this.getAttributes();
	}
	
}
