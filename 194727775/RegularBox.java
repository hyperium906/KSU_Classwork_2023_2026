public class RegularBox extends Box {
    private String items;
    private double wieght;

    public RegularBox(){
        super();
        items = " ";
        wieght = 0d;
    }
    public RegularBox(String deliveryAddress,String returnAddress,double width,double length, double height,
                      int count,String items,double wieght){
        super(deliveryAddress,returnAddress,width,length,height,count);
        this.items = items;
        this.wieght = wieght;
    }

    public double getWieght() {
        return wieght;
    }

    public String getItems() {
        return items;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nItems: ["+getItems()+"]"+
                "\nCount: ["+getCount()+"]"
                +"\nWeight: ["+getWieght()+"]";
    }
}
