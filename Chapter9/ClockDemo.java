package Chapter9;

public class ClockDemo {

    public static void main(String[] args) {
        Clock clk = new Clock();
        System.out.println(clk.getHours());
        System.out.println(clk.getMinutes());
        clk.setAlarm(20, 57);
        System.out.println(clk.getTime());
        System.out.println(clk.toString());
        
        WorldClock wck = new WorldClock(3);
        System.out.println(wck.getHours());
        System.out.println(wck.getMinutes());
        System.out.println(wck.getTime());
        System.out.println(wck.toString());
        
    }
    
}
