package bites.examples;

public class FizzBuzz {
    public static void main(String[] args) {
//        System.out.println(FizzBuzz.play(1));
//        System.out.println(FizzBuzz.play(3));
//        System.out.println(FizzBuzz.play(5));
//        System.out.println(FizzBuzz.play(15));

//        for (int number = 1; number <= 100; number ++) {
//            System.out.println(String.format("%s: %s", number, FizzBuzz.play(number)));
//        }
        int number = 1;
        while (number <= 100) {
            System.out.println(String.format("%s: %s", number, FizzBuzz.play(number)));
            number ++;
        }
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
