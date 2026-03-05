class FileRunner
{
	public static void main(String... values)
	{
		Folder folder=new Folder("Documents");
		Owner owner=new Owner("Sai");
		Permission permission=new Permission("ReadWrite");
		Version version=new Version(1);
		Storage storage=new Storage("LocalDisk");
		Backup backup=new Backup("Enabled");

		File file=new File("Report","PDF",20,10,true,folder,owner,permission,version,storage,backup);
		file.getFile();
	}
}