class College
{
	static float getPassPercentageOfBrach(String  name)
	{
		System.out.println("\nexecuting the getPassPercentageOfBrach in college\n"+"name: "+name);
		
		if(name==null)
		{
			System.out.println("null not be expected");
			return -1f;
		}
		
		if(name.equals("cse"))
		{
			return 95.6f;
		}
		
		if(name.equals("ece"))
		{
			return 93.6f;
		}
		
		if(name.equals("ise"))
		{
			return 91.6f;
		}
		
		if(name.equals("cv"))
		{
			return 80.6f;
		}
		
		if(name.equals("mech"))
		{
			return 88.6f;
		}
		System.out.println("select cse,ece,ise,cv,mech");
		return 0f;
	}
	
	
	static boolean getPlacements(String name)
	{
		System.out.println("\nexecuting the getPlacements in college\n"+"name: "+name);
		
		
		if(name==null)
		{
			System.out.println("null not be expected\n"+"name: "+name);
			return false;
		}
		
		if(name.equals("cse"))
		{
			return true;
		}
		
		if(name.equals("ece"))
		{
			return true;
		}
		
		if(name.equals("ise"))
		{
			return true;
		}
		
		if(name.equals("cv"))
		{
			return false;
		}
		
		if(name.equals("mech"))
		{
			return false;
		}
		System.out.println("select cse,ece,ise,cv,mech");
		return false;		
	}
	
	static float getHighestPackage(String name)
    {
        System.out.println("\nexecuting getHighestPackage\nname: "+name);

        if(name==null)
        {
            System.out.println("null not expected");
            return -1f;
        }

        if(name.equals("cse")) return 28.5f;
        if(name.equals("ece")) return 22.3f;
        if(name.equals("ise")) return 25.0f;
        if(name.equals("cv")) return 8.5f;
        if(name.equals("mech")) return 10.2f;

        System.out.println("select valid branch");
        return 0f;
    }
	
	static int getFacultyCount(String name)
    {
        System.out.println("\nexecuting getFacultyCount\nname: "+name);

        if(name==null)
        {
            System.out.println("null not expected");
            return -1;
        }

        if(name.equals("cse")) return 35;
        if(name.equals("ece")) return 30;
        if(name.equals("ise")) return 28;
        if(name.equals("cv")) return 20;
        if(name.equals("mech")) return 25;

        System.out.println("select valid branch");
        return 0;
    }

    static int getTotalStudents(String name)
    {
        System.out.println("\nexecuting getTotalStudents\nname: "+name);

        if(name==null)
        {
            System.out.println("null not expected");
            return -1;
        }

        if(name.equals("cse")) return 240;
        if(name.equals("ece")) return 210;
        if(name.equals("ise")) return 180;
        if(name.equals("cv")) return 150;
        if(name.equals("mech")) return 170;

        System.out.println("select valid branch");
        return 0;
    }
}
	