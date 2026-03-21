public class Question {
    private String questionText;
    private String questionAnswer;
    private int difficulty;

    public Question(String text1, String text2, int difficult) {
        questionText = text1;
        questionAnswer = text2;
        difficulty = difficult;

    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    @Override
    public String toString() {
        return questionText;
    }
}
