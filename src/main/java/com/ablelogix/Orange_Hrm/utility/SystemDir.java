package com.ablelogix.Orange_Hrm.utility;

public class SystemDir {
	
	public static void main( String[] a) {
		
		String SytemPath = System.getProperty("user.dir");
		
		System.out.println("System path is " +SytemPath);
		
		ConfigFileReader obj = new ConfigFileReader();
		ConfigFileReader.readConfig();
	}

}
