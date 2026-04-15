/*
n is the total number of elements that should be in the array if nothing were missing.
formula: expected sum=n(n+1)/2
missing element=expected sum - actual sum
*/

class MissingElement
{
    public static void main(String...values)
{
    int[] numbers={1,2,3,4,6};
    int n=numbers.length;
    int expectedSum=((n+1)*(n+2))/(2);
    int actualSum=0;
    for(int i=0;i<n;i++)
    {
        actualSum+=numbers[i];
    }
    int missingNumber=expectedSum-actualSum;
    System.out.println("missing number:"+missingNumber);
}
}