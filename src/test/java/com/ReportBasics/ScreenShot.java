package com.ReportBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

public static String getScreenshot(WebDriver driver,String screenShotname) {

TakesScreenshot ts=(TakesScreenshot) driver;

File src=ts.getScreenshotAs(OutputType.FILE);

String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
File destination= new File(path);

try {
FileUtils.copyDirectory(src,destination);
}catch (IOException e) {
	System.out.println("Capture Failed"+e.getMessage());
	
}
return path;


}

}