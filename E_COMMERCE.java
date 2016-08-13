package Practice;

public class E_COMMERCE {
	static CommonAPI objCommonAPI = new CommonAPI();
	static String strUrl = "http://www.mycontactform.com/";
	public static String SAMPLEFORMS_LINK = "Sample Forms";
	public static String ECOMMERCE_LINK = "E-Commerce Evaluation";
	public static String EMAIL_ADDRESS = ".//*[@id='email']";
	public static String EASY_TOLOCATE = ".//input[@name='q[1]' and @value='Yes']";
	public static String INTERNET_VISIBILITY = ".//*[@name='q[2]']";
	public static String ONLINE_CATLOG = ".//input[@name='q[3]' and @value='No']";
	public static String CONFUSION_OCCURED = ".//*[@name='q[4]']";
	public static String EASY_TOUNDERSTAND = ".//*[@name='q[5]' and @value='Yes']";
	public static String EASIER_TOUNDERSTAND = ".//*[@name='q[6]']";
	public static String EASIER_TOUSE = ".//*[@name='q[7]' and @value='It was a bit confusing']";
	public static String CHECK_OUT = ".//*[@name='q[8]']";
	public static String RATES = ".//*[@name='q[9]']";
	public static String OUR_BUSINESS = ".//*[@value='TV Advertisement']";
	public static String OURWEB_SITE = ".//*[@value='Daily']";
	public static String SUGGESTIONS = ".//*[@name='q[12]']";
	public static String VERIFICATION_CODE = ".//*[@id='visver_code']";
	public static String SUBMIT = ".//*[@name='submit']";
	

	public static void main(String[] args)throws InterruptedException{
		objCommonAPI.openUrl(strUrl);
		ApplicationForms5();
	}
		
		public static void ApplicationForms5()throws InterruptedException{
		
			objCommonAPI.clickLink(SAMPLEFORMS_LINK);
			objCommonAPI.clickLink(ECOMMERCE_LINK);
			objCommonAPI.setText(EMAIL_ADDRESS, "naga.wills@gmail.com");
			objCommonAPI.selectRadioButton(EASY_TOLOCATE);
			objCommonAPI.setText(INTERNET_VISIBILITY, "HELLO");
			objCommonAPI.selectRadioButton(ONLINE_CATLOG);
			objCommonAPI.setText(CONFUSION_OCCURED, "too much delay");
			objCommonAPI.selectRadioButton(EASY_TOUNDERSTAND);
			objCommonAPI.setText(EASIER_TOUNDERSTAND, "hai");
			objCommonAPI.selectRadioButton(EASIER_TOUSE);
			objCommonAPI.setText(CHECK_OUT, "HELLO");
			objCommonAPI.selectDropDown(RATES, "No");
			objCommonAPI.selectCheckBox(OUR_BUSINESS);
			objCommonAPI.selectRadioButton(OURWEB_SITE);
			objCommonAPI.setText(SUGGESTIONS, "WORKING GOOD");

			Thread.sleep(30000);
			objCommonAPI.submit(SUBMIT);
			
	}

}
