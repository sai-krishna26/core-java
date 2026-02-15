class Stabilizer {
    static String getBrand(String brand) {
        System.out.println("Executing getBrand in Stabilizer, brand: " + brand);
        return brand;
    }

    static int getCapacity(int capacity) {
        System.out.println("Executing getCapacity in Stabilizer, capacity: " + capacity + "V");
        return capacity;
    }

    static int getPrice(int price) {
        System.out.println("Executing getPrice in Stabilizer, price: " + price+"\n");
        return price;
    }
}