package nl.leon.training.whizlabs.exceptions;

/**
 * @author : Leon Jongsma
 */
public class Exception2 {

    static Integer i;

//    public static void main(String[] args) {
//        try {
//            System.out.println(i.doubleValue());
//
//        } catch (NullPointerException | RuntimeException e) {
//            System.out.println(e.getClass().getSimpleName());
//        }
//
//    }

    public static void main(String[] args) {
        try {
            System.out.println(i.doubleValue());

        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

}
