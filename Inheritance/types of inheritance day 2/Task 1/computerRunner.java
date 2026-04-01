class computerRunner
{
	public static void main(String... values)
	{
		Computer computer=new Computer();
		//Browser browser=new Browser();
		//computer.install(browser);
		
		//ChromeBrowser browserr=new MobileChromeBrowser();
		//browserr.fastOpen();
		 
		MobileChromeBrowser mobileChormeBrowser=new MobileChromeBrowser();
		mobileChormeBrowser.offline();
		
		Browser browser2=new ChromeBrowser();
		computer.install(browser2);
		
		Browser browser3=new MobileChromeBrow();
		computer.install(browser3);
	}
}