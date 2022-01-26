import Page.Login;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRunner extends SetUp{
    Login objLogin;
    @Test
    public void loginwith() throws IOException, ParseException {
        driver.get("https://priyoshop.com");
          objLogin =new Login(driver);
        JSONParser jsonParser=new JSONParser();
        Object obj=jsonParser.parse(new FileReader("./src/test/resources/user.json"));
        JSONObject jsonObject=(JSONObject)obj;
        String email=(String)jsonObject.get("email") ;
        String password=(String)jsonObject.get("password");

        String user1=objLogin.dologin(email,password);
        Assert.assertEquals(user1,"nazmul35-1885@diu.edu.bd");

//        String user1=objLogin.dologin("nazmul35-1885@diu.edu.bd","123456");
//        Assert.assertEquals(user1,"nazmul35-1885@diu.edu.bd");

    }

}
