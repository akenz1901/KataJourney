package chapterFour;

public class Questions {
    private final String questionOne;
    private final String questionTwo;
    private final String questionThree;
    private final String questionFour;
    private final String questionFive;
    private String answerOption;
    private int score;
    private int questionNumber;

    public Questions(){
        questionOne = """ 
                        What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """;
        questionThree = """
                What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """;
        questionFour = """
                What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """;
        questionTwo = """
                What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """;
        questionFive = """
                What is my daddy's Name
                        A. Michael
                        B. Alaba
                        C. Honarable
                """;

    }

    public String displayQuestion(int question) {
        if(question==1) {
            questionNumber = question;
            return questionOne;
        }
        else if(question == 2){
            questionNumber = question;
            return questionTwo;
        }
        else if(question == 3){
            questionNumber = question;
            return questionThree;
        }
        else if(question == 4){
            questionNumber = question;
            return questionFour;
        }
        else if(question == 5){
            questionNumber = question;
            return questionFive;
        }
        else
            return "No More Question in The Bank";
    }
    public void selectOption(String answerOption) {
        switch (questionNumber) {
            case 1:
                if (answerOption.equals("A") || answerOption.equals("a")) {
                    score++;
                    this.answerOption = answerOption;
                }
                    break;
            case 2:
                if (answerOption.equals("B") || answerOption.equals("b")) {
                    score++;
                    this.answerOption = answerOption;
                }
                break;
            case 3:
                if (answerOption.equals("C") || answerOption.equals("c")) {
                    score++;
                    this.answerOption = answerOption;
                }
                break;
            case 4:
                if (answerOption.equals("D") || answerOption.equals("d")) {
                    score++;
                    this.answerOption = answerOption;
                }
                break;
            case 5:
                if (answerOption.equals("a") || answerOption.equals("A")) {
                    score++;
                    this.answerOption = answerOption;
                }
                break;
        }

    }
    public String getAnswerOption() {
        return answerOption;
    }

    public int getScore() {
        return score;
    }
}
