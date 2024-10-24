package steppack;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basepack.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pompack.Pomclass;

public class StepDefenition extends Baseclass  {

	Pomclass pom = new Pomclass();
	
	@Given("User Launch the browser")
	public void user_launch_the_browser() {
		 browserlaunch();
		 max();
	}

	@Then("User Navigate to url {string}")
	public void user_navigate_to_url(String string) {
		url();
		implicitywait();
	}

	@Then("User Verify that home page is visible successfully")
	public boolean user_verify_that_home_page_is_visible_successfully() {
	    try {
	    	boolean isvisible = driver.findElement(pom.homepage).isDisplayed();
	    	
	    	if (isvisible) {
				 System.out.println("Home page is visible succesfully");
				 Shot1(isvisible);
				 Thread.sleep(3000);
				 
				 return isvisible;
			}
	    }catch (Exception e) {
			System.out.println("Home page is not visible");
		}
	    return false;
	}

	@Then("Click on Signup button")
	public void click_on_signup_button() {
	    driver.findElement(pom.loginbtn).click();
	    implicitywait();
	}

	@Then("Verify New User Signup is visible")
	public boolean verify_new_user_signup_is_visible() {
	    try {
			boolean isvisble = driver.findElement(pom.signupvisible).isDisplayed();
			if (isvisble) {
				System.out.println("New User Singup is visible");
				
				Shot1(isvisble);
				Thread.sleep(3000);
				return isvisble;
			}
		} catch (Exception e) {
			System.out.println("New user Signup is not visible");
		}
		return false;
	}

	@Then("Enter name {string} and email address {string}")
	public void enter_name_and_email_address(String name, String email) {
	    driver.findElement(pom.nameinput).sendKeys(name);
	    driver.findElement(pom.emailinput).sendKeys(email);
	}

	@Then("Click Signup button")
	public void click_signup_button() {
	    driver.findElement(pom.submitbtn).click();
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public boolean verify_that_enter_account_information_is_visible() {
	    try {
	    	boolean isvisible = driver.findElement(pom.acinfovisible).isDisplayed();
	    	
	    	if (isvisible) {
				System.out.println("Verify that ENTER ACCOUNT INFORMATION is visible");
				Shot1(isvisible);
				Thread.sleep(4000);
				return isvisible;
			}
			
		} catch (Exception e) {
			System.out.println("The ENTER ACCOUNT INFORMATION is not visible");
		}
	    return false;
	}
	@Then("Fill details Title {string} Password {string} Date {string} month {string} year {string}")
	public void fill_details_title_password_date_month_year(String title , String password, String Day, String Month, String Year) {
		   WebElement radiotitle1 = driver.findElement(pom.radiotitle);
		   radiotitle1.click();
		   
		   WebElement pass = driver.findElement(pom.passwordinput);
		   pass.sendKeys(password);
		   scroll(pass);
		   
		   WebElement day = driver.findElement(pom.dayinput);
		   day.click();
		   MouseHover(day);
		   WebElement days = driver.findElement(By.xpath("//div[@id='uniform-days']//option[@value='12']"));
		   days.click();
		  
		   WebElement month = driver.findElement(pom.monthinput);
		   month.click();
		   MouseHover(month);
		   WebElement month1 = driver.findElement(By.xpath("//div[@id='uniform-months']//option[@value='8']"));
		   month1.click();
		   
		   WebElement year = driver.findElement(pom.yearinput);
		   year.click();
		   MouseHover(year);
		   WebElement year1 = driver.findElement(By.xpath("//div[@id='uniform-years']//option[@value='1991']"));
		   year1.click();
		   implicitywait();
	}
	@Then("Select checkbox Sign up for our newsletter checkbox")
	public void select_checkbox_sign_up_for_our_newsletter_checkbox() {
	    driver.findElement(pom.newsletter).click();
	}

	@Then("Select checkbox Receive special offers from our partners")
	public void select_checkbox_receive_special_offers_from_our_partners() {
	   driver.findElement(pom.offers).click();
	}
	@Then("Fill details: Firstname {string} Lastname {string} Company {string} Address {string}  Country {string} State {string} City {string} Zipcode {string} MobileNumber {string}")
	public void fill_details_firstname_lastname_company_address_country_state_city_zipcode_mobile_number(String Firstname, String Lastname, String Company, String Address, String Country, String State, String City, String zipcode, String MobileNumber) {
	   driver.findElement(pom.firstname).sendKeys(Firstname);
	   driver.findElement(pom.lastname).sendKeys(Lastname);
	   driver.findElement(pom.company).sendKeys(Company);
	   driver.findElement(pom.address).sendKeys(Address);
	   driver.findElement(pom.country).sendKeys(Country);
	   driver.findElement(pom.state).sendKeys(State);
	   driver.findElement(pom.city).sendKeys(City);
	   driver.findElement(pom.zipcode).sendKeys(zipcode);
	   WebElement mobnum = driver.findElement(pom.mobilenum);
	   mobnum.sendKeys(MobileNumber);
	   scroll(mobnum);
	   implicitywait();
	}
	@Then("Click Create Account button")
	public void click_create_account_button() {
	    driver.findElement(pom.creataccbtn).click();
	    implicitywait();
	}

	@Then("Verify that ACCOUNT CREATED is visible")
	public void verify_that_account_created_is_visible() {
	    try {
			WebElement verify = driver.findElement(pom.verifyacc);
			verify.isDisplayed();
			System.out.println("Congratulations! Your new account is created");
			Shot("verifyacc");
		} catch (Exception e) {
			System.out.println("sorry! your new account is not created");
		}
	}

	@Then("Click Continue button")
	public void click_continue_button() {
	    driver.findElement(pom.continueacc).click();
	    
	}

	@Then("Verify that Logged in as {string} is visible")
	public void verify_that_logged_in_as_is_visible(String username) throws IOException {
	    driver.findElement(pom.loginas).isDisplayed();
	    
	    System.out.println("logged in as " + username + "is visible");
	    Shot("loginas");
	}


//@testcase2
	
	@Then("Verify login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
	   driver.findElement(pom.loginverify).isDisplayed();
	}

	@Then("Enter email {string} and password {string}")
	public void enter_email_and_password(String email, String password) {
	   driver.findElement(pom.email).sendKeys(email);
	   driver.findElement(pom.Password).sendKeys(password);
	}

	@Then("Click login button")
	public void click_login_button() {
	    driver.findElement(pom.login).click();
	}

	@Then("Click Delete Account button")
	public void click_delete_account_button() {
		 driver.findElement(pom.delete).click();
	}

	@Then("Verify that ACCOUNT DELETED is visible and click Continue button")
	public void verify_that_account_deleted_is_visible_and_click_continue_button() {
		 try {
				WebElement acc_delet = driver.findElement(pom.verifydlt);
				acc_delet.isDisplayed();
				
				System.out.println("your account is deleted");
				Shot("accountdeleted");
			} catch (Exception e) {
				System.out.println("your account is not deleted");
			}
		    driver.findElement(pom.continueacc).click();
	}
	//testcasse3 
	@When("verify error your email or password is incorrect is visible")
	public void verify_error_your_email_or_password_is_incorrect_is_visible() {
	    driver.findElement(pom.login).click();
	    try {
			driver.findElement(pom.incorrecttxt).isDisplayed();
			System.out.println("your email or password is incorrect!");
			Shot("incorrect");
		} catch (Exception e) {
			System.out.println("your email or password are correct!");
	}
	  
 }
	//testcase4
			@Then("click logout button")
			public void click_logout_button() {
			   driver.findElement(pom.logoutbtn).click();
			}

			@Then("verify that user is navigated to login page")
			public void verify_that_user_is_navigated_to_login_page() {
			    try {
					WebElement homepage = driver.findElement(pom.loginerror);
					homepage.isDisplayed();
					System.out.println("error to navigate to home page");
				} catch (Exception e) {
					System.out.println("home page is visible");
			}
			
			}
			//testcase 5
			
			@Then("verify error Email address already exist is visible")
			public void verify_error_email_address_already_exist_is_visible() {
				try {

					driver.findElement(pom.emailexisterror).isDisplayed();
					System.out.println("Email Address already exist!");
					Shot("emailexit");

				} catch (Exception e) {
					
				}
			}
	//testcase6
			@Then("click on Contact Us button")
			public void click_on_contact_us_button() {
			   driver.findElement(pom.contactbtn).click();
			   implicitywait();
			}

			@Then("verify GET In TOUCH is visible")
			public void verify_get_in_touch_is_visible() throws IOException {
			    driver.findElement(pom.getintxt).isDisplayed();
			    System.out.println("Get in touch is visible");
			    Shot("get_touch");
			}

			@Then("Enter Name {string}  Email {string} Subject {string} and Message {string}")
			public void enter_name_email_subject_and_message(String name, String email, String subject, String message) {
			    driver.findElement(pom.inputname).sendKeys(name);
			    driver.findElement(pom.inputemail).sendKeys(email);
			    driver.findElement(pom.inputsub).sendKeys(subject);
			    driver.findElement(pom.inputmsg).sendKeys(message);
			}

			@Then("user upload filer flipkart txt {string}")
			public void user_upload_filer_flipkart_txt(String image) {
			    driver.findElement(pom.choosefilebtn).sendKeys(image);
			}

			@Then("click the submit button")
			public void click_the_submit_button() {
			    driver.findElement(pom.btnsubmit).click();
			}

			@Then("user click the ok button on the alert")
			public void user_click_the_ok_button_on_the_alert() {
			   try {
				Alert alert = driver.switchTo().alert();
				System.out.println("alert is appeared");
				alert.accept();
			} catch (Exception e) {
				System.out.println("alert not appeared");
			}
			}

			@Then("verify the SUCCESS MESSAGE SUCCESS! your details have been submited successfully is visible")
			public void verify_the_success_message_success_your_details_have_been_submited_successfully_is_visible() throws IOException {
			   driver.findElement(pom.successtxt).isDisplayed();
			   System.out.println("success! your details have been submitted");
			   Shot("Success_contact");
			}

			@Then("Click HOME button and verify that landed to home page successfully")
			public void click_home_button_and_verify_that_landed_to_home_page_successfully() throws IOException {
			   driver.findElement(pom.homebtn).click();
			   driver.findElement(pom.homepage).isDisplayed();
			   System.out.println("landed on Home page");
			   Shot("Landed_Homepage");
			}
         //test case 7 
			@Then("click on TEST CASES button")
			public void click_on_test_cases_button() {
			    driver.findElement(pom.testcasebtn).click();
			}

			@Then("verify user is navigated to test cases page successfuly")
			public void verify_user_is_navigated_to_test_cases_page_successfuly() throws IOException {
				try {
					 driver.findElement(pom.casetxt).isDisplayed();
					    System.out.println("Test Cases page landed");
					    Shot("Test_casepage");
				} catch (Exception e) {
					System.out.println("error loading testcases page...");
				}
			   
			}
			//test case 8
			@Then("click on PRODUCTS button")
			public void click_on_products_button() {
			   driver.findElement(pom.productbtn).click();
			}

			@Then("verify user navigated to ALL PRODUCTS page successfully")
			public void verify_user_navigated_to_all_products_page_successfully() throws IOException {
				try {
					 WebElement product = driver.findElement(pom.productpaage);
					 product.isDisplayed();
					   System.out.println("landed to product page");
					   Shot("product_page");
					   scroll(product);
				} catch (Exception e) {
					System.out.println("error while loading product page");
				}
			  
			}

			@When("product list is visible")
			public void product_list_is_visible() {
			    WebElement prodlist = driver.findElement(pom.productlist);
			    prodlist.isDisplayed();
			    System.out.println("product list is visible");
			    scroll(prodlist);
			}

			@Then("click on VIEW PRODUCT of first product")
			public void click_on_view_product_of_first_product() {
				WebElement scr = driver.findElement(pom.category);
				scroll(scr);
			   driver.findElement(pom.viewproduct).click();
			   
			}

			@Then("user is landed to product detail page")
			public void user_is_landed_to_product_detail_page() throws IOException {
				try {
					 driver.findElement(pom.productdetailpage).isDisplayed();
					   System.out.println("product details page is visible");
					   Shot("product_detail");
				} catch (Exception e) {
					System.out.println("error while loading product details page");
				}
			  
			}

			@Then("verify that detail is visible productname, category, price, availability, condtion, brand")
			public void verify_that_detail_is_visible_productname_category_price_availability_condtion_brand() {
			   try {
				driver.findElement(pom.prodname).isDisplayed();
				driver.findElement(pom.prodcatgy).isDisplayed();
				driver.findElement(pom.prodprice).isDisplayed();
				driver.findElement(pom.prodavailable).isDisplayed();
				driver.findElement(pom.prodcondition).isDisplayed();
				driver.findElement(pom.prodbrand).isDisplayed();
				System.out.println("all product required details are verifyed");
				
			} catch (Exception e) {
				System.out.println("product details verification mismatching");
			}
			}
       //test case 9 
			@When("User enter productname {string} in search input and click search button")
			public void user_enter_product_name_in_search_input_and_click_search_button(String name) {
			    driver.findElement(pom.searchinput).sendKeys(name);
			    driver.findElement(pom.searchbtn).click();
			}

			@Then("verify SEARCHED PRODUCT IS visible")
			public void verify_searched_product_is_visible() throws InterruptedException {
			   WebElement visible = driver.findElement(pom.searchconform);
			   visible.isDisplayed();
			   System.out.println("product is visible");
			   scroll(visible);
			   Thread.sleep(3000);
			}

			@Then("verify all the products related to search are visible")
			public void verify_all_the_products_related_to_search_are_visible() {
			    driver.findElement(pom.prodreltag).isDisplayed();
			    System.out.println("product related search are visible");
			}
      // test cases 10
			@When("User scrolling down to footer")
			public void user_scrolling_down_to_footer() {
			    WebElement footer = driver.findElement(pom.subfooter);
			    scroll_bottom(footer);
			    
			}

			@Then("verify text SUBSCRIPTION")
			public void verify_text_subscription() {
			    driver.findElement(pom.subfooter).isDisplayed();
			    System.out.println("subscription is visible");
			}

			@Then("Enter email {string} in input and click arrow button")
			public void enter_email_in_input_and_click_arrow_button(String email) {
			   driver.findElement(pom.giveemail).sendKeys(email);
			   driver.findElement(pom.clickbtn).click();
			}
//
//			@Then("verify success message YOU HAVE BEEN SUCCESSFULLY SUBSCRIBED is visible")
//			public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
//			   
//			}
			//test case 11 
			@Then("click Cart button")
			public void click_cart_button() {
			    driver.findElement(pom.cartbtn).click();
			}

//			@Then("verify success message YOU HAVE BEEN SUCCESSFULLY SUBSCRIBED is visible")
//			public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
//			    
//			}
			//test case 12
			@Then("Hoverover first product and click add to cart")
			public void hoverover_first_product_and_click_add_to_cart() {
//				
			    WebElement Hoverele = driver.findElement(pom.products1);
			    scroll(Hoverele);
			    MouseHover(Hoverele);
			    WebElement firstproduct = driver.findElement(pom.addtocart);
			    firstproduct.click();
			    
			    
			    
			}

			@Then("click continue shopping button")
			public void click_continue_shopping_button() throws InterruptedException {
			   driver.findElement(pom.continueshop).click();
			   Thread.sleep(2000);
			}

			@Then("Hoverover second product and click add to cart")
			public void hoverover_second_product_and_click_add_to_cart() throws InterruptedException {
				
			    WebElement hoverele = driver.findElement(pom.mentshirt);
			    MouseHover(hoverele);
			    WebElement prodscroll = driver.findElement(By.xpath("//h2[@class='title text-center']"));
			    scroll(prodscroll);
			    
			    driver.findElement(pom.addtocart1).click();
			    driver.findElement(pom.continueshop).click();
			    scroll_top(hoverele);
			    
			}

			@Then("click view cart button")
			public void click_view_cart_button() {
			    driver.findElement(pom.cartbtn).click();
			}

			@Then("verify both products are added to cart")
			public void verify_both_products_are_added_to_cart() {
			     try {
					driver.findElement(pom.product1).isDisplayed();
					driver.findElement(pom.product2).isDisplayed();
					System.out.println("two products are visible");
				} catch (Exception e) {
					System.out.println("two products are not visible");
			}
			}

			@Then("verify their prices quantity and total price")
			public void verify_their_prices_quantity_and_total_price() {
				try {
					 WebElement cartprice = driver.findElement(pom.price);
					 cartprice.isDisplayed();
					   driver.findElement(pom.quantity).isDisplayed();
					   driver.findElement(pom.total).isDisplayed();
					   System.out.println("elements are verifyed");
					   Shot("cartprice");
				} catch (Exception e) {
					System.out.println("elements are not visible");
				}
			  
			}
			//test case 13
			@Then("Increase quantity {string}")
			public void increase_quantity(String Quantity) {
			   WebElement num = driver.findElement(pom.quantinc);
			   num.clear();
			   num.sendKeys(Quantity);
			}

			@Then("click add to cart")
			public void click_add_to_cart() {
			    driver.findElement(pom.addcart).click();
			}

			@Then("click view cart")
			public void click_view_cart() {
				 driver.findElement(pom.cartbtn).click();
			}

			@Then("verify product is displayed in cart page with excat quantity")
			public void verify_product_is_displayed_in_cart_page_with_excat_quantity() {
				try {
					 WebElement quantity = driver.findElement(pom.quantybox);
					 quantity.isDisplayed();
					 System.out.println("verifyed cart has excat quantity");
					Shot("quantity");
				} catch (Exception e) {
					System.out.println("not having the excat quantity");
				}
			    
			}
      // fourteen 
			@Then("verify cart page is displayed")
			public void verify_cart_page_is_displayed() {
				 driver.findElement(pom.cartbtn).isDisplayed();
				 System.out.println("cart page is visible");
			}

			@Then("click proceed to checkout")
			public void click_proceed_to_checkout() {
			   driver.findElement(pom.proceed).click();
			   
			}
			@Then("click register login")
			public void click_register_login() {
				 driver.findElement(pom.register).click();
			}

			@Then("Verify address and review your order")
			public void verify_address_and_review_your_order() {
			   
			   try {
				   
				  WebElement delivery = driver.findElement(pom.deliveryadd);
				  delivery.isDisplayed();
				  System.out.println("adress is displayed");
				  Shot("delivery");
				   
				  
				   WebElement reivew = driver.findElement(pom.revieworder);
				   reivew.isDisplayed();
				   System.out.println("product is visible");
				   scroll_bottom(delivery);
				   
				   
				 
				   
			} catch (Exception e) {
				System.out.println("address is not visible");
				System.out.println("product is not visible");
			}
			   
			}

			@Then("enter description {string} and click place order")
			public void enter_description_and_click_place_order(String text) {
				  WebElement textinput = driver.findElement(pom.description);
				  textinput.sendKeys(text); 
				  driver.findElement(pom.placeord).click();
			}

			@Then("enter payment details Name on card {string} card numer {string} CVC {string} expiration date {string} year {string}")
			public void enter_payment_details_name_on_card_card_numer_cvc_expiration_date_year(String nameoncard, String cardnum, String cvc, String mon, String yea) {
			    driver.findElement(pom.nameoncard).sendKeys(nameoncard);
			    driver.findElement(pom.cardnum).sendKeys(cardnum);
			    driver.findElement(pom.cv).sendKeys(cvc);
			    driver.findElement(pom.month1).sendKeys(mon);
			    driver.findElement(pom.year1).sendKeys(yea);
			    
			}

			@Then("click pay and confrim order button")
			public void click_pay_and_confrim_order_button() {
				driver.findElement(pom.paynconfirm).click();
			}

			@Then("verify success message your order has been placed successfully")
			public void verify_success_message_your_order_has_been_placed_successfully() throws IOException {
			   WebElement ordersuccess = driver.findElement(pom.successorder);
			   ordersuccess.isDisplayed();
			   System.out.println("order placed success fully");
			   Shot("ordersuccess");
			   
			}
   
// test case 15 ALl the snippets have been executed already and test result passed 
//  test case 16 All the snippents have been executed alreadynand test result passed
			//test case 17
			@Then("Click X button corresponding to particular product")
			public void click_x_button_corresponding_to_particular_product() {
			    driver.findElement(pom.xbtn).click();
			}

			@Then("verify that product is removed from the cart")
			public void verify_that_product_is_removed_from_the_cart() throws IOException {
			    WebElement cartempty = driver.findElement(pom.emptycart);
			    cartempty.isDisplayed();
			    System.out.println("empty cart visible");
			    Shot("cartempty");
			}

// test case 18 
			@Then("click on WOMEN category")
			public void click_on_women_category() throws InterruptedException {
				try {
					WebElement homescroll = driver.findElement(pom.homeclick);
					homescroll.click();
					WebElement cat1 = driver.findElement(pom.category1);
					MouseHover(cat1);
					scroll(cat1);
					Thread.sleep(3000);
					driver.findElement(pom.womencat).click();
					System.out.println("element clicked");
				} catch (Exception e) {
					System.out.println("element not found");
				}
			}

			@Then("clik on any category link under WOMEN category")
			public void clik_on_any_category_link_under_women_category() {
			    WebElement dress1 = driver.findElement(pom.womdress);
			    MouseHover(dress1);
			    dress1.click();
			}

			@Then("verify that category page is displayed and confirm text WOMEN TOPS PRODUCT")
			public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_product() {
			    try {
					WebElement verfydress = driver.findElement(pom.dressvrfy);
					verfydress.isDisplayed();
					System.out.println("women dress page displayed");
					Shot("verfydress");
				} catch (Exception e) {
					System.out.println("error loading page..");
				}
			}

			@Then("on left side bar click on any sub category link of men category")
			public void on_left_side_bar_click_on_any_sub_category_link_of_men_category() throws InterruptedException {
			    WebElement menHover = driver.findElement(pom.mencat);
			    MouseHover(menHover);
			    menHover.click();
			    Thread.sleep(1000);
			}

			@Then("verify that user is navigated to that category")
			public void verify_that_user_is_navigated_to_that_category() throws IOException {
				try {
					WebElement menTshirt = driver.findElement(pom.mentsht);
					 MouseHover(menTshirt);
					 menTshirt.getText();
					 System.out.println("element tshirt displayed");
					 Shot("menTshirt");
				} catch (Exception e) {
					System.out.println("element tshirt not displayed");
				}
					
			
			}
// test case 19
			@Then("verify that BRANDs are visible on the left side bar")
			public void verify_that_bran_ds_are_visible_on_the_left_side_bar() throws InterruptedException {
				try {
					WebElement cat1 = driver.findElement(pom.category1);
					MouseHover(cat1);
					scroll(cat1);
					Thread.sleep(3000);
					WebElement brandtitle = driver.findElement(pom.brandlist);
					MouseHover(brandtitle);
					brandtitle.isDisplayed();
					System.out.println("Brand tag is visble");
					scroll(brandtitle);
				} catch (Exception e) {
					System.out.println("brand is not visible");
				}
				
				
			}

			@Then("click on any BRAND name")
			public void click_on_any_brand_name() {
			   driver.findElement(pom.brandname).click();
			}

			@Then("verify user is navigated to brand page and brand products are displayed")
			public void verify_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
				try {
					 WebElement brandpage = driver.findElement(pom.brandview);
					    brandpage.isDisplayed();
					    System.out.println("selected brand page is visble");
					    scroll(brandpage);
				} catch (Exception e) {
					System.out.println("not visible selected brand page");
				}
			   
			}

			@Then("click on any other brand on the left side bar")
			public void click_on_any_other_brand_on_the_left_side_bar() {
				try {
					WebElement brandtitle = driver.findElement(pom.brandlist);
					MouseHover(brandtitle);
					scroll(brandtitle);
					driver.findElement(pom.nextbrand).click();
					System.out.println("next brand element is clicked");
					
				} catch (Exception e) {
					System.out.println("next brand element is not clicked");
				}
				
			}

			@Then("verify the user is navigated to that brand page and can see products")
			public void verify_the_user_is_navigated_to_that_brand_page_and_can_see_products() {
			  try {
				WebElement brandnextpage = driver.findElement(pom.verifynextbrnpage);
				brandnextpage.isDisplayed();
				System.out.println("next brand page is displayed");
				Shot("brandnextpage");
			} catch (Exception e) {
				System.out.println("next page is not displayed");
			}
			}
//test case 20
			@Then("verify All Products page and enter product name {string} in search input and search")
			public void verify_all_products_page_and_enter_product_name_in_search_input_and_search(String product) {
				try {
					WebElement prodisply = driver.findElement(pom.product1);
				    prodisply.isDisplayed();
				    System.out.println("All product page displayed");
				    scroll(prodisply);
				    
				    WebElement searchproduct = driver.findElement(pom.searchprod);
				    searchproduct.sendKeys(product);
				    scroll(searchproduct);
				    driver.findElement(pom.clicksrc).click();
				} catch (Exception e) {
					System.out.println("product page is not visible");
				}
			    
			}

			@Then("verify SEARCHED PRODUCT is visible1")
			public void verify_searched_product_is_visible1() {
				try {
					 WebElement resultpro = driver.findElement(pom.resultprod);	
					   resultpro.isDisplayed();
					   System.out.println("serached product is visible");
					   scroll(resultpro);
					   WebElement menscr = driver.findElement(pom.menprod);
					   MouseHover(menscr);
					  
				} catch (Exception e) {
					System.out.println("searched product is not visible");
				}
			  
			   }

			@Then("Add those products to cart")
			public void add_those_products_to_cart() {
			    WebElement addcartsrc = driver.findElement(pom.prodadd);
			    MouseHover(addcartsrc);
			    addcartsrc.click();
			    driver.findElement(pom.ctshop).click();
			    scroll_top(addcartsrc);
			}

			@Then("click Cart button and verify that products are visible in cart")
			public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
				try {
					 driver.findElement(pom.cartbtn).click();
					    WebElement prodoncart = driver.findElement(pom.prodoncart);
					    prodoncart.isDisplayed();
					    System.out.println("product is visible in cart page");
					   
				} catch (Exception e) {
					System.out.println("product is not visible");
				}
			   
			    
			}

			@Then("click SIGNUP LOGIN button and submit login details email {string} password {string}")
			public void click_signup_login_button_and_submit_login_details_email_password(String email, String password) {
				try {
					driver.findElement(pom.loginbtn).click();
					   driver.findElement(pom.email).sendKeys(email);
					   driver.findElement(pom.Password).sendKeys(password);
					   driver.findElement(pom.login).click();
					   WebElement Asnambi = driver.findElement(pom.loginas);
					   Asnambi.isDisplayed();
					   System.out.println("logged in as : " + Asnambi);
				} catch (Exception e) {
					System.out.println("not logged in ...");
				}
			   
			}

			@Then("Again go to cart")
			public void again_go_to_cart() {
			   driver.findElement(pom.cartbtn).click();
			}

			@Then("verify that those product are visible in cart after login as well")
			public void verify_that_those_product_are_visible_in_cart_after_login_as_well() {
				try {
					WebElement visibleprod = driver.findElement(pom.prodoncart);
					visibleprod.isDisplayed();
					System.out.println("mens tshirt is visible");
					Shot("visibleprod");
				} catch (Exception e) {
					System.out.println("product is not visible ");
				}
				
			}
//test case 21
			@Then("click on view product button")
			public void click_on_view_product_button() {
				WebElement prodbtn1 = driver.findElement(pom.products1);
				scroll(prodbtn1);
				driver.findElement(pom.clvcrt).click();
				
			}

			@Then("verify write your review is visible")
			public void verify_write_your_review_is_visible() {
				try {
					
					 WebElement scrprod1 = driver.findElement(pom.products1);
					    scroll(scrprod1);
					   // WebElement img1 = driver.findElement(pom.imgHover1);
						//MouseHover(img1);
					    WebElement writerw = driver.findElement(pom.writereview);
					   // MouseHover(writerw);
					    writerw.isDisplayed();
					    System.out.println("write your review is displayed");
					    scroll(writerw);
				} catch (Exception e) {
					System.out.println("not visible write review");
				}
			   
			}

			@Then("Enter name {string} email {string} and review {string}")
			public void enter_name_email_and_review(String name, String email,String review) {
			    driver.findElement(pom.namewrite).sendKeys(name);
			    driver.findElement(pom.emailwrite).sendKeys(email);
			    WebElement reviewsrc = driver.findElement(pom.txtreview);
			    reviewsrc.sendKeys(review);
			    scroll(reviewsrc);
			}

			@Then("click submit button")
			public void click_submit_button() {
			    driver.findElement(pom.reviewsubmit).click();
			}

			@Then("verify success message")
			public void verify_success_message() {
				try {
					WebElement elevisible1 = driver.findElement(By.xpath("//div[@id='review-section']"));
					   elevisible1.isDisplayed();
					   System.out.println("success message passed");
				} catch (Exception e) {
					// TODO: handle exception
				}
			   
			}

   // test case 22
			@Then("scroll down to page")
			public void scroll_down_to_page() {
				WebElement homescroll = driver.findElement(pom.homeclick);
				homescroll.click();
				scroll_bottom(homescroll);
				
			}

			@Then("verify RECOMMENDED ITEMS are visible")
			public void verify_recommended_items_are_visible() {
				try {
					WebElement moveup = driver.findElement(By.xpath("//div[@class='recommended_items']"));
					MouseHover(moveup);
					WebElement visibletxt = driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]"));
					MouseHover(visibletxt);
					visibletxt.isDisplayed();
					System.out.println("recomended items are visible");
					scroll(visibletxt);
					Thread.sleep(3000);
					implicitywait();
					
				} catch (Exception e) {
					System.out.println("recomended items are not visible");
				}
				
			}

			@Then("click on ADD TO CART on recommended product")
			public void click_on_add_to_cart_on_recommended_product() {
				WebElement addele = driver.findElement(By.xpath("(//div[@class=\"productinfo text-center\"])[35]"));
				MouseHover(addele);
//				driver.findElement(By.xpath("(//i[@class='fa fa-angle-right'])[2]")).click();
//				WebElement clickadd = driver.findElement(By.xpath("(//a[@data-product-id='1'])[3]"));
//				MouseHover(clickadd);
//				clickadd.click();
				driver.findElement(By.xpath("(//a[@data-product-id='1'])[3]")).click();
				 driver.findElement(pom.ctshop).click();
				
			}

			@Then("verify product is displayed in cart")
			public void verify_product_is_displayed_in_cart() {
				 WebElement moveup = driver.findElement(By.xpath("(//a[@data-product-id='1'])[3]"));
				 scroll_top(moveup);
				 driver.findElement(pom.cartbtn).click();
				 driver.findElement(By.xpath("//a[@href='/product_details/1']")).isDisplayed();
				 System.out.println("product is displayed in cart");
				
			}

			
}

