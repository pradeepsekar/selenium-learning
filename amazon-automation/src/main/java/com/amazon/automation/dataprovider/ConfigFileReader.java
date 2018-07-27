package com.amazon.automation.dataprovider;

import java.io.IOException;
import java.util.Properties;

import com.amazon.automation.enums.DriverType;
import com.amazon.automation.enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= "configuration.properties";

	
	public ConfigFileReader(){
		properties = new Properties();
		ClassLoader classLoader = getClass().getClassLoader();
		try {
			properties.load(classLoader.getResourceAsStream(propertyFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public DriverType getBrowser() {
		String browser = properties.getProperty("browser");
		if(browser != null) {
			return DriverType.CHROME;
		}
		else throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}
	
	public EnvironmentType getEnvironment() {
		String environment = properties.getProperty("environment");
		if(environment != null) {
			return EnvironmentType.LOCAL;
		}
		else throw new RuntimeException("EnvironmentType not specified in the Configuration.properties file.");
	}
	
	public boolean getBrowserWindowSize() {
		String windowMaximize = properties.getProperty("windowMaximize");
		return Boolean.valueOf(windowMaximize);
	}

}
