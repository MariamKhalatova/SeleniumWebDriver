package pages.common;

import constants.locators.HomePageConstants;
import constants.locators.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


    public class HomePage {
        private WebDriver driver;
        private By searchField = By.id(HomePageConstants.searchField);
        private By searchIcon = By.xpath(HomePageConstants.searchIcon);
        private By searchList = By.xpath(SearchResultPage.searchResult);
        private By itemPrice = By.xpath(HomePageConstants.itemPrice);


        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        //methods
        //getter/setters


        public By getSearchIcon() {
            return searchIcon;
        }

        //other methods
        public void navigateToHomePage(String baseURL){
            driver.get(baseURL);
        }

        public void clickElement(WebElement webElement){
            webElement.click();
        }


        public void inputSearchValue(String searchable) {
            driver.findElement(searchField).sendKeys(searchable);
        }

        public List<WebElement> clickSearchIcon() {
            driver.findElement(searchIcon).click();
            List<WebElement> list = driver.findElements(searchList);
            return list;
        }

        public void getItemPrice() {
            //get price of the item card
            driver.findElement(itemPrice).getText();
        }


    }

