package nl.leon.ocp.java.interfaces;

public class Bunny implements Hop {

    public void printDetails() {
        System.out.println(Hop.getJumpHeight());
    }
}
