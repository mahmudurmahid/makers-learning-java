package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
    }

    public static String celebration() {
        return "Happy belated birthday";
    }

    public static String changeOfPlan() {
        return "There has been a change of plans";
    }

    public static String apology() {
        return "I am very sorry";
    }
}
