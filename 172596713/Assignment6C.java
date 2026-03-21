import java.util.Scanner;
public class Assignment6C {
    public static int surpriseFunction(int u1, int u2){
        return u1 + u2;
    }
    public static float surpriseFunction(float u1, float u2){
        return u1 / u2;
    }
    public static double surpriseFunction(double u1, double u2){
        return u1 % u2;
    }
    public static String surpriseFunction(char u1, char u2){
        String x = "" +u1+u2;
        return x;
    }
    public static boolean surpriseFunction(boolean u1, boolean u2){
        return u1 && u2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Overloaded Surprise Function]");
        //System.out.println(" ");
        System.out.print("What data type do you want to enter? ");
        String u1;
        u1= sc.nextLine();
        switch (u1.toLowerCase()){
            case "integer":
                int U1,U2;
                System.out.print("Value #1: ");
                U1 = sc.nextInt();
                System.out.print("Value #2: ");
                U2 = sc.nextInt();
                System.out.println("Calling surprise_function()...");
                surpriseFunction(U1,U2);
                System.out.println("The result is "+  surpriseFunction(U1,U2));
            break;
            case "boolean":
                boolean User1,User2;
                System.out.print("Value #1: ");
                User1 = Boolean.parseBoolean(sc.next());
                System.out.print("Value #2: ");
                User2 = Boolean.parseBoolean(sc.next());
                System.out.println("Calling surprise_function()...");
                surpriseFunction(User1,User2);
                System.out.println("The result is "+  surpriseFunction(User1,User2));
            break;
            case "float":
                float User11,User22;
                System.out.print("Value #1: ");
                User11 = sc.nextFloat();
                System.out.print("Value #2: ");
                User22 = sc.nextFloat();
                System.out.println("Calling surprise_function()...");
                surpriseFunction(User11,User22);
                System.out.println("The result is "+  surpriseFunction(User11,User22));
            break;
            case "double":
                double User111,User222;
                System.out.print("Value #1: ");
                User111 = sc.nextDouble();
                System.out.print("Value #2: ");
                User222 = sc.nextDouble();
                System.out.println("Calling surprise_function()...");
                surpriseFunction(User111,User222);
                System.out.println("The result is "+  surpriseFunction(User111,User222));
            break;
            case "char":
                char User1111,User2222;
                System.out.print("Value #1: ");
                User1111 = sc.next().charAt(0);
                System.out.print("Value #2: ");
                User2222 = sc.next().charAt(0);
                System.out.println("Calling surprise_function()...");
                surpriseFunction(User1111,User2222);
                System.out.println("The result is "+  surpriseFunction(User1111,User2222));

        }


    }
}
