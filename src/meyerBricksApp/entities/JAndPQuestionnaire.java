package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionnaireService;

public class JAndPQuestionnaire extends Questionnaire{

    public JAndPQuestionnaire(){
        storeQuestionInA();
        storeQuestionInB();
        IDNUMBER = 2;
    }

    @Override
    public void storeQuestionInA() {
        int count = 1;
        for (int i = 10; i < 15; i++) {
            super.getQuestionAs().put(count, QuestionnaireService.getSetA()[i]);
            count++;
        }
    }

    @Override
    public void storeQuestionInB() {
        int count = 1;
        for (int i = 10; i < 15; i++) {
            super.getQuestionBs().put(count, QuestionnaireService.getSetB()[i]);
            count++;
        }
    }

    @Override
    public int getIDNumber() {
        return IDNUMBER;
    }
}
