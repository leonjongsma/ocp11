package nl.leon.training.whizlabs.exceptions;

/**
 * @author : Leon Jongsma
 */
public class Exception6 {
    static Integer i =0;

    public static void main(String[] args) {
        try {
            int x = 10;
            System.out.println(x%i.intValue());
        } catch (NullPointerException e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    }
}
