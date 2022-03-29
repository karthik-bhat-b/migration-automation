package com.cr.automation;

import org.docx4j.model.datastorage.migration.VariablePrepare;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public class DocxGenerator {

	public void test() throws Exception {

		HashMap<String, String> variables = new HashMap<>();
		InputStream templateInputStream;
		InputStream templateInputStream2;
		InputStream templateInputStream3;

		/* Hard coded values */
		String brand = "chrysler";
		String locale = "es_mx";
		String country = "mexico";
		String region = "nafta";
		String testUrl = "test-aem123.jeep.com.mx";
		String uatUrl = "uat-aem123-origin.jeep.com.mx";
		String uatPreviewUrl = "uat-origin123-preview.jeep.com.mx";
		String prodUrl = "prod.jeep.com.mx";
		String prodPreviewUrl = "prod-preview.jeep.com.mx";

		String isDualLanguage = "false";
		String secondLocale = "en_mx";

		/* Setting variables for template */
		variables.put("brandDescription", brand.toUpperCase() + " " + country.toUpperCase());
		variables.put("folderName", brand + "-" + country);
		variables.put("uatUrl", uatUrl);
		variables.put("uatPreviewUrl", uatPreviewUrl);
		variables.put("prodUrl", prodUrl);
		variables.put("prodPreviewUrl", prodPreviewUrl);
		variables.put("testUrl", testUrl);
		variables.put("brandLocale", brand.substring(0, 1).toUpperCase() + brand.substring(1) + " "
				+ country.substring(0, 1).toUpperCase() + country.substring(1));
		variables.put("brand", brand);
		variables.put("country", country);
		variables.put("locale", locale);
		variables.put("locale", secondLocale);
		variables.put("region", region);

		String directoryName = "target/";

		/* Reading Templates */
		if (isDualLanguage.equalsIgnoreCase("true")) {
			templateInputStream = this.getClass().getClassLoader().getResourceAsStream("templateUat2.docx");
			templateInputStream2 = this.getClass().getClassLoader().getResourceAsStream("templateTest2.docx");
			templateInputStream3 = this.getClass().getClassLoader().getResourceAsStream("templateProd2.docx");
		} else {
			templateInputStream = this.getClass().getClassLoader().getResourceAsStream("templateUat.docx");
			templateInputStream2 = this.getClass().getClassLoader().getResourceAsStream("templateTest.docx");
			templateInputStream3 = this.getClass().getClassLoader().getResourceAsStream("templateProd.docx");
		}

		/* UAT and UAT preview Document generation */
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(templateInputStream);
		MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
		VariablePrepare.prepare(wordMLPackage);
		documentPart.variableReplace(variables);
		OutputStream os = new FileOutputStream(
				new File(directoryName + variables.get("brandDescription") + "_Domain Setup_UAT AND UAT Preview.docx"));
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		wordMLPackage.save(outputStream);
		outputStream.writeTo(os);
		os.close();
		outputStream.close();
		templateInputStream.close();

		/* Test Document generation */

		WordprocessingMLPackage wordMLPackage2 = WordprocessingMLPackage.load(templateInputStream2);
		MainDocumentPart documentPart2 = wordMLPackage2.getMainDocumentPart();
		VariablePrepare.prepare(wordMLPackage2);
		documentPart2.variableReplace(variables);
		OutputStream os2 = new FileOutputStream(
				new File(directoryName + variables.get("brandDescription") + "_Domain Setup_Test.docx"));
		ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
		wordMLPackage2.save(outputStream2);
		outputStream2.writeTo(os2);
		os2.close();
		outputStream2.close();
		templateInputStream2.close();

		/* PROD and PROD preview Document generation */

		WordprocessingMLPackage wordMLPackage3 = WordprocessingMLPackage.load(templateInputStream3);
		MainDocumentPart documentPart3 = wordMLPackage3.getMainDocumentPart();
		VariablePrepare.prepare(wordMLPackage3);
		documentPart3.variableReplace(variables);
		OutputStream os3 = new FileOutputStream(
				new File(directoryName + variables.get("brandDescription") + "_Domain Setup_Prod.docx"));
		ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
		wordMLPackage3.save(outputStream3);
		outputStream3.writeTo(os3);
		os3.close();
		outputStream3.close();
		templateInputStream3.close();

	}

	public void test2(String brand, String locale, String country, String region, String testUrl, String uatUrl,
			String uatPreviewUrl, String prodUrl, String prodPreviewUrl, String isDualLanguage, String secondLocale)
			throws Exception {
		
		HashMap<String, String> variables = new HashMap<>();
		InputStream templateInputStream;
		InputStream templateInputStream2;
		InputStream templateInputStream3;

	

		/* Setting variables for template */
		variables.put("brandDescription", brand.toUpperCase() + " " + country.toUpperCase());
		variables.put("folderName", brand + "-" + country);
		variables.put("uatUrl", uatUrl);
		variables.put("uatPreviewUrl", uatPreviewUrl);
		variables.put("prodUrl", prodUrl);
		variables.put("prodPreviewUrl", prodPreviewUrl);
		variables.put("testUrl", testUrl);
		variables.put("brandLocale", brand.substring(0, 1).toUpperCase() + brand.substring(1) + " "
				+ country.substring(0, 1).toUpperCase() + country.substring(1));
		variables.put("brand", brand);
		variables.put("country", country);
		variables.put("locale", locale);
		variables.put("locale", secondLocale);
		variables.put("region", region);

		String directoryName = "target/";

		/* Reading Templates */
		if (isDualLanguage.equalsIgnoreCase("true")) {
			templateInputStream = this.getClass().getClassLoader().getResourceAsStream("templateUat2.docx");
			templateInputStream2 = this.getClass().getClassLoader().getResourceAsStream("templateTest2.docx");
			templateInputStream3 = this.getClass().getClassLoader().getResourceAsStream("templateProd2.docx");
		} else {
			templateInputStream = this.getClass().getClassLoader().getResourceAsStream("templateUat.docx");
			templateInputStream2 = this.getClass().getClassLoader().getResourceAsStream("templateTest.docx");
			templateInputStream3 = this.getClass().getClassLoader().getResourceAsStream("templateProd.docx");
		}

		/* UAT and UAT preview Document generation */
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(templateInputStream);
		MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
		VariablePrepare.prepare(wordMLPackage);
		documentPart.variableReplace(variables);
		OutputStream os = new FileOutputStream(
				new File(directoryName + variables.get("brandDescription") + "_Domain Setup_UAT AND UAT Preview.docx"));
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		wordMLPackage.save(outputStream);
		outputStream.writeTo(os);
		os.close();
		outputStream.close();
		templateInputStream.close();

		/* Test Document generation */

		WordprocessingMLPackage wordMLPackage2 = WordprocessingMLPackage.load(templateInputStream2);
		MainDocumentPart documentPart2 = wordMLPackage2.getMainDocumentPart();
		VariablePrepare.prepare(wordMLPackage2);
		documentPart2.variableReplace(variables);
		OutputStream os2 = new FileOutputStream(
				new File(directoryName + variables.get("brandDescription") + "_Domain Setup_Test.docx"));
		ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
		wordMLPackage2.save(outputStream2);
		outputStream2.writeTo(os2);
		os2.close();
		outputStream2.close();
		templateInputStream2.close();

		/* PROD and PROD preview Document generation */

		WordprocessingMLPackage wordMLPackage3 = WordprocessingMLPackage.load(templateInputStream3);
		MainDocumentPart documentPart3 = wordMLPackage3.getMainDocumentPart();
		VariablePrepare.prepare(wordMLPackage3);
		documentPart3.variableReplace(variables);
		OutputStream os3 = new FileOutputStream(
				new File(directoryName + variables.get("brandDescription") + "_Domain Setup_Prod.docx"));
		ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
		wordMLPackage3.save(outputStream3);
		outputStream3.writeTo(os3);
		os3.close();
		outputStream3.close();
		templateInputStream3.close();	

	}
}
