abstract class Envelope extends Mail {
    private double thickness;


    public Envelope(){
       super();
       thickness = 0d;
    }
    public Envelope(String deliveryAddress,String returnAddress,double width,double length,double thickness){
        super(deliveryAddress,returnAddress, width, length);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return    "["+getId()+"]"+
                "\n["+getDeliveryAddress()+"]"+
                "\n["+getReturnAddress()+"]"+
                "\n["+getWidth()+"] x ["+getLength()+"] x ["+getThickness()+"]";

    }
}
