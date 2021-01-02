package nl.leon.ocp.java.fundamentals;

public class ZooInfo {

    private void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur ;
        if (isWeekend) lemur = 5;
        else lemur = 10;
        System.out.println(giraffe + "" + lemur);
    }

    private void printZooInfo2(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) lemur = 5;
        else lemur = 3;
        //giraffe = 3;
        System.out.println(giraffe + "" + lemur);
    }

    public static void main(String[] args) {

    }
}
