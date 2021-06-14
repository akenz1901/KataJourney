package chapterSeven;

public class SevenSegmentDisplay {
    private final int[][] sevenSegmentArray;

    public SevenSegmentDisplay() {
        sevenSegmentArray = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    }

    void display() throws InterruptedException {
        for (int[] digits :sevenSegmentArray) {
            System.out.println();
            for (int singleDigit:digits) {
                switch (singleDigit) {
                    case 1 -> System.out.print("# ");
                    case 0 -> System.out.print("  ");
                }
                Thread.sleep(1000);
            }
        }
    }
    void writeOnA(){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < sevenSegmentArray[i].length; j++) {
                sevenSegmentArray[i][j] = 1;
            }
        }
    }
    void writeOnB(){
        for (int i = 3; i <= 3; i++) {
            for (int j = 0; j < 3; j++) {
                sevenSegmentArray[j][i] = 1;
            }
        }
    }
    void writeOnC(){
        for (int i = 3; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                sevenSegmentArray[j][i] = 1;
            }
        }
    }
    void writeOnD(){
        for (int i = 3; i >= 0; i--) {
            for (int j = 4; j <= sevenSegmentArray[i].length; j++) {
                sevenSegmentArray[j][i] = 1;
            }
        }
    }
    void writeOnE(){
        for (int i = 0; i < 1; i++) {
            for (int j = 4; j >= 2; j--) {
                sevenSegmentArray[j][i] = 1;
            }
        }
    }
    void writeOnF(){
        for (int i = 0; i < 1; i++) {
            for (int j = 2; j >= 0; j--) {
                sevenSegmentArray[j][i] = 1;
            }
        }
    }
    void writeOnG(){
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < sevenSegmentArray[i].length; j++) {
                sevenSegmentArray[i][j] = 1;
            }
        }
    }
}
