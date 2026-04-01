class OrbitRunner
{
	public static void main(String... args)
	{
		EarthOrbit earthOrbit = new EarthOrbit();
		EarthOrbit earthOrbit1 = new EarthOrbit();

		earthOrbit.radius=100;
		earthOrbit.speed=29.8;
		earthOrbit.planet="Earth";
		earthOrbit.moons=1;
		earthOrbit.galaxy="MilkyWay";
		earthOrbit.stable=true;
		earthOrbit.gravity=9.8;
		earthOrbit.star="Sun";

		System.out.println(earthOrbit.radius);
		System.out.println(earthOrbit.speed);
		System.out.println(earthOrbit.planet);
		System.out.println(earthOrbit.moons);
		System.out.println(earthOrbit.galaxy);
		System.out.println(earthOrbit.stable);
		System.out.println(earthOrbit.gravity);
		System.out.println(earthOrbit.star);
		earthOrbit.rotate();
		earthOrbit.revolve();
		earthOrbit.display();

		Orbit orbit = new EarthOrbit();
		Orbit orbit1 = new EarthOrbit();

		orbit.radius=200;
		orbit.speed=30;
		orbit.planet="Mars";

		System.out.println(orbit.radius);
		System.out.println(orbit.speed);
		System.out.println(orbit.planet);
		orbit.rotate();
		orbit.revolve();

		Orbit orbit2 = new Orbit();
		Orbit orbit3 = new Orbit();

		orbit2.radius=50;
		orbit2.speed=10;
		orbit2.planet="Moon";

		System.out.println(orbit2.radius);
		System.out.println(orbit2.speed);
		System.out.println(orbit2.planet);
		orbit2.rotate();
		orbit2.revolve();
	}
}