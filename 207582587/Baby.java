import java.util.Random;

public class Baby implements Runnable{
     int time;
     String name;
    Baby(String name){
    this.name = name;
    Random random = new Random();
    this.time = random.nextInt(5000);
    }



    public void run(){
        try {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is "+ name+", I am awake, feed me!!!");
        }
        catch (InterruptedException x){
            System.out.println("Interrupted Exception: " + x.getMessage());
        }
    };
}
