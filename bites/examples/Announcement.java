package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        Announcement newAnnouncement = new Announcement();

        System.out.println(newAnnouncement.changeOfPlan());
        System.out.println(newAnnouncement.apology());
        System.out.println(newAnnouncement.politeNotice());
        System.out.println(newAnnouncement.helpNeeded());
    }

    public String changeOfPlan() {
        return "There has been a change of plan";
    }
    public String apology() {
        return "I am very sorry, señor";
    }
    public String politeNotice() {
        return "This is a polite message";
    }
    public String helpNeeded() {
        return "I need your help, madam";
    }
}

/* PREVIOUS SOLUTION - static methods whereas above uses instance methods
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
*/