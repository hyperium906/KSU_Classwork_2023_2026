import java.util.ArrayList;

public class Bus {
     ArrayList <Person> passengers;
     private static int nextInt;
     private int busID;

     Bus (){
         passengers = new ArrayList<Person>();
         busID=nextInt;
         nextInt++;
     }

    public int getID() {

         return busID;
    }
    public void addPerson(Person person,int u1){
        passengers.set(u1,(person));

    }

    public void addPerson(Person person){
         passengers.add((person));

    }
    // HELP with REMOVE PERSON
    public boolean removePerson (Person person){
         if (passengers.contains(person)){
             passengers.remove(person);
             return true;
         }
         else {
             return false;
         }
    }
    //This one down here too
    public Person findPerson(String person){
         for (int i = 0; i<passengers.size(); i++){
             if(passengers.get(i).getName().equalsIgnoreCase(person)){
                 return passengers.get(i);

             }
         }
         return null;

    }
    public static boolean transferBus(Bus bus1,Bus bus2,Person person){
         if(bus1.passengers.contains(person)){
             bus1.removePerson(person);
             bus2.addPerson(person);
             return true;
         }
         else{
             return false;
         }
    }


    public String getPassengers(){
         String x= "";
        for (Person y: passengers) {
           x+=y.toString()+"\n";

        }
        return x;

    }

    @Override
    public String toString() {
         //String i = String.valueOf(getID());
         return ""+getID();
    }
}
