//boolean True or False  / 1 or 0
public class BooleanRunner{
    public static void main(String args[]){
        boolean isDoorOpen;
        boolean isCharging;
        boolean isConnected;
        boolean isTaken;
        boolean isWalkableDistance;

        isDoorOpen=true;
        isCharging=false;
        isConnected=false;
        isTaken=true;
        isWalkableDistance=false;

        System.out.println("\ntrue=yes and false=no\n");
        System.out.println("state of door?: "+isDoorOpen);
        System.out.println("state of connection?: "+isConnected);
        System.out.println("state of charging?: "+isCharging);
        System.out.println("state of taking?: "+isTaken);
        System.out.println("state of walkabledistance?: "+isWalkableDistance);

        isDoorOpen=false;
        isCharging=true;
        isConnected=true;
        isTaken=false;
        isWalkableDistance=true;

        System.out.println("\ntrue=yes and false=no");
        System.out.println("\nvalues of variable after re-assigning\n");
        System.out.println("state of door?: "+isDoorOpen);
        System.out.println("state of connection?: "+isConnected);
        System.out.println("state of charging?: "+isCharging);
        System.out.println("state of taking?: "+isTaken);
        System.out.println("state of walkabledistance?: "+isWalkableDistance);

    }
} 