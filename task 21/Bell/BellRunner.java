class BellRunner
{
	public static void main(String... values)
	{
		Handle handle=new Handle("Wood");
		Metal metal=new Metal("Bronze");
		Striker striker=new Striker("Iron");
		Stand stand=new Stand(1.5);
		Sound sound=new Sound(440);
		Temple temple=new Temple("Shiva Temple");

		Bell bell=new Bell("Round","Gold",5,10,true,
		handle,metal,striker,stand,sound,temple);

		bell.getBell();
	}
}