package com.selelium_phantojs.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author mike_yi
 * @Description selenium using with chromedriver
 *
 */
public class SeleniumChromedriver {
	@SuppressWarnings("unused")
	private WebDriver driver;

	public SeleniumChromedriver() {
		// set chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\install\\webdriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
}
