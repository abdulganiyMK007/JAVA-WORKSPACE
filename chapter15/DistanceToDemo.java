package chapter15;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class DistanceToDemo {

    private static Map<String, TreeSet<DistanceTo>> network;
    public static void main(String[] args) {
        initCityMaps();

        Scanner in = new Scanner(System.in);
        String from = "";
        String to = "";
        String input = "";

        while (true) {
            System.out.print("\nEnter 'F' to find OR 'Q' to quit: ");
            input = in.next();
            if (input.equalsIgnoreCase("F"))  {
                System.out.print("Enter from city: ");
                from = in.next();

                System.out.print("Enter to city: ");
                to = in.next();

                if (!network.containsKey(from)) {
                    System.out.println("City '"+ from +"' is NOT available");
                    continue;
                }

                if (!network.containsKey(to)) {
                    System.out.println("City '"+ to +"' is NOT available");
                    continue;
                }
                // from = "Pendleton";
                // to = "Princeton";
                
                int distance = getShortestDistance(from, to);
                System.out.println("Shortest distance from "+ from +" to "+ to +" : "+ distance);
            } else if (input.equalsIgnoreCase("Q")) {
                System.out.println("[END OF PROGRAM]");
                break;
            } else {
                System.out.println("[INVALID INPUT]");
            }
        }
    
        in.close();
        
    }

    private static int getShortestDistance(String from, String to) {
       
        PriorityQueue<DistanceTo> qDistance = new PriorityQueue<>();
        qDistance.add(new DistanceTo(from, 0));
        Map<String, Integer> shortestKnownDistance = new TreeMap<>();
        
        while (!qDistance.isEmpty()) {
            DistanceTo smallest = qDistance.remove();
            // System.out.println("TARGET: "+ smallest.getTarget());

            if (!shortestKnownDistance.containsKey(smallest.getTarget())) {
                int d = smallest.getDistance();
                String target = smallest.getTarget();

                shortestKnownDistance.put(target, d);
                for (DistanceTo c : network.get(target)) {
                    qDistance.add(new DistanceTo(c.getTarget(), d + c.getDistance()));
                }
            }

            // print(shortestKnownDistance);
            // printQueue(qDistance);
        }

        // print(shortestKnownDistance);
        return shortestKnownDistance.get(to);
        
    }

    private static void initCityMaps() {
        network = new TreeMap<>();

        TreeSet<DistanceTo> pendletonSet = new TreeSet<>();
        pendletonSet.add(new DistanceTo("Pierre", 2));
        pendletonSet.add(new DistanceTo("Pueblo", 8));
        pendletonSet.add(new DistanceTo("Phoenix", 4));
        network.put("Pendleton", pendletonSet);

        TreeSet<DistanceTo> pierreSet = new TreeSet<>();
        pierreSet.add(new DistanceTo("Pendleton", 2));
        pierreSet.add(new DistanceTo("Pueblo", 3));
        network.put("Pierre", pierreSet);

        TreeSet<DistanceTo> puebloSet = new TreeSet<>();
        puebloSet.add(new DistanceTo("Pendleton", 8));
        puebloSet.add(new DistanceTo("Pierre", 3));
        puebloSet.add(new DistanceTo("Peoria", 3));
        puebloSet.add(new DistanceTo("Phoenix", 3));
        network.put("Pueblo", puebloSet);

        TreeSet<DistanceTo> phoenixSet = new TreeSet<>();
        phoenixSet.add(new DistanceTo("Pendleton", 4));
        phoenixSet.add(new DistanceTo("Pueblo", 3));
        phoenixSet.add(new DistanceTo("Peoria", 4));
        phoenixSet.add(new DistanceTo("Pittsburg", 10));
        phoenixSet.add(new DistanceTo("Pensacola", 5));
        network.put("Phoenix", phoenixSet);

        TreeSet<DistanceTo> peoriaSet = new TreeSet<>();
        peoriaSet.add(new DistanceTo("Pueblo", 3));
        peoriaSet.add(new DistanceTo("Phoenix", 4));
        peoriaSet.add(new DistanceTo("Pittsburg", 5));
        network.put("Peoria", peoriaSet);

        TreeSet<DistanceTo> pittsburgSet = new TreeSet<>();
        pittsburgSet.add(new DistanceTo("Peoria", 5));
        pittsburgSet.add(new DistanceTo("Phoenix", 10));
        pittsburgSet.add(new DistanceTo("Pensacola", 4));
        pittsburgSet.add(new DistanceTo("Princeton", 2));
        network.put("Pittsburg", pittsburgSet);

        TreeSet<DistanceTo> pensacolaSet = new TreeSet<>();
        pensacolaSet.add(new DistanceTo("Phoenix", 5));
        pensacolaSet.add(new DistanceTo("Pittsburg", 4));
        pensacolaSet.add(new DistanceTo("Princeton", 5));
        network.put("Pensacola", pensacolaSet);

        TreeSet<DistanceTo> princetonSet = new TreeSet<>();
        princetonSet.add(new DistanceTo("Pittsburg", 2));
        princetonSet.add(new DistanceTo("Pensacola", 5));
        network.put("Princeton", princetonSet);

        // for (String key : network.keySet()) {
        //     System.out.println(key +": " + network.get(key).size());
        //     for (DistanceTo d : network.get(key)) {
        //         System.out.println(">>> "+ d.getTarget() +": "+ d.getDistance());
        //     }
        // }
    }

    // private static void printQueue(PriorityQueue<DistanceTo> qDistance) {
    //     String str = "[";
    //     for (DistanceTo c : qDistance) {
    //         str += c.getTarget() +": "+ c.getDistance() +", ";
    //     }

    //     str += "]";
    //     System.out.println(str);
    // }

    // private static void print(Map<String, Integer> where) {
    //     for (String key : where.keySet()) {
    //         System.out.println(key +" : "+ where.get(key));
    //     }
    //     System.out.println("=====================");
    // }

}
