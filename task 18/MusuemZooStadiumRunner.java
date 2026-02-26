class MusuemZooStadiumRunner
{
	public static void main(String... values)
	{
		MusuemCreator.getMusuem();
		MusuemCreator.getMusuem("jurrasic");
		MusuemCreator.getMusuem("sahara","rajasthan");
		
		ZooCreator.getZoo();
		ZooCreator.getZoo(400);
		ZooCreator.getZoo(500.06);
		ZooCreator.getZoo(400,500.08);
		
		StadiumCreator.getStadium();
		StadiumCreator.getStadium(true);
		StadiumCreator.getStadium(75000.99f);
		StadiumCreator.getStadium(false,50000.90f);
	}
}