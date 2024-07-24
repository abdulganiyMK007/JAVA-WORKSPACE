public class StudentIDTester {

    public static void main(String[] args) {
        StudentID alice = new StudentID();
        alice.setName("Alice Njoku");

        StudentID bayo = new StudentID();
        bayo.setName("Bayo Agbabiaka");

        StudentID caro = new StudentID();
        caro.setName("Caro Beta");

        System.out.println("Name: " + alice.getName() + ". ID: " + alice.getId());
        System.out.println("Name: " + bayo.getName() + ". ID: " + bayo.getId());
        System.out.println("Name: " + caro.getName() + ". ID: " + caro.getId());
    }

}
