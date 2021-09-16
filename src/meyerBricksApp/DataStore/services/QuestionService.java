package meyerBricksApp.DataStore.services;

import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.entities.Aspirant;
import meyerBricksApp.entities.EAndIQuestionnaire;
import meyerBricksApp.entities.Questionnaire;

public interface QuestionService {
    String displayQuestionA(Questionnaire questionnaire, int question);

    String displayQuestionB(Questionnaire questionnaire, int questionNumber);

    int selectChoiceExtrovertAndIntrovert(ChoiceType choice, Questionnaire questionnaire);
}
