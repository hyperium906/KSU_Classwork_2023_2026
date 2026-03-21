import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        System.out.println("[DNA Reverser and Translator]");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence:");
        String u1 = scanner.nextLine();
        String u2 = "";
        if( DNALib.validator(u1)==true){
            u2 = DNALib.reverser(u1);
            u2=DNALib.inverser(u2);
            u2 = DNALib.translator(u2);
            System.out.println("Your DNA sequence reversed and translated is: ");
            System.out.println(u2);
        }
        else {
            System.out.println("Your DNA sequence is not valid");
        }
    }
}
