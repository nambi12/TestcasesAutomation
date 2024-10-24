package pompack;

import org.openqa.selenium.By;

public class Pomclass {


	public By homepage = By.xpath("//a[@style='color: orange;']") ;
	public By loginbtn = By.xpath("//a[@href='/login']");
	public By signupvisible = By.xpath("//h2[text()='New User Signup!']");
	public By nameinput = By.xpath("//input[@type='text']");
	public By emailinput = By.xpath("(//input[@type='email'])[2]");
	public By submitbtn = By.xpath("(//button[@type='submit'])[2]");
	public By acinfovisible = By.xpath("//b[text()='Enter Account Information']"); 

	//To Enter Account Information
	public By radiotitle = By.xpath("//input[@id='id_gender1']");
	public By passwordinput = By.xpath("//input[@id='password']");
	public By dayinput = By.xpath("//div[@id='uniform-days']");
	public By monthinput = By.xpath("//div[@id='uniform-months']");
	public By yearinput = By.xpath("//div[@id='uniform-years']");
	public By newsletter = By.xpath("//input[@id='newsletter']");
	public By offers = By.xpath("//input[@id='optin']");

	//Address Information
	public By firstname = By.xpath("//input[@id='first_name']");
	public By lastname = By.xpath("//input[@id='last_name']");
	public By company = By.xpath("//input[@id='company']");
	public By address = By.xpath("//input[@id='address1']");
	public By country = By.xpath("//select[@id='country']");
	public By state = By.xpath("//input[@id='state']");
	public By city = By.xpath("//input[@id='city']");
	public By zipcode = By.xpath("//input[@id='zipcode']");
	public By mobilenum = By.xpath("//input[@id='mobile_number']");
	public By creataccbtn = By.xpath("(//button[@type='submit'])[1]");

	//Verify account is creadted 
	public By verifyacc = By.xpath("//b[text()='Account Created!']");
	public By continueacc = By.xpath("//a[text()='Continue']");
	public By loginas = By.xpath("//a[text()=' Logged in as ']");

	

	//testcase2
	//login in account
	public By loginverify = By.xpath("//h2[text()='Login to your account']");
	public By email = By.xpath("//input[@data-qa='login-email']");
	public By Password = By.xpath("//input[@data-qa='login-password']");
	public By login = By.xpath("//button[text()='Login']");
	public By loginuser = By.xpath("//a[text()=' Logged in as ']");

	//Delet Account
    public By delete = By.xpath("//a[@href='/delete_account']");
    public By verifydlt = By.xpath("//b[text()='Account Deleted!']");
    
   // testcase3
    public By incorrecttxt = By.xpath("//p[text()='Your email or password is incorrect!']");
    
    //testcase 4
    public By logoutbtn = By.xpath("//a[@href='/logout']");
    public By  loginerror = By.xpath("//div[@id='summary']");
    
    //testcase 5
    public By emailexisterror = By.xpath("//p[text()='Email Address already exist!']");
    
    //testcase 6
    public By contactbtn = By.xpath("//a[@href='/contact_us']");
    public By getintxt = By.xpath("(//h2[@class='title text-center'])[2]");
    public By inputname = By.xpath("//input[@name='name']");
    public By inputemail = By.xpath("//input[@name='email']");
    public By inputsub = By.xpath("//input[@name='subject']");
    public By inputmsg = By.xpath("//textarea[@id='message']");
    public By choosefilebtn = By.xpath("//input[@name='upload_file']");
    public By btnsubmit = By.xpath("//input[@name='submit']");
    public By successtxt = By.xpath("//div[@class='status alert alert-success']");
    public By homebtn = By.xpath("//a[@class='btn btn-success']");
    public By Homepage = By.xpath("//i[@class='fa fa-home']");
    
    //test case 7 
    public By testcasebtn = By.xpath("(//a[@href='/test_cases'])[1]");
    public By casetxt = By.xpath("//b[text()='Test Cases']");
    
    //test case 8 
    public By productbtn = By.xpath("//a[@href='/products']");
    public By productpaage = By.xpath("//img[@id='sale_image']");
    public By productlist = By.xpath("//div[@class='features_items']");
    public By category = By.xpath("//h2[text()='Category']");
    public By viewproduct = By.xpath("//a[@href='/product_details/1']");
    public By productdetailpage = By.xpath("//button[@type='button']");
    public By prodname = By.xpath("//h2[text()='Blue Top']");
    public By prodcatgy = By.xpath("//p[text()='Category: Women > Tops']");
    public By prodprice = By.xpath("//span[text()='Rs. 500']");
    public By prodavailable = By.xpath("//p[text()=' In Stock']");
    public By prodcondition = By.xpath("//b[text()='Condition:']");
    public By prodbrand = By.xpath("//b[text()='Brand:']");
    
    //test case 9 
    public By searchinput = By.xpath("//input[@id='search_product']");
    public By searchbtn = By.xpath("//i[@class='fa fa-search']");
    public By searchconform = By.xpath("//p[text()='Blue Top']");
    public By prodreltag = By.xpath("//h2[text()='Brands']");
    
    //test case 10
    public By subfooter = By.xpath("//h2[text()='Subscription']");
    public By giveemail = By.xpath("//input[@id='susbscribe_email']");
    public By clickbtn = By.xpath("//button[@id='subscribe']");
    
    // test case 11
    public By cartbtn = By.xpath("//a[@href='/view_cart']");
    
    //test case 12
    public By products1 = By.xpath("//h2[text()='All Products']");
    public By addtocart = By.xpath("(//a[text()='Add to cart'])[1]");
    public By continueshop = By.xpath("//button[text()='Continue Shopping']");
    
    public By mentshirt = By.xpath("//a[@href='/product_details/2']");
    public By addtocart1 = By.xpath("(//a[text()='Add to cart'])[3]");
    public By product1 = By.xpath("(//a[@class='btn btn-default add-to-cart'])[2]");
    public By product2 = By.xpath("(//a[@class='btn btn-default add-to-cart'])[4]");
    public By price = By.xpath("//td[@class='price']");
    public By quantity = By.xpath("//td[@class='quantity']");
    public By total = By.xpath("//td[@class='total']");
   
    //test case 13
    public By quantinc = By.xpath("//input[@id='quantity']");
    public By addcart = By.xpath("//button[@type='button']") ;
    public By quantybox = By.xpath("(//button[@class='disabled'])[1]");
    
    //test case 14 
    public By proceed = By.xpath("//a[text()='Proceed To Checkout']");
    public By register =By.xpath("//u[text()='Register / Login']");
    public By deliveryadd = By.xpath("//ul[@id='address_delivery']");
    public By revieworder = By.xpath("//h2[text()='Review Your Order']");
    public By description = By.xpath("//textarea[@class='form-control']");
    public By placeord = By.xpath("//a[@href='/payment']");
    public By nameoncard = By.xpath("//input[@name='name_on_card']");
    public By cardnum  = By.xpath("//input[@name='card_number']");
    public By cv = By.xpath("//input[@name='cvc']");
    public By month1 = By.xpath("//input[@name='expiry_month']");
    public By year1 = By.xpath("//input[@name='expiry_year']");
    public By paynconfirm = By.xpath("//button[@id='submit']");
    public By successorder = By.xpath("//b[text()='Order Placed!']");
    
    //test case 17
    public By xbtn = By.xpath("//a[@class='cart_quantity_delete']");
    public By emptycart = By.xpath("(//p[@class='text-center'])[1]");
    
//    test case 18
    public By homeclick = By.xpath("//a[text()=' Home']");
    public By category1 = By.xpath("//h2[text()='Category']");
    public By womencat = By.xpath("(//h4[@class='panel-title']//i[@class='fa fa-plus'])[1]");
    public By womdress = By.xpath("//a[@href='/category_products/1']");
    public By dressvrfy = By.xpath("//h2[@class='title text-center']");
    public By mencat = By.xpath("(//h4[@class='panel-title']//i[@class='fa fa-plus'])[2]");
    public By mentsht = By.xpath("//a[text()='Tshirts ']");
    		

// test case 19
    public By brandlist = By.xpath("//h2[text()='Brands']");
    public By brandname = By.xpath("//a[@href='/brand_products/Polo']");
    public By brandview = By.xpath("//h2[@class='title text-center']");
    public By nextbrand = By.xpath("//a[@href='/brand_products/H&M']");
    public By verifynextbrnpage = By.xpath("//h2[@class='title text-center']");
    
    //test case 20
    public By searchprod = By.xpath("//input[@id='search_product']");
    public By clicksrc = By.xpath("//button[@id='submit_search']");
    public By resultprod = By.xpath("//div[@class='single-products']");
    public By menprod = By.xpath("(//p[text()='Men Tshirt'])[2]");
    public By prodadd = By.xpath("//a[@data-product-id='2']");
    public By ctshop = By.xpath("//button[text()='Continue Shopping']");
    public By prodoncart = By.xpath("//a[text()='Men Tshirt']");
    		
    	
//test case 21
    public By clvcrt = By.xpath("//a[@href='/product_details/1']");
    public By imgHover1 = By.xpath("//img[@alt='ecommerce website products']");
    public By writereview = By.xpath("//ul[@class='nav nav-tabs']//a[@href='#reviews']");
    public By namewrite = By.xpath("//input[@id='name']");
    public By emailwrite = By.xpath("//input[@id='email']");
    public By txtreview = By.xpath("//textarea[@id='review']");
    public By reviewsubmit = By.xpath("//button[@id='button-review']");


//test case 22
    




















}
