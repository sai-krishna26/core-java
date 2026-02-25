class Snow
{
	String area;
	boolean isSnowing;
	double humidity;
	double temparature;
	double probability;
	
	Snow()
	{
		System.out.println("i am a msg of non parameterized Snow constructor");
	}
	Snow(String area)
	{
		this.area=area;
		System.out.println(area);
	}
	Snow(String area, boolean isSnowing)
	{
		this.area=area;
		this.isSnowing=isSnowing;
		System.out.println(area+", "+isSnowing);
	}
	Snow(String area, boolean isSnowing, double humidity)
	{
		this.area=area;
		this.isSnowing=isSnowing;
		this.humidity=humidity;
		System.out.println(area+", "+isSnowing+", "+humidity);
	}
	Snow(String area, boolean isSnowing, double humidity, double temparature)
	{
		this.area=area;
		this.isSnowing=isSnowing;
		this.humidity=humidity;
		this.temparature=temparature;
		System.out.println(area+", "+isSnowing+", "+humidity+", "+temparature);
	}
	Snow(String area, boolean isSnowing, double humidity, double temparature, double probability)
	{
		this.area=area;
		this.isSnowing=isSnowing;
		this.humidity=humidity;
		this.temparature=temparature;
		this.probability=probability;
		System.out.println(area+", "+isSnowing+", "+humidity+", "+temparature+", "+probability);
	}
	
}