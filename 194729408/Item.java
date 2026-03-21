abstract class Item {
    private String title ;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public Item(){
        title = " ";
    }
    public Item(String u1) {
        title = u1;
    }
    public abstract String getListing();

    @Override
    public String toString() {
        return title;
    }
}
