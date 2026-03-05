class File
{
	String fileName;
	String format;
	int size;
	int pages;
	boolean editable;

	Folder folder;
	Owner owner;
	Permission permission;
	Version version;
	Storage storage;
	Backup backup;

	File(String fileName,String format,int size,int pages,boolean editable,
	Folder folder,Owner owner,Permission permission,Version version,Storage storage,Backup backup)
	{
		this.fileName=fileName;
		this.format=format;
		this.size=size;
		this.pages=pages;
		this.editable=editable;
		this.folder=folder;
		this.owner=owner;
		this.permission=permission;
		this.version=version;
		this.storage=storage;
		this.backup=backup;

		System.out.println("created a File using primitive and non primitive variables");
	}

	void getFile()
	{
		System.out.println("fileName: "+this.fileName);
		System.out.println("format: "+this.format);
		System.out.println("owner object: "+this.owner);
	}
}