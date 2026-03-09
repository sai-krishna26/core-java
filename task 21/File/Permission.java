class Permission
{
	String type;
	Permission(String type)
	{
		this.type=type;
		System.out.println("created type using Permission");
	}
	void getPermission()
	{
		System.out.println("Permission type: "+this.type);
	}
}