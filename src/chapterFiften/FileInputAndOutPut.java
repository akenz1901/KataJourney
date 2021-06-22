package chapterFiften;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileInputAndOutPut {

    public static Formatter preview;

    public static void openFile(){

        try{
            preview = new Formatter("student_record.txt");
        }
        catch (SecurityException securityException){
            System.out.println(securityException.getMessage());
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println(fileNotFoundException.getMessage());
            System.exit(1);
        }
    }

    public static void addStudentRecords(){
        Scanner recordInput = new Scanner(System.in);
        System.out.printf("%s%n", "Enter Student info and CTRL D to Exit Loop");
        while(recordInput.hasNext()){

            try{
                String firstName = recordInput.next();
                String lastName = recordInput.next();
                int level = recordInput.nextInt();
                int year = recordInput.nextInt();
                preview.format("%s %s %d %d %d%n ", firstName, lastName, level, year, LocalDate.now().getYear() - year);
            }
            catch (FormatterClosedException closedException){
                System.err.println("An Error Occurred" + closedException.getMessage());
                break;
            }
            catch (NoSuchElementException fileDoesntExist){
                System.err.println("Sorry File Doesn't Exist " + fileDoesntExist.getMessage());
            }
        }
        System.out.println("Loop Ends");
    }
    public static void closeFile(){
        if(preview != null)
            preview.close();
    }
}
