public class TheDrum {
    private TeaBox nextTeaBox = null;

    TheDrum(int j,int e,int l){
         for (int i = 0; i<j ; i++){
                TeaBox currentTeaBox = new TeaBox("Jasmine",nextTeaBox);
                nextTeaBox = currentTeaBox;}
         for (int i = 0; i<e; i++){
            TeaBox currentTeaBox = new TeaBox("Earl Grey",nextTeaBox);
            nextTeaBox = currentTeaBox;
            }
         for (int i = 0; i<l; i++){
            TeaBox currentTeaBox = new TeaBox("Lemon",nextTeaBox);
            nextTeaBox = currentTeaBox;
        }
    }

    public TeaBox getNextTeaBox() {
        if (nextTeaBox==null){
            return null;
        }
        TeaBox current = nextTeaBox;
        nextTeaBox = nextTeaBox.getNextTea();
        return current;
    }

}
