class Diabetes
{
	String patientName;
	String type;
	String gender;
	String bloodGroup;
	String doctorName;
	String hospitalName;
	String city;
	String country;
	String medication;
	String dietPlan;
	int age;
	int sugarLevel;
	int fastingSugar;
	int diagnosisYear;
	boolean isInsulinDependent;
	double weight;
	String symptoms;
	String treatmentType;
	String exerciseRoutine;
	boolean isUnderControl;

	Diabetes(String patientName,
	String type,
	String gender,
	String bloodGroup,
	String doctorName,
	String hospitalName,
	String city,
	String country,
	String medication,
	String dietPlan,
	int age,
	int sugarLevel,
	int fastingSugar,
	int diagnosisYear,
	boolean isInsulinDependent,
	double weight,
	String symptoms,
	String treatmentType,
	String exerciseRoutine,
	boolean isUnderControl)
	{
		this.patientName = patientName;
		this.type = type;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.doctorName = doctorName;
		this.hospitalName = hospitalName;
		this.city = city;
		this.country = country;
		this.medication = medication;
		this.dietPlan = dietPlan;
		this.age = age;
		this.sugarLevel = sugarLevel;
		this.fastingSugar = fastingSugar;
		this.diagnosisYear = diagnosisYear;
		this.isInsulinDependent = isInsulinDependent;
		this.weight = weight;
		this.symptoms = symptoms;
		this.treatmentType = treatmentType;
		this.exerciseRoutine = exerciseRoutine;
		this.isUnderControl = isUnderControl;
	}

	void show()
	{
		System.out.println("patient name: " + this.patientName);
		System.out.println("type: " + this.type);
		System.out.println("gender: " + this.gender);
		System.out.println("blood group: " + this.bloodGroup);
		System.out.println("doctor name: " + this.doctorName);
		System.out.println("hospital name: " + this.hospitalName);
		System.out.println("city: " + this.city);
		System.out.println("country: " + this.country);
		System.out.println("medication: " + this.medication);
		System.out.println("diet plan: " + this.dietPlan);
		System.out.println("age: " + this.age);
		System.out.println("sugar level: " + this.sugarLevel);
		System.out.println("fasting sugar: " + this.fastingSugar);
		System.out.println("diagnosis year: " + this.diagnosisYear);
		System.out.println("is insulin dependent: " + this.isInsulinDependent);
		System.out.println("weight: " + this.weight);
		System.out.println("symptoms: " + this.symptoms);
		System.out.println("treatment type: " + this.treatmentType);
		System.out.println("exercise routine: " + this.exerciseRoutine);
		System.out.println("is under control: " + this.isUnderControl);
	}
}