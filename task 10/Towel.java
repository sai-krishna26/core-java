class Towel {
    static String getColor(String color) {
        System.out.println("Executing getColor in Towel, color: " + color);
        return color;
    }

    static String getMaterial(String material) {
        System.out.println("Executing getMaterial in Towel, material: " + material);
        return material;
    }

    static int getPrice(int price) {
        System.out.println("Executing getPrice in Towel, price: " + price+"\n");
        return price;
    }
}