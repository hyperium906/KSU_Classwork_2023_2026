public class BlueRayDisk {
    public String title;
    public String director;
    public int yearofrelease;
    public double cost;

    BlueRayDisk(String title, String director,int yearof, double cost){
        this.title = title;
        this.director = director;
        this.yearofrelease = yearof;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$"+cost+" "+yearofrelease+" "+title+", "+director;
    }
}
