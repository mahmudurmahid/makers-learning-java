package bites.examples;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz.play(1));
        System.out.println(FizzBuzz.play(3));
        System.out.println(FizzBuzz.play(5));
        System.out.println(FizzBuzz.play(15));
    }

    private static String play(Integer number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "Try again, sunshine";
        }
    }
}
