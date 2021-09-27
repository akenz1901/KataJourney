package meyerBricksApp.DataStore.services;


import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import meyerBricksApp.entities.Aspirant;
import meyerBricksApp.entities.Questionnaire;

import java.util.ArrayList;
import java.util.List;

public class QuestionServiceImp implements QuestionService{
    @Override
    public String displayQuestionA(Questionnaire questionnaire, int questionNumber) {
        validateQuestionNumber(questionNumber);
        String question = questionnaire.getQuestionAs().get(questionNumber);
        return question;
    }

    @Override
    public String displayQuestionB(Questionnaire questionnaire, int questionLocation) {
        validateQuestionNumber(questionLocation);
        String question = questionnaire.getQuestionBs().get(questionLocation);
        return question;
    }

    @Override
    public int selectChoiceExtrovertAndIntrovert(ChoiceType choice, Aspirant aspirant) {
        int score = 0;
        if (choice.equals(ChoiceType.A)) {
            score = aspirant.increaseExtrovertScore();
            return score;
        }
        else if (choice.equals(ChoiceType.B))
            score = aspirant.increaseIntrovertScore();
            return score;
    }

    private void validateCommonQuestionEffectOnScore(Integer question){
        List<Integer> numberConsistency = new ArrayList<>(5);
        if (numberConsistency.contains(question))
           throw new MeyerBriggsAppException("Question Already Attempted");

        numberConsistency.add(question);
    }
    private void validateQuestionNumber(int number){
        if (number > 5 || number < 0)
         throw new MeyerBriggsAppException("Invalid Number");
    }
}
