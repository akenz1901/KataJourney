package diary;

import java.time.LocalDateTime;

public class Entry {
    private final LocalDateTime entryDateAndTime;
    private String entryBody;


    public Entry(String entryBody) {
        this.entryBody = entryBody;
        entryDateAndTime = LocalDateTime.now();
    }
}
