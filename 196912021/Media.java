abstract class Media {
    private String fileName;
    private int id;
    private static int nextID = 1;

    Media(){
        fileName =" ";
        id = nextID;
        nextID++;

    }
    Media(String fileName){
        this.fileName = fileName;
        id = nextID;
        nextID++;

    }

    public String getFileName() {
        return fileName;
    }

    public int getId() {
        return id;
    }
}
