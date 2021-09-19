package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;

import java.util.HashMap;
import java.util.Map;

public abstract class Questionnaire {
    private final Map<Integer, String> questionAs = new HashMap<>(5);
    private final Map<Integer, String> questionBs = new HashMap<>(5);
    private ChoiceType preference;
    protected static int IDNUMBER;

    protected abstract  void storeQuestionInA();
    protected abstract void storeQuestionInB();

    public abstract int getIDNumber();

    protected ChoiceType getPreference() {
        return preference;
    }

    protected void setPreference(ChoiceType preference) {
        this.preference = preference;
    }

    public Map<Integer, String> getQuestionAs() {
        return questionAs;
    }
    public Map<Integer, String> getQuestionBs() {
        return questionBs;
    }
}
