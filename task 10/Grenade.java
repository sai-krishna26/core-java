class Grenade {
    static String getType(String type) {
        System.out.println("Executing getType in Grenade, type: " + type);
        return type;
    }

    static int getWeight(int weight) {
        System.out.println("Executing getWeight in Grenade, weight: " + weight + "g");
        return weight;
    }

    static int getRange(int range) {
        System.out.println("Executing getRange in Grenade, range: " + range + "m"+"\n");
        return range;
    }
}