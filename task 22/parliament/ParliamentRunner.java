class ParliamentRunner
{
	public static void main(String... values)
	{
		Parties parties=Parties.BJP;
		Parliament parliament=new Parliament(2,"Delhi",parties);
	  	parliament.printParlimentInfo();
		
		System.out.println("----------------------------------------------------------");
		Parties parties1=Parties.TDP;
		Parliament parliament1=new Parliament(2,"Delhi",parties1);
		parliament1.printParlimentInfo();
		
		System.out.println("----------------------------------------------------------");
		Parties parties2=Parties.INC;
		Parliament parliament2=new Parliament(2,"Delhi",parties2);
		parliament2.printParlimentInfo();
		
		System.out.println("----------------------------------------------------------");
		Parties parties3=Parties.JDS;
		Parliament parliament3=new Parliament(2,"Delhi",parties3);
		parliament3.printParlimentInfo();
	}
}