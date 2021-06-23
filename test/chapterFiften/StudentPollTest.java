package chapterFiften;

public class StudentPollTest {
    public static void main(String[] args) {
        StudentPoll poll = new StudentPoll();

        poll.rate();
        poll.sumResponses();
        poll.openAndWriteInTheFIle();
    }
}
