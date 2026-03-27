class getCapsRunner
{
	public static void main(String... cap)
	{
		Cap[] caps=new Cap[10];
		getCaps getcaps=new getCaps(caps);
		
		Cap cap0=new Cap("Nike","white","cotton",400.99,'M',false);
		getcaps.storeCaps(cap0);
	}
}