public class Complaint {
    private String causeOfAction;
    private String plaintiffCitizenship;
    private String defendandCitizenship;
    private String originalStateOfFilling;
    private double amountInControversy;
    private int id;
    private static int nextID = 1;

    public int getId() {
        return id;
    }

    public double getAmountInControversy() {
        return amountInControversy;
    }

    public String getCauseOfAction() {
        return causeOfAction;
    }

    public String getDefendandCitizenship() {
        return defendandCitizenship;
    }

    public String getOriginalStateOfFilling() {
        return originalStateOfFilling;
    }

    public String getPlaintiffCitizenship() {
        return plaintiffCitizenship;
    }

    Complaint(String one, String two,String three,String four,double one1){
        id = nextID;
        nextID++;
        causeOfAction = one;
        plaintiffCitizenship = two;
        defendandCitizenship = three;
        originalStateOfFilling = four;
        amountInControversy =one1;

    }
}
