class Rotor
{
	String material;
	Rotor(String material)
	{
		this.material=material;
		System.out.println("created material using Rotor");
	}
	void getRotor()
	{
		System.out.println("rotor material: "+this.material);
	}
}