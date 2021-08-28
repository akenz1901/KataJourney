package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.DataStore.services.QuestionService;

import java.util.HashMap;
import java.util.Map;

public abstract class Questionnaire {
    private final Map<Integer, String> questionAs = new HashMap<>();
    private final Map<Integer, String> questionBs = new HashMap<>();

    public abstract  void setQuestionInA();
    public abstract void setQuestionInB();

    public Map<Integer, String> getQuestionAs() {
        return questionAs;
    }
    public Map<Integer, String> getQuestionBs() {
        return questionBs;
    }
}
