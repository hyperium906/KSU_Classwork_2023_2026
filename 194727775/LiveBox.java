public class LiveBox extends Box{
    private String Animal;
    private int age;

    public LiveBox(){
        super();
        Animal = " ";
        age = 0;
    }
    public LiveBox(String deliveryAddress,String returnAddress,double width,double length, double height,
                   int count,String Animal,int age){
        super(deliveryAddress,returnAddress,width,length,height,count);
        this.Animal = Animal;
        this.age = age;
    }

    public String getAnimal() {
        return Animal;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAnimal: ["+getAnimal()+"] "
                +"\nCount: ["+getCount()+"] "
                +"\nAge (Days): ["+getAge()+"]";
    }
}
