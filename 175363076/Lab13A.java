public class Lab13A {
    public static void main(String[] args) {
        System.out.println("Year 2020: ");
        BuildingBlueprint building1 = new BuildingBlueprint();
        BuildingBlueprint building2 = new BuildingBlueprint(30,30,.75f,false);
        int v =  (int) (building1.getPercent() * 100);
        int v2 =  (int) (building2.getPercent() * 100);
        System.out.println("Building 1 has "+building1.getStories()+" floors, "+building1.getApartments()+
                " apartments, and is "+(v)+"% occupied. Full? "+(building1.getOccupied()));
        System.out.println("Building 2 has "+building2.getStories()+" floors, "+building2.getApartments()+
                " apartments, and is "+(v2)+"% occupied. Full? "+(building2.getOccupied()));

        System.out.println(" ");
        System.out.println("Many years pass.");
        System.out.println(" ");
        System.out.println("Year 2043: ");

        building1.overload(0f);
        building2.overload(1f);
        int v3 =  (int) (building1.getPercent() * 100);
        int v4 =  (int) (building2.getPercent() * 100);

        System.out.println("Building 1 has "+building1.getStories()+" floors, "+building1.getApartments()+
                " apartments, and is "+(v3)+"% occupied. Full? "+(building1.getOccupied()));
        System.out.println("Building 2 has "+building2.getStories()+" floors, "+building2.getApartments()+
                " apartments, and is "+(v4)+"% occupied. Full? "+(building2.getOccupied()));
        System.out.println(" ");
        System.out.println("Looks like people prefer taller buildings.");
        //System.out.println(building2.getPercent());





    }
}
class  BuildingBlueprint{
     private int stories;
     private int apartments;
     private float percent;
     private boolean occupied;
    BuildingBlueprint(int s, int a, float p, boolean o){
        stories = s;
        apartments = a;
        percent = p;
        occupied = o;
    }
    BuildingBlueprint(){
        stories = 10;
        apartments = 20;
        percent = 1.0f;
        occupied = true;
    }
    public boolean overload(float occupied1){
        percent = occupied1;
        if (percent==1){
             occupied = true;
        }
        else if (percent>=0&&percent<1){
            occupied = false;
        }
        return occupied;
    }
    public boolean getOccupied(){
        return occupied;
    }
    public int getStories(){
        return stories;
    }
    public  int getApartments(){
        return apartments;
    }
    public float getPercent(){
        return percent;
    }




}
