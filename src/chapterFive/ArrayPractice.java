package chapterFive;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] names ={"Michael", "Davies","Chibuzor","Gozie","Isaac"};
        for(int numberCounter = 1; numberCounter<=5; numberCounter++){
            System.out.println(names[numberCounter-1]);
        }
        int[] numbers = {2, 3, 4, 5, 2};
        for(int number : numbers){
            System.out.println(number);
        }
    }


}
