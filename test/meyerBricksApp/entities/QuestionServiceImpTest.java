package meyerBricksApp.entities;

import meyerBricksApp.DataStore.ChoiceType;
import meyerBricksApp.DataStore.services.QuestionService;
import meyerBricksApp.DataStore.services.QuestionServiceImp;
import meyerBricksApp.DataStore.services.QuestionnaireService;
import meyerBricksApp.MeyerBriggsExceptions.MeyerBriggsAppException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionServiceImpTest {
    private QuestionService questionService;
    private EAndIQuestionnaire eAndIQuestionnaire;
    private SAndNQuestionnaire sAndNQuestionnaire;
    private JAndPQuestionnaire jAndPQuestionnaire;
    private TAndFQuestionnaire tAndFQuestionnaire;
    private Aspirant mercy;

    @BeforeEach
    void setUp() {
        questionService = new QuestionServiceImp();
        eAndIQuestionnaire = new EAndIQuestionnaire();
        sAndNQuestionnaire = new SAndNQuestionnaire();
        jAndPQuestionnaire = new JAndPQuestionnaire();
        tAndFQuestionnaire = new TAndFQuestionnaire();
        mercy = new Aspirant("Akenz", "Michael", LocalDate.of(1995, 4, 24));

    }

    @AfterEach
    void tearDown(){
        QuestionnaireService.resetControl();
    }

    @Test
    void displayQuestionAInE_andIQuestionnaire() {
        assertNotNull(questionService.displayQuestionA(eAndIQuestionnaire, 1));
        assertEquals("more outgoing, think out loud", questionService.displayQuestionA(eAndIQuestionnaire, 5));

        assertEquals("conserve energy, enjoy one-on-one", questionService.displayQuestionB(eAndIQuestionnaire, 1));


    }

    @Test
    void displayQuestionA_andBThrowAnException() {
        assertThrows(MeyerBriggsAppException.class, () -> questionService.displayQuestionA(eAndIQuestionnaire, 6));
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
    void displayQuestionThrowsQuestionAlreadyDisplayExceptionInQuestionA(){
        assertEquals("facts, things, 'what is'", questionService.displayQuestionA(tAndFQuestionnaire, 3));
        assertThrows( MeyerBriggsAppException.class, ()-> questionService.displayQuestionA(tAndFQuestionnaire, 3));

    }
    @Test
    void confirmChoiceSelectChoice(){
        assertEquals("expend energy, enjoy groups", questionService.displayQuestionA(eAndIQuestionnaire, 1));
        assertEquals("conserve energy, enjoy one-on-one", questionService.displayQuestionB(eAndIQuestionnaire, 1));
        eAndIQuestionnaire.setChoice(ChoiceType.B);
        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(eAndIQuestionnaire));
    }
    @Test
    void selectChoiceForE_andIQuestionnaire(){
        assertEquals("expend energy, enjoy groups", questionService.displayQuestionA(eAndIQuestionnaire, 1));
        assertEquals("conserve energy, enjoy one-on-one", questionService.displayQuestionB(eAndIQuestionnaire, 1));
        eAndIQuestionnaire.setChoice(ChoiceType.B);

        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(eAndIQuestionnaire));
        assertEquals(1, questionService.scoreCandidate(eAndIQuestionnaire, mercy));

        assertEquals("interpret literally", questionService.displayQuestionA(eAndIQuestionnaire, 2));
        assertEquals("look for meaning and possibilities", questionService.displayQuestionB(eAndIQuestionnaire, 2));
        eAndIQuestionnaire.setChoice(ChoiceType.B);

        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(eAndIQuestionnaire));
        assertEquals(2, questionService.scoreCandidate(eAndIQuestionnaire, mercy));

        assertEquals("logical, thinking, questioning", questionService.displayQuestionA(eAndIQuestionnaire, 3));
        assertEquals("empathetic, feeling, accommodating", questionService.displayQuestionB(eAndIQuestionnaire, 3));
        eAndIQuestionnaire.setChoice(ChoiceType.A);

        assertEquals(ChoiceType.A, questionService.confirmChoiceWasSelected(eAndIQuestionnaire));
        assertEquals(1, questionService.scoreCandidate(eAndIQuestionnaire, mercy));

        assertEquals("organized, orderly", questionService.displayQuestionA(eAndIQuestionnaire, 4));
        assertEquals("flexible, adaptable", questionService.displayQuestionB(eAndIQuestionnaire, 4));
        eAndIQuestionnaire.setChoice(ChoiceType.B);

        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(eAndIQuestionnaire));
        assertEquals(3, questionService.scoreCandidate(eAndIQuestionnaire, mercy));

        assertEquals("more outgoing, think out loud", questionService.displayQuestionA(eAndIQuestionnaire, 5));
        assertEquals("more reserved, think to yourself", questionService.displayQuestionB(eAndIQuestionnaire, 5));
        eAndIQuestionnaire.setChoice(ChoiceType.A);

        assertEquals(ChoiceType.A, questionService.confirmChoiceWasSelected(eAndIQuestionnaire));
        assertEquals(2, questionService.scoreCandidate(eAndIQuestionnaire, mercy));
    }
    @Test
    void selectChoiceForS_andNQuestionnaire(){
        assertEquals("practical, realistic, experiential", questionService.displayQuestionA(sAndNQuestionnaire, 1));
        assertEquals("imaginative, innovative, theoretical", questionService.displayQuestionB(sAndNQuestionnaire, 1));
        sAndNQuestionnaire.setChoice(ChoiceType.B);

        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(sAndNQuestionnaire));
        assertEquals(1, questionService.scoreCandidate(sAndNQuestionnaire, mercy));

        assertEquals("candid, straight forward, frank", questionService.displayQuestionA(sAndNQuestionnaire, 2));
        assertEquals("tactful kind, encouraging", questionService.displayQuestionB(sAndNQuestionnaire, 2));
        sAndNQuestionnaire.setChoice(ChoiceType.B);

        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(sAndNQuestionnaire));
        assertEquals(2, questionService.scoreCandidate(sAndNQuestionnaire, mercy));

        assertEquals("plan, schedule", questionService.displayQuestionA(sAndNQuestionnaire, 3));
        assertEquals("unplanned, spontaneous", questionService.displayQuestionB(sAndNQuestionnaire, 3));
        sAndNQuestionnaire.setChoice(ChoiceType.A);

        assertEquals(ChoiceType.A, questionService.confirmChoiceWasSelected(sAndNQuestionnaire));
        assertEquals(1, questionService.scoreCandidate(sAndNQuestionnaire, mercy));

        assertEquals("seek many tasks, public activities, interaction with others", questionService.displayQuestionA(sAndNQuestionnaire, 4));
        assertEquals("seek private, solitary activities with quiet to concentrate", questionService.displayQuestionB(sAndNQuestionnaire, 4));
        sAndNQuestionnaire.setChoice(ChoiceType.B);

        assertEquals(ChoiceType.B, questionService.confirmChoiceWasSelected(sAndNQuestionnaire));
        assertEquals(3, questionService.scoreCandidate(sAndNQuestionnaire, mercy));

        assertEquals("standard usual conventional", questionService.displayQuestionA(sAndNQuestionnaire, 5));
        assertEquals("different, novel, unique", questionService.displayQuestionB(sAndNQuestionnaire, 5));
        sAndNQuestionnaire.setChoice(ChoiceType.A);

        assertEquals(ChoiceType.A, questionService.confirmChoiceWasSelected(sAndNQuestionnaire));
        assertEquals(2, questionService.scoreCandidate(sAndNQuestionnaire, mercy));
    }
}
