package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;

public class SAndNQuestionnaire extends Questionnaire{

    @Override
    public void setQuestionInA() {
        int count = 1;
        for (int i = 5; i < 10; i++) {
            super.getQuestionAs().put(count, QuestionService.getSetA()[i]);
            count++;
        }
    }

    @Override
    public void setQuestionInB() {
        int count = 1;
        for (int i = 5; i < 10; i++) {
            super.getQuestionBs().put(count, QuestionService.getSetB()[i]);
            count++;
        }
    }
}
