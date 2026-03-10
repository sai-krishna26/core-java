class ServerRunner{
	public static void main(String... val)
	{
		long[] ip=new long[3];
		ip[0]=07653;
		ip[1]=86534;
		ip[2]=98733;
		
		Rotour[] rotour=new Rotour[3];
		rotour[0]=new Rotour("basic rotour",4);
		rotour[1]=new Rotour("medium rotour",6);
		rotour[2]=new Rotour("advanced rotour",8);
		
		Server server=new Server(ip,rotour);
		server.displayServer();
	}
}