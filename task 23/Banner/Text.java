class Text
{
	String message;
	int line;
	
	Text(String message,int line)
	{
		this.message=message;
		this.line=line;
	}
	
	void displayText()
	{
		System.out.println("text message: "+this.message);
		System.out.println("line number: "+this.line);
	}
}