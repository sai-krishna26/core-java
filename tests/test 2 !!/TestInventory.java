public class TestInventory
{
    public static void main(String[] args)
    {
        InventoryManagement p1 = new InventoryManagement(
                101, "Laptop", 50, 5, 800, 7, false);

        InventoryManagement p2 = new InventoryManagement(
                102, "Winter Jacket", 15, 3, 120, 5, true);

        InventoryManagement p3 = new InventoryManagement(
                103, "Mobile Phone", 100, 10, 600, 4, false);

        InventoryManagement p4 = new InventoryManagement(
                104, "Air Conditioner", 10, 2, 1500, 6, true);

				
        System.out.println("Stock Status:");
        System.out.println(p1.productName + ": " + p1.checkStockStatus());
        System.out.println(p2.productName + ": " + p2.checkStockStatus());
        System.out.println(p3.productName + ": " + p3.checkStockStatus());
        System.out.println(p4.productName + ": " + p4.checkStockStatus());

		
        System.out.println("\nAverage Inventory Value: "
                + InventoryManagement.getAverageInventoryValue());

				
        System.out.println("\nWeekly Revenue:");
        System.out.println(p1.productName + ": " + p1.calculateWeeklyRevenue());
        System.out.println(p2.productName + ": " + p2.calculateWeeklyRevenue());
        System.out.println(p3.productName + ": " + p3.calculateWeeklyRevenue());
        System.out.println(p4.productName + ": " + p4.calculateWeeklyRevenue());

		
        System.out.println("\nRestocking Air Conditioner...");
        p4.restock(20);

		
        System.out.println("Updated Stock Status: "
                + p4.checkStockStatus());
    }
}