package meyerBricksApp.DataStore.services;


import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import meyerBricksApp.entities.Aspirant;
import meyerBricksApp.entities.EAndIQuestionnaire;
import meyerBricksApp.entities.Questionnaire;

public class QuestionServiceImp implements QuestionService{
    @Override
    public String displayQuestionA(Questionnaire questionnaire, int questionNumber) {
        validateQuestionNumber(questionNumber);
        equals(questionnaire);
        String question = questionnaire.getQuestionAs().get(questionNumber);
        return question;
    }

    @Override
    public String displayQuestionB(Questionnaire questionnaire, int questionLocation) {
        validateQuestionNumber(questionLocation);
        equals(questionnaire);
        String question = questionnaire.getQuestionBs().get(questionLocation);
        return question;
    }

    @Override
    public int selectChoice(ChoiceType choice, Questionnaire questionnaire) {
        if(choice.equals(ChoiceType.A) && equals(questionnaire))
            return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        EAndIQuestionnaire questionnaire = new EAndIQuestionnaire();
        return obj.equals(questionnaire);
    }

    private void validateQuestionNumber(int number){
        if (number > 5 || number < 0)
         throw new MeyerBriggsAppException("Invalid Number");
    }
}
