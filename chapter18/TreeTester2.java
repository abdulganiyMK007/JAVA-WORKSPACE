package chapter18;

/**
 * This class demonstrates the advanced techniques in BinarySearchTree2.
 */
public class TreeTester2 {
   public static void main(String[] args) {
      BinarySearchTree2<Student> students = new BinarySearchTree2<>();
      // Can form BinarySearchTree2<Student> even though Student
      // implements Comparable<Person> and not Comparable<Student>

      students.add(new Student("Romeo", "Art History"));
      students.add(new Student("Juliet", "CS"));
      students.add(new Student("Tom", "Leisure Studies"));
      students.add(new Student("Diana", "EE"));
      students.add(new Student("Harry", "Biology"));

      class PrintVisitor implements Visitor<Object> {
         public void visit(Object data) {
            System.out.println(data);
         }
      }

      // Can pass a Visitor<Object>, not just a Visitor<Student>
      students.inorder(new PrintVisitor());
   }
}
