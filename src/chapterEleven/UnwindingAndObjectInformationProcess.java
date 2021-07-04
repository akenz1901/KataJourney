package chapterEleven;

public class UnwindingAndObjectInformationProcess {

    public static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception("Exception was thrown in the 3rd method");
    }

    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception e){
            System.err.printf("%s%n%n", e.getMessage());
            e.printStackTrace();//This line does the same thing the System.out does.


            StackTraceElement[] traceElements = e.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");
            for (StackTraceElement element:traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());



            }

        }
    }
}
