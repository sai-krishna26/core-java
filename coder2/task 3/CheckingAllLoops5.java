class CheckingAllLoops5{

    static void check() {
        int age = 16;
        String vote = "yes";
        eligibility(age);
        decision(vote);
        loops(age);
    }

    static void eligibility(int age) {

        if (age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible");

        System.out.println("------------------");
    }

    static void decision(String vote) {

        switch (vote) {
            case "yes":
                System.out.println("Vote Recorded");
                break;
            case "no":
                System.out.println("Vote Skipped");
                break;
            default:
                System.out.println("Invalid Option");
        }

        System.out.println("------------------");
    }

    static void loops(int age) {

        while (age < 18) {
            System.out.println("Increasing age...");
            age++;
        }

        System.out.println("------------------");

        for (int i = 0; i < 3; i++)
            System.out.println("Survey Question " + i);

        System.out.println("------------------");

        do {
            age--;
            System.out.println("Rechecking age: " + age);
        } while (age > 16);
    }

    public static void main(String[] args) {
        check();
    }
}
