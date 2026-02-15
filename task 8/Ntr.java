class Ntr
{
	static void devara(String songsName, String actors,int collections)
	{
		System.out.println("name of song: "+songsName+", actors: "+actors+", collection/day: "+collections);
		
		
		if(songsName==null)
		{
			System.out.println("enter a valid song name it should not be a null");
			return;
		}
		
		if(actors==null)
		{
			System.out.println("enter a valid actors name it should not be a null");
			return;
		}
		
		if(collections<100)
		{
			System.out.println("enter a valid collections it should be 120>");
			return;
		}
		
			System.out.println("details are good");
	}
	
	static void rrr(String heroines,String heros,int noOfSongs)
	{
		System.out.println("\nname of heroines: "+heroines+", heros: "+heros+", no of songs: "+noOfSongs);
		
		if(heroines==null)
		{
			System.out.println("enter a valid heroines name it should not be a null");
			return;
		}
		
		if(heros=="NTR")
			System.out.println("excellent bro");
		else if(heros=="ram charan")
			System.out.println("nice bro");
		else
			System.out.println("better luck next time");
		
		
		if(heros==null)
		{
			System.out.println("enter a valid heros name it should not be a null");
			return;
		}
		
		if(noOfSongs>06)
		{
			System.out.println("enter a valid song count it should be <6");
			return;
		}
	}
}
