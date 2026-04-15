class DuplicateFinder
{
    public static void main(String...values)
    {
        int[] numbers={2,3,4,6,5,3};
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]==numbers[j])
                {
                    System.out.println(numbers[i]+" has a duplicate");
                    break;
                }
            }
        }
    }
}
