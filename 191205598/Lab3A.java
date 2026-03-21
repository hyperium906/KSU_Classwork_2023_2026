import java.util.Scanner;
public class Lab3A {
    public static void printMenu(){
        System.out.println("What would you like to do?\n" +
                "1. Add a question to the quiz\n" +
                "2. Remove a question from the quiz\n" +
                "3. Modify a question in the quiz\n" +
                "4. Take the quiz\n" +
                "5. Quit");
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        boolean quit = false;
        int u1;
        Quiz quiz1 = new Quiz();


        do {
            printMenu();
            u1 = sc.nextInt();

            switch (u1) {
                case 1:
                    quiz1.add_Question();


                break;

                case 2:
                    quiz1.removeQuestion();

                break;
                case 3:
                    quiz1.modifyQuestion();

                break;
                case 4:
                    quiz1.qiveQuiz();

                break;

                case 5:

                quit = true;

                break;


            }


        }while (quit==false);


    }
}
