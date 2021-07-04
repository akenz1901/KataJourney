package chapterEleven;

public class UsingChainedException {
    public static void method1() throws Exception {
        try {
            method2();
        }
        catch (Exception e){
            throw new Exception("Exception was thrown in the 1st method");
        }
    }

    private static void method2() throws Exception {
        try {
            method3();
        }
        catch (Exception e){
            throw new Exception("Exception was thrown in the 2nd method");
        }
    }

    private static void method3() throws Exception {
        throw new Exception("Exception was thrown in the 3rd method");
    }

    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

}
