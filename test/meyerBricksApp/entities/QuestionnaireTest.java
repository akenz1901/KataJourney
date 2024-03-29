package meyerBricksApp.entities;


import meyerBricksApp.DataStore.services.QuestionnaireService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionnaireTest {
    EAndIQuestionnaire eandIQuestionnaire;
    SAndNQuestionnaire sAndNQuestionnaire;
    JAndPQuestionnaire jAndPQuestionnaire;
    TAndFQuestionnaire tAndFQuestionnaire;
    @BeforeEach
    void setUp(){
        eandIQuestionnaire = new EAndIQuestionnaire();
        sAndNQuestionnaire = new SAndNQuestionnaire();
        jAndPQuestionnaire = new JAndPQuestionnaire();
        tAndFQuestionnaire = new TAndFQuestionnaire();
    }
    @AfterEach
    void tearDown(){
        QuestionnaireService.resetControl();
    }
    @Test
    void eAndIQuestionnaireNotNull(){
        assertNotNull(eandIQuestionnaire);
    }
    @Test
    void setAofEAndIQuestionnaireNotNull(){
        assertNotNull(eandIQuestionnaire.getQuestionAs());
    }
    @Test
    void eAndQuestionnaireContainsFiveQuestion(){
        assertEquals(5, eandIQuestionnaire.getQuestionAs().size());
    }
    @Test
    void setAOfeAndQuestionnaireHaveTheRightQuestions() {
        for (int i = 0; i < 5; i++) {
            assertEquals(QuestionnaireService.getSetA()[i], eandIQuestionnaire.getQuestionAs().get(i+1));
        }
    }
    @Test
    void setBofEAndIQuestionnaireNull(){
        assertNotNull(eandIQuestionnaire.getQuestionBs().get(1));
    }
    @Test
    void setBofEAndIQuestionnaireHasFiveSizes(){
        assertEquals(5, eandIQuestionnaire.getQuestionBs().size());
    }
    @Test
    void setBOfeAndQuestionnaireHaveTheRightQuestions() {
        for (int i = 0; i < 5; i++) {
            assertEquals(QuestionnaireService.getSetB()[i], eandIQuestionnaire.getQuestionBs().get(i+1));
        }
    }
    @Test
    void SAndNQuestionnaireNotNull(){
        assertNotNull(sAndNQuestionnaire);
    }
    @Test
    void eachOfSetAofSAndNQuestionnaireNotNull(){
        assertNotNull(sAndNQuestionnaire.getQuestionAs().get(1));
    }
    @Test
    void setAofSAndNQuestionnaireHasFiveSizes(){
        assertEquals(5, sAndNQuestionnaire.getQuestionAs().size());
    }
    @Test
    void setAOfSAndNQuestionnaireHaveTheRightQuestions() {
        int count = 1;
        for (int i = 5; i < 10; i++) {
            assertEquals(QuestionnaireService.getSetA()[i], sAndNQuestionnaire.getQuestionAs().get(count));
            count++;
        }
    }
    @Test
    void setBofSAndNQuestionnaireHasFiveSizes(){
        assertEquals(5, sAndNQuestionnaire.getQuestionBs().size());
    }
    @Test
    void setBOfSAndNQuestionnaireHaveTheRightQuestions() {
        int count = 1;
        for (int i = 5; i < 10; i++) {
            assertEquals(QuestionnaireService.getSetB()[i], sAndNQuestionnaire.getQuestionBs().get(count));
            count++;
        }
    }
    @Test
    void setAJAndPQuestionnaireIsNotEmpty(){
        assertFalse(jAndPQuestionnaire.getQuestionAs().isEmpty());
    }
    @Test
    void setAOfJAndPQuestionnaireSizeIsFive(){
        assertEquals(5, jAndPQuestionnaire.getQuestionAs().size());
    }
    @Test
    void setAOfJAndPQuestionnaireHaveTheRightQuestions() {
        int count = 1;
        for (int i = 15; i < 20; i++) {
            assertEquals(QuestionnaireService.getSetA()[i], jAndPQuestionnaire.getQuestionAs().get(count));
            count++;
        }
    }
    @Test
    void setBJAndPQuestionnaireIsNotEmpty(){
        assertFalse(jAndPQuestionnaire.getQuestionBs().isEmpty());
    }

    @Test
    void setBOfJAndPQuestionnaireSizeIsFive(){
        assertEquals(5, jAndPQuestionnaire.getQuestionBs().size());
    }
    @Test
    void setBOfJAndPQuestionnaireHaveTheRightQuestions() {
        int count = 1;
        for (int i = 15; i < 20; i++) {
            assertEquals(QuestionnaireService.getSetB()[i], jAndPQuestionnaire.getQuestionBs().get(count));
            count++;
        }
    }
    @Test
    void setATAndFQuestionnaireIsNotEmpty(){
        assertFalse(tAndFQuestionnaire.getQuestionAs().isEmpty());
    }
    @Test
    void setATAndFQuestionnaireContainsFiveElements(){
        assertEquals(5, tAndFQuestionnaire.getQuestionAs().size());
    }
    @Test
    void setAOfTAndFQuestionnaireHaveTheRightQuestions() {
        int count = 1;
        for (int i = 10; i < 15; i++) {
            assertEquals(QuestionnaireService.getSetA()[i], tAndFQuestionnaire.getQuestionAs().get(count));
            count++;
        }
    }
    @Test
    void setBTAndFQuestionnaireIsNotEmpty(){
        assertFalse(tAndFQuestionnaire.getQuestionBs().isEmpty());
    }
    @Test
    void setBTAndFQuestionnaireContainsFiveElements(){
        assertEquals(5, tAndFQuestionnaire.getQuestionAs().size());
    }
    @Test
    void setBOfTAndFQuestionnaireHaveTheRightQuestions() {
        int count = 1;
        for(int i = 10; i < 15; i++) {
            assertEquals(QuestionnaireService.getSetB()[i], tAndFQuestionnaire.getQuestionBs().get(count));
            count++;
        }
    }
}