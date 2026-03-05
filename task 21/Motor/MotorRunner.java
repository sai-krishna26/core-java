class MotorRunner
{
	public static void main(String... values)
	{
		Coil coil=new Coil("Copper");
		Rotor rotor=new Rotor("Steel");
		Stator stator=new Stator("Large");
		Bearing bearing=new Bearing("SKF");
		Fan fan=new Fan(4);
		Wire wire=new Wire("High");

		Motor motor=new Motor("ABB","AC",500,3000,true,coil,rotor,stator,bearing,fan,wire);
		motor.getMotor();
	}
}