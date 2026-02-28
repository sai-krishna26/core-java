class Office
{
	String name;
	String location;
	String companyType;
	String ceoName;
	String managerName;
	String department;
	String buildingType;
	String country;
	String workingHours;
	String contactEmail;
	int employeeCount;
	int establishedYear;
	int numberOfFloors;
	int cabinCount;
	boolean isHeadOffice;
	double annualRevenue;
	String securityType;
	String internetProvider;
	String officeTiming;
	boolean isOpenOnWeekend;

	Office(String name,
	String location,
	String companyType,
	String ceoName,
	String managerName,
	String department,
	String buildingType,
	String country,
	String workingHours,
	String contactEmail,
	int employeeCount,
	int establishedYear,
	int numberOfFloors,
	int cabinCount,
	boolean isHeadOffice,
	double annualRevenue,
	String securityType,
	String internetProvider,
	String officeTiming,
	boolean isOpenOnWeekend)
	{
		this.name = name;
		this.location = location;
		this.companyType = companyType;
		this.ceoName = ceoName;
		this.managerName = managerName;
		this.department = department;
		this.buildingType = buildingType;
		this.country = country;
		this.workingHours = workingHours;
		this.contactEmail = contactEmail;
		this.employeeCount = employeeCount;
		this.establishedYear = establishedYear;
		this.numberOfFloors = numberOfFloors;
		this.cabinCount = cabinCount;
		this.isHeadOffice = isHeadOffice;
		this.annualRevenue = annualRevenue;
		this.securityType = securityType;
		this.internetProvider = internetProvider;
		this.officeTiming = officeTiming;
		this.isOpenOnWeekend = isOpenOnWeekend;
	}

	void show()
	{
		System.out.println("name: " + this.name);
		System.out.println("location: " + this.location);
		System.out.println("company type: " + this.companyType);
		System.out.println("ceo name: " + this.ceoName);
		System.out.println("manager name: " + this.managerName);
		System.out.println("department: " + this.department);
		System.out.println("building type: " + this.buildingType);
		System.out.println("country: " + this.country);
		System.out.println("working hours: " + this.workingHours);
		System.out.println("contact email: " + this.contactEmail);
		System.out.println("employee count: " + this.employeeCount);
		System.out.println("established year: " + this.establishedYear);
		System.out.println("number of floors: " + this.numberOfFloors);
		System.out.println("cabin count: " + this.cabinCount);
		System.out.println("is head office: " + this.isHeadOffice);
		System.out.println("annual revenue: " + this.annualRevenue);
		System.out.println("security type: " + this.securityType);
		System.out.println("internet provider: " + this.internetProvider);
		System.out.println("office timing: " + this.officeTiming);
		System.out.println("is open on weekend: " + this.isOpenOnWeekend);
	}
}