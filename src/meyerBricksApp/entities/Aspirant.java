package meyerBricksApp.entities;

import java.util.HashMap;
import java.util.Map;

public class Aspirant {
    String[] questionnaireScore = {"Extrovert", "Introvert", "Sensing", "Intuition", "Thinking", "Feeling", "Judging", "Perceiving"};
    Map<String, Integer> scores = new HashMap<>();

    public int increaseExtrovertScore(){
        scores.put(questionnaireScore[0], +1);
        return scores.get(questionnaireScore[0]);
    }
    public int increaseIntrovertScore(){
        scores.put(questionnaireScore[1], +1);
        return scores.get(questionnaireScore[1]);
    }
    public int increaseSensingScore(){
        scores.put(questionnaireScore[2], +1);
        return scores.get(questionnaireScore[2]);
    }
    public int increaseIntuitionScore(){
        scores.put(questionnaireScore[3], +1);
        return scores.get(questionnaireScore[3]);
    }
    public int increaseThinkingScore(){
        scores.put(questionnaireScore[4], +1);
        return scores.get(questionnaireScore[4]);
    }
    public int increaseFeelingScore(){
        scores.put(questionnaireScore[5], +1);
        return scores.get(questionnaireScore[1]);
    }
    public int increaseJudgingScore(){
        scores.put(questionnaireScore[6], +1);
        return scores.get(questionnaireScore[6]);
    }
    public int increasePerceivingScore() {
        scores.put(questionnaireScore[7], +1);
        return scores.get(questionnaireScore[7]);
    }

    public Map<String, Integer> getScore() {
        return scores;
    }
}
