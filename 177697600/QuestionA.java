import java.util.Scanner;
public class QuestionA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u1 ="";
        String finalText = "";
        System.out.println("[T-9 Dialing]\n" +
                "Enter your message, one letter at a time:");

        do {
            u1 = sc.nextLine();
            if(u1.equals("1")){
                finalText+="A";
            }
            else if (u1.equals("11")){
                finalText+="B";
            }
            else if (u1.equals("111")){
                finalText+="C";
            }
            else if (u1.equals("2")){
                finalText+="D";
            }
            else if (u1.equals("22")){
                finalText+="E";
            }
            else if (u1.equals("222")){
                finalText+="F";
            }
            else if (u1.equals("3")){
                finalText+="G";
            }
            else if (u1.equals("33")){
                finalText+="H";
            }
            else if (u1.equals("4")){
                finalText+="I";
            }
            else if (u1.equals("44")){
                finalText+="J";
            }
            else if (u1.equals("444")){
                finalText+="K";
            }
            else if (u1.equals("5")){
                finalText+="L";
            }
            else if (u1.equals("55")){
                finalText+="M";
            }
            else if (u1.equals("555")){
                finalText+="N";
            }
            else if (u1.equals("6")){
                finalText+="O";
            }
            else if (u1.equals("66")){
                finalText+="P";
            }
            else if (u1.equals("7")){
                finalText+="Q";
            }
            else if (u1.equals("77")){
                finalText+="R";
            }
            else if (u1.equals("777")){
                finalText+="S";
            }
            else if (u1.equals("7777")){
                finalText+="T";
            }
            else if (u1.equals("8")){
                finalText+="U";
            }
            else if (u1.equals("88")){
                finalText+="V";
            }
            else if (u1.equals("888")){
                finalText+="W";
            }
            else if (u1.equals("8888")){
                finalText+="X";
            }
            else if (u1.equals("9")){
                finalText+="Y";
            }
            else if (u1.equals("99")){
                finalText+="Z";
            }
            else if (u1.equals("0")){
                finalText+=" ";
            }

        }while (!(u1.equals("#")||u1.equals("*")));
        System.out.println("Message: "+finalText);

    }
}
