package nl.leon.ocp.java.fundamentals.localclass;

public class PrintNumbers {

    private int length = 5;

    public void calculate() {
        final int width = 20;

        class MyLocalClass {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        final MyLocalClass localClass = new MyLocalClass();
        localClass.multiply();
    }

    public void procesData() {
        final int length = 5;
        int width = 10;
        int height = 2;

        class VolumeCalculator {
            public int multiply() {
                return length * width * height;
            }
        }
        // width = 2;
    }


    public static void main(String[] args) {
        PrintNumbers outer = new PrintNumbers();
        outer.calculate();
    }
}
