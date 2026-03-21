import java.util.ArrayList;

public class Dispatcher {
    ArrayList<Bus> busQueue = new ArrayList<Bus>();

    public int addBus(Bus bus){
        busQueue.add(bus);
        return busQueue.indexOf(bus);

    }
    public int addBus(Bus bus, int positon){
        if (positon<0 || positon>busQueue.size()){
            busQueue.remove(bus);
            busQueue.add(bus);}
        else {
            busQueue.set(positon,bus);
        }
        return busQueue.indexOf(bus);}


    public Bus findBus(int id){

        for (Bus name : busQueue){
            if (name.getID()==id){
                return name;
            }
        }
        return null;
    }
    // This ONE TOO
    public Bus removeBus(int id){
        for(Bus name2: busQueue){
            if (name2.getID()==id){
                busQueue.remove(name2);
                return name2;
            }
        }
         return null;

    }
    // THIS ONE TOO
    public Bus dispatchBus(){
        if(busQueue.isEmpty()){
            return null;
        }
        else {
           Bus b = busQueue.get(0);
           busQueue.remove(0);
           return b;
        }


    }



    @Override
    public String toString() {
        String v = "";
        for (Bus t: busQueue) {
            v+=t.toString()+"\n";
        }
        return v;
    }
}
