class JokerRunner
{
	public static void main(String... values)
	{
		String[] actions=new String[3];
		actions[0]="comedy";
		actions[1]="magical";
		actions[2]="nuetral";
		
		Smile[] smile=new Smile[3];
		smile[0]=new Smile("funny");
		smile[1]=new Smile("angry");
		smile[2]=new Smile("attitude");
		
		Joker joker=new Joker(actions,smile);
		joker.displayJoker();
	}
}