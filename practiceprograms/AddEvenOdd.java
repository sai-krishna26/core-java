class AddEvenOdd {

    public static int differenceOfSums(int n, int m) {
        int evenSum = 0;
        int oddSum = 0;
        int index = 1;
        int sum = 0;

        while (index <= n) {
            if (index % m == 0) {
                evenSum += index;
            } else {
                oddSum += index;
            }
            index++;
        }

        sum = oddSum - evenSum;
        return sum;
    }

    public static void main(String... vals) {
        int result = differenceOfSums(10, 3);
        System.out.println("Result = " + result);
    }
}