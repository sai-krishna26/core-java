class CheckingAllLoops4{

    static void check() {
        int balance = 5000;
        String type = "savings";
        accountType(type);
        loops(balance);
    }

    static void accountType(String type) {

        switch (type) {
            case "savings":
                System.out.println("Savings Account");
                break;
            case "current":
                System.out.println("Current Account");
                break;
            default:
                System.out.println("Other Account");
        }

        System.out.println("------------------");
    }

    static void loops(int balance) {

        while (balance > 2000) {
            System.out.println("Withdrawing 500");
            balance -= 500;
        }

        System.out.println("------------------");

        for (int i = 1; i <= 3; i++)
            System.out.println("Interest year " + i);

        System.out.println("------------------");

        do {
            balance += 200;
            System.out.println("Minimum balance restore: " + balance);
        } while (balance < 2500);
    }

    public static void main(String[] args) {
        check();
    }
}
