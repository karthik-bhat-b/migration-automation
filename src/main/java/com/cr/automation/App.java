package com.cr.automation;

import org.apache.log4j.BasicConfigurator;

public class App {
	 public static void main(String args[]) {
		 BasicConfigurator.configure();  
		 DocxGenerator dg = new DocxGenerator();
		 
		 try {
			dg.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
