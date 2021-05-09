package chapterFive;

import chapterFour.Questions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalQuestionQuiz {

    @Test
    void questionAndAnswerOptionCanBeDisplay(){
        Questions question = new Questions();

        assertEquals(""" 
                        What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """, question.displayQuestion(1));
    }
    @Test
    void answerOptionCanSelected(){
        Questions questions = new Questions();
        assertEquals(""" 
                        What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """, questions.displayQuestion(1));
        questions.selectOption("A");

        assertEquals("A", questions.getAnswerOption());
    }
    @Test
    void userCanBeScored(){
        Questions questions = new Questions();
        assertEquals(""" 
                        What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """, questions.displayQuestion(1));
        questions.selectOption("A");

        assertEquals("A", questions.getAnswerOption());
        assertEquals(1, questions.getScore());


        assertEquals("""
                What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """, questions.displayQuestion(2));
        questions.selectOption("B");

        assertEquals("B", questions.getAnswerOption());
        assertEquals(2, questions.getScore());
    }
}
