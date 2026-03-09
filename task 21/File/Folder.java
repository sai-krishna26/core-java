class Folder
{
	String name;
	Folder(String name)
	{
		this.name=name;
		System.out.println("created name using Folder");
	}
	void getFolder()
	{
		System.out.println("Folder name: "+this.name);
	}
}