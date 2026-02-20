class LabourRunner
{
	public static void main(String[] args)
	{
		Labour labour=new Labour();
		Labour labour1=new Labour();
		
		System.out.println("default name :"+labour.name);
		System.out.println("default salary :"+labour.salary);
		System.out.println("default idProofs :"+labour.idProofs);
		
		labour.name="Ramesh";
		labour.salary=15000.50f;
		labour.idProofs=new String[]{"adhar card","pan card","ration card","bank passbook"};
		
		System.out.println("initialized name :"+labour.name);
		System.out.println("initialized salary :"+labour.salary);
		
		System.out.println("ninitialized idProofs :");
		for(String id:labour.idProofs)
		{
			System.out.print(id+", ");
			
		}
	}
}