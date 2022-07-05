package algorithms;

public class ZigZagChallenge {

    public static String StringChallenge(String[] strArr) {
        // code goes here

        int number = Integer.parseInt(strArr[1]);
        String word = strArr[0];

        StringBuilder output = new StringBuilder();

        if(word.length() <= number){
            return word;
        }

        for(int theRow = 0; theRow < number; theRow++){

            int n = theRow;
            boolean isUp = true;

            while(n < word.length()){

                output = output.append(word.charAt(n));

                if(theRow == 0 || theRow == number-1){

                    n += (2 * number - 2);
                }
                else{

                    if(isUp){

                        n += (2 * (number - theRow) - 2);
                    }
                    else{
                        n += theRow * 2;
                    }
                    isUp ^= true;
                }
            }
        }

        return output.toString();
    }

//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(StringChallenge(s.nextLine()));
//    }
}
