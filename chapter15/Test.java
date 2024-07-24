package chapter15;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

    private static Map<String, TreeSet<DistanceTo>> network;
    public static void main(String[] args) {
        initCityMaps();
        
        for (String key : network.keySet()) {
            System.out.println("+ ["+ key +" size : " + network.get(key).size() +"]");
            for (DistanceTo d : network.get(key)) {
                System.out.println(">>> "+ d.getTarget() +": "+ d.getDistance());
            }
        }

        getShortestDistance("", "");
    }

    
    private static void initCityMaps() {
        network = new TreeMap<>();

        TreeSet<DistanceTo> pendletonSet = new TreeSet<>();
        pendletonSet.add(new DistanceTo("Phoenix", 4));
        pendletonSet.add(new DistanceTo("Phoenix", 3));
        pendletonSet.add(new DistanceTo("Phoenix", 1));
        network.put("Pendleton", pendletonSet);

        TreeSet<DistanceTo> phoenixSet = new TreeSet<>();
        phoenixSet.add(new DistanceTo("Pendleton", 4));
        phoenixSet.add(new DistanceTo("Pensacola", 5));
        network.put("Phoenix", phoenixSet);


        TreeSet<DistanceTo> pensacolaSet = new TreeSet<>();
        pensacolaSet.add(new DistanceTo("Phoenix", 5));
        pensacolaSet.add(new DistanceTo("Princeton", 3));
        pensacolaSet.add(new DistanceTo("Prince", 5));
        network.put("Pensacola", pensacolaSet);

        TreeSet<DistanceTo> princetonSet = new TreeSet<>();
        princetonSet.add(new DistanceTo("Pensacola", 5));
        network.put("Princeton", princetonSet);

    }


    


    private static void printQueue(PriorityQueue<DistanceTo> qDistance) {
        String str = "[";
        for (DistanceTo c : qDistance) {
            str += c.getTarget() +": "+ c.getDistance() +", ";
        }

        str += "]";
        System.out.println(str);
    }

    private static void print(Map<String, Integer> where) {
        for (String key : where.keySet()) {
            System.out.println(key +" : "+ where.get(key));
        }
        System.out.println("=====================");
    }

    
    private static int getShortestDistance(String from, String to) {
       
        PriorityQueue<DistanceTo> qDistance = new PriorityQueue<>();
        qDistance.add(new DistanceTo(from, 0));
        Map<String, Integer> shortestKnownDistance = new TreeMap<>();
        
        while (!qDistance.isEmpty()) {
            DistanceTo smallest = qDistance.remove();
            System.out.println("TARGET: "+ smallest.getTarget());

            if (!shortestKnownDistance.containsKey(smallest.getTarget())) {
                int d = smallest.getDistance();
                String target = smallest.getTarget();

                shortestKnownDistance.put(target, d);
                for (DistanceTo c : network.get(target)) {
                    qDistance.add(new DistanceTo(c.getTarget(), d + c.getDistance()));
                }
            }

            print(shortestKnownDistance);
            printQueue(qDistance);
        }

        print(shortestKnownDistance);
        return shortestKnownDistance.get(to);
        
    }

 

}
