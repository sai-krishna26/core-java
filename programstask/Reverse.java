class Reverse
{
	public static void main(String[] val)
	{
		String value="RAVAN";
		String Rstring="";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			Rstring+=value.charAt(i);
		}
		System.out.println("original string: "+value);
		System.out.println("reversed string: "+Rstring);
	}
}