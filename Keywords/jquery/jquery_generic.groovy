package jquery

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class jquery_generic {
	@Keyword
	def execJS(String script){
		WebDriver driver = DriverFactory.getWebDriver()
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Object response = jse.executeScript(script)
		sleep(300);
		return response;
	}
}
