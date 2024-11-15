package chapter13;

/**
 * This class solves the eight queens problem using backtracking.
 */
public class EightQueens {
   public static void main(String[] args) {
      solve(new PartialSolution(0));
   }

   /**
    * Prints all solutions to the problem that can be extended from
    * a given partial solution.
    * 
    * @param sol the partial solution
    */
   public static void solve(PartialSolution sol) {
      int exam = sol.examine();
      if (exam == PartialSolution.ACCEPT) {
         System.out.println(sol);
      } else if (exam == PartialSolution.CONTINUE) {
         for (PartialSolution p : sol.extend()) {
            solve(p);
         }
      }
   }
}
