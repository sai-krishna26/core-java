class CollegeRunner
{
	public static void main(String[] val)
	{
		float pass=College.getPassPercentageOfBrach("cse");
		System.out.println("passing percentage: "+pass);
		
		boolean placement=College.getPlacements("ise");
		System.out.println("placement in college: "+placement);
		
		float packagee=College.getHighestPackage("ece");
		System.out.println("highest package: "+packagee);
		
		int count=College.getFacultyCount("cv");
		System.out.println("no of faculties: "+count);
		
		int counts=College.getTotalStudents("mech");
		System.out.println("no of students: "+counts);
		
	}
}