package bites.examples;

public class Quotes {
    public static void main(String[] args) {
        System.out.println(Quotes.albertEinstein());
        System.out.println(Quotes.mayaAngelou());
        System.out.println(Quotes.nelsonMandela());
        System.out.println(Quotes.oscarWilde());
    }

    public static String albertEinstein() {
        return "Life is like riding a bicycle. To keep your balance, you must keep moving.";
    }

    public static String mayaAngelou() {
        return "You will face many defeats in life, but never let yourself be defeated.";
    }

    public static String nelsonMandela() {
        return "It always seems impossible until it's done.";
    }

    public static String oscarWilde() {
        return "Be yourself; everyone else is already taken.";
    }
}
