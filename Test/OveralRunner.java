import java.util.Scanner;

class OveralRunner
{
	public static void main(String... values)
	{
		Scanner sc=new Scanner(System.in);
		SwitchCase switchCase=new SwitchCase();
		
		while(true)
		{
			System.out.println("\n========= KLIPCART MENU =========");
			System.out.println("1. Store Products");
			System.out.println("2. Display Products");
			System.out.println("3. Get Product By ID");
			System.out.println("4. Get Price By Product Name");
			System.out.println("5. Get Product By Company Name");
			System.out.println("6. Get Company By Product Name");
			System.out.println("7. Get Mnf & Exp Date By Product Name");
			System.out.println("8. Get Product By Type");
			System.out.println("9. Delete Product");
			System.out.println("10. Update Mnf & Exp Date");
			System.out.println("11. Update Product Price");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			if(choice==0)
			{
				System.out.println("Exiting program...");
				break;
			}
			
			switchCase.selectMethod(choice);
		}
		sc.close();
	}
}