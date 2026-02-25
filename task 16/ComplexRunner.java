class ComplexRunner
{
	public static void main(String[] val)
	{
		Complex complex=new Complex();
		Complex.Bucket bucket=complex.new Bucket(25,"Transaparent",350.48);
		System.out.println("bucket size: "+bucket.size+" L");
		System.out.println("bucket color: "+bucket.color);
		System.out.println("bucket cost: "+bucket.cost);
		
		
		Complex.Jacket jacket=complex.new Jacket("decathlon","India","sport leather",1499.99,true);
		
		
		Complex.Pocket pocket=complex.new Pocket(true,"right",8.50f);
	}
}