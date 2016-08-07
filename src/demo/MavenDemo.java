package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class MavenDemo {

	WebDriver driver;

	@Test
	public void openBrowser(XmlTest x) throws MalformedURLException {
		String hub = x.getParameter("hub");
		URL url = new URL(hub);
		String browser = x.getParameter("browser");
		DesiredCapabilities c = new DesiredCapabilities();
		c.setBrowserName(browser);

		driver = new RemoteWebDriver(url, c);
		driver.get("http://www.google.com");
		driver.close();
	}

}
