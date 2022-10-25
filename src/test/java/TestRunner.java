import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends AppLaunch{

    @BeforeTest
    public void TKScreen(){

       TestCase testCase=new TestCase(driver);


//        Utils utils = new Utils(driver);
//        utils.readJSON();

        testCase.TKMobileNoEnter("01617079276");
        //testCase.otpPage();
        testCase.TkOTP("1");





    }





}
