class PVR
{
	String theatreName;
	String location;
	String screenType;
	String movieName;
	String showTime;
	String seatType;
	String foodCombo;
	String managerName;
	String city;
	String state;
	int totalScreens;
	int totalSeats;
	int availableSeats;
	int ticketPrice;
	boolean is3D;
	double collectionToday;
	String soundSystem;
	String bookingApp;
	String language;
	boolean isHouseFull;

	PVR(String theatreName,
	String location,
	String screenType,
	String movieName,
	String showTime,
	String seatType,
	String foodCombo,
	String managerName,
	String city,
	String state,
	int totalScreens,
	int totalSeats,
	int availableSeats,
	int ticketPrice,
	boolean is3D,
	double collectionToday,
	String soundSystem,
	String bookingApp,
	String language,
	boolean isHouseFull)
	{
		this.theatreName = theatreName;
		this.location = location;
		this.screenType = screenType;
		this.movieName = movieName;
		this.showTime = showTime;
		this.seatType = seatType;
		this.foodCombo = foodCombo;
		this.managerName = managerName;
		this.city = city;
		this.state = state;
		this.totalScreens = totalScreens;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
		this.is3D = is3D;
		this.collectionToday = collectionToday;
		this.soundSystem = soundSystem;
		this.bookingApp = bookingApp;
		this.language = language;
		this.isHouseFull = isHouseFull;
	}

	void show()
	{
		System.out.println("theatre name: " + this.theatreName);
		System.out.println("location: " + this.location);
		System.out.println("screen type: " + this.screenType);
		System.out.println("movie name: " + this.movieName);
		System.out.println("show time: " + this.showTime);
		System.out.println("seat type: " + this.seatType);
		System.out.println("food combo: " + this.foodCombo);
		System.out.println("manager name: " + this.managerName);
		System.out.println("city: " + this.city);
		System.out.println("state: " + this.state);
		System.out.println("total screens: " + this.totalScreens);
		System.out.println("total seats: " + this.totalSeats);
		System.out.println("available seats: " + this.availableSeats);
		System.out.println("ticket price: " + this.ticketPrice);
		System.out.println("is 3D: " + this.is3D);
		System.out.println("collection today: " + this.collectionToday);
		System.out.println("sound system: " + this.soundSystem);
		System.out.println("booking app: " + this.bookingApp);
		System.out.println("language: " + this.language);
		System.out.println("is house full: " + this.isHouseFull);
	}
}