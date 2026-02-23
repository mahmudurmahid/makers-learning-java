package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        System.out.println(Announcement.celebration());
        System.out.println(Announcement.changeOfPlan());
        System.out.println(Announcement.apology());
        System.out.println(Announcement.politeNotice());
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

    public static String politeNotice() {
        return "May I kindly ask you to...";
    }
}
