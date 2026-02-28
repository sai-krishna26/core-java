class Brain
{
	String personName;
	String brainType;
	String hemisphereDominance;
	String memoryType;
	String intelligenceLevel;
	String bloodGroup;
	String doctorName;
	String hospitalName;
	String city;
	String country;
	int age;
	int iqLevel;
	int brainWeight;
	int neuronCount;
	boolean isHealthy;
	double reactionTime;
	String disorder;
	String treatment;
	String bloodSupplyType;
	boolean isUnderObservation;

	Brain(String personName,
	String brainType,
	String hemisphereDominance,
	String memoryType,
	String intelligenceLevel,
	String bloodGroup,
	String doctorName,
	String hospitalName,
	String city,
	String country,
	int age,
	int iqLevel,
	int brainWeight,
	int neuronCount,
	boolean isHealthy,
	double reactionTime,
	String disorder,
	String treatment,
	String bloodSupplyType,
	boolean isUnderObservation)
	{
		this.personName = personName;
		this.brainType = brainType;
		this.hemisphereDominance = hemisphereDominance;
		this.memoryType = memoryType;
		this.intelligenceLevel = intelligenceLevel;
		this.bloodGroup = bloodGroup;
		this.doctorName = doctorName;
		this.hospitalName = hospitalName;
		this.city = city;
		this.country = country;
		this.age = age;
		this.iqLevel = iqLevel;
		this.brainWeight = brainWeight;
		this.neuronCount = neuronCount;
		this.isHealthy = isHealthy;
		this.reactionTime = reactionTime;
		this.disorder = disorder;
		this.treatment = treatment;
		this.bloodSupplyType = bloodSupplyType;
		this.isUnderObservation = isUnderObservation;
	}

	void show()
	{
		System.out.println("person name: " + this.personName);
		System.out.println("brain type: " + this.brainType);
		System.out.println("hemisphere dominance: " + this.hemisphereDominance);
		System.out.println("memory type: " + this.memoryType);
		System.out.println("intelligence level: " + this.intelligenceLevel);
		System.out.println("blood group: " + this.bloodGroup);
		System.out.println("doctor name: " + this.doctorName);
		System.out.println("hospital name: " + this.hospitalName);
		System.out.println("city: " + this.city);
		System.out.println("country: " + this.country);
		System.out.println("age: " + this.age);
		System.out.println("iq level: " + this.iqLevel);
		System.out.println("brain weight (grams): " + this.brainWeight);
		System.out.println("neuron count (millions): " + this.neuronCount);
		System.out.println("is healthy: " + this.isHealthy);
		System.out.println("reaction time: " + this.reactionTime);
		System.out.println("disorder: " + this.disorder);
		System.out.println("treatment: " + this.treatment);
		System.out.println("blood supply type: " + this.bloodSupplyType);
		System.out.println("is under observation: " + this.isUnderObservation);
	}
}