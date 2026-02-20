class CheckingAllLoops2{

    static void check() {
        int marks = 76;
        String dept = "cse";
        processMarks(marks);
        department(dept);
        loops(marks);
    }

    static void processMarks(int marks) {

        if (marks < 40)
            System.out.println("Fail");
        else if (marks < 60)
            System.out.println("Second Class");
        else if (marks < 75)
            System.out.println("First Class");
        else
            System.out.println("Distinction");

        System.out.println("------------------");
    }

    static void department(String dept) {

        switch (dept) {
            case "cse":
                System.out.println("Computer Science");
                break;
            case "ece":
                System.out.println("Electronics");
                break;
            default:
                System.out.println("Other Department");
        }

        System.out.println("------------------");
    }

    static void loops(int marks) {

        int bonus = 5;

        while (marks < 80) {
            System.out.println("Improving marks: " + marks);
            marks++;
        }

        System.out.println("------------------");

        for (int i = 1; i <= bonus; i++)
            System.out.println("Subject " + i);

        System.out.println("------------------");

        do {
            marks--;
            System.out.println("Final marks: " + marks);
        } while (marks > 78);
    }

    public static void main(String[] args) {
        check();
    }
}
