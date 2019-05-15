package com.agilespace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EstimationAutomation6 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://agilespace.tcs.com";

		driver.get(baseUrl);

		driver.findElement(By.id("loginUserId")).sendKeys("AS99608");
		driver.findElement(By.id("loginPassword")).sendKeys("Password123$");
		driver.findElements(By.name("submitButton")).get(0).click();
		driver.manage().window().maximize();
		// driver.close();
		// driver.wait(2000);

		driver.findElements(By.partialLinkText("View My Estimations")).get(0).click();
		// driver.wait(2000);
		driver.findElements(By.className("NormalLink")).get(1).click();
		driver.findElements(By.tagName("li")).get(1).click();
		driver.findElement(By.id("addbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("functionalDiv")).click();
		driver.findElement(By.id("nonFunctionalityDiv")).click();
		driver.findElement(By.id("storySizeAdjDiv")).click();
		driver.findElement(By.id("storyPointDiv")).click();

		WebElement businessRulesPopup = driver.findElement(By.id("businessRulesPopup"));
		Select ab1 = new Select(businessRulesPopup);
		List<WebElement> list1 = ab1.getOptions();

		WebElement codeRefactoringOrChurnPopup = driver.findElement(By.id("codeRefactoringOrChurnPopup"));
		Select ab2 = new Select(codeRefactoringOrChurnPopup);
		List<WebElement> list2 = ab2.getOptions();

		WebElement regressionPopup = driver.findElement(By.id("regressionPopup"));
		Select ab3 = new Select(regressionPopup);
		List<WebElement> list3 = ab3.getOptions();

		WebElement designChangePopup = driver.findElement(By.id("designChangePopup"));
		Select ab4 = new Select(designChangePopup);
		List<WebElement> list4 = ab4.getOptions();

		WebElement entitiesManipulatedPopup = driver.findElement(By.id("entitiesManipulatedPopup"));
		Select ab5 = new Select(entitiesManipulatedPopup);
		List<WebElement> list5 = ab5.getOptions();

		WebElement primaryDataManipulationTypePopup = driver.findElement(By.id("primaryDataManipulationTypePopup"));
		Select ab6 = new Select(primaryDataManipulationTypePopup);
		List<WebElement> list6 = ab6.getOptions();

		WebElement databaseTripsPopup = driver.findElement(By.id("databaseTripsPopup"));
		Select ab7 = new Select(databaseTripsPopup);
		List<WebElement> list7 = ab7.getOptions();

		WebElement interfacesMidtierPopup = driver.findElement(By.id("interfacesMidtierPopup"));
		Select ab8 = new Select(interfacesMidtierPopup);
		List<WebElement> list8 = ab8.getOptions();

		WebElement deploymentManagementChangePopup = driver.findElement(By.id("deploymentManagementChangePopup"));
		Select ab9 = new Select(deploymentManagementChangePopup);
		List<WebElement> list9 = ab9.getOptions();

		WebElement performanceImpactPopup = driver.findElement(By.id("performanceImpactPopup"));
		Select ab10 = new Select(performanceImpactPopup);
		List<WebElement> list10 = ab10.getOptions();

		WebElement securityImpactPopup = driver.findElement(By.id("securityImpactPopup"));
		Select ab11 = new Select(securityImpactPopup);
		List<WebElement> list11 = ab11.getOptions();

		WebElement usabilityImpactPopup = driver.findElement(By.id("usabilityImpactPopup"));
		Select ab12 = new Select(usabilityImpactPopup);
		List<WebElement> list12 = ab12.getOptions();

		WebElement reliabilityImpactPopup = driver.findElement(By.id("reliabilityImpactPopup"));
		Select ab13 = new Select(reliabilityImpactPopup);
		List<WebElement> list13 = ab13.getOptions();

		WebElement storyLevelSizeAdj1Popup = driver.findElement(By.id("storyLevelSizeAdj1Popup"));
		Select ab14 = new Select(storyLevelSizeAdj1Popup);
		List<WebElement> list14 = ab14.getOptions();

		WebElement adjustmentImpact1Popup = driver.findElement(By.id("adjustmentImpact1Popup"));
		Select ab15 = new Select(adjustmentImpact1Popup);
		List<WebElement> list15 = ab15.getOptions();

		WebElement storyLevelSizeAdj2Popup = driver.findElement(By.id("storyLevelSizeAdj2Popup"));
		Select ab16 = new Select(storyLevelSizeAdj2Popup);
		List<WebElement> list16 = ab16.getOptions();

		WebElement adjustmentImpact2Popup = driver.findElement(By.id("adjustmentImpact2Popup"));
		Select ab17 = new Select(adjustmentImpact2Popup);
		List<WebElement> list17 = ab17.getOptions();

		WebElement storyLevelSizeAdj3Popup = driver.findElement(By.id("storyLevelSizeAdj3Popup"));
		Select ab18 = new Select(storyLevelSizeAdj3Popup);
		List<WebElement> list18 = ab18.getOptions();

		WebElement adjustmentImpact3Popup = driver.findElement(By.id("adjustmentImpact3Popup"));
		Select ab19 = new Select(adjustmentImpact3Popup);
		List<WebElement> list19 = ab19.getOptions();

		// ================================
		try {

			File folder = new File("C:\\Users\\sinha\\Downloads\\selenium work");
			File[] listOfFiles = folder.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				int count = 0;
				System.out.println("Doing for " + listOfFiles[i].getName());
				FileInputStream file1 = new FileInputStream(new File(listOfFiles[i].getAbsolutePath()));

				// Create Workbook instance holding reference to .xlsx file
				HSSFWorkbook workbook = new HSSFWorkbook(file1);

				// Get first/desired sheet from the workbook
				HSSFSheet sheet = workbook.getSheetAt(0);

				// Iterate through each rows one by one
				Iterator<Row> rowIterator = sheet.iterator();
				int st = 0;
				int co = 0;
				int li = 0;
				while (rowIterator.hasNext()) {

					try {
						Row row = rowIterator.next();
						// For each row, iterate through all the columns
						for (Cell cell : row) {
							if (cell.getCellType() == CellType.STRING) {
								if (cell.getRichStringCellValue().getString().trim().equals("Stringent")) {
									st = cell.getColumnIndex();
								}
								if (cell.getRichStringCellValue().getString().trim().equals("Comfortable")) {
									co = cell.getColumnIndex();
								}
								if (cell.getRichStringCellValue().getString().trim().equals("Likely")) {
									li = cell.getColumnIndex();
								}
							}
						}
						row.getCell(CellReference.convertColStringToIndex("G")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("J")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("M")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("P")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("S")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("V")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("Y")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AB")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AE")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AH")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AK")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AN")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AQ")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AT")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AV")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("AY")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("BA")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("BD")).setCellType(CellType.STRING);
						row.getCell(CellReference.convertColStringToIndex("BF")).setCellType(CellType.STRING);

						
							ab1.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("G"))
									.getStringCellValue().trim());
						

						
							ab2.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("J"))
									.getStringCellValue().trim());
						

						try {
							ab3.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("M"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab4.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("P"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab5.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("S"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab6.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("V"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab7.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("Y"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab8.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AB"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab9.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AE"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab10.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AH"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab11.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AK"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab12.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AN"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab13.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AQ"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab14.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AT"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab15.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AV"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab16.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("AY"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab17.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("BA"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab18.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("BD"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						try {
							ab19.selectByVisibleText(row.getCell(CellReference.convertColStringToIndex("BF"))
									.getStringCellValue().trim());
						} catch (Exception e) {

						}

						driver.findElement(By
								.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/form[1]/div[2]/div[2]/form/div[5]/div/table/tbody/tr/td[1]/input"))
								.click();
						Thread.sleep(700);
						if (driver.findElements(By.id("timeout-keep-signin-btn")).size() > 0) {
							System.out.println("Session Continued");
							driver.findElement(By.id("timeout-keep-signin-btn")).click();
						}

						/*
						 * row.getCell(CellReference.convertColStringToIndex(
						 * "BO")) .setCellValue(driver.findElement(By.id(
						 * "storyPointStringentPopup")).getAttribute("value"));
						 * row.getCell(CellReference.convertColStringToIndex(
						 * "BR")).setCellValue(
						 * driver.findElement(By.id("storyPointComfortablePopup"
						 * )).getAttribute("value"));
						 * row.getCell(CellReference.convertColStringToIndex(
						 * "BS")) .setCellValue(driver.findElement(By.id(
						 * "storyPointLikelyPopup")).getAttribute("value"));
						 */

						row.getCell(st).setCellValue(
								driver.findElement(By.id("storyPointStringentPopup")).getAttribute("value"));
						row.getCell(co).setCellValue(
								driver.findElement(By.id("storyPointComfortablePopup")).getAttribute("value"));
						row.getCell(li)
								.setCellValue(driver.findElement(By.id("storyPointLikelyPopup")).getAttribute("value"));

						System.out.println(count++);
					} catch (Exception e) {

					}
				}

				file1.close();
				FileOutputStream outFile = new FileOutputStream(
						new File("C:\\Users\\sinha\\Downloads\\selenium work new\\" + listOfFiles[i].getName()));
				workbook.write(outFile);
				outFile.close();
				System.out.println("Completed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ==============================

	}

}
