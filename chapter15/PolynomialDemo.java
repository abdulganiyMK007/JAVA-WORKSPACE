package chapter15;

public class PolynomialDemo {

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new Term(1, 2));
        p.add(new Polynomial(new Term(2, 1)));
        p.add(new Polynomial(new Term(3, 0)));
        System.out.println(p.print());

        Polynomial q = new Polynomial(new Term(1, 1));
        q.add(new Polynomial(new Term(1, 0)));
        System.out.println(q.print());        

        Polynomial f = p.multiply(q);
        System.out.println(f.print());
        
    }
    
}
