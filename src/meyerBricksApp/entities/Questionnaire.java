package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.DataStore.services.QuestionService;

import java.util.HashMap;
import java.util.Map;

public abstract class Questionnaire {
    private static Map<Integer, String> questionAs = new HashMap<>();
    private static Map<Integer, String> questionBs = new HashMap<>();
    private ChoiceType choice;

    public Questionnaire(){
        setQuestionInA();
        setQuestionInB();
    }
    protected void setQuestionInA() {
        for (int i = 0; i < QuestionService.getSetA().length; i++) {
            Questionnaire.questionAs.put(QuestionService.generateNumber()+1, QuestionService.getSetA()[i]);
        }
    }
    protected void setQuestionInB() {
        QuestionService.resetControl();
        for (int i = 0; i < QuestionService.getSetB().length; i++) {
            questionBs.put(QuestionService.generateNumber()+1, QuestionService.getSetB()[i]);
        }
    }
    private static void setQuestionAs(Map<Integer, String> questionAs) {
        Questionnaire.questionAs = questionAs;
    }

    private void setQuestionBs(Map<Integer, String> questionBs) {
        Questionnaire.questionBs = questionBs;
    }

    public Map<Integer, String> getQuestionAs() {
        return questionAs;
    }
    public Map<Integer, String> getQuestionBs() {
        return questionBs;
    }

    private void setQuestions(Map<Integer, String> questions) {
        questionAs = questions;
    }
}
