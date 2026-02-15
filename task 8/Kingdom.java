class Kingdom
{
	static void save(boolean king,String name,String kingdomName,String queenName,String princessName,int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled)
	{
		
		String kingQueen;
		if(king == true)
		{
			kingQueen="King is ruling";
		}
		else
		{
			kingQueen="Queen is ruling";
		}
		
		System.out.println("\n----------------------------------------------------------------------------------------------------\n");
		System.out.println("King or Queen: "+kingQueen
		+",\n name: "+name
		+",\n kingdom Name: "+kingdomName
		+",\n Queen name: "+queenName
		+",\n Princess Name: "+princessName
		+",\n population Of Kingdom: "+populationOfKingdom
		+",\n Territory: "+territory
		+",\n year of Birth: "+yearOfBirth
		+",\n year of death: "+yearOfDeath
		+",\n army size: "+armySize
		+",\n years ruled: "+yearsRuled);
	
		
		if(populationOfKingdom < 100000)
		{
			System.out.println("enter a proper population range(>100000)");
			return;
		}
		
		
		if(yearOfBirth>1800)
		{
			System.out.println("enter the valid year of birth (<1800)");
			return;
		}
		
		
		if(yearOfDeath>1980)
		{
			System.out.println("enter the valid year of death(<1980)");
			return;
		}
		
		if(armySize<100)
		{
			System.out.println("army size is invalid(>100)");
			return;
		}
		
		if(yearsRuled<60)
		{
			System.out.println("enter a valid years ruled(>60)");
			return;
		}
	}
	
	static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,String type,int noOfWeapons,String commanderName,boolean commanderMarried,String commanderWifeName,boolean commanderIsFather,String commanderChildName,int commanderExperience)
	{
		
		String commanderMarriedStatus;
		if(commanderMarried == true)
		{
			commanderMarriedStatus="Married";
			//System.out.println("commander wife name: "+commanderWifeName);
		}
		else
		{
			commanderMarriedStatus="not Married";
		}
		
		
		String commanderIsFatherStatus;
		if(commanderIsFather == true)
		{
			commanderIsFatherStatus="YES i am father";
		}
		else
		{
			commanderIsFatherStatus="N0 i am not a father";
		}
		
		
		
		String commFam;
		if(commanderIsFather== true)
		{
			System.out.println(commanderChildName);
		}
		else
		{
			System.out.println("childrens: NA");
		}
			
		
		
		
		System.out.println("\n-------------------------------------------------------------------------\n");
		System.out.println("no Of Soldiers: "+noOfSoldiers+
		",\n no of elephants: "+noOfElephants+
		",\n no of horses: "+noOfHorses+
		",\n type: "+type+
		",\n no of weapons: "+noOfWeapons+
		",\n commmander name: "+commanderName+
		",\n commander Married?: "+commanderMarriedStatus+
		",\n commander WifeName: "+commanderWifeName+
		",\n commander Is Father?: "+commanderIsFatherStatus+
		",\n commander ChildName: "+commanderChildName+
		",\n commander Experience: "+commanderExperience);
		
		if(noOfSoldiers<5000)
		{
			System.out.println("enter the valid soldiers count(>5000)");
			return;
		}
		
		if(noOfElephants<20)
		{
			System.out.println("enter the valid count(>20)");
			return;
		}
		
		if(noOfHorses<50)
		{
			System.out.println("enter the valid count(>50)");
			return;
		}
		
		/**if(noOfElephants<50)
		{
			System.out.println("enter the valid count");
			return;
		}*/
		
		if(noOfWeapons<50)
		{
			System.out.println("enter the valid count(>50)");
			return;
		}
		
		
		if(commanderExperience<10)
		{
			System.out.println("not eligible  to be a commander(>10)");
			return;
		}
		
	} 
}