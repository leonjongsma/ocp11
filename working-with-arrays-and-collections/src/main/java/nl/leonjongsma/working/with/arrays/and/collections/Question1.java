package nl.leonjongsma.working.with.arrays.and.collections;

import java.util.Map;
import java.util.TreeMap;

public class Question1 {

    /**
     * Given:
     * Map<Integer, String> students = new TreeMap<>();
     * Which one of the following code fragments will generate the output [Aima, Troy, Robin,George]
     *
     *
     */

    public static void main(String[] args) {
        answer1();
        answer2();
        answer3();
        answer4();
    }

    public static void answer1() {
        Map<Integer, String> students = new TreeMap<>();
        students.put(5, "Joshua");
        students.put(1, "Aima");
        students.put(3, "Robin");
        students.put(5, "George");
        students.put(2, "Troy");
        System.out.println(students);
    }

    public static void answer2() {
        Map<Integer, String> students = new TreeMap<>();
        students.put(-1, "Aima");
        students.put(-2, "Troy");
        students.put(-3, "Robin");
        students.put(-4, "George");
        System.out.println(students.values());
    }

    public static void answer3() {
        Map<Integer, String> students = new TreeMap<>();
        students.put(5, "Joshua");
        students.put(1, "Aima");
        students.put(3, "Robin");
        students.put(5, "George");
        students.put(2, "Troy");
        System.out.println(students.values());
    }

    public static void answer4() {
        Map<Integer, String> students = new TreeMap<>();
        students.put(1, "Aima");
        students.put(3, "Robin");
        students.put(2, "Troy");
        students.put(4, "George");
        System.out.println(students.keySet());
    }
}
