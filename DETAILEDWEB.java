package Practice;

public class DETAILEDWEB {

	
	static CommonAPI objCommonAPI = new CommonAPI();
	  static String strUrl= "http://www.mycontactform.com/";
	  public static String SAMPLEFORMS_LINK="Sample Forms";
		 public static String DETAILEDWEBFORM_LINK ="Detailed Web Feedback";
		 public static String SUBJECT = ".//*[@id='subject']";
		 public static String NAME =".//*[@id='q1']";
		 public static String EMAIL_TXTFLD =".//*[@id='email']";
		 public static String HOWDIDFIND_US = ".//*[@value='Televistion Ad']";
		 public static String VISIT_US = ".//*[@value='Daily']";
		 public static String NAVIGATION_SYSTEM = ".//*[@id='q5']";
		 public static String SITE_DESIGN = ".//*[@id='q6']";
		 public static String OUR_SITE =".//*[@id='q7']";
		 public static String FAVORITE_PART = ".//*[@id='q8']";
		 public static String SUGGESTIONS = ".//*[@id='q9']";
		 public static String TELL_US = ".//*[@id='q4']";
		 public static String SUBMIT = ".//*[@name='submit']";
		 

	public static void main(String[] args)throws InterruptedException 
	{
		objCommonAPI.openUrl(strUrl);
		 ApplicationForm3();

	}
	public static void ApplicationForm3() throws InterruptedException
	 {
		 objCommonAPI.clickLink(SAMPLEFORMS_LINK);
		 objCommonAPI.clickLink(DETAILEDWEBFORM_LINK);
		 objCommonAPI.setText(SUBJECT, "SCIENCE");
		 objCommonAPI.setText(NAME, "KONDA");
		 objCommonAPI.setText(EMAIL_TXTFLD, "naga.wills@gmail.com");
		 objCommonAPI.selectRadioButton(HOWDIDFIND_US);
		objCommonAPI.selectRadioButton(VISIT_US);
		 objCommonAPI.selectDropDown(NAVIGATION_SYSTEM, "9");
		 objCommonAPI.selectDropDown(SITE_DESIGN, "8");
		 objCommonAPI.selectDropDown(OUR_SITE, "7");
		 objCommonAPI.setText(FAVORITE_PART, "HI");
		 objCommonAPI.setText(SUGGESTIONS, "HELLO");
		 objCommonAPI.setText(TELL_US, "how r u");
		 Thread.sleep(30000);
		  objCommonAPI.submit(SUBMIT);
		 
		 
	 }
	

}
