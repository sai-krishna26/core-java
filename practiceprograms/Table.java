class Table
/*{
	static void TableMain(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}*/
/*{
	static void TableMain(int num)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}
	}
}*/

{
	static void TableMain(int num)
	{
		int i=1;
		do
		{
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}
		while(i<=10);
	}
}