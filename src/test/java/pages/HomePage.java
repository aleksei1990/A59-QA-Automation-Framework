package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    //Constructor
    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }

    //Locator
    @FindBy(css = "img.avatar")
    private WebElement userAvatarIcon;
    @FindBy(css = "i[data-testid='sidebar-create-playlist-btn']")
    private WebElement addPlayList;
    @FindBy(css = "li[data-testid='playlist-context-menu-create-simple']")
    private WebElement createPlayListBtn;
    @FindBy(css = "[name='create-simple-playlist-form']>input")
    private WebElement playListNameInput;
    @FindBy(css = "li a.songs")
    private WebElement allSongsList;
    @FindBy(css = "div#searchForm input[type='search']")
    private WebElement searchSong;
    @FindBy(xpath = "//a[contains(text(),\"Test Playlist for HW21\")]")
    private WebElement myPlayList;
    @FindBy(css = ".playlist:nth-child(4)")
    private WebElement userPlayList;
    @FindBy(css = "[name='name']")
    private WebElement newNamePlayList;
    @FindBy(css = "div.success.show")
    private WebElement playListMessagePopup;

    //Methods
    public WebElement getUserAvatar(){
        return userAvatarIcon;
    }
    public WebElement getAddPlaylist(){
        return addPlayList;
    }
    public WebElement getCreatePlayListBtn(){
        return createPlayListBtn;
    }
    public WebElement getPlayListNameInput(){
        return playListNameInput;
    }
    public WebElement getSearchSong(){
        return searchSong;
    }
    public WebElement getMyPlayList(){
        return myPlayList;
    }
    public void homePlayList(){
        getMyPlayList().click();
    }
    public WebElement getUserPlayList(){
        return userPlayList;
    }
    public void doubleClickUserPlayList(){
        actions.doubleClick(getUserPlayList()).perform();
    }
    public WebElement getNewNamePlayList(){
        return newNamePlayList;
    }
    public void enterNewNamePlayList(String newPlayList){
        actions.moveToElement(getNewNamePlayList()).perform();
        getNewNamePlayList().sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
        getNewNamePlayList().sendKeys(newPlayList);
        getNewNamePlayList().sendKeys(Keys.ENTER);
    }
    public WebElement successPlayListMessagePopup(){
        return playListMessagePopup;
    }


    public void createPlayList(String playListName){
        actions.moveToElement(getAddPlaylist()).perform();
        getAddPlaylist().click();
        getCreatePlayListBtn().click();
        getPlayListNameInput().click();
        getPlayListNameInput().sendKeys(playListName);
        getPlayListNameInput().sendKeys(Keys.ENTER);

    }
    public WebElement getPlayListByName(String playListName){
        return findElement(By.xpath(String.format("//section[@id='playlists']//li//a[text()='%s']", playListName)));
    }
    public void openPlayList(String playListName){
        getPlayListByName(playListName).click();
    }

    public void chooseAllSongsList (){
        allSongsList.click();
    }
    public void enterSearchSong(String songName){
        actions.moveToElement(getSearchSong()).perform();
        getSearchSong().click();
        getSearchSong().clear();
        getSearchSong().sendKeys(songName);
    }
}
