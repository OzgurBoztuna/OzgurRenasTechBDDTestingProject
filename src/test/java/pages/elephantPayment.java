package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import javax.sql.rowset.BaseRowSet;
import java.util.Map;

public class elephantPayment extends BrowserUtils {
    public elephantPayment(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;
    @FindBy(id ="month" )
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvv;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement pay;


public void creditCard(Map<String,String > datatable){
    cardNumber.sendKeys(datatable.get("CNumber"));
    month.sendKeys(datatable.get("EMonth"));
    year.sendKeys(datatable.get("EYear"));
    cvv.sendKeys(datatable.get("CVVCode"));
}


public void payButton(){
    pay.click();
}


}
