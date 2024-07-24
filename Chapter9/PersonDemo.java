package Chapter9;

public class PersonDemo {

    public static void main(String[] args) {
        Person person1 = new Person("personName", 11111);
        Person person2 = new Student("studentName", 2222, "studentMajor");
        Person person3 = new Instructor("instructorName", 3333, 20000);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
