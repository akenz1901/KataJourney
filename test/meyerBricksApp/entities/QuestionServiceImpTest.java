package meyerBricksApp.entities;

import meyerBricksApp.DataStore.services.QuestionService;
import meyerBricksApp.DataStore.services.QuestionServiceImp;
import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionServiceImpTest {
    QuestionService questionService;
    Questionnaire question;
    @BeforeEach
    void setUp(){
        questionService = new QuestionServiceImp();
        question = new EAndIQuestionnaire();
    }

    @AfterEach
    void tearDown(){}

    @Test
    void displayQuestionAInE_andIQuestionnaire(){
        assertNotNull(questionService.displayQuestionA(question, 1));

        assertEquals("more outgoing, think out loud", questionService.displayQuestionA(question, 5));
    }
    @Test
    void displayQuestionAThrowAnException(){
        assertThrows(MeyerBriggsAppException.class, () -> questionService.displayQuestionA(question, 6));
    }
}
