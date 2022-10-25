import io.appium.java_client.android.AndroidDriver;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.io.IOException;

public class Utils {
    AndroidDriver driver;
    public Utils(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   public int OTP1;
    public int OTP2;
    public int OTP3;
    public int OTP4;

    public String mobileNumber;

    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public int getOTP1() {
        return OTP1;
    }

    public void setOTP1(int OTP1) {
        this.OTP1 = OTP1;
    }

    public int getOTP2() {
        return OTP2;
    }

    public void setOTP2(int OTP2) {
        this.OTP2 = OTP2;
    }
    public int getOTP3() {
        return OTP3;
    }

    public void setOTP3(int OTP3) {
        this.OTP3 = OTP3;
    }
    public int getOTP4() {
        return OTP4;
    }

    public void setOTP4(int OTP3) {
        this.OTP3 = OTP3;
    }




    public void readJSON() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("./src/test/resources/user.json"));
        JSONObject jsonObject = (JSONObject) obj;
        setmobileNumber((String)jsonObject.get("mobileNumber"));
        setOTP1((Integer) jsonObject.get("OTP1"));
        setOTP2((Integer) jsonObject.get("OTP2"));
        setOTP3((Integer)jsonObject.get("OTP3"));
        setOTP4((Integer)jsonObject.get("OTP4"));


    }

}
