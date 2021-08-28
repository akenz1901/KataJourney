package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;

public class EAndIQuestionnaire extends Questionnaire{

    public void setQuestionInA(){
        for (int i = 0; i < 5; i++) {
            super.getQuestionAs().put(QuestionService.generateNumber()+1, QuestionService.getSetA()[i]);
        }
    }
    public void setQuestionInB(){
        QuestionService.resetControl();
        for (int i = 0; i < 5; i++) {
            super.getQuestionBs().put(QuestionService.generateNumber()+1, QuestionService.getSetB()[i]);
        }
    }
}
