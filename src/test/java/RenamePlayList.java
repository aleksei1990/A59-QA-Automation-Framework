import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

//homework 21
public class RenamePlayList extends BaseTest {
    String newPlayList = "Playlist for hw";

    @Test
public void renamePlayListHw(){

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        String updPlayListMsg = "Updated playlist \"Playlist for hw.\"";
        String myPlayList = "Test Playlist for HW21";

        loginPage.login();
        homePage.homePlayList();
        homePage.doubleClickUserPlayList();
        homePage.enterNewNamePlayList(newPlayList);
        Assert.assertTrue(homePage.successPlayListMessagePopup().isDisplayed());

        //Choose Play list
//        myPlayList("Test Playlist for HW21");

        //Double click on Play list Name
//        doubleClickUserPlayList();
//
//        //Enter New Name
//        enterNewNamePlayList();
//
//        Assert.assertEquals(successPlayListMessagePopup(),updPlayListMsg);
//
//    }
//
//    public String successPlayListMessagePopup(){
//        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.cssSelector("div.success.show")));
//        return notification.getText();
//    }
//
//    public void enterNewNamePlayList() {
//        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.cssSelector("[name='name']")));
//        inputField.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
//        inputField.sendKeys(newPlayList);
//        inputField.sendKeys(Keys.ENTER);
//    }
//
//    public void doubleClickUserPlayList() {
//        WebElement userPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.cssSelector(".playlist:nth-child(4)")));
//        actions.doubleClick(userPlayList).perform();
//    }
//
//    public void myPlayList(String playlistName) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath("//a[contains(text(),\"Test Playlist for HW21\")]"))).click();
    }

}
