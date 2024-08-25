import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
//Homework16

public class RegistrationTest extends BaseTest {
    RegistrationPage registrationPage = new RegistrationPage(getDriver());
    @Test
    public void  registrationNavigation()  {
        String urlRegistration = "https://qa.koel.app/registration";

        registrationPage.getRegistration();
//      Added ChromeOptions argument below to fix websocket error
        //Step 1
//        String url = "https://qa.koel.app/";
//        driver.get(url);

        //Step 2
//        WebElement registrationLink = driver.findElement(By.cssSelector("a[href='registration']"));
//        registrationLink.click();
        

        
        //Step 3
        Assert.assertEquals(getDriver().getCurrentUrl(), urlRegistration);
        
    }
    
}

