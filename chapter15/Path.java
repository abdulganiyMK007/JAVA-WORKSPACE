package chapter15;

/**
 * A path in a maze is defined by a starting (row, column)
 * position and a direction (NORTH, EAST, SOUTH, or WEST).
 * A path starts out with the same starting and ending position
 * and direction. It can be extended as the maze is traversed,
 * until it reaches an exit, intersection, or dead end.
 * 
 * Intuitively, think of the path as starting at an intersection
 * and then moving forward, potentially turning along the
 * way, until it reaches another intersection.
 */
public class Path {
   public static final int NORTH = 0;
   public static final int EAST = 1;
   public static final int SOUTH = 2;
   public static final int WEST = 3;

   private static final int[] ROW_OFFSETS = { -1, 0, 1, 0 };
   private static final int[] COLUMN_OFFSETS = { 0, 1, 0, -1 };

   private int startingRow;
   private int startingColumn;
   private int startingDirection;
   private int endingRow;
   private int endingColumn;
   private int endingDirection;

   /**
    * Constructs a path with a given position and direction
    * 
    * @param row       the starting row
    * @param column    the starting column
    * @param direction the starting direction
    */
   public Path(int row, int column, int direction) {
      startingRow = row;
      startingColumn = column;
      startingDirection = direction;
      endingRow = row;
      endingColumn = column;
      endingDirection = direction;
   }

   /**
    * Moves the ending position of this path one unit in the
    * current direction.
    */
   public void move() {
      endingRow = getNextRow();
      endingColumn = getNextColumn();
   }

   /**
    * Turns the ending direction of this path clockwise.
    */
   public void turn() {
      final int DIRECTIONS = 4;
      endingDirection = (endingDirection + 1) % DIRECTIONS;
   }

   /**
    * Gets the ending row of this path.
    * 
    * @return the ending row
    */
   public int getEndingRow() {
      return endingRow;
   }

   /**
    * Gets the ending column of this path.
    * 
    * @return the ending column
    */
   public int getEndingColumn() {
      return endingColumn;
   }

   /**
    * Gets the next row of this path if it continues in the ending
    * direction.
    * 
    * @return the next row
    */
   public int getNextRow() {
      return endingRow + ROW_OFFSETS[endingDirection];
   }

   /**
    * Gets the next column of this path if it continues in the ending
    * direction.
    * 
    * @return the next row
    */
   public int getNextColumn() {
      return endingColumn + COLUMN_OFFSETS[endingDirection];
   }

   /**
    * Checks whether two directions are opposites of each other.
    * 
    * @param dir1 a direction between 0 and 3
    * @param dir2 a direction between 0 and 3
    * @return true if they are opposites (i.e. 0 and 2, 1 and 3,
    *         2 and 0, or 3 and 1)
    */
   private static boolean isOpposite(int dir1, int dir2) {
      return dir1 != dir2 && (dir1 + dir2) % 2 == 0;
   }

   /**
    * Checks whether this path is the opposite of another one.
    * 
    * @param other another path that ends where this path starts
    * @return true if other is the opposite of this path
    */
   public boolean isOpposite(Path other) {
      return startingRow == other.endingRow
            && startingColumn == other.endingColumn
            && isOpposite(startingDirection, other.endingDirection);
   }

   public String toString() {
      String result = "(" + startingRow + "," + startingColumn
            + ")" + "NESW".charAt(startingDirection);
      if (endingRow != startingRow || endingColumn != startingColumn) {
         result = result + "<->(" + endingRow + "," + endingColumn
               + ")" + "NESW".charAt(endingDirection);
      }
      return result;
   }
}
