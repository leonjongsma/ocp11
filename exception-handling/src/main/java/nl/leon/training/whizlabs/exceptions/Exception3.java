package nl.leon.training.whizlabs.exceptions;

/**
 * @author : Leon Jongsma
 */
public class Exception3 {

    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
            if (e instanceof ArrayIndexOutOfBoundsException) {
                throw new ArrayIndexOutOfBoundsException("Out of bounds");
            } else if (e instanceof NullPointerException) {
                throw new NullPointerException("Null value");
            } else {
                throw new ArithmeticException("Arithmetic");
            }
        }
    }
}
