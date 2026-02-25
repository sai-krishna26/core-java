//sum of even and odd
//[1,2,3,4]
//oddSum=4,evenSum=6

class SumCalculation
{

		public static void main(String[] args)
		{
			int aaray[]={1,5,4,5,6,7};
			int eSum=0;
			int oSum=0;
			
			for(int i=0;i<aaray.length;i++)
			{
				if(aaray[i]%2==0)
				{
					eSum=eSum+aaray[i];
				}
				else
				{
					oSum=oSum+aaray[i];
				}
				
			}
			System.out.println("even sum: "+eSum);
			System.out.println("odd sum: "+oSum);
		}
}