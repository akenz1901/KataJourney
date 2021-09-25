package meyerBricksApp.entities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Aspirant {
    private String firstName;
    private String lastName;
    private LocalDate Age;
    private String personality;
    private final String[] questionnaireScore = {"Extrovert", "Introvert", "Sensing", "Intuition", "Thinking", "Feeling", "Judging", "Perceiving"};
    private Map<String, Integer> scores = new HashMap<>();
    private static final int[] control = new int[8];

    public Aspirant(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Aspirant(String firstName, String lastName, LocalDate age){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Aspirant(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getAge() {
        return Age;
    }

    public void setAge(LocalDate age) {
        Age = age;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public int increaseExtrovertScore(){
        scores.put(questionnaireScore[0], ++control[0]);
        return scores.get(questionnaireScore[0]);
    }
    public int increaseIntrovertScore(){
        scores.put(questionnaireScore[1], ++control[1]);
        return scores.get(questionnaireScore[1]);
    }
    public int increaseSensingScore(){
        scores.put(questionnaireScore[2], ++control[2]);
        return scores.get(questionnaireScore[2]);
    }
    public int increaseIntuitionScore(){
        scores.put(questionnaireScore[3], ++control[3]);
        return scores.get(questionnaireScore[3]);
    }
    public int increaseThinkingScore(){
        scores.put(questionnaireScore[4], ++control[4]);
        return scores.get(questionnaireScore[4]);
    }
    public int increaseFeelingScore(){
        scores.put(questionnaireScore[5], ++control[5]);
        return scores.get(questionnaireScore[5]);
    }
    public int increaseJudgingScore(){
        scores.put(questionnaireScore[6], ++control[6]);
        return scores.get(questionnaireScore[6]);
    }
    public int increasePerceivingScore() {
        scores.put(questionnaireScore[7], ++control[7]);
        return scores.get(questionnaireScore[7]);
    }

    public Map<String, Integer> getScore() {
        return scores;
    }
}
