package meyerBricksApp.DataStore;

public enum ScaleType {
    E("Extrovert"),
    I("Introvert"),
    S("Sensing"),
    N("Intuition"),
    T("Thinking"),
    F("Feeling"),
    J("Judging"),
    P("Perceiving");
    private final String meaning;
    ScaleType(String meaning){
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }
}
