package generic;

public interface FrameworkConstants {

	public String CHROME_KEY="webdriver.chrome.driver";	
	public String CHROME_VALUE="./src/main/resources/Drivers/chromedriver.exe";
	
	public String FIREFOX_KEY="webdriver.gecko.driver";
	public String FIREFOX_VALUE="./src/main/resources/Drivers/geckodriver.exe";
	
	public String EXCEL_PATH = "./src/test/resources/TestData/testData.xlsx";
	
	public String PROPERTYFILE_PATH = "./src/test/resources/PropertyFile/data.properties";
	
	public String SCREENSHOT_PATH = "./ScreenShots/";
	
	public String REPORTS_PATH="./Reports/";
	
	public String TEST_NAME="ExtentDemo";
	
	long TIMEOUTS_WAIT= 20;
}
