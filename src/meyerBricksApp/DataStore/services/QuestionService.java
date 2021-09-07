package meyerBricksApp.DataStore.services;

import meyerBricksApp.entities.Questionnaire;

public interface QuestionService {
    String displayQuestionA(Questionnaire questionnaire, int question);

    String displayQuestionB(Questionnaire questionnaire, int i);
}
