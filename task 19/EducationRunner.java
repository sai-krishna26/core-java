class EducationRunner
{
	public static void main(String... value)
	{
		Education e1 = new Education("IIT Delhi","B.Tech","Computer Science","IIT Delhi","India","Regular","CGPA","English","AICTE","Urban",4,2018,2022,160,true,800000.0,"Merit","JEE Advanced","CSE",true);
		e1.show();
		System.out.println("------------------------------------------------");

		Education e2 = new Education("Harvard University","MBA","Business Administration","Harvard","USA","Regular","GPA","English","AACSB","Urban",2,2021,2023,64,true,6000000.0,"Need Based","GMAT","Business",true);
		e2.show();
		System.out.println("------------------------------------------------");

		Education e3 = new Education("Stanford University","M.Tech","Artificial Intelligence","Stanford","USA","Regular","GPA","English","ABET","Urban",2,2022,2024,48,true,5500000.0,"Merit","GRE","AI",false);
		e3.show();
		System.out.println("------------------------------------------------");

		Education e4 = new Education("Delhi University","B.Sc","Physics","DU","India","Regular","Percentage","English","UGC","Urban",3,2017,2020,120,true,150000.0,"None","Merit List","Science",true);
		e4.show();
		System.out.println("------------------------------------------------");

		Education e5 = new Education("Oxford University","PhD","Mathematics","Oxford","UK","Research","GPA","English","QAA","Urban",5,2016,2021,200,true,7000000.0,"Research Grant","Interview","Mathematics",true);
		e5.show();
		System.out.println("------------------------------------------------");

		Education e6 = new Education("Anna University","B.E","Mechanical Engineering","Anna University","India","Regular","CGPA","English","AICTE","Urban",4,2019,2023,170,true,200000.0,"State","TNEA","Mechanical",true);
		e6.show();
		System.out.println("------------------------------------------------");

		Education e7 = new Education("MIT","B.Tech","Electrical Engineering","MIT","USA","Regular","GPA","English","ABET","Urban",4,2015,2019,180,true,6500000.0,"Merit","SAT","Electrical",true);
		e7.show();
		System.out.println("------------------------------------------------");

		Education e8 = new Education("Christ University","BBA","Finance","Christ","India","Regular","CGPA","English","NAAC","Urban",3,2020,2023,130,true,300000.0,"Merit","Entrance Test","Commerce",true);
		e8.show();
		System.out.println("------------------------------------------------");

		Education e9 = new Education("JNU","M.A","Political Science","JNU","India","Regular","CGPA","English","UGC","Urban",2,2021,2023,80,true,50000.0,"None","Entrance Exam","Arts",true);
		e9.show();
		System.out.println("------------------------------------------------");

		Education e10 = new Education("Cambridge University","M.Sc","Data Science","Cambridge","UK","Regular","GPA","English","QAA","Urban",1,2023,2024,60,true,5000000.0,"Merit","IELTS","Data Science",false);
		e10.show();
		System.out.println("------------------------------------------------");
	}
}