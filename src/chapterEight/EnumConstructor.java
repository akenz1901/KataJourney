package chapterEight;

public enum EnumConstructor {
    BIRO("Lucky Pen", "Lucky Limited"),
    PENCIL("Black and Red Pencil", "HB pencil"),
    BOOK("Joter Note", "Seun Mercy");

    private final String name;
    private final String company;

    EnumConstructor(String name, String company){
        this.name = name;
        this.company = company;
    }
    public String toString(){
        return String.format("Product name %s %s", name, company);
    }
}
