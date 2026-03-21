public class Employee extends Thread {
    private TheDrum pallet;
    private int totalJasmine;
    private int totalEarlGrey;
    private int totalLemon;
    private int id;
    private static int nextID = 0;

    Employee(TheDrum theDrum){
        this.pallet = theDrum;
        totalJasmine = 0;
        totalEarlGrey = 0;
        totalLemon = 0;
        id = nextID;
        nextID++;
    }
    public int totalTea(){
        return totalLemon+totalJasmine+totalEarlGrey+totalLemon;
    }

    @Override
    public void run() {
        TeaBox current = pallet.getNextTeaBox();
        while (current!=null){
            switch (current.getTeaType()){
                case "Jasmine":
                    totalJasmine++;
                break;
                case "Earl Grey":
                    totalEarlGrey++;
                break;
                case "Lemon":
                    totalLemon++;
                break;
            }
            if (current.getNextTea() == null){
                break;
            }
            current = pallet.getNextTeaBox();
        }

    }

    @Override
    public String toString() {
        return "Employee "+id+ " has unloaded "+ totalJasmine+" boxes of Jasmine Tea, "+totalEarlGrey+" boxes of Earl Grey Tea, and "+totalLemon+" boxes of Lemon Tea.";
    }
}
