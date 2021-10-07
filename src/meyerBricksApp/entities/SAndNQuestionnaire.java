package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionnaireService;

public class SAndNQuestionnaire extends Questionnaire{

    public SAndNQuestionnaire(){
        storeQuestionInA();
        storeQuestionInB();
    }

    @Override
    public void storeQuestionInA() {
        int count = 1;
        for (int i = 5; i < 10; i++) {
            super.getQuestionAs().put(count, QuestionnaireService.getSetA()[i]);
            count++;
        }
    }

    @Override
    public void storeQuestionInB() {
        int count = 1;
        for (int i = 5; i < 10; i++) {
            super.getQuestionBs().put(count, QuestionnaireService.getSetB()[i]);
            count++;
        }
    }

    @Override
    public int getIDNumber() {
        return IDNUMBER;
    }
}
