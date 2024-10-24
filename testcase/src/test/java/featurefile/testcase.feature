
@testcases
Feature: automation test


  #@First
  #Scenario Outline: RegisterUser
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Verify New User Signup is visible
    #Then Enter name "nambi" and email address "nambirajan1212@gmail.com"
    #And Click Signup button
    #Then Verify that ENTER ACCOUNT INFORMATION is visible
    #Then Fill details Title "<title>" Password "<password>" Date "<Day>" month "<Month>" year "<Year>"
    #Then Select checkbox Sign up for our newsletter checkbox
    #Then Select checkbox Receive special offers from our partners
    #Then Fill details: Firstname "<First_name>" Lastname "<Last_name>" Company "<Company>" Address "<Address>"  Country "<Country>" State "<State>" City "<City>" Zipcode "<Zipcode>" MobileNumber "<Mobile_Number>"
    #And Click Create Account button
    #Then Verify that ACCOUNT CREATED is visible
    #Then Click Continue button
    #Then Verify that Logged in as "<username>" is visible
   #
    #Examples: 
      #| title | password | Day | Month | Year  | First_name | Last_name | company | Address   | Country | State     | City    | Zipcode | Mobile_Number | Username |
      #| Mr    | admin123 |  12 |    08 | 19991 | Nambi     | Rajan    | Axcess  | Tidalpark | India   | Tamilnadu | chennai | 6000001 |   8754721904 | @nambi   |

  #@Second
  #Scenario Outline: Login User with correct email and password
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Verify login to your account is visible
    #Then Enter email "nambirajan1212@gmail.com" and password "admin123"
    #And Click login button
    #Then Verify that Logged in as "<username>" is visible
    #Then Click Delete Account button
    #Then Verify that ACCOUNT DELETED is visible and click Continue button
    #
    #@three
    #Scenario Outline: Login User with incorrect email and password
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Verify login to your account is visible
    #When Enter email "nambi1212@gmail.com" and password "admin12"
    #And verify error your email or password is incorrect is visible
    #
    #@four
    #Scenario Outline: Logout User
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Verify login to your account is visible
    #Then Enter email "nambirajan1212@gmail.com" and password "admin123"
    #And Click login button
    #Then Verify that Logged in as "<username>" is visible
    #And click logout button
    #Then verify that user is navigated to login page
  #
    #@five 
    #Scenario Outline: Register User with existing email
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Verify New User Signup is visible
    #Then Enter name "nambi" and email address "nambirajan1212@gmail.com"
    #And Click Signup button
    #And verify error Email address already exist is visible
    
    #@six
    #Scenario Outline: Contact us form
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then click on Contact Us button
    #Then verify GET In TOUCH is visible
    #Then Enter Name "<name>"  Email "<email>" Subject "<subject>" and Message "<message>"
    #Then user upload filer flipkart txt "<image>"
    #Then click the submit button
    #Then user click the ok button on the alert 
    #Then verify the SUCCESS MESSAGE SUCCESS! your details have been submited successfully is visible
    #Then Click HOME button and verify that landed to home page successfully
    #
    #Examples:
    #| name  |       email              |      subject             | message                   | image                                                            |
    #| nambi | nambirajan1212@gmail.com |  screenshot of a document | This is a medical script | /Users/nambi/Downloads/WhatsApp Image 2024-09-25 at 19.48.32.jpeg|
    #
    #@seven
    #Scenario: Verify Test Cases page
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then click on TEST CASES button
    #And verify user is navigated to test cases page successfuly
    
    #@eight
    #Scenario: Verify All Products and Product detail page
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then verify user navigated to ALL PRODUCTS page successfully
    #When product list is visible
    #Then click on VIEW PRODUCT of first product 
    #Then user is landed to product detail page 
    #Then verify that detail is visible productname, category, price, availability, condtion, brand
    #
    #@nine
    #Scenario: Search Product
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then verify user navigated to ALL PRODUCTS page successfully
    #When User enter productname "blue top" in search input and click search button
    #Then verify SEARCHED PRODUCT IS visible
    #Then verify all the products related to search are visible 
    
    #@ten
    #Scenario: Verify Subscription in home page 
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #When User scrolling down to footer 
    #Then verify text SUBSCRIPTION
    #And Enter email "nambirajan1212@gmail.com" in input and click arrow button 
    #Then verify success message YOU HAVE BEEN SUCCESSFULLY SUBSCRIBED is visible
    #
    #@eleven
    #Scenario: Verify Subscription in cart page
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then click Cart button
    #When User scrolling down to footer 
    #Then verify text SUBSCRIPTION
    #And Enter email "nambirajan1212@gmail.com" in input and click arrow button 
    #Then verify success message YOU HAVE BEEN SUCCESSFULLY SUBSCRIBED is visible
    #
    #@twell
    #Scenario: Add products in cart
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then Hoverover first product and click add to cart
    #Then click continue shopping button
    #Then Hoverover second product and click add to cart
    #Then click view cart button 
    #Then verify both products are added to cart 
    #And verify their prices quantity and total price
    #
    #@thirteen
    #Scenario: Verify Product quantity in cart
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then click on VIEW PRODUCT of first product 
    #And Increase quantity "<Quantity>"
    #Then click add to cart 
    #Then click continue shopping button
    #Then click view cart 
    #Then verify product is displayed in cart page with excat quantity
    #
    #Examples:
    #|Quantity|
    #| 4      |
    
    #@fourteen
    #Scenario: Place Order Register while Checkout
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then Hoverover first product and click add to cart
    #Then click continue shopping button
    #Then Hoverover second product and click add to cart
    #Then click view cart button 
    #And verify cart page is displayed
    #Then click proceed to checkout
    #And click register login
    #Then Enter name "raja" and email address "nambiraj@gmail.com"
    #And Click Signup button
    #Then Verify that ENTER ACCOUNT INFORMATION is visible
    #Then Fill details Title "<title>" Password "<password>" Date "<Day>" month "<Month>" year "<Year>"
    #Then Select checkbox Sign up for our newsletter checkbox
    #Then Select checkbox Receive special offers from our partners
    #Then Fill details: Firstname "<First_name>" Lastname "<Last_name>" Company "<Company>" Address "<Address>"  Country "<Country>" State "<State>" City "<City>" Zipcode "<Zipcode>" MobileNumber "<Mobile_Number>"
    #And Click Create Account button
    #Then Verify that ACCOUNT CREATED is visible
    #Then Verify that ACCOUNT CREATED is visible
    #Then Click Continue button
    #Then Verify that Logged in as "<username>" is visible
    #Then click view cart button 
    #Then click proceed to checkout
    #Then Verify address and review your order
    #Then enter description "product delivery with in one week" and click place order
    #Then enter payment details Name on card "raj" card numer "2345679828" CVC "123" expiration date "03" year "1991"
    #And click pay and confrim order button
    #Then verify success message your order has been placed successfully
    #Then Click Delete Account button
    #Then Verify that ACCOUNT DELETED is visible and click Continue button
    #
    #Examples:
    #| title | password | Day | Month | Year  | First_name | Last_name | company | Address   | Country | State     | City    | Zipcode | Mobile_Number | Username |   
    #| Mr    | admin123 |  11 |    09 | 1999  |   raj      | nambi     | Axcess  | Tidalpark | India   | Tamilnadu | chennai | 6000001 |   8754721904 | @raj      |
    #
    #|name on card | card number | cvc | month |year |
    #|    raj     | 2345756577  | 234 | 09    | 2025|
    
    #@fifteen
    #Scenario: Plcae order Register before Checkout
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Enter name "raja" and email address "nambiraj@gmail.com"
    #And Click Signup button
    #Then Verify that ENTER ACCOUNT INFORMATION is visible
    #Then Fill details Title "<title>" Password "<password>" Date "<Day>" month "<Month>" year "<Year>"
    #Then Select checkbox Sign up for our newsletter checkbox
    #Then Select checkbox Receive special offers from our partners
    #Then Fill details: Firstname "<First_name>" Lastname "<Last_name>" Company "<Company>" Address "<Address>"  Country "<Country>" State "<State>" City "<City>" Zipcode "<Zipcode>" MobileNumber "<Mobile_Number>"
    #And Click Create Account button
    #Then Verify that ACCOUNT CREATED is visible
    #Then Click Continue button
    #Then Verify that Logged in as "<username>" is visible
    #And  click on PRODUCTS button
    #Then Hoverover first product and click add to cart
    #Then click continue shopping button
    #Then Hoverover second product and click add to cart
    #Then click view cart button 
    #Then click proceed to checkout
    #Then Verify address and review your order
    #Then enter description "product delivery with in one week" and click place order
    #Then enter payment details Name on card "raj" card numer "2345679828" CVC "123" expiration date "03" year "1991"
    #And click pay and confrim order button
    #Then verify success message your order has been placed successfully
    #Then Click Delete Account button
    #Then Verify that ACCOUNT DELETED is visible and click Continue button
    #
    #Examples:
    #| title | password | Day | Month | Year  | First_name | Last_name | company | Address   | Country | State     | City    | Zipcode | Mobile_Number | Username |   
    #| Mr    | admin123 |  09 |    09 | 1999  |   raj      |  K        | Axx     | Tidalpark |  India  | Tamilnadu | chennai | 6000001 |   8754721904  | @raj     |
    #
    #@sixteen
    #Scenario: Place Order Login Before Checkout
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then Click on Signup button
    #Then Enter email "nambirajan1212@gmail.com" and password "admin123"
    #And Click login button
    #Then Verify that Logged in as "<username>" is visible
    #And  click on PRODUCTS button
    #Then Hoverover first product and click add to cart
    #Then click continue shopping button
    #Then Hoverover second product and click add to cart
    #Then click view cart button 
    #Then click proceed to checkout
    #Then Verify address and review your order
    #Then enter description "product delivery with in one week" and click place order
    #Then enter payment details Name on card "raj" card numer "2345679828" CVC "123" expiration date "03" year "1991"
    #And click pay and confrim order button
    #Then verify success message your order has been placed successfully
    #Then Click Delete Account button
    #Then Verify that ACCOUNT DELETED is visible and click Continue button
    #
    #@seveenteen
    #Scenario: Remove Products From Cart
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then Hoverover second product and click add to cart
    #Then click view cart button 
    #And verify cart page is displayed
    #Then Click X button corresponding to particular product
    #Then verify that product is removed from the cart
    #
    #@eighteen
    #Scenario: View Category Product
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #Then click on WOMEN category
    #Then clik on any category link under WOMEN category
    #Then verify that category page is displayed and confirm text WOMEN TOPS PRODUCT
    #And on left side bar click on any sub category link of men category
    #Then verify that user is navigated to that category
    #
    #@nineteen
    #Scenario: 
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then verify that BRANDs are visible on the left side bar
    #And click on any BRAND name 
    #Then verify user is navigated to brand page and brand products are displayed 
    #Then click on any other brand on the left side bar 
    #And verify the user is navigated to that brand page and can see products
    #
    #@twenty
    #Scenario: Search product and verify cart after login
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then verify All Products page and enter product name "men tshirt" in search input and search
    #Then verify SEARCHED PRODUCT is visible1
    #And verify all the products related to search are visible
    #Then Add those products to cart
    #Then click Cart button and verify that products are visible in cart
    #Then click SIGNUP LOGIN button and submit login details email "nambirajan1212@gmail.com" password "admin123"
    #And Again go to cart 
    #Then verify that those product are visible in cart after login as well
    
    #@twentyone
    #Scenario: Add reiview on product
    #Given User Launch the browser
    #Then User Navigate to url "https://www.automationexercise.com"
    #Then User Verify that home page is visible successfully
    #And  click on PRODUCTS button
    #Then click on view product button
    #And verify write your review is visible
    #Then Enter name "nambi" email "nambirajan1212@gmail.com" and review "product is good"
    #And click submit button
    #Then verify success message 
    
    @twentytwo
    Scenario: Add to cart from Recommended items
    Given User Launch the browser
    Then User Navigate to url "https://www.automationexercise.com"
    And scroll down to page 
    Then verify RECOMMENDED ITEMS are visible
    Then click on ADD TO CART on recommended product 
    Then click on view product button
    Then click Cart button 
    Then verify product is displayed in cart
    
    
    
    
    
    
    
    
    
    
    
    
    
