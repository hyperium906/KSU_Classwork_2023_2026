abstract class Mail {
    private String deliveryAddress  ;
    private String returnAddress;
    private double width;
    private double length;
    private int id;
    private static int nextID =0;
    public Mail(){
        deliveryAddress = " ";
        returnAddress = " ";
        width = 0d;
        length = 0d;
        id = nextID;
        nextID++;

    }
    public Mail(String deliveryAddress,String returnAddress,double width,double length){
        this.deliveryAddress =deliveryAddress;
        this.returnAddress = returnAddress;
        this.width = width;
        this.length = length;
        id = nextID;
        nextID++;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "["+getId()+"]"+
                "\n["+getDeliveryAddress()+"]"+
                "\n["+getReturnAddress()+"]";
    }
}
