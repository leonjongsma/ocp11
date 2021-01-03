package nl.leon.ocp.java.interfaces;

public interface Schedule {

    default void wakeUp() {
        checkTime(7);
    }

    private void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have " +(17-hour)+"hours left " + "to make the appointment");
        }
    }
}
