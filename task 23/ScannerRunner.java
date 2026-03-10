class ScannerRunner
{
	public static void main(String... val)
	{
		int[] codes=new int[3];
		codes[0]=101;
		codes[1]=102;
		codes[2]=103;
		
		Lens[] lens=new Lens[3];
		lens[0]=new Lens("basic lens",2);
		lens[1]=new Lens("medium lens",4);
		lens[2]=new Lens("advanced lens",6);
		
		Scanner scanner=new Scanner(codes,lens);
		scanner.displayScanner();
	}
}