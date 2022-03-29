package com.cr.automation;

import org.apache.log4j.BasicConfigurator;

public class App {
	public static void main(String args[]) {
		// BasicConfigurator.configure();
		DocxGenerator dg = new DocxGenerator();
		System.out.println("brand " + args[0]);
		System.out.println("locale " + args[1]);
		System.out.println("country " + args[2]);
		System.out.println("region " + args[3]);
		System.out.println("testUrl " + args[4]);
		System.out.println("uatUrl " + args[5]);
		System.out.println("uatPreviewUrl " + args[6]);
		System.out.println("prodUrl " + args[7]);
		System.out.println("prodPreviewUrl " + args[8]);
		System.out.println("isDualLanguage " + args[9]);
		System.out.println("secondLocale " + args[10]);

		String brand = args[0];
		String locale = args[1];
		String country = args[2];
		String region = args[3];
		String testUrl = args[4];
		String uatUrl = args[5];
		String uatPreviewUrl = args[6];
		String prodUrl = args[7];
		String prodPreviewUrl = args[8];

		String isDualLanguage = args[9];
		String secondLocale = args[10];

		try {
			// dg.test();
			dg.generateDoc(brand, locale, country, region, testUrl, uatUrl, uatPreviewUrl, prodUrl, prodPreviewUrl,
					isDualLanguage, secondLocale);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
