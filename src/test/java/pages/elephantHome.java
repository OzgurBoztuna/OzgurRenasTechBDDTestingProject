package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.io.BufferedWriter;
import java.util.List;

public class elephantHome extends BrowserUtils {
    public elephantHome(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement header;


public void setHeader(String str){

    Assert.assertEquals(str,header.getText());

}



    @FindBy(tagName = "h3")
    private WebElement price;

    public void setPrice(String expected) {
        String x = price.getText();
        String id = x.split(": ")[1].trim();

        Assert.assertEquals(id,expected);

    }
    public boolean URL(String urlcontains) {
        String Url = Driver.getDriver().getCurrentUrl();
        if (Url.contains(urlcontains)) {
            return true;
        } else {
            return false;
        }
    }

    @FindBy(xpath ="//select[@name='quantity']")
   public WebElement quantity;


    @FindBy(xpath = "//input[@value='Buy Now']")
    private WebElement buyNow;


    public void buyNowButton(){
        buyNow.click();
    }



    public void clicked() {
        quantity.click();
        BrowserUtils.staticWait(1);

    }
    public void  selectquantity(String src){
        Select dropdown=new Select(quantity);
        dropdown.selectByValue(src);

    }







}