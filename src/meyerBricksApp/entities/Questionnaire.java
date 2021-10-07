package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Questionnaire {
    private final Map<Integer, String> questionAs = new HashMap<>(5);
    private final Map<Integer, String> questionBs = new HashMap<>(5);
    protected static int IDNUMBER;
    private ChoiceType choice;


    public ChoiceType getChoice() {
        return choice;
    }

    public void setChoice(ChoiceType choice) {
        this.choice = choice;
    }

    protected List<String> temporaryQuestionBank = new ArrayList<>(5);

    public List<String> getTemporaryQuestionBank() {
        return temporaryQuestionBank;
    }

    private void setTemporaryQuestionBank(List<String> temporaryQuestionBank) {
        this.temporaryQuestionBank = temporaryQuestionBank;
    }

    protected abstract  void storeQuestionInA();
    protected abstract void storeQuestionInB();

    public abstract int getIDNumber();


    public Map<Integer, String> getQuestionAs() {
        return questionAs;
    }
    public Map<Integer, String> getQuestionBs() {
        return questionBs;
    }
}
