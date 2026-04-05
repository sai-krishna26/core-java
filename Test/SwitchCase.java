import java.util.Scanner;

class SwitchCase
{
	Scanner sc = new Scanner(System.in);
	KlipCartRunner klipCartRunner=new KlipCartRunner();
	
	void selectMethod(int number)
	{
		switch(number)
		{
			case 1:klipCartRunner.storeKey();
			break;
			
			case 2:klipCartRunner.displayKey();
			break;
			
			case 3:
			System.out.print("Enter product Id: ");
			int id=sc.nextInt();
			sc.nextLine();
			klipCartRunner.getProductByProductIdKey(id);
			break;
			
			case 4:
			System.out.print("Enter product name: ");
			String name=sc.nextLine();
			klipCartRunner.getProductPriceByProductNameKey(name);
			break;
			
			case 5:
			System.out.print("Enter company name: ");
			String cname=sc.nextLine();
			klipCartRunner.getProductNameByCompanyNameKey(cname);
			break;
			
			case 6:
                System.out.print("Enter product name: ");
                String pname1 = sc.nextLine();
                klipCartRunner.getCompanyByproductNameKey(pname1);
                break;

            case 7:
                System.out.print("Enter product name: ");
                String pname2 = sc.nextLine();
                klipCartRunner.storeProducts.getMnfAndExpDateByproductName(pname2);
                break;

            case 8:
                System.out.print("Enter type (GROCERY / ELECTRONICS / DAIRY): ");
                String typeInput = sc.nextLine().toUpperCase();

                try {
                    Type type = Type.valueOf(typeInput);
                    klipCartRunner.storeProducts.getProductNameByType(type);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid type!");
                }
                break;

            case 9:
                System.out.print("Enter product name to delete: ");
                String delName = sc.nextLine();
                klipCartRunner.storeProducts.deleteProduct(delName);
                break;

            case 10:
                System.out.print("Enter product name: ");
                String pname4 = sc.nextLine();

                System.out.print("Enter new Manufacture Date: ");
                String newMnf = sc.nextLine();

                System.out.print("Enter new Expiry Date: ");
                String newExp = sc.nextLine();

                klipCartRunner.storeProducts
                    .UpdateMnfDateAndExpDateByProductName(pname4, newMnf, newExp);
                break;

            case 11:
                System.out.print("Enter product name: ");
                String pname5 = sc.nextLine();

                System.out.print("Enter new price: ");
                double newPrice = sc.nextDouble();
                sc.nextLine();

                klipCartRunner.storeProducts
                    .UpdateProductPriceByProductName(pname5, newPrice);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}