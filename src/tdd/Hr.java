package tdd;

public class Hr {
    public static String employ(Candidate candidate) {
        if(candidate.getSchool().equals(School.LASU))
            throw new IllegalArgumentException("We cannot Admit you here");
        else
        return "Employed";
    }
}
