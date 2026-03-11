class PainterRunner
{
	public static void main(String... values)
	{
		String[] worksfor=new String[3];
		worksfor[0]="drawing";
		worksfor[1]="painting";
		worksfor[2]="mixing";
		
		Color[] color=new Color[3];
		color[0]=new Color("square",150);
		color[1]=new Color("diamond",250);
		color[2]=new Color("circle",300);
		
		Painter painter=new Painter(worksfor,color);
		painter.displayPainter();
	}
}