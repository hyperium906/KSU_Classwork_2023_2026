import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0,counter2= 0, counter3 = 0;
        System.out.print("File 1 Name? ");
        String u1= scanner.nextLine();
        System.out.print("File 2 Name? ");
        String u2= scanner.nextLine();
        File file1 = new File("src//"+u1);
        File file2 = new File("src//"+u2);
        try{
            Scanner sc = new Scanner (file1);
            Scanner sc2 = new Scanner (file2);
            while (sc.hasNextLine()){
                sc.nextLine();
                counter2++;
            }
            while (sc2.hasNextLine()){
                sc2.nextLine();
                counter3++;
            }
            if (counter2!=counter3){
                throw new IOException("Files have different number of lines");
            }

        //file1 = new File("/Users/jyothitari/CSE1322/Lab9/src/"+u1);
        //file2 = new File("src//"+u2);
        String line= "";
        String line2 = "";
        sc = new Scanner (file1);
        sc2 = new Scanner (file2);

        while (sc.hasNextLine()){
            counter++;
            line = sc.nextLine();
            line2 = sc2.nextLine();
            if (!line.equals(line2)){
                System.out.println("Line "+counter+"\n<"+line+"\n>"+line2);
            }
        }
        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
