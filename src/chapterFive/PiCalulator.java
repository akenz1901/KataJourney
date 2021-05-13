package chapterFive;

public class PiCalulator {

    public static void main(String[] args){
        double pii = 0;

        System.out.printf("Value   of    Pii %n");
        for(int count = 1; count < 200_000; count++){

            if(count == 1) {
                pii = 4;
            }
            else if(count % 2 == 0){
                pii = pii - (double) 4 / (count + (count - 1));
            }
            else{
                pii = pii + (double) 4 / (count + (count - 1));
            }
            if(pii >= 3.141598 && pii <= 3.14160) {
                System.out.printf("%d %20f%n", count, pii);
            }
        }
    }
}
