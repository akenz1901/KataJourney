package chapterSeventeen;

import java.util.stream.IntStream;

public class StreamAndLambda {

    public static void main(String[] args) {
        int result = IntStream.range(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum();
        System.out.println(result);
    }
}
