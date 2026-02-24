package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName() {
        return this.name;
    }

    public Integer getYearOfCreation() {
        return this.yearOfCreation;
    }

    public String getCreator() {
        return this.creator;
    }

    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage("Java", 1991, "James Gosling");

        System.out.println(programmingLanguage.getName());
        System.out.println(programmingLanguage.getYearOfCreation());
        System.out.println(programmingLanguage.getCreator());
    }
}
