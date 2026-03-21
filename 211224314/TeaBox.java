public class TeaBox {
    private String teaType;
    private TeaBox nextTea;

    TeaBox(String teaType, TeaBox teaBox){
        this.teaType = teaType;
        this.nextTea = teaBox;

    }

    public String getTeaType() {
        return teaType;
    }

    public TeaBox getNextTea() {
        return nextTea;
    }
}
