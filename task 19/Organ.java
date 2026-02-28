class Organ
{
	String name;
	String system;
	String function;
	String location;
	String shape;
	String color;
	String tissueType;
	String bloodSupply;
	String nerveSupply;
	String relatedOrgan;
	int averageWeight;
	int averageLength;
	int cellCount;
	int discoveryYear;
	boolean isVital;
	double phLevel;
	String scientistName;
	String medicalField;
	String commonDisease;
	boolean isTransplantPossible;

	Organ(String name,
	String system,
	String function,
	String location,
	String shape,
	String color,
	String tissueType,
	String bloodSupply,
	String nerveSupply,
	String relatedOrgan,
	int averageWeight,
	int averageLength,
	int cellCount,
	int discoveryYear,
	boolean isVital,
	double phLevel,
	String scientistName,
	String medicalField,
	String commonDisease,
	boolean isTransplantPossible)
	{
		this.name = name;
		this.system = system;
		this.function = function;
		this.location = location;
		this.shape = shape;
		this.color = color;
		this.tissueType = tissueType;
		this.bloodSupply = bloodSupply;
		this.nerveSupply = nerveSupply;
		this.relatedOrgan = relatedOrgan;
		this.averageWeight = averageWeight;
		this.averageLength = averageLength;
		this.cellCount = cellCount;
		this.discoveryYear = discoveryYear;
		this.isVital = isVital;
		this.phLevel = phLevel;
		this.scientistName = scientistName;
		this.medicalField = medicalField;
		this.commonDisease = commonDisease;
		this.isTransplantPossible = isTransplantPossible;
	}

	void show()
	{
		System.out.println("name: " + this.name);
		System.out.println("system: " + this.system);
		System.out.println("function: " + this.function);
		System.out.println("location: " + this.location);
		System.out.println("shape: " + this.shape);
		System.out.println("color: " + this.color);
		System.out.println("tissue type: " + this.tissueType);
		System.out.println("blood supply: " + this.bloodSupply);
		System.out.println("nerve supply: " + this.nerveSupply);
		System.out.println("related organ: " + this.relatedOrgan);
		System.out.println("average weight (g): " + this.averageWeight);
		System.out.println("average length (cm): " + this.averageLength);
		System.out.println("cell count (approx): " + this.cellCount);
		System.out.println("discovery year: " + this.discoveryYear);
		System.out.println("is vital: " + this.isVital);
		System.out.println("ph level: " + this.phLevel);
		System.out.println("scientist name: " + this.scientistName);
		System.out.println("medical field: " + this.medicalField);
		System.out.println("common disease: " + this.commonDisease);
		System.out.println("is transplant possible: " + this.isTransplantPossible);
	}
}