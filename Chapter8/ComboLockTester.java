public class ComboLockTester {

    public static void main(String[] args) {
        ComboLock lock = new ComboLock(5, 35, 0);
        lock.turnRight(5);
        lock.turnLeft(10);
        lock.turnRight(5);
        System.out.println("OPEN: " + lock.open());

        ComboLock lock1 = new ComboLock(20, 25, 25);
        lock1.turnRight(20);
        lock1.turnRight(5);
        lock1.turnRight(45);
        System.out.println("OPEN: " + lock1.open());
        lock1.reset();
        lock1.turnRight(20);
        lock1.turnLeft(35);
        lock1.turnLeft(40);
        System.out.println("OPEN: " + lock1.open());
        lock1.reset();
        lock1.turnRight(20);
        lock1.turnLeft(35);
        lock1.turnRight(40);
        System.out.println("OPEN: " + lock1.open());

    }

}
