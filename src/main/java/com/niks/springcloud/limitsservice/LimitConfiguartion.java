package com.niks.springcloud.limitsservice;

public class LimitConfiguartion {

	private Integer maximum;
	private Integer minimum;
	
	protected LimitConfiguartion(){
		
	}
	
	public LimitConfiguartion(Integer maximum, Integer minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public Integer getMaximum() {
		return maximum;
	}

	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	
	
	
	
}
