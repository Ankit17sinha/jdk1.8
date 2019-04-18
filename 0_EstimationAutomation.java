package com.agilespace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EstimationAutomation {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://agilespace.tcs.com";
		// Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File("C:\\Users\\sinha\\Downloads\\Documents\\agile.log")); 
  
        // Store current System.out before assigning a new value 
        //PrintStream console = System.out; 
  
        // Assign o to output stream 
        System.setOut(o); 
		driver.get(baseUrl);

		driver.findElement(By.id("loginUserId")).sendKeys("AS99608");
		driver.findElement(By.id("loginPassword")).sendKeys("Password123$");
		driver.findElements(By.name("submitButton")).get(0).click();
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
		int count = 0;

		for (WebElement ele1 : list1) {

			ab1.selectByVisibleText(ele1.getText());

			for (WebElement ele2 : list2) {

				ab2.selectByVisibleText(ele2.getText());
				for (WebElement ele3 : list3) {

					ab3.selectByVisibleText(ele3.getText());
					for (WebElement ele4 : list4) {

						ab4.selectByVisibleText(ele4.getText());
						for (WebElement ele5 : list5) {

							ab5.selectByVisibleText(ele5.getText());
							for (WebElement ele6 : list6) {

								ab6.selectByVisibleText(ele6.getText());
								for (WebElement ele7 : list7) {

									ab7.selectByVisibleText(ele7.getText());
									for (WebElement ele8 : list8) {

										ab8.selectByVisibleText(ele8.getText());
										for (WebElement ele9 : list9) {

											ab9.selectByVisibleText(ele9.getText());
											for (WebElement ele10 : list10) {

												ab10.selectByVisibleText(ele10.getText());
												for (WebElement ele11 : list11) {

													ab11.selectByVisibleText(ele11.getText());
													for (WebElement ele12 : list12) {

														ab12.selectByVisibleText(ele12.getText());
														for (WebElement ele13 : list13) {

															ab13.selectByVisibleText(ele13.getText());
															for (WebElement ele14 : list14) {

																ab14.selectByVisibleText(ele14.getText());
																for (WebElement ele15 : list15) {

																	ab15.selectByVisibleText(ele15.getText());
																	for (WebElement ele16 : list16) {

																		ab16.selectByVisibleText(ele16.getText());
																		for (WebElement ele17 : list17) {

																			ab17.selectByVisibleText(ele17.getText());
																			for (WebElement ele18 : list18) {

																				ab18.selectByVisibleText(
																						ele18.getText());
																				for (WebElement ele19 : list19) {

																					ab19.selectByVisibleText(
																							ele19.getText());

																					driver.findElement(By
																							.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/form[1]/div[2]/div[2]/form/div[5]/div/table/tbody/tr/td[1]/input"))
																							.click();
																					Thread.sleep(500);
																					if(driver.findElements(By.id("timeout-keep-signin-btn")).size() > 0){
																						System.out.println("Session Continued");
																						driver.findElement(By.id("timeout-keep-signin-btn")).click();
																						}
																					
																					System.out.println(++count+ " " +ele1.getText()
																							+ " " + ele2.getText() + " "
																							+ ele3.getText() + " "
																							+ ele4.getText() + " "
																							+ ele5.getText() + " "
																							+ ele6.getText() + " "
																							+ ele7.getText() + " "
																							+ ele8.getText() + " "
																							+ ele9.getText() + " "
																							+ ele10.getText() + " "
																							+ ele11.getText() + " "
																							+ ele12.getText() + " "
																							+ ele13.getText() + " "
																							+ ele14.getText() + " "
																							+ ele15.getText() + " "
																							+ ele16.getText() + " "
																							+ ele17.getText() + " "
																							+ ele18.getText() + " "
																							+ ele19.getText() + " "
																							+ driver.findElement(
																									By.id("storyPointStringentPopup"))
																									.getAttribute(
																											"value")

																							+ " "
																							+ driver.findElement(
																									By.id("storyPointComfortablePopup"))
																									.getAttribute(
																											"value")
																							+ " "
																							+ driver.findElement(
																									By.id("storyPointLikelyPopup"))
																									.getAttribute(
																											"value"));

																				}

																			}

																		}

																	}

																}

															}

														}

													}

												}

											}

										}

									}

								}

							}

						}

					}

				}

			}

		}
	}

}
