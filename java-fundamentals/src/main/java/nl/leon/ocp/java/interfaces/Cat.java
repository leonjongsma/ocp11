package nl.leon.ocp.java.interfaces;

public class Cat implements Run, Walk {

    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }

    public int getRunSpeed() {
        return Run.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getWalkSpeed());
        System.out.println(new Cat().getRunSpeed());
    }

}
