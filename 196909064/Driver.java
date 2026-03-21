import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u1;
        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        u1 = sc.nextInt();
        FibIteration i = new FibIteration();
        FibFormula j = new FibFormula();
        System.out.println("Fib of "+u1+" by iteration is: "+ i.calculate_fib(u1));
        System.out.println("Fib of "+u1+" by formula is: "+j.calculate_fib(u1));

    }
}
