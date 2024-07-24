package chapter15;

import java.util.Objects;

public class DistanceTo implements Comparable<DistanceTo> {
    private String target;
    private int distance;

    public DistanceTo(String city, int dist) {
        target = city;
        this.distance = dist;
    }

    public String getTarget() {
        return target;
    }

    public int getDistance() {
        return distance;
    }

    public int compareTo(DistanceTo other) {
        return distance - other.distance;
    }

    public int hashCode() {
        return Objects.hash(target, distance);
    }

    public boolean equals(Object other) {
        return (other instanceof DistanceTo && target.equals(((DistanceTo) other).getTarget()));
    }

    
}
