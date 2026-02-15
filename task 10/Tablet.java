class Tablet {
    static String getBrand(String brand) {
        System.out.println("Executing getBrand in Tablet, brand: " + brand);
        return brand;
    }

    static int getCapacity(int capacity) {
        System.out.println("Executing getStorage in Tablet, storage: " + capacity + "mg");
        return capacity;
    }

    static int getPrice(int price) {
        System.out.println("Executing getPrice in Tablet, price: " + price+"\n");
        return price;
    }
}