package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;
import meyerBricksApp.DataStore.services.QuestionServiceImp;
import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionServiceImpTest {
    private QuestionService questionService;
    private Questionnaire question;
    private SAndNQuestionnaire sAndNQuestionnaire;
    @BeforeEach
    void setUp(){
        questionService = new QuestionServiceImp();
        question = new EAndIQuestionnaire();
        sAndNQuestionnaire = new SAndNQuestionnaire();
    }

    @AfterEach
    void tearDown(){}

    @Test
    void displayQuestionAInE_andIQuestionnaire(){
        assertNotNull(questionService.displayQuestionA(question, 1));
        assertEquals("more outgoing, think out loud", questionService.displayQuestionA(question, 5));

        assertEquals("Conserve energy, enjoy one-on-one", questionService.displayQuestionB(question, 1));


    }
    @Test
    void displayQuestionAThrowAnException(){
        assertThrows(MeyerBriggsAppException.class, () -> questionService.displayQuestionA(question, 6));
    }
    @Test
    void displayQuestionAInS_andNQuestionnaire(){
        assertEquals("candid, straight forward, frank", questionService.displayQuestionA(sAndNQuestionnaire, 2));

        assertEquals("unplanned, spontaneous", questionService.displayQuestionB(sAndNQuestionnaire, 3));
    }
}
