public class Periodical extends Item {
    private int issueNum;

    public Periodical(){

    }
    public Periodical(int issueNum, String u1){
        this.issueNum = issueNum;
        setTitle(u1);

    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    public String getListing() {
        return "Periodical Title - " + getTitle()+
                "\n"+"Issue # - "+ issueNum;
    }
}
