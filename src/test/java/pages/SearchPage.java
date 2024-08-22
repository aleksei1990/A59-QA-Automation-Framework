package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    By viewAllButton = By.xpath("//button[@data-test='view-all-songs-btn']");
    By firstSong = By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]");
    By addToButton = By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']");
    By playList = By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Playlist 78')]");
    By addToPlayListMessage = By.cssSelector("div.success.show");

    public WebElement clickViewAllButton(){
        return findElement(viewAllButton);}
    public void pressViewAllButton(){
        clickViewAllButton().click();
        }

    public WebElement selectFitstSong(){
        return findElement(firstSong);}
    public void getFirstSong(){
        selectFitstSong().click();
    }

    public WebElement clickAddToButton(){
        return findElement(addToButton);}
    public void pressAddToButton(){
        clickAddToButton().click();
    }
    public WebElement choosePlayList(){
        return findElement(playList);}
    public void selectPlayList(){
        choosePlayList().click();
    }
    public WebElement getAddToPlayListMessage(){
        return findElement(addToPlayListMessage);
    }




}
