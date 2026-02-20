class CheckingAllLoops6{

    static void check() {
        int num = 7;
        decision(num);
        loops(num);
    }

    static void decision(int num) {

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        System.out.println("------------------");
    }

    static void loops(int num) {

        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reverse: " + reverse);

        System.out.println("------------------");

        for (int i = 1; i <= num; i++)
            System.out.println("Factorial step: " + i);

        System.out.println("------------------");

        do {
            num--;
            System.out.println("Reducing number: " + num);
        } while (num > 3);
    }

    public static void main(String[] args) {
        check();
    }
}
