package org.example.Recursivity;

public class RecursivityExercise {
    public static void main(String[] args) {
        sumOfDigitsClasic(12345);
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
}
