package chapterSeven;

public class PlayAround {
    public static void main(String[] args) {


        int[][] numbers = new int[3][9];

        numbers [0] = new int[3];
        numbers [1] = new int[5];
        numbers [2] = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        int [] daddy = new int[5];
        for (int i = 0; i < daddy.length; i++) {

            System.out.println(daddy[0]++);
        }
    }
}