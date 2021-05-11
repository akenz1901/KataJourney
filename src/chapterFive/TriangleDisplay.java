package chapterFive;

public class TriangleDisplay {

    public static void main(String[] args) {

//        int go = 1;
//        int empty = 0;
//
//        for (int count = 1; count <=10; count++){
//            for(int babe = 0; babe < empty; babe++){
//                System.out.print(" ");
//            }
//            empty++;
//            for(int lib = go; lib <=10 ; lib++){
//                System.out.print("*");
//            }
//            System.out.println();
//            go++;
//        }
        int go = 10;
        int empty = 10;

        for (int count = 1; count <=10; count++){
            for(int babe = 0; babe < empty; babe++){
                System.out.print(" ");
            }
            empty--;
            for(int lib = go; lib <=10 ; lib++){
                System.out.print("*");
            }
            System.out.println();
            go--;
        }
    }
}
