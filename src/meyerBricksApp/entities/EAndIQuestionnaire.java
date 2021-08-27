package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;

import java.util.HashMap;
import java.util.Map;

public class EAndIQuestionnaire extends Questionnaire{
    Map<Integer, String> questionAs = new HashMap<>(5);
    Map<Integer, String> questionBs = new HashMap<>(5);

    public EAndIQuestionnaire(){
        setQuestionInA();
        setQuestionInB();
    }
    @Override
    protected void setQuestionInA() {
        for (int i = 0; i < questionAs.size(); i++) {
            questionAs.put(QuestionService.generateNumber()+1, QuestionService.getSetA()[i]);
        }
    }

    @Override
    protected void setQuestionInB() {
        QuestionService.resetControl();
        for (int i = 0; i < questionBs.size(); i++) {
            questionBs.put(QuestionService.generateNumber()+1, QuestionService.getSetA()[i]);
        }
    }

    public Map<Integer, String> getQuestionA() {
        return questionAs;
    }

    public Map<Integer, String> getQuestionB() {
        return questionBs;
    }
}
