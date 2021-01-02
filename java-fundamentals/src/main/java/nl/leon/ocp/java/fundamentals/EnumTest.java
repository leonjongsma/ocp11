package nl.leon.ocp.java.fundamentals;

public class EnumTest {

    public void test1() {
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("is it summer yet?");
        }
    }

    public void test2() {
        Season summer = Season.SUMMER;
        switch (summer) {
            case FALL:
            //case Season.FALL: // does not compile
                System.out.println("Rake some leaves");
                break;
            case SUMMER:
                //case 0:// does not compile
                System.out.println("Get out the sled!");
                break;
        }
    }
}
