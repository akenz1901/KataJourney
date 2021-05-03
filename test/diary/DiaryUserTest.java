package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryUserTest {
    Diary relationshipDiary;
    User joy;
    @BeforeEach
    void startThisBeforeEach(){
        relationshipDiary = new Diary();
        joy = new User("joy", relationshipDiary);
    }

    @Test
    void userHasADiary(){
        //assert
        assertNotNull(joy.getDiary());

    }
    @Test
    void userCanWriteOnDiary(){
        joy.createEntry("""
                Today I Was Happy,
                I expected a small black pen i met a big black bamboo""");
    }
}