//amstrong number = Sum of (each digit ^ number of digits) = the original number
//Number of digits = 3
//Calculation:1^3+5^3+6^3
import java.util.*;
class Amstrong
{
	public static void main(String... values)
	{
		int num=173;
		String number=num+"";
		int result=0;
		int size=number.length();
		
		for(int i=0;i<size;i++)
		{
			result+=Math.pow(Integer.parseInt(number.charAt(i)+""),size);
		}
		System.out.println("result:"+result);
	}
}

//result+=Math.pow((number.charAt(i)-'0'),size);