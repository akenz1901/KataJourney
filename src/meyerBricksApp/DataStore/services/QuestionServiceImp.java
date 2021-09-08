package meyerBricksApp.DataStore.services;


import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import meyerBricksApp.entities.Questionnaire;

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

    private void validateQuestionNumber(int number){
        if (number > 5 || number < 0)
         throw new MeyerBriggsAppException("Invalid Number");
    }
}
