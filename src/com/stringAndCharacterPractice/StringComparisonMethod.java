package com.stringAndCharacterPractice;

public class StringComparisonMethod {

    public static void main(String[] args) {
        String first_object = new String("mercy");
        String second_object = "hello word";
        String third_object = "good morning";
        String fourth_object = "Good morning";

        if (first_object.equals("mercy")){
            System.out.println(first_object + " is equals to the object mercy");
        }
        else
            System.out.println("It's not equals to mercy");

        if(first_object == "mercy"){
            System.out.println("It's equals to mercy");
        }
        else
            System.out.println("It's not equals cause they are not the same object");

        if(third_object.equalsIgnoreCase(fourth_object)){
            System.out.printf("%s is equals to %s using ignoreCase%n", third_object, fourth_object);
        }
        else{
            System.out.println(third_object + " is not equal"  + fourth_object);
        }

        System.out.printf("%nfirst_object.compareTo(second_object) is %d", first_object.compareTo(second_object));
        System.out.printf("%nsecond_object.compareTo(first_object) is %d", second_object.compareTo(first_object));
        System.out.printf("%nfirst_object.compareTo(first_object) is %d", first_object.compareTo(first_object));
        System.out.printf("%nthird_object.compareTo(fourth_object) is %d", third_object.compareTo(fourth_object));
        System.out.printf("%nfourth_object.compareTo(third_object) is %d", fourth_object.compareTo(third_object));

        if (first_object.regionMatches(0, second_object, 0, 5)) {
            System.out.println("\nfirst 5 of first and second are same");
        }
        else
            System.out.println("\nfirst and second are not the same");

        if (fourth_object.regionMatches(0, third_object, 0, 5)) {
            System.out.println("First 5 Third and fourth are same ");
        }
        else
            System.out.println("Neither fourth and third are the same");
    }
}
