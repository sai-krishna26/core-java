class MaxGap
{
    public static int main(String[] args)
    {

        int nums[]={2,5,8,1};
            int maxDif=0;

            if(nums.length<2)
            {
                return 0;
            }
            else
            {
                java.util.Arrays.sort(nums);
                for(int i=0;i<nums.length-1;i++)
                {
                    int dif=nums[i+1]-nums[i];
                    if(dif>maxDif)
                    {
                        maxDif=dif;
                    }
                }
            }
            return maxDif;
    }
}
