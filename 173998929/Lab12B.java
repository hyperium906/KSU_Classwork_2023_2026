import java.util.Scanner;
class Dog {
    int age;
    double weight;
    String name;
    String furColor;
    String breed;
    Dog(int age1, double weight,String name, String furColor,String breed){
        age = age1;
        this.weight = weight;
        this.name = name;
        this.furColor = furColor;
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Woof! Woof!");

    }
    public void rename(String u1){
        name = u1;

    }
    public void eat(double u1){
        weight += u1;
    }

}

public class Lab12B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are about to create a dog ");
        int u1;
        System.out.print("How old is the dog: ");
        u1= sc.nextInt();
        double u2;
        System.out.print("How much does the dog weigh: ");
        u2= sc.nextDouble();
        String u3;
        sc.nextLine();
        System.out.print("What is the dog's name: ");
        u3=sc.nextLine();
        String u4;
        //sc.nextLine();
        System.out.print("What color is the dog: ");
        u4=sc.nextLine();
        String u5;
        //sc.nextLine();
        System.out.print("What breed is the dog: ");
        u5=sc.nextLine();

        System.out.println(" " );

        Dog One = new Dog(u1,u2,u3,u4,u5);
        System.out.println(One.name+" is a "+One.age+" year old "+ One.furColor+" "+One.breed+" that weighs "+One.weight+" lbs.");
        System.out.println(" " );
        One.bark();
        double u6;
        System.out.print(One.name+" is hungry, how much should he eat: ");
        u6 = sc.nextDouble();
        One.eat(u6);
        sc.nextLine();
        String u7;
        System.out.print(One.name+" isn't a very good name. What should they be renamed to: ");
        u7 = sc.nextLine();

        System.out.println(" ");

        One.rename(u7);
        System.out.println(One.name+" is a "+One.age+" year old "+ One.furColor+" "+One.breed+" that weighs "+One.weight+" lbs.");


    }
}
