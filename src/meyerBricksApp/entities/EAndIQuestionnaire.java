package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionnaireService;

public class EAndIQuestionnaire extends Questionnaire{

    public EAndIQuestionnaire(){
        storeQuestionInA();
        storeQuestionInB();
    }

    public int getNumber(){
        return IDNUMBER;
    }
    public void storeQuestionInA(){
        for (int i = 0; i < 5; i++) {
            super.getQuestionAs().put(QuestionnaireService.generateNumber()+1, QuestionnaireService.getSetA()[i]);
        }
    }
    public void storeQuestionInB(){
        QuestionnaireService.resetControl();
        for (int i = 0; i < 5; i++) {
            super.getQuestionBs().put(QuestionnaireService.generateNumber()+1, QuestionnaireService.getSetB()[i]);
        }
    }

    @Override
    public int getIDNumber() {
        return IDNUMBER;
    }
}
