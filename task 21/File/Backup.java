class Backup
{
	String status;
	Backup(String status)
	{
		this.status=status;
		System.out.println("created status using Backup");
	}
	void getBackup()
	{
		System.out.println("backup status: "+this.status);
	}
}