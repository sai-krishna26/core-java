class BirdRunner
{
	public static void main(String[] vals)
	{
		/*String type=Bird.getColorByName(null);
		if(type != null) 
		{
			System.out.println("colour of bird: " + type);
		}*/
		
		/*String type1=Bird.getColorByName("peacock");
		System.out.println("colour of bird: "+type1);
		
		String type2=Bird.getColorByName("parroat");
		System.out.println("colour of bird: "+type2);*/
		
		String birds[]={null,"peacock", "parroat", "crow", "sparrow", "pigeo",
						"flamingo", "canary", "eagle", "owl", "kingfisher",
						"woodpecker", "duck", "swan", "turkey", "penguin",
						"robin", "hummingbird", "falcon", "heron", "macaw",
						"cockatoo", "nightingale", "crane","kakhi"};
		//for(datatype variable : array)				
		for(String bird:birds)
		{
			String colour=Bird.getColorByName(bird);
			System.out.println("colour of "+bird+" :"+colour);
			
			
			//int lifeSpan=Bird.getLifespanByName(bird);
			//System.out.println("life span of "+bird+" :"+lifeSpan);
		}
		for(int index=0;index<birds.length;index++)
		{
			String bird = birds[index];
			int lifeSpan=Bird.getLifespanByName(bird);
			System.out.println("life span of "+bird+" :"+lifeSpan+" years");
		}
	}
}