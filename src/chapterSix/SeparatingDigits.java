package chapterSix;

public class SeparatingDigits {
    int unit;
    String result;
    int r;

    public int getDivision(int a, int b){
        return a / b;
    }
    public int getRemainder(int a, int b){
        return a % b;
    }
    public String display(int number){
        if (number > 1 && number<99999) {
            while (number > 0){
                unit = getRemainder(number, 10);
                result = unit + " " + result;
//                number = getDivision(number, 10);
//                System.out.println(number);
            }
        }
        return result;
    }
}
