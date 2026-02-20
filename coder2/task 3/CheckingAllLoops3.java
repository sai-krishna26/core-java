class CheckingAllLoops3{

    static void check() {
        int price = 1200;
        String brand = "nike";
        quality(price);
        brandType(brand);
        loops(price);
    }

    static void quality(int price) {

        if (price < 500)
            System.out.println("Low Quality");
        else if (price < 1000)
            System.out.println("Medium Quality");
        else
            System.out.println("High Quality");

        System.out.println("------------------");
    }

    static void brandType(String brand) {

        switch (brand) {
            case "nike":
                System.out.println("Sports Brand");
                break;
            case "zara":
                System.out.println("Fashion Brand");
                break;
            default:
                System.out.println("Unknown Brand");
        }

        System.out.println("------------------");
    }

    static void loops(int price) {

        int count = 3;

        while (price > 1000) {
            System.out.println("Applying discount...");
            price -= 100;
        }

        System.out.println("------------------");

        for (int i = 1; i <= count; i++)
            System.out.println("Item " + i);

        System.out.println("------------------");

        do {
            price += 50;
            System.out.println("Tax added: " + price);
        } while (price < 950);
    }

    public static void main(String[] args) {
        check();
    }
}
