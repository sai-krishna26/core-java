class SwitchCaseExmp2Runner
{
	public static void main(String[] opt)
	{
		SwitchCaseExmp2.getTypeOfMovies(1);
		SwitchCaseExmp2.getTypeOfMovies(5);
		SwitchCaseExmp2.getTypeOfMovies(3);
		
		
	}
	
	static void getcoll(char call)
	{
		SwitchCaseExmp2.kgfMovieticket(call);
	}
	
	
	
    static void showDays(byte day)
    {
        switch(day)
        {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            default: System.out.println("Invalid Day");
        }
    }
	
}