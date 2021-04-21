package diary;

public class User {
    private final Diary diary;
    private final String userName;
    public User(String userName, Diary userDiary) {
        this.userName = userName;
        diary = userDiary;
    }

    public Diary getDiary() {
        return diary;
    }

    public void createEntry(String entryBody) {
        diary.addEntry(entryBody);
    }

}
