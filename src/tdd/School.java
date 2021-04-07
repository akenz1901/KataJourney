package tdd;

public enum School {
    NOUN("National Open University"),
    UN("University Of Nigeria"),
    LASU("Lagos State University");

    private String fullName;

    School(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

}
