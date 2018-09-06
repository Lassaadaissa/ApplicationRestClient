package com.lassaad.javalabs.client.builder;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*Builder*/
public class Builder {
	private final Map<String, Object> params= new HashMap<String, Object>();
	private String param1;
	private String param2; 
	private Integer param3;
	private Boolean param4;
	
	public Builder param1(String param1)
	{
		this.param1 = param1;
		params.put("param1", param1);
		return this;
	}
	public Builder param2(String param2)
	{
		this.param2 = param2;
		params.put("param2", param2);
		return this;
	}
	public Builder param3(int param3)
	{
		this.param3 = param3;
		params.put("param3", param3);
		return this;
	}
	public Builder param4(boolean param4)
	{
		this.param4 = param4;
		params.put("param4", param4);
		return this;
	}
	
	public PersonParamBuilder build()
	{
		PersonParamBuilder parameters =  new PersonParamBuilderImpl();
		parameters.putAll(params);
		return parameters;
	}
	
}
