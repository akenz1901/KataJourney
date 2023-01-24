package chapterFour;

import java.security.SecureRandom;
import java.util.*;


public class Kata {

    public static void fillArray(int... digits) {
        Arrays.fill(digits, 6);
    }

    public static void copyArray(int[] digits, int... emptyArray) {

        System.arraycopy(digits,0, emptyArray, 0, digits.length);
    }

    enum GRADE {PASSED, FAILED, BEG_TO_PASS, INVALID}

    Scanner collector = new Scanner(System.in);

    public double calculateAverage() {
        int average = 0;
        int number;
        int allAverageNumber = 0;
        while (allAverageNumber < 3) {
            System.out.print("Enter number: ");
            number = collector.nextInt();
            average = average + number;
            allAverageNumber++;
        }
        return average / 3.0;
    }

    public GRADE calculateGrade(int grade) {
        if (grade > 100)
            return GRADE.INVALID;
        if (grade >= 90)
            return GRADE.PASSED;
        else if (grade >= 80)
            return GRADE.PASSED;
        else if (grade >= 70)
            return GRADE.BEG_TO_PASS;
        else
            return GRADE.FAILED;
    }

    public boolean isEven(int isItEven) {
        return isItEven % 2 == 0;
    }

    public boolean isPrime(int number) {
        int numberCounter = 2;
        while (numberCounter < number) {
            if (number % numberCounter == 0) {
                return false;
            }
            numberCounter++;
        }
        return true;
    }

    public static double copiesPrice() {
        Scanner collector = new Scanner(System.in);
        int userInput;
        String newPriceList = """
                How Many Copies do you want to buy?
                                
                Select 1 for 1-4 Copies Price
                Select 2 for 5-9 copies Price
                select 3 for 10-29 copies Price
                Select 4 for 30-49 copies Price
                select 5 for 50-99 copies Price
                Select 6 for 100-199 copies Price
                Select 7 for 200 Above copies Price
                """;
        System.out.println(newPriceList);
        userInput = collector.nextInt();
        switch (userInput) {
            case 1 -> System.out.print("Price for your cart is " + (1500 * 1.0));
            case 2 -> System.out.print("Price for your cart is " + ((1500 - 100) * 1.0));
            case 3 -> System.out.print("Price for your cart is " + ((1500 - 200) * 1.0));
            case 4 -> System.out.print("Price for your cart is " + ((1500 - 300) * 1.0));
            case 5 -> System.out.print("Price for your cart is " + ((1500 - 400) * 1.0));
            case 6 -> System.out.print("Price for your cart is " + ((1500 - 500) * 1.0));
            case 7 -> System.out.print("Price for your cart is " + ((1500 - 600) * 1.0));
            default -> System.out.print("Oga behave na");
        }
        return userInput;
    }

    public String checkTheFactorsOfANumber() {
        List<Integer> factorNumbers = new ArrayList<>();
        System.out.print("Enter a number: ");
        int number = collector.nextInt();
        int factorNumber = 2;
        while (factorNumber < number) {
            if (number % factorNumber == 0) {
                factorNumbers.add(factorNumber);
            }
            factorNumber++;
        }
        if (number % factorNumber != 0)
            System.out.println("The Number Of factor are " + factorNumber);
        return String.format("The factor numbers of %d are %s", number, Arrays.toString(factorNumbers.toArray()));
    }

    public String arithmeticNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum + " is the sum of " + firstNumber + " and " + secondNumber);
        int subtraction = firstNumber - secondNumber;
        System.out.println(subtraction + " is the subtraction of " + firstNumber + " and " + secondNumber);
        int difference = firstNumber * secondNumber;
        System.out.println(difference + " is the difference between " + firstNumber + " and " + secondNumber);
        int quotient = firstNumber / secondNumber;
        return quotient * 1.0 + " is the quotient of" + firstNumber + " and " + secondNumber;

    }

    public int[] shuffleArray(int... container) {
        SecureRandom generalRandom = new SecureRandom();
        int number;
        int secondHolder;
        int random = generalRandom.nextInt(container.length);
        for (int i = 0; i < container.length; i++) {
            number = container[i];
            secondHolder = container[i];
            container[i] = container[random];
            container[random] = number;
            container[random] = secondHolder;
        }
        return container;
    }

    public int[] reverseArray(int... number) {
        int counter = 0;
        int[] num = new int[number.length];
        for (int i = number.length - 1; i >= 0; i--) {
            num[counter] = number[i];
            System.out.println(number[i]);
            counter++;
        }
        return num;
    }

    public static void sortArrayDesc(int... number) {
        for (int i = 1; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                int numb;
                if (number[i] > number[j]) {
                    numb = number[j];
                    number[j] = number[i];
                    number[i] = numb;
                }
//                if (j == number.length - 1) {
//                    int inCounter = 0;
//                    for (int k = 1; k < number.length; k++) {
//                        if (number[inCounter] < number[k]) {
//                            numb = number[k];
//                            number[k] = number[inCounter];
//                            number[inCounter] = numb;
//                        }
//                        inCounter++;
//                    }
//                }
            }
        }
    }

    public boolean isItEven(int number) {
        return number % 2 == 0;
    }

    public static void sortArrayAsc(int... number){
        for (int i = 1; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                int numb;
                if (number[i] < number[j]) {
                    numb = number[j];
                    number[j] = number[i];
                    number[i] = numb;
                }
            }
        }
//        Arrays.sort(intDigits);
    }

    public static void modifyArrayList(){
        ArrayList<String> healthStore = new ArrayList<>();

        healthStore.add("Cotton Wool");
        healthStore.add(0, "Injection");
        healthStore.add("Bed");
        healthStore.add("Ambulance");

        System.out.println(healthStore.get(1));
        displayArrayList(healthStore);

        System.out.printf("%s", healthStore.contains("Bed") ? "Yes": "not");
    }
    public static void displayArrayList(ArrayList<String> item){
        for (String things:item) {
            System.out.println(things);
        }
    }

    public static int arithmeticProgression(int firstNumber, int secondNumber, int thirdNumber){
        int firstDifference = thirdNumber - secondNumber;
        int secondDifference =  secondNumber - firstNumber;

        assert (firstDifference == secondDifference): "Not a sequence of AP";

            return firstDifference;

    }

    public static String man() {
        String[] array = {"1,2,4,5", "2,4,6,7"};
        String first_string = String.format("%s,%s", array[0], array[1]);
        String[] strArr = first_string.split(",");
        String outPut = "";
        int j;

        for (int i = 0; i < strArr.length; i++) {
            for (j = i+1; j < strArr.length; j++) {
                if (strArr[i].equalsIgnoreCase(strArr[j]))
                    outPut = strArr[j];
            }
        }
        return outPut;
    }

    public static String referenceNumberGenerator(){
        SecureRandom random = new SecureRandom();
        StringBuilder letters = new StringBuilder("abcdefgh1jklmnopqrstuwxyz");
        letters.append(letters.toString().toUpperCase(Locale.ROOT));
        String[] referenceStack = {")($%&@^!*_;/><:{}[]!+-=_|~`\"", letters.toString(), "1234567890", };
        StringBuilder reference = new StringBuilder();

        for(int i = 0; i < 10; i++){
            for (String s : referenceStack) {
                int generated;
                generated = random.nextInt(s.length());
                reference.append(s.substring(generated, generated+1));
            }
        }

        return reference.toString();
    }

    public static void main(String[] args) {
//        modifyArrayList();
//        man();
        System.out.println(referenceNumberGenerator());
//        System.out.print(Math.sqrt(-0.137));
    }

}