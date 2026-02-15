class Tablet {
    static String getBrand(String brand) {
        System.out.println("Executing getBrand in Tablet, brand: " + brand);
        return brand;
    }

    static int getStorage(int storage) {
        System.out.println("Executing getStorage in Tablet, storage: " + storage + "GB");
        return storage;
    }

    static int getPrice(int price) {
        System.out.println("Executing getPrice in Tablet, price: " + price);
        return price;
    }
}