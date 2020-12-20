package nl.leon.training.whizlabs.exceptions;

/**
 * @author : Leon Jongsma
 */
public class Exception4 {

    public static void main(String[] args) throws Exception {
        try {
            constructor1();
            constructor2();
            constructor3(new Throwable());
            constructor4(new Throwable());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void constructor1() throws Exception {
        throw new Exception();
    }

    private static void constructor2() throws Exception {
        throw new Exception("message");
    }

    private static void constructor3(Throwable throwable) throws Exception {
        throw new Exception("message",throwable);
    }

    private static void constructor4(Throwable throwable) throws Exception {
        throw new Exception(throwable);
    }
}
