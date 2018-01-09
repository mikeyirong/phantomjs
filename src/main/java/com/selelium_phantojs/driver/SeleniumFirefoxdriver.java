package com.selelium_phantojs.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * @author mike_yi
 * @Description selenium using with firefoxDriver
 * @email 1135556405@qq.com
 */
public class SeleniumFirefoxdriver {
	private WebDriver driver;

	public SeleniumFirefoxdriver() {
		// set geckodriver.exe path
		System.setProperty("webdriver.gecko.driver", "D:\\install\\webdriver\\geckodriver.exe");
		// firefox intall path
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\firefox.exe");
		this.driver = new FirefoxDriver();
	}
}
