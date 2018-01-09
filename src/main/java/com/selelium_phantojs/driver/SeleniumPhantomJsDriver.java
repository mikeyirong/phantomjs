package com.selelium_phantojs.driver;

import java.util.ArrayList;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author mike_yi
 * @Description selenium using with PhantomJsDriver
 * @email 1135556405@qq.com
 */
public class SeleniumPhantomJsDriver {
	private WebDriver driver;

	public SeleniumPhantomJsDriver() {
		DesiredCapabilities dcaps = new DesiredCapabilities();
		// ssl证书支持
		dcaps.setCapability("acceptSslCerts", true);
		// 截屏支持
		dcaps.setCapability("takesScreenshot", true);
		// css搜索支持
		dcaps.setCapability("cssSelectorsEnabled", true);
		// js支持
		dcaps.setJavascriptEnabled(true);
		// 驱动支持
		dcaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"D:\\install\\webdriver\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		// 图片加载
		dcaps.setCapability("phantomjs.page.settings.loadImages", false);
		// 设置use-agent
		dcaps.setCapability("phantomjs.page.settings.userAgent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36");
		// 设置请求头
		// dcaps.setCapability("phantomjs.page.customHeaders.Host", "www.amazon.com");
		// 设置代理
		ArrayList<String> cliArgsCap = new ArrayList<String>();
		String ipInfo = "14.117.179.57:22806";
		cliArgsCap.add("--proxy=" + ipInfo);
		cliArgsCap.add("--proxy-auth=kim:avfnxus8");
		cliArgsCap.add("--proxy-type=socks");
		// dcaps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);
		this.driver = new PhantomJSDriver(dcaps);
		// 设置窗口大小
		driver.manage().window().setSize(new Dimension(1280, 1024));
	}
}
