class BrokerRunner
{
	public static void main(String... val)
	{
		int[] deals=new int[3];
		deals[0]=201;
		deals[1]=202;
		deals[2]=203;
		
		Client[] client=new Client[3];
		client[0]=new Client("Ravi",5);
		client[1]=new Client("Arun",3);
		client[2]=new Client("Kiran",7);
		
		Broker broker=new Broker(deals,client);
		broker.displayBroker();
	}
}