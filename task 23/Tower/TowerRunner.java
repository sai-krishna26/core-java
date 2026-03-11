class TowerRunner
{
	public static void main(String...args)
	{
		String[] types= new String[3];
		types[0]="Jio";
		types[1]="Airtel";
		types[2]="reliance";
		
		Signal[] signal=new Signal[3];
		signal[0]=new Signal(100,true);
		signal[1]=new Signal(120,false);
		signal[2]=new Signal(200,true);
		
		Tower tower = new Tower(types,signal);
		tower.showTower();
	}
}