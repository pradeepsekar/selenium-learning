package stepDefintions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;

public class UserStepDefinitions implements BaseTest {
	protected WebDriver driver = DriverUtil.getDefaultDriver();

	@Given("^I enter search text into input field$")
	public void i_enter_search_text_into_input_field_having_id(DataTable data) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		String type = "id";
		String accessName = "lst-ib";
		List<List<String>> searchData = data.raw();
		for (List<String> currentSearchText : searchData) {
			miscmethodObj.validateLocator(type);
			inputObj.enterText(type, currentSearchText.get(0), accessName);
		}
//		throw new PendingException();
	}
	
	@And("^I take screenshots$")
	public void I_take_screenshots() throws Exception
	{
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File currdir=new File("Screenshots");
		String path=currdir.getAbsolutePath();
		DateFormat date=new SimpleDateFormat("ddMMyyyyHHmmss");
		Calendar cal=Calendar.getInstance();
		cal.getTime();
//		String path = srcfile.getAbsolutePath();
		System.out.println("path="+ path);
		FileUtils.copyFile(srcfile, new File(path+"\\screenshot"+date.format(cal.getTime())+".png"));
	}
	
	@After
	public void checkIfScenarioFailed(Scenario scenario) {
		if(scenario.isFailed()) {
			System.out.println("********** scenario failed ********************");
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File currdir=new File("Screenshots");
			String path=currdir.getAbsolutePath();
			DateFormat date=new SimpleDateFormat("ddMMyyyyHHmmss");
			Calendar cal=Calendar.getInstance();
			cal.getTime();
//			String path = srcfile.getAbsolutePath();
			System.out.println("path="+ path);
			try {
				FileUtils.copyFile(srcfile, new File(path+"\\screenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Map<String, String> sampleMap = new HashMap<>();
		}
	}

}
