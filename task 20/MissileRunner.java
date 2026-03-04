class MissileRunner
{
	public static void main(String... args)
	{
		Missile m=new Missile();
		Missile m1=new Missile();
		m.launch(); m.target(); m.lockTarget(); m.ignite();
		m.fuel(); m.navigate(); m.accelerate(); m.explode();
		m.selfDestruct(); m.checkSystem(); m.maintenance();
		m.displayRange(); m.displayType(); m.reload(); m.deactivate();
	}
}