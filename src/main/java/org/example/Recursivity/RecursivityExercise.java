package org.example.Recursivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecursivityExercise {
    private static Map<Long, Long> mapCache = new HashMap<>();
    private static List<Long> listCache = new ArrayList<>();

    static {
        listCache.add(0L);
        listCache.add(1L);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDIgitsR(135192));
//        infiniteLoop(0);
        long start = System.currentTimeMillis();
        System.out.println(fibonacci(1000));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void sumOfDigitsClasic(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;

        }
        System.out.println(sum);

    }

    public static int sumOfDIgitsR(int number) {
        if (number < 10) {
            return number;
        }
        int lastDigit = number % 10;
        int numberWithoutLastDigit = number / 10;
        int resultFromSubProblem = sumOfDIgitsR(numberWithoutLastDigit);
        int curentResult = lastDigit + resultFromSubProblem;
        return curentResult;
    }

    public static void infiniteLoop(long i) {
        System.out.println(i);
        infiniteLoop(i + 1);
    }

    //    0,1,1,2,3,5,8,13,21,34,55....
//    return the n'th element
    public static long fibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
//        if (mapCache.containsKey(n)) {
//            return mapCache.get(n);
//        }
        if (listCache.size() > n) {
            return listCache.get((int) n);
        }

        // return the previous + the other previous number
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        if (listCache.size() == n) {
            listCache.add(result);
        }
//        mapCache.put(n, result);
//        System.out.println("Element on position " + n + " is " + result ) ;
        return result;

    }


}
