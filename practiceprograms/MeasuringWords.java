class MeasuringWords
{
	public static void main(String... values)
	{
		String[] words={"paradise","toxic","DRD","varanasi","war"};
		
		for(String wr:words)
		{
			if(wr.length()>=4)
			{
				System.out.println(wr);
			}
		}
	}
}