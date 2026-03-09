class CloudRunner
{
	public static void main(String... values)
	{
		DataCenter dataCenter=new DataCenter("Mumbai");
		Region region=new Region("Asia");
		Service service=new Service("Compute");
		Security security=new Security("Encryption");
		Client client=new Client("CompanyX");
		Network network=new Network("5G");

		Cloud cloud=new Cloud("AWS","IaaS",100,500,true,
		null,region,service,security,client,network);

		cloud.getCloud();
	}
}