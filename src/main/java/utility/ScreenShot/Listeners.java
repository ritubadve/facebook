package utility.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestListener;
import org.testng.ITestResult;

import pojo.LaunchBrowser;

public class Listeners extends Base64 implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("on test start " +result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success" +result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			
			ScreenshotException.takeScreenShot(driver, result.getName());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped "+result.getName());
	}
	
	public void onTestFinish(ITestResult result) {
		System.out.println("on test finish "+result.getName());
}
}