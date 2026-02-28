class Cell
{
	String name;
	String type;
	String shape;
	String function;
	String location;
	String discoveredBy;
	String organismType;
	String nucleusType;
	String cellWallType;
	String cytoplasmType;
	int size;
	int chromosomeCount;
	int discoveryYear;
	int lifespanDays;
	boolean isEukaryotic;
	double phLevel;
	String reproductionType;
	String energySource;
	String specialFeature;
	boolean isVisibleToNakedEye;

	Cell(String name,
	String type,
	String shape,
	String function,
	String location,
	String discoveredBy,
	String organismType,
	String nucleusType,
	String cellWallType,
	String cytoplasmType,
	int size,
	int chromosomeCount,
	int discoveryYear,
	int lifespanDays,
	boolean isEukaryotic,
	double phLevel,
	String reproductionType,
	String energySource,
	String specialFeature,
	boolean isVisibleToNakedEye)
	{
		this.name = name;
		this.type = type;
		this.shape = shape;
		this.function = function;
		this.location = location;
		this.discoveredBy = discoveredBy;
		this.organismType = organismType;
		this.nucleusType = nucleusType;
		this.cellWallType = cellWallType;
		this.cytoplasmType = cytoplasmType;
		this.size = size;
		this.chromosomeCount = chromosomeCount;
		this.discoveryYear = discoveryYear;
		this.lifespanDays = lifespanDays;
		this.isEukaryotic = isEukaryotic;
		this.phLevel = phLevel;
		this.reproductionType = reproductionType;
		this.energySource = energySource;
		this.specialFeature = specialFeature;
		this.isVisibleToNakedEye = isVisibleToNakedEye;
	}

	void show()
	{
		System.out.println("name: " + this.name);
		System.out.println("type: " + this.type);
		System.out.println("shape: " + this.shape);
		System.out.println("function: " + this.function);
		System.out.println("location: " + this.location);
		System.out.println("discovered by: " + this.discoveredBy);
		System.out.println("organism type: " + this.organismType);
		System.out.println("nucleus type: " + this.nucleusType);
		System.out.println("cell wall type: " + this.cellWallType);
		System.out.println("cytoplasm type: " + this.cytoplasmType);
		System.out.println("size (micrometer): " + this.size);
		System.out.println("chromosome count: " + this.chromosomeCount);
		System.out.println("discovery year: " + this.discoveryYear);
		System.out.println("lifespan (days): " + this.lifespanDays);
		System.out.println("is eukaryotic: " + this.isEukaryotic);
		System.out.println("ph level: " + this.phLevel);
		System.out.println("reproduction type: " + this.reproductionType);
		System.out.println("energy source: " + this.energySource);
		System.out.println("special feature: " + this.specialFeature);
		System.out.println("is visible to naked eye: " + this.isVisibleToNakedEye);
	}
}