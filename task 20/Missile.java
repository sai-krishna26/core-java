class Missile
{
	void launch(){ System.out.println("executing launch in Missile"); }
	void target(){ System.out.println("executing target in Missile"); }
	void lockTarget(){ System.out.println("executing lockTarget in Missile"); }
	void ignite(){ System.out.println("executing ignite in Missile"); }
	void fuel(){ System.out.println("executing fuel in Missile"); }
	void navigate(){ System.out.println("executing navigate in Missile"); }
	void accelerate(){ System.out.println("executing accelerate in Missile"); }
	void explode(){ System.out.println("executing explode in Missile"); }
	void selfDestruct(){ System.out.println("executing selfDestruct in Missile"); }
	void checkSystem(){ System.out.println("executing checkSystem in Missile"); }
	void maintenance(){ System.out.println("executing maintenance in Missile"); }
	void displayRange(){ System.out.println("executing displayRange in Missile"); }
	void displayType(){ System.out.println("executing displayType in Missile"); }
	void reload(){ System.out.println("executing reload in Missile"); }
	void deactivate(){ System.out.println("executing deactivate in Missile"); }
}

class MissileRunner
{
	public static void main(String... args)
	{
		Missile m=new Missile();
		m.launch(); m.target(); m.lockTarget(); m.ignite();
		m.fuel(); m.navigate(); m.accelerate(); m.explode();
		m.selfDestruct(); m.checkSystem(); m.maintenance();
		m.displayRange(); m.displayType(); m.reload(); m.deactivate();
	}
}