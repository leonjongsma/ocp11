package nl.leon.ocp.functionalprogramming.questions;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question5 {

    public static void main(String[] args) {
        System.out.println(result3());
        System.out.println(result6());
    }

    /** this implementation is not working)
     *
     *
     * @return
     */
//    private static double result1() {
//        return LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//    }

    /**
     * mapToInt missing cast
     */
//    private static double result2() {
//
//        return LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//    }
    private static double result3() {

        return LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
    }

    /**
     *
     * missing boxed()
     */
//    private static double result4() {
//
//        return LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//    }


    /**
     *
     * missing cast to int
     */
//        private static double result5() {
//
//        return LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//    }

    private static double result6() {

        return LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
    }

}
