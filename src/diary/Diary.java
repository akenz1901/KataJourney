package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    ArrayList<Entry> entries= new ArrayList<>();
    public void addEntry(String entryBody) {
        Entry entry = new Entry(entryBody);
        entries.add(entry);
    }

    public int getTotalNumberOfEntries() {
        return entries.size();
    }
}
