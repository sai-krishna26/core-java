class SwitchCaseExmp1
{
	static void selectScene(String name)
	{
		switch(name)
		{
			case "salaar":System.out.println("kateramma fight");
			break;
			case "bahubali1":System.out.println("why kattappa killed bahubali?");
			break;
			case "dangal":System.out.println("olympic fight");
			break;
			case "kgf2":System.out.println("kalash nikavo");
			break;
			case "dhurandhar":System.out.println("rehman dakait entry");
			break;
			default:System.out.println("all scences are good");
		}
	}
	
    static void showMonths(short month)
    {
        switch(month)
        {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            default: System.out.println("Invalid Month");
        }
    }

	
	
	public static void main(String[] args)
	{
		selectScene("salaar");
	}
	
}