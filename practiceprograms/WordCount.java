class WordCount{
    public static void main(String[] args) {
        String s="saveChangesInTheEditor";
        int result=camelcase(s);
        System.out.println(result);
    }
    public static int camelcase(String s) {
    int count=0;
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if((int)curr>=65 && (int)curr<=90)
            {
                count=count+1;
            }
        }
        return count+1;
    }
}
