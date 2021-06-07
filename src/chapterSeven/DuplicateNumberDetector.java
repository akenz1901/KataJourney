package chapterSeven;

public class DuplicateNumberDetector {
    private int[] numbers = new int[5];

    private int count = 0;
    public void inputNumber(int num){
        for (int number:numbers) {
            if(number == num) throw new NumberAlreadyExistException("You Just Entered A Duplicate Number");
        }
        if(num < 10 || num >100)throw new NumberOutOfBoundException("You Entered Wrong Number Pls Enter Number Within The Range");
            numbers[count] = num;
            count++;
    }
    public int[] getContainerOfNumbers() {
        return numbers;
    }

    private static class NumberOutOfBoundException extends RuntimeException{
        public NumberOutOfBoundException(String message){
            super(message);
        }
    }
}

    class NumberAlreadyExistException extends RuntimeException {
        public NumberAlreadyExistException(String message) {
            super(message);
        }
    }
