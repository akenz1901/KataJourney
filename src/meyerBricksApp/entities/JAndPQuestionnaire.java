package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;

public class JAndPQuestionnaire extends Questionnaire{
    @Override
    public void setQuestionInA() {
        int count = 1;
        for (int i = 10; i < 15; i++) {
            super.getQuestionAs().put(count, QuestionService.getSetA()[i]);
            count++;
        }
    }

    @Override
    public void setQuestionInB() {

    }
}
