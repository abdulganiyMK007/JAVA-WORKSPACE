/*
Implement a class Robot that simulates a robot wandering on an 
infinite plane. The robot is located at a point with integer 
coordinates and faces north, east, south, or west. 
Supply methods

public void turnLeft()
public void turnRight()
public void move()
public Point getLocation()
public String getDirection()

The turnLeft and turnRight methods change the direction but not 
the location. The move method moves the robot by one unit in the
direction it is facing. The get Direction method returns a 
string "N", "E", "S", or "W".
 */

import java.awt.*;

public class Robot {

    private static final int NORTH = 0;
    private static final int EAST = 1;
    private static final int SOUTH = 2;
    private static final int WEST = 3;

    private int row;
    private int column;
    private int direction; // 0 = North, 1 = East, 2 = South, 3 = West

    public Robot() {
        row = column = direction = 0;
    }

    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;

            case WEST:
                direction = SOUTH;
                break;

            case SOUTH:
                direction = EAST;
                break;

            case EAST:
                direction = NORTH;
                break;

            default:
                break;
        }
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround() {
        turnLeft();
        turnLeft();
    }

    public void move() {
        moveOneUnit();
    }

    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            moveOneUnit();
        }
    }

    private void moveOneUnit() {
        if (direction == NORTH) {
            row++;
        } else if (direction == EAST) {
            column++;
        } else if (direction == SOUTH) {
            row--;
        } else if (direction == WEST) {
            column--;
        }
    }

    public Point getLocation() {
        Point location = new Point(column, row);
        return location;
    }

    public String getDirection() {
        switch (direction) {
            case NORTH:
                return "N";

            case WEST:
                return "W";

            case SOUTH:
                return "S";

            default:
                return "E";
        }
    }

}
