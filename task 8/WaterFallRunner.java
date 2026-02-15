class WaterFallRunner
{
	public static void main(String[] values)
	{
		String location="Chikkamagaluru";
		String location1="shimogga";
		String location2="yadgir";
		String location3="mandya";
	
		WaterFall.info(null,location,230,18.6);
		WaterFall.info("hebbe",location,551,35.5);
		WaterFall.info("kalhatgiri",location,400,22.8);
		WaterFall.info("hanumanagundi",location,72,12.4);
		WaterFall.info("manikyadhara",location,30,6.9);
		
		String state="karnataka";
		String capital="bengaluru";
		int area=566;
		int area1=700;
		int area2=500;
		int area3=800;
		boolean stateIsRich=true;
		
		
		
		WaterFall.stateOwningInfo(null,state,capital,area,stateIsRich);
		WaterFall.stateOwningInfo(location1,"orissa",capital,area1,stateIsRich);
		WaterFall.stateOwningInfo(location2,state,capital,area2,stateIsRich);
		WaterFall.stateOwningInfo(location3,state,capital,area3,stateIsRich);
		WaterFall.stateOwningInfo(location,state,capital,area,false);
	}
}