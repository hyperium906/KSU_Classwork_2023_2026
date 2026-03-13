import java.util.Scanner;
class Autograder{
    private int graderId;
    private String courseName;
    private int assignmentNumber;
    private String right_answer;
    private boolean give_extra_credit;

    public Autograder(){
        graderId = 921232;
        courseName =  "CSE 1321";
        assignmentNumber = 1;
        right_answer = "PRINT ('Hello world!');";
        give_extra_credit = true;
    }
    public Autograder(int graderId,String courseName,int assignmentNumber,String right_answer,boolean give_extra_credit)
    {
        this.graderId = graderId;
        this. courseName = courseName;
        this. assignmentNumber = assignmentNumber;
        this.right_answer = right_answer;
        this.give_extra_credit = give_extra_credit;
    }

    public int getGraderId() {
        return graderId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAssignmentNumber() {
        return assignmentNumber;
    }
    public int gradeAnswer(String u1){
        int answer=0;
        if(u1.equals(right_answer)){
            give_extra_credit = true;
            answer +=100;
            if (give_extra_credit==true){
                answer+=5;
            }
        }
      else{
            answer = 0;
        }
        return answer;
    }
}
public class QuestionC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autograder one = new Autograder();
        String u1;
        System.out.println("[CCSE 1321 Autograder]");
        System.out.println(" ");
        System.out.print("Enter your code for CSE 1321, Assignment 1: ");
        u1 = sc.nextLine();
        System.out.println("Grader #"+one.getGraderId()+": You earned a "+one.gradeAnswer(u1)+" for "
                +one.getCourseName()+", Assignment "+ one.getAssignmentNumber()+".");


    }
}
