class PrimarySchoolRunner
{

	public static void main(String value[])
	{
		PrimarySchool primaryschool=new PrimarySchool();
		PrimarySchool primaryschool1=new PrimarySchool();
		PrimarySchool primaryschool2=new PrimarySchool();
		PrimarySchool primaryschool3=new PrimarySchool();
		PrimarySchool primaryschool4=new PrimarySchool();
		
		System.out.println("\ndefault value of String name: "+primaryschool.name);
		System.out.println("default value of int noOfStudents: "+primaryschool1.noOfStudents);
		System.out.println("default value of boolean isOpen: "+primaryschool2.isOpen);
		System.out.println("default value of float fee: "+primaryschool4.fee);
		
		primaryschool.name="Govt high school,gurumatkal";
		primaryschool.noOfStudents=200;
		primaryschool.isOpen=true;
		primaryschool.fee=250;
		
		System.out.println("\nupdated value of String name: "+primaryschool4.name);
		System.out.println("updated value of int noOfStudents: "+primaryschool2.noOfStudents);
		System.out.println("updated value of boolean isOpen: "+primaryschool3.isOpen);
		System.out.println("updated value of float fee: "+primaryschool.fee);
		System.out.println("---------------------------------------------------------");
		
		
		
		HighSchool highschool=new HighSchool();
		HighSchool highschool1=new HighSchool();
		HighSchool highschool2=new HighSchool();
		HighSchool highschool3=new HighSchool();
		HighSchool highschool4=new HighSchool();

		System.out.println("\ndefault value of String name: "+highschool.name);
		System.out.println("default value of int noOfStudents: "+highschool1.noOfStudents);
		System.out.println("default value of int totalSubjects: "+highschool2.totalSubjects);
		System.out.println("default value of boolean isCoachingAvailable: "+highschool3.isCoachingAvailable);

		highschool.name="Govt High School";
		highschool.noOfStudents=500;
		highschool.totalSubjects=8;
		highschool.isCoachingAvailable=true;

		System.out.println("\nupdated value of String name: "+highschool.name);
		System.out.println("updated value of int noOfStudents: "+highschool.noOfStudents);
		System.out.println("updated value of int totalSubjects: "+highschool.totalSubjects);
		System.out.println("updated value of boolean isCoachingAvailable: "+highschool.isCoachingAvailable);
		System.out.println("---------------------------------------------------------");

		
		
		
		Inter inter=new Inter();
		Inter inter1=new Inter();
		Inter inter2=new Inter();
		Inter inter3=new Inter();
		Inter inter4=new Inter();

		System.out.println("\ndefault value of String name: "+inter.name);
		System.out.println("default value of int noOfcourses: "+inter1.noOfcourses);
		System.out.println("default value of boolean isKcetCoachingAvailable: "+inter2.isKcetCoachingAvailable);
		System.out.println("default value of boolean accomodation: "+inter3.accomodation);

		inter.name="Sri Chaitanya";
		inter.noOfcourses=5;
		inter.isKcetCoachingAvailable=true;
		inter.accomodation=false;

		System.out.println("\nupdated value of String name: "+inter.name);
		System.out.println("updated value of int noOfcourses: "+inter.noOfcourses);
		System.out.println("updated value of boolean isKcetCoachingAvailable: "+inter.isKcetCoachingAvailable);
		System.out.println("updated value of boolean accomodation: "+inter.accomodation);
		System.out.println("---------------------------------------------------------");

		
		
		Engineering engineering=new Engineering();
		Engineering engineering1=new Engineering();
		Engineering engineering2=new Engineering();
		Engineering engineering3=new Engineering();
		Engineering engineering4=new Engineering();

		System.out.println("\ndefault value of String name: "+engineering.name);
		System.out.println("default value of int noOfBranches: "+engineering1.noOfBranches);
		System.out.println("default value of boolean placements: "+engineering2.placements);
		System.out.println("default value of float highestPackage: "+engineering3.highestPackage);

		engineering.name="ABC Engineering College";
		engineering.noOfBranches=12;
		engineering.placements=true;
		engineering.highestPackage=25.5f;

		System.out.println("\nupdated value of String name: "+engineering.name);
		System.out.println("updated value of int noOfBranches: "+engineering.noOfBranches);
		System.out.println("updated value of boolean placements: "+engineering.placements);
		System.out.println("updated value of float highestPackage: "+engineering.highestPackage);
		System.out.println("---------------------------------------------------------");

		
		wood wood=new wood();
		wood wood1=new wood();
		wood wood2=new wood();
		wood wood3=new wood();
		wood wood4=new wood();

		System.out.println("\ndefault value of String type: "+wood.type);
		System.out.println("default value of int cost: "+wood1.cost);
		System.out.println("default value of boolean usefull: "+wood2.usefull);
		System.out.println("default value of String purpose: "+wood3.purpose);

		wood.type="Teak";
		wood.cost=5000;
		wood.usefull=true;
		wood.purpose="Furniture";

		System.out.println("\nupdated value of String type: "+wood.type);
		System.out.println("updated value of int cost: "+wood.cost);
		System.out.println("updated value of boolean usefull: "+wood.usefull);
		System.out.println("updated value of String purpose: "+wood.purpose);
		System.out.println("---------------------------------------------------------");

	}

}