class OurCollege
{
	static void info(String collegeName,String location,int pincode)
	{
		System.out.println("\nexecuting String,String,int in info() of OurCollege{} ");
		System.out.println("college name: "+collegeName+", location: "+location+", pincode: "+pincode);
		
		if(collegeName==null)
		{
			System.out.println("name should not be a null");
			return;
		}
		
		if(location==null)
		{
			System.out.println("locatin should not be a null");
			return;
		}
		
		if(pincode!=577102)
		{
			System.out.println("pincode should be a 577102");
			return;
		}
		
		System.out.println("details are right");
	}
	
	static void info(int pincode,String location,String collegeName)
	{
		System.out.println("\nexecuting String,String,int in info() of OurCollege{} ");
		System.out.println("college name: "+collegeName+", location: "+location+", pincode: "+pincode);
		
		if(collegeName==null)
		{
			System.out.println("name should not be a null");
			return;
		}
		
		if(location==null)
		{
			System.out.println("location should not be a null");
			return;
		}
		
		if(pincode!=577102)
		{
			System.out.println("pincode should be a 577102");
			return;
		}
		
		
		System.out.println("details are right");
	}
}