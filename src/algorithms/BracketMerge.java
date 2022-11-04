package algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BracketMerge {

    public String[] mergeBrackets(int num) {
        List<String> determinedBrackets = new ArrayList<>();
        String open = "(";
        String close = ")";
        StringBuilder finalResult = new StringBuilder();
        boolean constraint = 1 >= num & num <= 8;

        if(constraint){
            switch (num){
                case 1:
                    return new String[]{open + close};
                case 2:
                    for (int i = 1; i <= num; i++) {
                        for (int j = 0; j < num; j++) {
                            finalResult.append(open).append(close);
                            determinedBrackets.add(finalResult.toString());
                        }
                        for (int k = 0; k < num-1; k++) {
                            finalResult = new StringBuilder();
                            finalResult.append(close)
                                    .append(close)
                                    .append(open)
                                    .append(open);
                        }
                    }
                    return determinedBrackets.toArray(new String[0]);
            }
        }

        return new String[]{};
    }

    public static void main(String... args){
        BracketMerge bracketMerge = new BracketMerge();

        System.out.println(Arrays.toString(bracketMerge.mergeBrackets(2)));
    }
}
