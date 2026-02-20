class LiftSystem
{
    void moveLift(int startFloor)
    {
        int floor = startFloor;
        int stop = 1;

        System.out.println("Lift Movement:");

        do
        {
            System.out.print("Floor " + floor + "  ");

            if(stop < 5)
                floor++;   
            else
                floor--;    
            stop++;

        } while(stop <= 10);
    }
}
