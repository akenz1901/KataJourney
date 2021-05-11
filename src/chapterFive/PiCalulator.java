package chapterFive;

public class PiCalulator {

    public static void main(String[] args){
        double pii = 0;

        System.out.printf("Value   of    Pii %n");
        for(int count = 1; count < 200_000; count++){

            if(count == 1) {
                pii = 4;
            }
            else if(count == 2){
                pii = pii - (double) 4 / (count + (count - 1));
            }
            else{
                pii = pii + (double) 4 / (count + (count - 1));
            }
            System.out.printf("%d %20.2f%n", count, pii);
        }
    }
}
