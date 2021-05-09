package chapterFour;

public class DataEncryption {


    public int takeNumbers(int number){

        int encryptedDigits;

        int firstNumber = number / 1000;
        firstNumber += 7;
        firstNumber %= 10;

        int secondNumber = number / 100;
        secondNumber += 7;
        secondNumber %= 10;

        int thirdNumber = number / 10;
        thirdNumber += 7;
        thirdNumber %= 10;

        int fourthNum = number / 10;
        fourthNum += 7;
        fourthNum %= 10;

        thirdNumber *= 1000;
        fourthNum *= 100;
        firstNumber *= 10;

        encryptedDigits = thirdNumber + fourthNum + firstNumber + secondNumber;

        return encryptedDigits;
    }
}
