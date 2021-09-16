package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;
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
    private JAndPQuestionnaire jAndPQuestionnaire;
    private TAndFQuestionnaire tAndFQuestionnaire;

    @BeforeEach
    void setUp() {
        questionService = new QuestionServiceImp();
        question = new EAndIQuestionnaire();
        sAndNQuestionnaire = new SAndNQuestionnaire();
        jAndPQuestionnaire = new JAndPQuestionnaire();
        tAndFQuestionnaire = new TAndFQuestionnaire();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void displayQuestionAInE_andIQuestionnaire() {
        assertNotNull(questionService.displayQuestionA(question, 1));
        assertEquals("more outgoing, think out loud", questionService.displayQuestionA(question, 5));

        assertEquals("Conserve energy, enjoy one-on-one", questionService.displayQuestionB(question, 1));


    }

    @Test
    void displayQuestionA_andBThrowAnException() {
        assertThrows(MeyerBriggsAppException.class, () -> questionService.displayQuestionA(question, 6));
    }

    @Test
    void displayQuestionA_andBInS_andNQuestionnaire() {
        assertEquals("candid, straight forward, frank", questionService.displayQuestionA(sAndNQuestionnaire, 2));

        assertEquals("unplanned, spontaneous", questionService.displayQuestionB(sAndNQuestionnaire, 3));
    }

    @Test
    void displayQuestionA_andBInJ_andPQuestionnaire() {
        assertEquals("firm, tend to criticize, hold the line", questionService.displayQuestionA(jAndPQuestionnaire, 1));

        assertEquals("tender-hearted, merciful", questionService.displayQuestionB(jAndPQuestionnaire, 5));
    }
    @Test
    void displayQuestionA_andBInT_andFQuestionnaire() {
        assertEquals("facts, things, 'what is'", questionService.displayQuestionA(tAndFQuestionnaire, 3));

        assertEquals("sensitive, people-oriented, compassionate", questionService.displayQuestionB(tAndFQuestionnaire, 4));
    }
    @Test
    void selectChoice(){
        assertEquals("expend energy, enjoy groups", questionService.displayQuestionA(question, 1));
        assertEquals("Conserve energy, enjoy one-on-one", questionService.displayQuestionB(question, 1));
        assertEquals(1, questionService.selectChoiceExtrovertAndIntrovert(ChoiceType.B, question));
    }
}
