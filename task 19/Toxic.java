class Toxic
{
	String title;
	String hero;
	String heroine;
	String director;
	String producer;
	String musicDirector;
	String language;
	String genre;
	String releaseDate;
	String productionCompany;
	int budget;
	int duration;
	int screens;
	int censorRating;
	boolean isPanIndia;
	double boxOfficeCollection;
	String villain;
	String cinematographer;
	String editor;
	boolean isHit;

	Toxic(String title,
	String hero,
	String heroine,
	String director,
	String producer,
	String musicDirector,
	String language,
	String genre,
	String releaseDate,
	String productionCompany,
	int budget,
	int duration,
	int screens,
	int censorRating,
	boolean isPanIndia,
	double boxOfficeCollection,
	String villain,
	String cinematographer,
	String editor,
	boolean isHit)
	{
		this.title = title;
		this.hero = hero;
		this.heroine = heroine;
		this.director = director;
		this.producer = producer;
		this.musicDirector = musicDirector;
		this.language = language;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.productionCompany = productionCompany;
		this.budget = budget;
		this.duration = duration;
		this.screens = screens;
		this.censorRating = censorRating;
		this.isPanIndia = isPanIndia;
		this.boxOfficeCollection = boxOfficeCollection;
		this.villain = villain;
		this.cinematographer = cinematographer;
		this.editor = editor;
		this.isHit = isHit;
	}

	void show()
	{
		System.out.println("title: " + this.title);
		System.out.println("hero: " + this.hero);
		System.out.println("heroine: " + this.heroine);
		System.out.println("director: " + this.director);
		System.out.println("producer: " + this.producer);
		System.out.println("music director: " + this.musicDirector);
		System.out.println("language: " + this.language);
		System.out.println("genre: " + this.genre);
		System.out.println("release date: " + this.releaseDate);
		System.out.println("production company: " + this.productionCompany);
		System.out.println("budget: " + this.budget);
		System.out.println("duration: " + this.duration);
		System.out.println("screens: " + this.screens);
		System.out.println("censor rating: " + this.censorRating);
		System.out.println("is pan india: " + this.isPanIndia);
		System.out.println("box office collection: " + this.boxOfficeCollection);
		System.out.println("villain: " + this.villain);
		System.out.println("cinematographer: " + this.cinematographer);
		System.out.println("editor: " + this.editor);
		System.out.println("is hit: " + this.isHit);
	}
}