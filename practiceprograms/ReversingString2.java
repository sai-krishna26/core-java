class ReversingString2
{
	public static void main(String[] values)
	{
		String array="MAMAS";
		String rArray="";
		for(int index=array.length()-1;index>=0;index--)
		{
			rArray=rArray+array.charAt(index);
		}
		System.out.println(rArray);
	}
}