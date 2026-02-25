package bites.examples;

public class Test {
    public static void main(String[] args) {
        System.out.println(quoteOne());
        Test.quoteTwo();
        Test.quoteThree("QuoteThree - test");
        System.out.println(quoteFour());
    }

    public static String quoteOne() {
        return "QuoteOne - test";
    }

    public static void quoteTwo() {
        System.out.println("QuoteTwo - test");
    }

    public static void quoteThree(String quote) {
        System.out.println(quote);
    }

    public static String quoteFour() {
        return "QuoteFour - test";
    }
}
