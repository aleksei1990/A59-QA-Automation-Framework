import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PlayListPage;


public class DeletePlayList extends BaseTest {



    @Test

    public void deletePlayList() {
// Without 'Thread.sleep(s)'

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        PlayListPage playListPage = new PlayListPage(getDriver());
        String playListName = "Playlist 78";
        loginPage.login();
        homePage.createPlayList(playListName);
        homePage.openPlayList(playListName);
        playListPage.deletePlayList();
        Assert.assertTrue(homePage.getPlayListByName(playListName).isDisplayed());

    }

}
