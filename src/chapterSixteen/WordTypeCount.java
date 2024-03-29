package chapterSixteen;

import java.util.*;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        createMap(map);
        displayMap(map);
    }

    public static void createMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scanner.nextLine();

        String[] collectedTokens = input.split(" ");

        for(String token : collectedTokens){

            String word = token.toLowerCase();

            if(map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            }
            else
                map.put(word, 1);
        }

    }

    public static void displayMap(Map<String, Integer> map){
        Set<String> keys = map.keySet();

        TreeSet<String > sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for(String key : sortedKeys){
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("Size: %d%nisEmpty: %s%n", map.size(), map.isEmpty() ? "Yes": "No");
    }
}
