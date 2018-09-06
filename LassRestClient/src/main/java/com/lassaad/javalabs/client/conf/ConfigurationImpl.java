package com.lassaad.javalabs.client.conf;


/*Interface Implements*/
public class ConfigurationImpl implements Configuration {

	
	
	private String baseUrl;
	private String version;
	private String complementUrl;
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getComplementUrl() {
		return complementUrl;
	}
	public void setComplementUrl(String complementUrl) {
		this.complementUrl = complementUrl;
	}

}
