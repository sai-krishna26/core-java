class SwitchCaseExmp2
{
	static void getTypeOfMovies(int  condition )
	{
		switch(condition)
		{
			case 1:System.out.println("Horror");
			break;
			case 2:System.out.println("Romantic");
			break;
			case 3:System.out.println("Fantacy");
			break;
			case 4:System.out.println("Action");
			break;
			case 5:System.out.println("Mythology");
			break;
			default:System.out.println("all are good");
			
		}
	}
	
	static void kgfMovieticket(char collection)
	{
		switch(collection)
		{
			case 'A':System.out.println("Iron row");
			break;
			case 'B':System.out.println("silver row");
			break;
			case 'C':System.out.println("golden row");
			break;
			case 'D':System.out.println("platinum row");
			break;
			case 'E':System.out.println("majestic row");
			break;
			default:System.out.println("dont waste money");
		}
	}
}