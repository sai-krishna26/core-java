class Solution{
     String date;

    Solution(String date){
        this.date=date;
    }
    void Convert(){
        String[] parts=date.split("-");

        int yearNumber=Integer.parseInt(parts[0]);
        int monthNumber=Integer.parseInt(parts[1]);
        int dayNumber=Integer.parseInt(parts[2]);

        String binaryYear=Integer.toBinaryString(yearNumber);
        String binaryMonth=Integer.toBinaryString(monthNumber);
        String binaryDay=Integer.toBinaryString(dayNumber);

        System.out.println(binaryYear+"-"+binaryMonth+"-"+binaryDay);         
    }
}