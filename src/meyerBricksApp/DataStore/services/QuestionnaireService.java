package meyerBricksApp.DataStore.services;

import meyerBricksApp.entities.Questionnaire;

public class QuestionnaireService {
    private static final String[] setA = new String[20];
    private static final String[] setB = new String[20];
    private static Integer questionNumber = 0;


    static {
        setUpQuestion();
    }

    public static void setUpQuestion(){
        setA[generateNumber()] = "expend energy, enjoy groups";
        setA[generateNumber()] = "conserve energy, enjoy one-on-one";
        setA[generateNumber()] = "logical, thinking, questioning";
        setA[generateNumber()] = "organized, orderly";
        setA[generateNumber()] = "more outgoing, think out loud";
        setA[generateNumber()] = "practical, realistic, experiential";
        setA[generateNumber()] = "candid, straight forward, frank";
        setA[generateNumber()] = "plan, schedule";
        setA[generateNumber()] = "seek many tasks, public activities, interaction with others";
        setA[generateNumber()] = "standard usual conventional";
        setA[generateNumber()] = "firm, tend to criticize, hold the line";
        setA[generateNumber()] = "regulate, structured";
        setA[generateNumber()] = "external, communicative, express yourself";
        setA[generateNumber()] = "focus on here-and-now";
        setA[generateNumber()] = "tough-minded, just";
        setA[generateNumber()] = "preparation, plan ahead";
        setA[generateNumber()] = "active, initiate";
        setA[generateNumber()] = "facts, things, 'what is'";
        setA[generateNumber()] = "matter of fact, issue-oriented";
        setA[generateNumber()] = "control, govern";
        resetControl();

        setB[generateNumber()] = "Conserve energy, enjoy one-on-one";
        setB[generateNumber()] = "look for meaning and possibilities";
        setB[generateNumber()] = "empathetic, feeling, accommodating";
        setB[generateNumber()] = "flexible, adaptable";
        setB[generateNumber()] = "more reserved, think to yourself";
        setB[generateNumber()] = "imaginative, innovative, theoretical";
        setB[generateNumber()] = "tactful kind, encouraging";
        setB[generateNumber()] = "unplanned, spontaneous";
        setB[generateNumber()] = "seek private, solitary activities with quiet to concentrate";
        setB[generateNumber()] = "different, novel, unique";
        setB[generateNumber()] = "gentle, tend to appreciate, conciliate";
        setB[generateNumber()] = "easygoing, 'live' and 'let live'";
        setB[generateNumber()] = "internal reticent, keep to yourself";
        setB[generateNumber()] = "look to the future, global perspective,'big picture'";
        setB[generateNumber()] = "tender-hearted, merciful";
        setB[generateNumber()] = "go with the flow adapt as you go";
        setB[generateNumber()] = "reflective, deliberate";
        setB[generateNumber()] = "ideas, dreams, 'what could be,' philosophical";
        setB[generateNumber()] = "sensitive, people-oriented, compassionate";
        setB[generateNumber()] = "latitude, freedom";
        resetControl();
    }
    public static String[] getSetA() {
        return setA;
    }

    public static String[] getSetB() {
        return setB;
    }

    public static Integer generateNumber(){
        return questionNumber++;
    }
    public static void resetControl(){
        questionNumber = 0;
    }
}
