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
		System.out.println("--------------------------------------------------");
		System.out.println("fileName: "+this.fileName);
		System.out.println("format: "+this.format);
		System.out.println("size: "+this.size);
		System.out.println("pages: "+this.pages);
		System.out.println("editable: "+this.editable);
		if(this.folder!=null)
		{
			this.folder.getFolder();
		}
		else
		{
			System.out.println("folder not found");
		}
		if(this.owner!=null)
		{
			this.owner.getOwner();
		}
		if(this.permission!=null)
		{
			this.permission.getPermission();
		}
		if(this.version!=null)
		{
			this.version.getVersion();
		}
		if(this.storage!=null)
		{
			this.storage.getStorage();
		}
		if(this.backup!=null)
		{
			this.backup.getBackup();
		}
	}
}