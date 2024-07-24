package Chapter9;

public class Person {

    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String toString() {
        return getClass().getName() + " [name=" + name + "][yearOfBirth=" + yearOfBirth + "]";
    }

}
