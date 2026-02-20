class University
{
	static String[] getCoursesByCollegeName(String collegeName)
	{
		
		System.out.println("\nexecuting the getCoursesByCollegeName in University"+"\ncollege name: "+collegeName);
		
		if(collegeName==null)
		{
			System.out.println("name cannot be null");
			return null; 
		}
		
		String privateCourses[]={"CSE","ISE","DS","AIML","ROBOTICS","ECE","EEE","CV","MECH"};
		String topPrivate[]={"CSE", "ECE", "MECH", "CIVIL", "EEE","AEROSPACE", "AI", "DATA SCIENCE", "ROBOTICS"};
		String governmentCourses[]={"CSE", "ECE", "MECH", "CIVIL", "EEE"};
		
	
		if(collegeName.equals("Adichunchanagiri Institute of Technology"))return privateCourses;
		if(collegeName.equals("Acharya College of Engineering"))return privateCourses;
		if(collegeName.equals("National Institute of Technology Karnataka, Surathkal"))return topPrivate;
		if(collegeName.equals("Adichunchanagiri Institute of Technology")) return privateCourses;
		if(collegeName.equals("Acharya College of Engineering")) return privateCourses;
		if(collegeName.equals("R.V. College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("M.S. Ramaiah Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("BMS College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("PES University, Bangalore")) return privateCourses;
		if(collegeName.equals("Siddaganga Institute of Technology, Tumkur")) return privateCourses;
		if(collegeName.equals("Christ University – Faculty of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("Jain University – School of Engineering & Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Canara Engineering College, Benjanapadavu")) return privateCourses;
		if(collegeName.equals("SJCE – Sri Jayachamarajendra College of Engineering, Mysore")) return privateCourses;
		if(collegeName.equals("NIE – The National Institute of Engineering, Mysore")) return privateCourses;
		if(collegeName.equals("SDM College of Engineering and Technology, Dharwad")) return privateCourses;
		if(collegeName.equals("Dayananda Sagar College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("Bangalore Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Don Bosco Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("HKBK College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("East Point Group of Institutions, Bangalore")) return privateCourses;
		if(collegeName.equals("BNM Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Nitte Meenakshi Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("PES College of Engineering, Mandya")) return privateCourses;
		if(collegeName.equals("Bapuji Institute of Engineering & Technology, Davangere")) return privateCourses;
		if(collegeName.equals("KLE Institute of Technology, Hubli")) return privateCourses;
		if(collegeName.equals("SECAB Institute of Engineering & Technology, Bijapur")) return privateCourses;
		if(collegeName.equals("MVJ College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("CMR Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Acharya Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("RV Institute of Technology and Management, Bangalore")) return privateCourses;
		if(collegeName.equals("Maharaja Institute of Technology, Mysore")) return privateCourses;
		if(collegeName.equals("Oxford College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("Alliance University College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("JSS Academy of Technical Education, Bangalore")) return privateCourses;
		if(collegeName.equals("RNS Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Sai Vidya Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Basaveshwar Engineering College, Bagalkot")) return privateCourses;
		if(collegeName.equals("Sahyadri College of Engineering & Management, Mangalore")) return privateCourses;
		if(collegeName.equals("Malnad College of Engineering, Hassan")) return privateCourses;
		if(collegeName.equals("Global Academy of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Rajeev Institute of Technology, Hassan")) return privateCourses;
		if(collegeName.equals("BMS Institute of Technology and Management, Bangalore")) return privateCourses;
		if(collegeName.equals("Nagarjuna College of Engineering & Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("Rajarajeswari College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("KLS Gogte Institute of Technology, Belagavi")) return privateCourses;
		if(collegeName.equals("New Horizon College of Engineering, Bangalore")) return privateCourses;
		if(collegeName.equals("SJB Institute of Technology, Bangalore")) return privateCourses;
		if(collegeName.equals("St. Joseph Engineering College, Mangalore")) return privateCourses;
		if(collegeName.equals("Vidyavardhaka College of Engineering, Mysore")) return privateCourses;
		if(collegeName.equals("National Institute of Technology Karnataka, Surathkal")) return topPrivate;
		if(collegeName.equals("Indian Institute of Technology Dharwad")) return topPrivate;
		if(collegeName.equals("Indian Institute of Science, Bangalore")) return topPrivate;
		if(collegeName.equals("International Institute of Information Technology, Bangalore")) return topPrivate;
		if(collegeName.equals("IIIT Bangalore")) return topPrivate;
		if(collegeName.equals("Manipal Institute of Technology, Manipal")) return topPrivate;
		if(collegeName.equals("Government Engineering College, Haveri")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Kushalnagar")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Raichur")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Chamarajanagar")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Hassan")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Karwar")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Gangavathi")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Mandya")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Koppal")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Bidar")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Kalaburagi")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Bagalkot")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Davangere")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Tumkur")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Yadgir")) return governmentCourses;
		if(collegeName.equals("Government Engineering College, Chikkaballapur")) return governmentCourses;
		
		
		System.out.println("the college not found");		
		return null;
	}
}