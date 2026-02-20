class WhileProgram
{
    static void executeWhile()
    {
        int value = 1;
        RunWhile(value);
    }

	
	
    static void RunWhile(int index)
    {
        int i = 1;

        System.out.println("While Loop :");

        while(i <= 10)
        {
            System.out.print(index + " ");

            if(i < 5)
            {
                index++; 
            }
            else
            {
                index--; 
            }

            i++;
        }
    }
}
