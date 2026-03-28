class getCapsRunner
{
	public static void main(String... cap)
	{
		Cap[] caps=new Cap[10];
		getCaps getcaps=new getCaps(caps);
		
		Cap cap0=new Cap("Nike","white","cotton",400.99,'M',false);
		getcaps.storeCaps(cap0);
		
		Cap cap1=new Cap("adidas","black","nylon",450.90,'L',true);
		getcaps.storeCaps(cap1);
		
		Cap cap2=new Cap("puma","orange","Plastic",380.98,'S',true);
		getcaps.storeCaps(cap2);
		
		Cap cap3=new Cap("sport","red","fiber",480.98,'L',false);
		getcaps.storeCaps(cap3);
		
		Cap cap4=new Cap("Wildcraft","black","black",680.98,'M',false);
		getcaps.storeCaps(cap4);
		
		Cap cap5=new Cap("reebok","green","cloth",800.98,'L',false);
		getcaps.storeCaps(cap5);
		
		Cap cap6=new Cap("mrf","blue","jersy",780.98,'M',false);
		getcaps.storeCaps(cap6);
		
		Cap cap7=new Cap("ceat","navyblue","fiber",370.98,'S',true);
		getcaps.storeCaps(cap7);
		
		Cap cap8=new Cap("ports","green","cloth",980.98,'M',true);
		getcaps.storeCaps(cap8);
		
		Cap cap9=new Cap("air","tiltyellow","fiber",280.98,'L',false);
		getcaps.storeCaps(cap9);
	}
}