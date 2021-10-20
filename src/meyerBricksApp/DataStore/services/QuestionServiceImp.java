package meyerBricksApp.DataStore.services;


import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import meyerBricksApp.entities.*;

import java.util.Arrays;


public class QuestionServiceImp implements QuestionService{
    @Override
    public String displayQuestionA(Questionnaire questionnaire, int questionNumber) {
        validateQuestionNumber(questionNumber);
        validateCommonQuestionEffectOnScore(questionnaire, questionnaire.getQuestionAs().get(questionNumber));
        String question = questionnaire.getQuestionAs().get(questionNumber);
        return question;
    }

    @Override
    public String displayQuestionB(Questionnaire questionnaire, int questionLocation) {
        validateQuestionNumber(questionLocation);
        validateCommonQuestionEffectOnScore(questionnaire, questionnaire.getQuestionBs().get(questionLocation));
        String question = questionnaire.getQuestionBs().get(questionLocation);
        return question;
    }

    @Override
    public int scoreCandidate(Questionnaire questionnaire, Aspirant aspirant) {

        return switch (questionnaire.getClass().getSimpleName()) {
            case "EAndIQuestionnaire" -> scoreCandidateForE_andIQuestionnaire((EAndIQuestionnaire) questionnaire, aspirant);
            case "SAndNQuestionnaire" -> scoreCandidateForS_andNQuestionnaire((SAndNQuestionnaire) questionnaire, aspirant);
            case "JAndPQuestionnaire" -> scoreCandidateForJ_andPQuestionnaire((JAndPQuestionnaire) questionnaire, aspirant);
            case "TAndFQuestionnaire" -> scoreCandidateForT_andFQuestionnaire((TAndFQuestionnaire) questionnaire, aspirant);
            default -> 0;
        };
    }

    private int scoreCandidateForT_andFQuestionnaire(TAndFQuestionnaire questionnaire, Aspirant aspirant) {
        int score = 0;
        if (questionnaire.getChoice().equals(ChoiceType.A) ) {
            score = aspirant.increaseThinkingScore();
            return score;
        }
        else if (questionnaire.getChoice().equals(ChoiceType.B))
            score = aspirant.increaseFeelingScore();
        return score;
    }

    public static int scoreCandidateForE_andIQuestionnaire(EAndIQuestionnaire questionnaire, Aspirant aspirant){
        int score = 0;
        if (questionnaire.getChoice().equals(ChoiceType.A) ) {
            score = aspirant.increaseExtrovertScore();
            return score;
        }
        else if (questionnaire.getChoice().equals(ChoiceType.B))
            score = aspirant.increaseIntrovertScore();
        return score;
    }

    public static int scoreCandidateForS_andNQuestionnaire(SAndNQuestionnaire questionnaire, Aspirant aspirant){
        int score = 0;
        if (questionnaire.getChoice().equals(ChoiceType.A) ) {
            score = aspirant.increaseSensingScore();
            return score;
        }
        else if (questionnaire.getChoice().equals(ChoiceType.B))
            score = aspirant.increaseIntuitionScore();
        return score;
    }
    public static int scoreCandidateForJ_andPQuestionnaire(JAndPQuestionnaire questionnaire, Aspirant aspirant){
        int score = 0;
        if (questionnaire.getChoice().equals(ChoiceType.A) ) {
            score = aspirant.increaseJudgingScore();
            return score;
        }
        else if (questionnaire.getChoice().equals(ChoiceType.B))
            score = aspirant.increasePerceivingScore();
        return score;
    }

    @Override
    public ChoiceType confirmChoiceWasSelected(Questionnaire questionnaire) {
        return questionnaire.getChoice();
    }

    @Override
    public int[] getTotalScore(Questionnaire questionnaire, Aspirant aspirant) {
        int extro = 0, intro= 0;
        if(questionnaire.getClass().getSimpleName().equals(EAndIQuestionnaire.class.getSimpleName()))
            extro = aspirant.getScore().get("Extrovert");
            intro = aspirant.getScore().get("Introvert");
        return new int[]{extro, intro};
    }

    private void validateCommonQuestionEffectOnScore(Questionnaire questionnaire, String question){
        if (questionnaire.getTemporaryQuestionBank().contains(question))
           throw new MeyerBriggsAppException("Question Already Attempted");
        questionnaire.getTemporaryQuestionBank().add(question);
    }

    private void validateQuestionNumber(int number){
        if (number > 5 || number < 0)
         throw new MeyerBriggsAppException("Invalid Number");
    }
}
