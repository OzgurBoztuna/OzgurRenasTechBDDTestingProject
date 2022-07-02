package pages;

import org.apache.commons.math3.optim.univariate.BracketFinder;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class paymentVerify extends BrowserUtils {

           public paymentVerify(){
               PageFactory.initElements(Driver.getDriver(),this);
           }

      @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verify;

           public void setVerify(String str){
               BrowserUtils.staticWait(2);
               Assert.assertEquals(verify.getText(),str);


           }



}
