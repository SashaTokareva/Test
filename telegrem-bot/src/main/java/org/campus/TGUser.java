package org.campus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TGUser {
    private Long userId;
    private List<Question> guetions = new ArrayList<>();

    private Integer backendPoint = 0;
    private Integer frontendPoint = 0;
    private Integer gaPoint = 0;

    public TGUser(Long userId) {
        this.userId = userId;
        fillQuestions();
    }

    private void fillQuestions() {
        guetions.add(new Question(Texts.Q1, Arrays.asList(
                new Answer(LanguageType.FRONTEND, Texts.Q1_A1),
                new Answer(LanguageType.FRONTEND, Texts.Q1_A2),
                new Answer(LanguageType.BACKED, Texts.Q1_A3),
                new Answer(LanguageType.QA, Texts.Q1_A4)
        )));

        guetions.add(new Question(Texts.Q2, Arrays.asList(
                new Answer(LanguageType.FRONTEND, Texts.Q2_A1),
                new Answer(LanguageType.BACKED, Texts.Q2_A2),
                new Answer(LanguageType.QA, Texts.Q2_A3),
                new Answer(LanguageType.FRONTEND, Texts.Q2_A4)
        )));

        guetions.add(new Question(Texts.Q3, Arrays.asList(
                new Answer(LanguageType.QA, Texts.Q3_A1),
                new Answer(LanguageType.FRONTEND, Texts.Q3_A2),
                new Answer(LanguageType.FRONTEND, Texts.Q3_A3),
                new Answer(LanguageType.BACKED, Texts.Q3_A4)
        )));

        guetions.add(new Question(Texts.Q4, Arrays.asList(
                new Answer(LanguageType.FRONTEND, Texts.Q4_A1),
                new Answer(LanguageType.FRONTEND, Texts.Q4_A2),
                new Answer(LanguageType.QA, Texts.Q4_A3),
                new Answer(LanguageType.BACKED, Texts.Q4_A4)
        )));

        guetions.add(new Question(Texts.Q5, Arrays.asList(
                new Answer(LanguageType.FRONTEND, Texts.Q5_A1),
                new Answer(LanguageType.QA, Texts.Q5_A2),
                new Answer(LanguageType.FRONTEND, Texts.Q5_A3),
                new Answer(LanguageType.QA, Texts.Q5_A4)
        )));

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Question> getGuetions() {
        return guetions;
    }

    public void setGuetions(List<Question> guetions) {
        this.guetions = guetions;
    }

    public Integer getBackendPoint() {
        return backendPoint;
    }

    public void setBackendPoint(Integer backendPoint) {
        this.backendPoint = backendPoint;
    }

    public Integer getFrontendPoint() {
        return frontendPoint;
    }

    public void setFrontendPoint(Integer frontendPoint) {
        this.frontendPoint = frontendPoint;
    }

    public Integer getGaPoint() {
        return gaPoint;
    }

    public void setGaPoint(Integer gaPoint) {
        this.gaPoint = gaPoint;
    }
}
