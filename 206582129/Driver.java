import java.util.Scanner;
import java.io.*;

public class Driver {
    public static void processComplaint(Complaint c)throws StateComplaintException{
        if (c.getCauseOfAction().equals("Equal Protection Challenge")||c.getCauseOfAction().equals("Title IX Workplace Discrimination")||c.getCauseOfAction().equals("Prisoner Civil Rights Claim")||c.getCauseOfAction().equals("Fair Labor Standard Act Claim")){
            return;
        }
        if (c.getPlaintiffCitizenship().equals(c.getDefendandCitizenship())){
            throw new StateComplaintException("Lack of Diversity");
        }
        if (c.getAmountInControversy()<=75000){
            throw new StateComplaintException("Amount in controversy less than or equal to $75000");
        }
        if (c.getDefendandCitizenship().equals(c.getOriginalStateOfFilling())) {
            throw new StateComplaintException("No prejudice through diversity");
        }
    }
    public static void main(String[] args) {
        System.out.println("[Federal Court Complaint Processor]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to process: ");
        String u1 = sc.nextLine();
        int counterAccepted = 0;
        int counterRemanded = 0;
        PrintWriter pw1 = null;
        PrintWriter pw = null;
        try{
            pw1=new PrintWriter("src//accepted");
            pw = new PrintWriter("src//remanded");
            File one = new File("src//"+u1);
            Scanner scanner = new Scanner(one);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] array;
                array = data.split("," );
                Complaint c = new Complaint(array[0],array[2],array[3],array[4],Double.valueOf(array[1]));
                try {
                    processComplaint(c);
                    counterAccepted++;
                    pw1.println(
                             "Case ID: "+c.getId()+ "\n" +
                             "Cause of action: "+c.getCauseOfAction()+ "\n" +
                             "Amount in Controversy: $"+c.getAmountInControversy()+"\n" +
                             "Plaintiff’s Citizenship: "+c.getPlaintiffCitizenship()+"\n" +
                             "Defendant’s Citizenship: "+c.getDefendandCitizenship()+"\n" +
                             "Originally filed in: "+c.getOriginalStateOfFilling()+"\n"+
                            "==============================");
                }
                catch (StateComplaintException z){
                    counterRemanded++;
                    pw.println(
                            "Case ID: "+c.getId()+ "\n" +
                            "Cause of action: "+c.getCauseOfAction()+ "\n" +
                            "Amount in Controversy: $"+c.getAmountInControversy()+"\n" +
                            "Plaintiff’s Citizenship: "+c.getPlaintiffCitizenship()+"\n" +
                            "Defendant’s Citizenship: "+c.getDefendandCitizenship()+"\n" +
                            "Originally filed in: "+c.getOriginalStateOfFilling()+"\n\nReason: "+z.getMessage()+
                             "\n"+"==============================");
                }
            }
            pw.close();
            pw1.close();
        }
        catch (FileNotFoundException f){
            System.out.println(f.getMessage());
        }
        finally {
            System.out.println("Processing complete. Accepted cases written to accepted.txt and remanded cases written to\n" +
                    "remanded.txt\n" +
                    "Number of remanded cases: "+ counterRemanded+"\n" +
                    "Number of accepted cases: "+counterAccepted+"\n" +
                    "Shutting down...");
        }


    }
}
