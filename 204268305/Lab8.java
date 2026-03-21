import java.util.Scanner;

class InvalidTimeException extends Exception{
    public InvalidTimeException(){}
    public InvalidTimeException(String error){super(error);}
}
public class Lab8 {
    public static int differenceTime (String u1) throws InvalidTimeException{
        int u2=0;
        int hour=0,min=0,sec=0;
        String[] splitStrings = u1.split(":",3);
        if (splitStrings.length<3){
            throw new InvalidTimeException("Enter a valid time");
        }
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    hour = Integer.parseInt(splitStrings[i]);
                } else if (i == 1) {
                    min = Integer.parseInt(splitStrings[i]);
                } else if (i == 2) {
                    sec = Integer.parseInt(splitStrings[i]);
                }
            }
            if (hour<0){
                throw new InvalidTimeException("Hour must be above 0");
            }
            else if (hour>24) {
                throw new InvalidTimeException("Hour must be below 24");
            }
            if (min>=60){
                throw new InvalidTimeException("Minutes must be less than 60");
            }
            if (sec>=60){
                throw new InvalidTimeException("Seconds must be less than 60");
            }


        u2 =  (hour*60*60) + (min*60) + sec;
        return u2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time1=0,time2=0;
        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String u1 = sc.nextLine();
            time1 = differenceTime(u1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            String u2 = sc.nextLine();
            time2 = differenceTime(u2);
            if (time1 > time2) {
                time1 = time1 - time2;
            } else {
                time1 = time2 - time1;
            }
            System.out.println("Difference in seconds: " + time1);
        }
        catch (Exception ef){
            System.out.println(ef.getMessage());
        }

    }
}
