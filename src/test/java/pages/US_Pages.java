
package pages;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utilities.Driver;

    public class US_Pages {

        public US_Pages(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy (xpath = "//*[@class='gLFyf']")
        public WebElement searchTextBox;

        @FindBy (xpath = "(//input[@class='gNO89b'])[1]")
        public WebElement searchButton;

        @FindBy(xpath="//div[@id='result-stats']")
        public WebElement result;

        @FindBy(id="twotabsearchtextbox")
        public WebElement amazonSearch;

        @FindBy (xpath = "//span[@class='DFlfde SwHCTb']")
        public WebElement kasilastirmaDegeri;

    }

