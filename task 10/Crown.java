class Crown {
    static String getMaterial(String material) {
        System.out.println("Executing getMaterial in Crown, material: " + material);
        return material;
    }

    static int getWeight(int weight) {
        System.out.println("Executing getWeight in Crown, weight: " + weight + "g");
        return weight;
    }

    static int getCost(int cost) {
        System.out.println("Executing getCost in Crown, cost: " + cost+"\n");
        return cost;
    }
}