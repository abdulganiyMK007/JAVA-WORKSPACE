package chapter18;

public interface Visitor<E> {
   /**
    * This method is called for each visited node.
    * 
    * @param data the data of the node
    */
   void visit(E data);
}
