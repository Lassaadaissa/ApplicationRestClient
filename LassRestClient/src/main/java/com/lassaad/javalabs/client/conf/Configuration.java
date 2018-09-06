package com.lassaad.javalabs.client.conf;



/*Interface*/
public interface Configuration {
	
	void setBaseUrl(String baseUrl);
	
	String getBaseUrl();
	
	void setVersion(String version);
	
	String getVersion();
	
	void setComplementUrl(String complementUrl);
	
	String getComplementUrl();
	
}
