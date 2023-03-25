package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends CommonOps implements ITestListener {

    public void onStart(ITestContext execution){
        System.out.println("--------Start Execution--------");
    }

    public void onFinish(ITestContext execution){
        System.out.println("--------End Execution--------");
    }

    public void onTestStart(ITestResult test){
        System.out.println("--------Start Test--------:" +test.getName()+"Pass --------");
    }

    public void onTestSuccess(ITestResult test){
        System.out.println("-------- Test--------:"+ test.getName()+"Pass-------");
    }

    public void onTestFailure(ITestResult test){
        System.out.println("--------Test--------:" +test.getName()+"Filed-------");
        if (!platform.equalsIgnoreCase("api")){
        SaveScreenshot();
    }
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // TODO Auto-generated method stub
    }

    public void onTestSkipped(ITestResult test){
        System.out.println("--------Skip Test--------:" +test.getName()+"--------");
    }

    @Attachment(value = "Page Screenshot", type = "image/png")
    public byte [] SaveScreenshot(){
        if (!platform.equalsIgnoreCase("mobile"))
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        else
            return ((TakesScreenshot)mobileDriver).getScreenshotAs(OutputType.BYTES);
    }
}
