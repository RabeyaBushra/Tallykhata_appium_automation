import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TestCase {

    @FindBy(id = "com.progoti.tallykhata:id/et_mobile_number")
    public
    MobileElement mobileNumber;

    @FindBy(id = "com.progoti.tallykhata:id/btn_next")
    public
    MobileElement nextBtn1;

    //    @FindBy(id = "com.progoti.tallykhata:id/pinEntryViewOtp")
//    public
//    MobileElement OTP;
    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    public
    MobileElement OTP1;
//
//    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]")
//    public
//    MobileElement OTP2;
//
//    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]")
//    public
//    MobileElement OTP3;
//    @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[4]")
//    public
//    MobileElement OTP4;

    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    public
    MobileElement nextBtn2;
    public AndroidDriver driver;


    @FindBy(id = "com.progoti.tallykhata:id/pinEntryViewOtp")
    public
    MobileElement element;


    public void otpPage() {

//        Point location = element.getLocation();
//
//        System.out.print("location is : " + location);
//     System.out.print("location is : " + location.getX());
//        System.out.print("location is : " + location.getY());


    Dimension OTP1element = element.getSize();
    int height = OTP1element.getHeight();
    int width = OTP1element.getWidth();
    System.out.println(height);
    System.out.println(width);

    int x1=(width/2)-84;
    int x2=(width/2)-84;

    //int x3=(width/2)+100;

        System.out.println(x1);
        System.out.println(x2);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(x1,x2));
}









    public TestCase(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void TKMobileNoEnter(String mobileNo) {

        mobileNumber.sendKeys(""+mobileNo+"");
        nextBtn1.click();

    }

    public void TkOTP(String otp) {

          otpPage();
//          OTP.sendKeys(otp);
//        OTP1.sendKeys(""+otp1+"");
//        OTP2.sendKeys(""+otp2+"");
//        OTP3.sendKeys(""+otp3+"");
//        OTP4.sendKeys(""+otp4+"");

//        nextBtn2.click();








    }


}
