package bites.examples;

public class Announcement {
    public static void main(String[] args) {
        Announcement myAnnouncement = new Announcement();
        System.out.println(myAnnouncement.celebration());
        System.out.println(myAnnouncement.changeOfPlan());
        System.out.println(myAnnouncement.apology());
        System.out.println(myAnnouncement.politeNotice());
        System.out.println(myAnnouncement.helpNeeded());
    }

    public String celebration() {
        return "Happy belated birthday";
    }

    public String changeOfPlan() {
        return "There has been a change of plans";
    }

    public String apology() {
        return "I am very sorry";
    }

    public String politeNotice() {
        return "May I kindly ask you to...";
    }

    public String helpNeeded() {
        return "I need your help with...";
    }
}
