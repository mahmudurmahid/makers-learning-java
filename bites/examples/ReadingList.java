package bites.examples;
import java.util.ArrayList;

public class ReadingList {
    String[] unread = new String[5];

    private void addBook(String book) {
        Boolean findBookSpace = true;
        Integer index = 0;

        while (findBookSpace) {
            if (unread[index] == null) {
                unread[index] = book;
                findBookSpace = false;
            } else {
                index++;
            }
        }
    }

    public static void main(String[] args) {
        ReadingList myReadingList = new ReadingList();
        myReadingList.addBook("The Lion, The Witch, & The Wardrobe");
        myReadingList.addBook("The Cat In The Hat");
        myReadingList.addBook("The Bible");
        myReadingList.addBook("Harry Potter: The Philosopher's Stone");
        myReadingList.addBook("Java for Dummies");

        System.out.println(myReadingList.unread[0]);
        System.out.println(myReadingList.unread[1]);
        System.out.println(myReadingList.unread[2]);
        System.out.println(myReadingList.unread[3]);
        System.out.println(myReadingList.unread[4]);
    }
}
