class Education
{
	String institutionName;
	String degree;
	String fieldOfStudy;
	String universityName;
	String country;
	String modeOfStudy;
	String gradingSystem;
	String mediumOfInstruction;
	String accreditation;
	String campusType;
	int durationYears;
	int startYear;
	int endYear;
	int totalCredits;
	boolean isFullTime;
	double tuitionFees;
	String scholarshipType;
	String entranceExam;
	String departmentName;
	boolean isCompleted;

	Education(String institutionName,
	String degree,
	String fieldOfStudy,
	String universityName,
	String country,
	String modeOfStudy,
	String gradingSystem,
	String mediumOfInstruction,
	String accreditation,
	String campusType,
	int durationYears,
	int startYear,
	int endYear,
	int totalCredits,
	boolean isFullTime,
	double tuitionFees,
	String scholarshipType,
	String entranceExam,
	String departmentName,
	boolean isCompleted)
	{
		this.institutionName = institutionName;
		this.degree = degree;
		this.fieldOfStudy = fieldOfStudy;
		this.universityName = universityName;
		this.country = country;
		this.modeOfStudy = modeOfStudy;
		this.gradingSystem = gradingSystem;
		this.mediumOfInstruction = mediumOfInstruction;
		this.accreditation = accreditation;
		this.campusType = campusType;
		this.durationYears = durationYears;
		this.startYear = startYear;
		this.endYear = endYear;
		this.totalCredits = totalCredits;
		this.isFullTime = isFullTime;
		this.tuitionFees = tuitionFees;
		this.scholarshipType = scholarshipType;
		this.entranceExam = entranceExam;
		this.departmentName = departmentName;
		this.isCompleted = isCompleted;
	}

	void show()
	{
		System.out.println("institution name: " + this.institutionName);
		System.out.println("degree: " + this.degree);
		System.out.println("field of study: " + this.fieldOfStudy);
		System.out.println("university name: " + this.universityName);
		System.out.println("country: " + this.country);
		System.out.println("mode of study: " + this.modeOfStudy);
		System.out.println("grading system: " + this.gradingSystem);
		System.out.println("medium of instruction: " + this.mediumOfInstruction);
		System.out.println("accreditation: " + this.accreditation);
		System.out.println("campus type: " + this.campusType);
		System.out.println("duration (years): " + this.durationYears);
		System.out.println("start year: " + this.startYear);
		System.out.println("end year: " + this.endYear);
		System.out.println("total credits: " + this.totalCredits);
		System.out.println("is full time: " + this.isFullTime);
		System.out.println("tuition fees: " + this.tuitionFees);
		System.out.println("scholarship type: " + this.scholarshipType);
		System.out.println("entrance exam: " + this.entranceExam);
		System.out.println("department name: " + this.departmentName);
		System.out.println("is completed: " + this.isCompleted);
	}
}