class Computer
{
	void install(Browser browser)
	{
		System.out.println("-----------------------------------------");
		System.out.println("executing install in computer");
		if(browser!=null)
		{
			browser.open();
			if(browser instanceof ChromeBrowser)
			{
				System.out.println("-----------------------------------------");
				System.out.println(" browser has valid Reference of ChromeBrowser");
				ChromeBrowser chrome=(ChromeBrowser)browser;
				chrome.fastOpen();
			}
			if(browser instanceof MobileChromeBrowser)
			{
				System.out.println("-----------------------------------------");
				System.out.println("broswer has valid Refernce of MobileChromeBrowser ");
				MobileChromeBrowser mobileChrome=(MobileChromeBrowser)browser;
				mobileChrome.offline();
			}
		}
	}
	
	
}