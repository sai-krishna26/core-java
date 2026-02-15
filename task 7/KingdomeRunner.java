class KingdomRunner
{
	public static void main(String[] values)
	{
		
		boolean king=true;
		String name="Bahubali";
		String kingdomName="mahishmati";
		String queenName="devasena";
		String princessName="avantika";
		int populationOfKingdom>100000;'
		String territory="varanasi";
		int yearOfDeath=1801;
		int yearOfDeath=1999;
		int armySize=5000;
		int yearsRuled=50;
		
		
		int noOfSoldiers=50000;
		int noOfElephants=1000;
		int noOfHorses=1000;
		String type=Army;
		int noOfWeapons=25000;
		String commanderName="kattappa";
		boolean commanderMarried=true;
		String commanderWifeName="shivagaami";
		boolean commanderIsFather=false;
		String commanderChildName="bichhala deva";
		int commanderExperience=30;
		
		
		Kingdome.save(king, name, kingdomName, queenName, princessName, populationOfKingdom, territory, yearOfBirth, yearOfDeath, armySize, yearsRuled);
		
		Kingdome.saveArmy(noOfSoldiers, noOfElephants, noOfHorses, type, noOfWeapons, commanderName, commanderMarried, commanderWifeName, commanderIsFather, commanderChildName, commanderExperience);
	}
}