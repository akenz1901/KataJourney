package diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    @Test
    void entryCanBeAdded(){
        Diary diary = new Diary();

        diary.addEntry(""" 
                I am a good guy
                 """);
        assertEquals(1, diary.getTotalNumberOfEntries());

        diary.addEntry(""" 
                I am a good looking guy
                 """);
        assertEquals(2, diary.getTotalNumberOfEntries());
    }
}
