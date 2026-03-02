class CollegeRunner
{
	public static void main(String[] val)
	{
		float pass=College.getPassPercentageOfBrach("cse");
		System.out.println("passing percentage: "+pass);
		
		boolean placement=College.getPlacements("cse");
		System.out.println("placement in college: "+placement);
		
		float packagee=College.getHighestPackage("cse");
		System.out.println("highest package: "+packagee);
		
		int count=College.getFacultyCount("cse");
		System.out.println("no of faculties: "+count);
		
		int counts=College.getTotalStudents("cse");
		System.out.println("no of students: "+counts);
		
	}
}