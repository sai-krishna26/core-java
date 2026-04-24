class arrayCopy
{
    public static void main(String[] args) 
    {

    String[] names={"John","Smith","Adam","Eve"};
    String[] selectedNames=new String[names.length];

        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(names,0,selectedNames,1,2);
        for(String name:selectedNames)
        {
            System.out.println(name);
        }
    }
}