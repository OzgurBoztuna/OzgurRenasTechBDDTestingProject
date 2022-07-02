package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.elephantHome;
import pages.elephantPayment;
import pages.paymentVerify;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

public class elephantSteps extends BrowserUtils {
  public void elephantSteps(){PageFactory.initElements(Driver.getDriver(),this);}

    elephantHome elephantHome=new elephantHome();
    elephantPayment payment=new elephantPayment();
     paymentVerify verify=new paymentVerify();


    @Given("The user goes to URL")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
        BrowserUtils.staticWait(3);
    }

    @When("The user wants to verify header {string}")
    public void the_user_wants_to_verify_header(String string) {
      BrowserUtils.staticWait(2);
        elephantHome.setHeader(string);




    }

    @When("The user wants to verify toy price as {string}")
    public void the_user_wants_to_verify_toy_price_as(String string) {
        elephantHome.setPrice(string);


    }
    @When("The user wants tp verify URL contains {string}")
    public void the_user_wants_tp_verify_url_contains(String string) {
        elephantHome.URL(string);


    }



    @When("The user wants to click the quantity button")
    public void the_user_wants_to_click_the_quantity_button() {
        elephantHome.clicked();
    }

    @When("The user wants to select {string}")
    public void the_user_wants_to_select(String string) {
        elephantHome.selectquantity(string);

    }

    @Then("The user wants to click Buy Now button")
    public void the_user_wants_to_click_buy_now_button() {
      elephantHome.buyNowButton();

    }

    @Then("The user wants to enter following credit card information")
    public void the_user_wants_to_enter_following_credit_card_information(Map<String,String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

      payment.creditCard(dataTable);
    }

    @Then("The user wants to click Pay button")
    public void the_user_wants_to_click_pay_button() {
payment.payButton();
    }

    @Then("The user  should be able to verify {string}")
    public void the_user_should_be_able_to_verify(String string) {
verify.setVerify(string);

    }

    @When("The user want to buy toys according to given {string}")
    public void the_user_want_to_buy_toys_according_to_given(String string) {
elephantHome.selectquantity(string);
    }
}

