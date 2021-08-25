package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.DataStore.services.QuestionService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionnaireTest {
    Questionnaire question;
    @BeforeEach
    void setUp(){
        question = new Questionnaire();
    }
    @AfterEach
    void tearDown(){}

    @Test
    void questionnaireNotNull(){
        assertNotNull(question);
    }
    @Test
    void checkQuestionA_andBNotEmpty(){
        assertFalse(question.getQuestionAs().isEmpty());
        assertFalse(question.getQuestionBs().isEmpty());
    }
    @Test
    void testThatTwentyQuestionsAreThereInEachQuestionRepo(){
        assertEquals(20, question.getQuestionAs().size());
        assertEquals(20, question.getQuestionBs().size());
    }
    @Test
    void compareAndAllQuestionsInSectionA_AreUnique(){
        for (int i = 0; i < QuestionService.getSetA().length; i++) {
            assertEquals(QuestionService.getSetA()[i], question.getQuestionAs().get(i+1));
        }
    }
    @Test
    void compareAndAllQuestionsInSectionB_AreUnique(){
        for (int i = 0; i < QuestionService.getSetB().length; i++) {
            System.out.println(i);
            assertEquals(QuestionService.getSetB()[i], question.getQuestionBs().get(i+1));
        }
    }
}