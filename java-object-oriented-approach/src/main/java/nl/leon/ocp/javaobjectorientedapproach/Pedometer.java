package nl.leon.ocp.javaobjectorientedapproach;

public class Pedometer {

    private String units;
    private double stride;

    public Pedometer(String units) {
        this.units = units;
    }


    // incorrect use of overloading since using super instead of this
//
//    public Pedometer(String units, double stride) {
//        super("inches");
//        super.stride = 25;
//    }


    /*
        correct overload method.
     */
    public Pedometer(double stride) {
        this("inches");
        this.stride = 25;
    }
    // static method no overloading.
    public static Pedometer init() {
        Pedometer ped = new Pedometer("inches");
        ped.stride = 25;
        return ped;
    }
    // static method, on overloading.
    public static Pedometer init(String units, double stride) {
        Pedometer ped = new Pedometer(units);
        ped.stride = stride;
        return ped;
    }
}
