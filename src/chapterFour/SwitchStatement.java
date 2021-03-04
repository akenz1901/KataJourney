package chapterFour;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String... args) {

//        String prompMessage = """
//                -> Press 1 for igbo.
//                -> Press 2 for Hausa.
//                -> Press 2 for Yoruba.
//                -> Press 3 for English.
//                """;
//
//        System.out.println(prompMessage);
//        Scanner userInputCollector = new Scanner(System.in);
//        int userInput = userInputCollector.nextInt();
//        switch (userInput) {
//
//            case 1:
//                System.out.println("Igbo Kwenu!!!");
//                break;
//
//            case 2:
//                System.out.println("Aboki Kwenu!!!");
//                break;
//
//            case 3:
//                System.out.println("Omo Ilu Mi!!!");
//                break;
//
//            case 4:
//                System.out.println("How far Bro!!!");
//                break;
//            default:
//                System.out.println("Get Lost");
//
//
//        }
String chooseOption = """
        for data click 1
        for customer care 2
        for bonus click 3
        for loan click 4 """;
    Scanner collector = new Scanner(System.in);
    int takeInput = collector.nextInt();
    switch (takeInput){
        case 4:
            System.out.println("You're not eligible for the loan");
            break;
        case 3:
            System.out.println("You have an active bonus");
            break;
        case 1:
            System.out.println("Buy data with *234* ");
            break;
        case 2:
            System.out.println("Dial 111 to get to customer line");
            break;
        default:
            System.out.println("Dial 111 to get to customer line");

    }
    }
}
