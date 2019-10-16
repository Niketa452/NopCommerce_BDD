package NopCommerce_BDD;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    AppleMacBookPro appleMacBookPro = new AppleMacBookPro();
    EmailAFriendDetails emailAFriendDetails = new EmailAFriendDetails();
    ShoppingCart shoppingCart=new ShoppingCart();
    Checkout checkout=new Checkout();
    BuyBooks buyBooks=new BuyBooks();


    @Given("^I am on the Registeration page$")
    public void i_am_on_the_Registeration_page() {
        homePage.clickonregisterbutton();
        registrationPage.verifyURL();

    }

    @When("^I fill all compulsory fields$")
    public void i_fill_all_compulsory_fields() {
        registrationPage.enteringRegistrationDetails();

    }

    @When("^I click on Registeration button$")
    public void i_click_on_Registeration_button() {
        registrationPage.clickonRegisterButton();

    }

    @Then("^Your registration is completed message should be displayed$")
    public void your_registration_is_completed_message_should_be_displayed() {
        registrationPage.confirmMessageDisplay();
    }


    @Given("^I am on the product page$")
    public void i_am_on_the_product_page() {
        homePage.validatecurrenturl();//gets current title;
        homePage.clickonregisterbutton();//clicking registration button on homepage
        registrationPage.verifyURL();//verifying registration page URL
        registrationPage.enteringRegistrationDetails();
        registrationPage.clickonRegisterButton();//enter registration details and asserting confirmation message
        registrationPage.confirmMessageDisplay();//registration confirmation message display
        registrationPage.navigateBackToHomePAge();//back to homepage


    }

    @When("^I click on 'Email a friend' button$")
    public void i_click_on_Email_a_friend_button() {
        homePage.clickOnAProductToReferToAFriend();


    }

    @When("^I should be navigated to the 'Email a friend' details page$")
    public void i_should_be_navigated_to_the_Email_a_friend_details_page() {
        appleMacBookPro.clickonAProduct();
    }

    @When("^I fill all the compulsory fields$")
    public void i_fill_all_the_compulsory_fields() {
        emailAFriendDetails.registeredUserShouldBeAbleToReferAProductToAFriend();

    }

    @When("^click on 'Send mail' button$")
    public void click_on_Send_mail_button() {
        emailAFriendDetails.clickonsendEmail();

    }

    @Then("^'Your message has been sent' message should be displayed$")
    public void your_message_has_been_sent_message_should_be_displayed() {
        emailAFriendDetails.messageSentDisplay();

    }
    @Given("^I am on the home page$")
    public void i_am_on_the_home_page()  {
        homePage.clickOnAProductToReferToAFriend();

    }

    @When("^I click on a product and 'email a friend' button$")
    public void i_click_on_a_product_and_email_a_friend_button() {
        appleMacBookPro.clickonAProduct();
    }

    @When("^I enter friend's email and my email$")
    public void i_enter_friend_s_email_and_my_email()  {
    emailAFriendDetails.onlyRegisteredMemebersToBeAbleToReferProductToAFriend();
    }

    @Then("^'Only registered customers can use email a friend feature' message should be displayed$")
    public void only_registered_customers_can_use_email_a_friend_feature_message_should_be_displayed() {
        emailAFriendDetails.errorMessage();
    }
    @Given("^I am a registered user$")
    public void i_am_a_registered_user() {
        homePage.clickonregisterbutton();
        registrationPage.enteringRegistrationDetails();
        registrationPage.clickonRegisterButton();
        registrationPage.confirmMessageDisplay();//registration confirmation message display
        registrationPage.navigateBackToHomePAge();//back to homepage


    }

    @When("^I click on 'Books' category and select a product and click on shopping cart$")
    public void i_click_on_Books_category_and_select_a_product_and_click_on_shopping_cart() {
        homePage.buybooks();
        buyBooks.buybook();

    }

    @When("^I click on 'Checkout' button$")
    public void i_click_on_Checkout_button() {
        shoppingCart.checkout();

    }

    @When("^I fill chekout form details$")
    public void i_fill_chekout_form_details() {
        checkout.fillCheckoutForm();
    }

    @Then("^I should recieve 'Your order has been successfully processed' message$")
    public void i_should_recieve_Your_order_has_been_successfully_processed_message() {
        checkout.thankyouMessage();
    }
    @Given("^I am on books category page$")
    public void i_am_on_books_category_page()  {
        homePage.buybooks();


    }

    @When("^I click on Add to cart button$")
    public void i_click_on_Add_to_cart_button()  {
        buyBooks.buybook();
    }

    @When("^I check the Terms and condition radio button$")
    public void i_check_the_Terms_and_condition_radio_button()  {
        shoppingCart.termsAndCondition();

    }

    @When("^I click on 'Checkout' button on the shopping cart page$")
    public void i_click_on_Checkout_button_on_the_shopping_cart_page()  {
        shoppingCart.checkout();
    }

    @When("^I click on 'Checkout as a guest' button$")
    public void i_click_on_Checkout_as_a_guest_button()  {
        checkout.checkoutAsAGuest();
    }

    @When("^I fill checkout form details as a guest$")
    public void i_fill_checkout_form_details_as_a_guest()  {
        checkout.fillFormAsGuest();
        checkout.fillCheckoutForm();
    }

    @Then("^'Your order has been successfully processed' message should be displayed$")
    public void your_order_has_been_successfully_processed_message_should_be_displayed()  {
       checkout.thankyouMessage();
    }












}

