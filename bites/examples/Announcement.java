package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        Announcement.changeOfPlan();
        Announcement.apology("I am very sorry, señor");
        System.out.println(Announcement.politeNotice());
        System.out.println(Announcement.helpNeeded());
    }

    public static void changeOfPlan() {
        System.out.println("There has been a change of plan");
    }

    public static void apology(String politeMessage) {
        System.out.println(politeMessage);
    }

    public static String politeNotice() {
        return "This is a polite message";
    }

    public static String helpNeeded() {
        return "I need your help, madam";
    }
}
