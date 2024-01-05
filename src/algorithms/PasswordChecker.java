package algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /* * Complete the 'getPasswordStrength' function below.
     * * The function is expected to return a STRING_ARRAY.
     * * The function accepts following parameters:
     * *  1. STRING_ARRAY passwords
     * *  2. STRING_ARRAY common_words */
    public static List<String> getPasswordStrength(List<String> passwords, List<String> common_words) {
        List<String> outputs = new ArrayList();
        final String WEAK = "weak";
        final String STRONG = "strong";
        int cm = 0;
        for(String word : passwords){
            if(word.length() < 6){ cm = 1; }
            else if(word.equals(word.toLowerCase()) || word.equals(word.toUpperCase())){
                cm = 1;
            }else if(containsOnlyDigits(word)){ cm = 1; }

            for(String cword:common_words){
                if(word.contains(cword)){ cm = 1;
                }else if(cword.endsWith(word)){
                    cm = 1;
                }
            } if(cm == 1){
                outputs.add(WEAK);
            }else{
                outputs.add(STRONG);
            } cm = 0;
        }
        return outputs;
    }

    public static boolean containsOnlyDigits(String password){
        int j = 0;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                j++;
            }
        }
        if(j == password.length()){ return true;
        }
        return false;
    } }

public class PasswordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int passwordsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> passwords = IntStream.range(0, passwordsCount).mapToObj(i -> {
            try { return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } }) .collect(toList());
        int common_wordsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> common_words = IntStream.range(0, common_wordsCount).mapToObj(i -> {
            try { return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }) .collect(toList());
        List<String> result = Result.getPasswordStrength(passwords, common_words);
        bufferedWriter.write( result.stream() .collect(joining("\n")) + "\n" );
        bufferedReader.close(); bufferedWriter.close();
    }
}