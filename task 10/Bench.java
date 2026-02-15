class Bench {
    static String getMaterial(String material) {
        System.out.println("Executing getMaterial in Bench, material: " + material);
        return material;
    }

    static int getCapacity(int capacity) {
        System.out.println("Executing getCapacity in Bench, capacity: " + capacity + " persons");
        return capacity;
    }

    static int getPrice(int price) {
        System.out.println("Executing getPrice in Bench, price: " + price+"\n");
        return price;
    }
}