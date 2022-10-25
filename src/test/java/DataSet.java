import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "data-provider")
    public Object[][] setData(){
        return new Object[][] {
                {1,2,3,4},

        };
    }
}
