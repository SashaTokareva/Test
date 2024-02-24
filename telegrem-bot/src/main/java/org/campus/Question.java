package org.campus;

import java.util.ArrayList;
import java.util.List;
public class Question {
    private String text;
    private Boolean hasAnswer = false;
    private Boolean sendQuestionToUser = false;
    private List<Answer> answer = new ArrayList<>();

    public Question(String text, List<Answer> answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getHasAnswer() {
        return hasAnswer;
    }

    public void setHasAnswer(Boolean hasAnswer) {
        this.hasAnswer = hasAnswer;
    }

    public Boolean getSendQuestionToUser() {
        return sendQuestionToUser;
    }

    public void setSendQuestionToUser(Boolean sendQuestionToUser) {
        this.sendQuestionToUser = sendQuestionToUser;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
