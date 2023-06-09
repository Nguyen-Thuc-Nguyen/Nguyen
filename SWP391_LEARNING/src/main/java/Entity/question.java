package Entity;

public class question {
    private int questionID;
    private int typeID;
    private String question;
    private String answer;

    public question(int questionID, int typeID, String question, String answer) {
        this.questionID = questionID;
        this.typeID = typeID;
        this.question = question;
        this.answer = answer;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
