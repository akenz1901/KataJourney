package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;

public class TAndFQuestionnaire extends Questionnaire{
    @Override
    public void setQuestionInA() {
        int count = 1;
        for (int i = 15; i < 20; i++) {
            super.getQuestionAs().put(count, QuestionService.getSetA()[i]);
            count++;
        }
    }

    @Override
    public void setQuestionInB() {
        int count = 1;
        for (int i = 15; i < 20; i++) {
            super.getQuestionBs().put(count, QuestionService.getSetB()[i]);
            count++;
        }
    }
}
