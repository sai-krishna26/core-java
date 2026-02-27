class Google
{
	String companyName;
	String parentCompany;
	int foundingYear;
	String founder1;
	String founder2;
	String headquarters;
	String ceo;
	long marketCap;
	int numberOfEmployees;
	String mainSearchEngine;
	String videoPlatform;
	String mobileOS;
	String webBrowser;
	String cloudService;
	String emailService;
	String mapsService;
	String aiModel;
	boolean isPublicCompany;
	String stockSymbol;
	double revenueInBillions;
	
	Google(	String companyName,
			String parentCompany,
			int foundingYear,
			String founder1,
			String founder2,
			String headquarters,
			String ceo,
			long marketCap,
			int numberOfEmployees,
			String mainSearchEngine,
			String videoPlatform,
			String mobileOS,
			String webBrowser,
			String cloudService,
			String emailService,
			String mapsService,
			String aiModel,
			boolean isPublicCompany,
			String stockSymbol,
			double revenueInBillions)
	{
		this.companyName=companyName;
		this.parentCompany=parentCompany;
		this.foundingYear=foundingYear;
		this.founder1=founder1;
		this.founder2=founder2;
		this.headquarters=headquarters;
		this.ceo=ceo;
		this.marketCap=marketCap;
		this.numberOfEmployees=numberOfEmployees;
		this.mainSearchEngine=mainSearchEngine;
		this.videoPlatform=videoPlatform;
		this.mobileOS=mobileOS;
		this.webBrowser=webBrowser;
		this.cloudService=cloudService;
		this.emailService=emailService;
		this.mapsService=mapsService;
		this.aiModel=aiModel;
		this.isPublicCompany=isPublicCompany;
		this.stockSymbol=stockSymbol;
		this.revenueInBillions=revenueInBillions;
	}
		
	void present()
	{
		System.out.println("company name: " + companyName);
		System.out.println("parent company: " + this.parentCompany);
		System.out.println("founding year: " + this.foundingYear);
		System.out.println("founder1: " + this.founder1);
		System.out.println("founder2: " + this.founder2);
		System.out.println("headquarters: " + this.headquarters);
		System.out.println("ceo: " + this.ceo);
		System.out.println("market cap: " + this.marketCap);
		System.out.println("number of employees: " + this.numberOfEmployees);
		System.out.println("main search engine: " + this.mainSearchEngine);
		System.out.println("video platform: " + this.videoPlatform);
		System.out.println("mobile OS: " + this.mobileOS);
		System.out.println("web browser: " + this.webBrowser);
		System.out.println("cloud service: " + this.cloudService);
		System.out.println("email service: " + this.emailService);
		System.out.println("maps service: " + this.mapsService);
		System.out.println("AI model: " + this.aiModel);
		System.out.println("is public company: " + this.isPublicCompany);
		System.out.println("stock symbol: " + this.stockSymbol);
		System.out.println("revenue in billions: " + this.revenueInBillions);
	}
}