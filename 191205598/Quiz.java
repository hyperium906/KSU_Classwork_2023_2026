import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    ArrayList<Question> questions = new ArrayList<Question>();

    public void add_Question(){
        String text1, text2;
        int difficult;
        System.out.println("What is the question Text?");
        text1 = sc.nextLine();
        System.out.println("What is the answer?");
        text2 = sc.nextLine();
        System.out.println("How Difficult (1-3)?");
        difficult = sc.nextInt();
        System.out.println(" ");
        sc.nextLine();
        
       Question q1 = new Question(text1,text2,difficult);
       questions.add(q1);


    }
    public void removeQuestion(){
        int u1;
        System.out.println("Choose the question to remove?");
        for (int i =0; i<questions.toArray().length; i++){
            System.out.println(i+". "+questions.get(i));
        }
        u1 = sc.nextInt();
        if(u1<0||u1>questions.size()){
            System.out.println("Error");
        }
        else {
            questions.remove(u1);
        }
        sc.nextLine();

    }
    public void modifyQuestion(){
        String text1,text2;
        int u1,difficult;
        System.out.println("Choose the question to modify?");
        for (int i =0; i<questions.size(); i++){
            System.out.println(i+". "+questions.get(i));
        }
        u1 = sc.nextInt();
        sc.nextLine();
        if(u1<0||u1>questions.size()){
            System.out.println("Error");
        }
        else {
            System.out.println("What is the question Text?");
            text1 = sc.nextLine();
            System.out.println("What is the answer?");
            text2 = sc.nextLine();
            System.out.println("How Difficult (1-3)?");
            difficult = sc.nextInt();
            sc.nextLine();
            System.out.println(" ");
            Question q1 = new Question(text1,text2,difficult);
            questions.set(u1,q1);
        }
    }
    public void qiveQuiz (){

        String u1;
        int counter = 0;
        for (Question t: questions) {
            System.out.println(t);
            u1 = sc.nextLine();
            if (u1.equalsIgnoreCase(t.getQuestionAnswer())){
                System.out.println("Correct");
                counter++;
            }
            else {
                System.out.println("Inorrect");

            }

        }
        System.out.println("You got "+counter+" out of "+questions.size());


    }

}
