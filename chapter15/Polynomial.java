package chapter15;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Polynomial {

    private Map<Integer, Term> expression;

    public Polynomial() {
        expression = new TreeMap<>();
    }

    public Polynomial(Term aTerm) {
        expression = new TreeMap<>();
        expression.put(aTerm.getPower(), aTerm);
    }

    public int size() {
        return expression.size();
    }

    public Term get(int i) {
        return expression.get(i);
    }

    @SuppressWarnings("rawtypes")
    public Polynomial multiply(Polynomial multiplicandPolynomial) {
        Polynomial productPolynomial = new Polynomial();
        Iterator multiplicandIterator = multiplicandPolynomial.getKeysIterator();

        while (multiplicandIterator.hasNext()) {
            int multiplicandKey = (int) multiplicandIterator.next();
            Term multiplicandTerm = multiplicandPolynomial.get((int) multiplicandKey);

            Polynomial tempPolynomial = new Polynomial();

            for (Integer multiplierKey : expression.keySet()) {
                Term multiplierTerm = expression.get(multiplierKey);

                int coefficient = multiplierTerm.getCoefficient() * multiplicandTerm.getCoefficient();
                int power = multiplierTerm.getPower() + multiplicandTerm.getPower();

                tempPolynomial.add(new Polynomial(new Term(coefficient, power)));
            }

            productPolynomial.add(tempPolynomial);
        }

        return productPolynomial;
    }


    @SuppressWarnings("rawtypes")
    public void add(Polynomial newPolynomial) {
        Iterator newIterator = newPolynomial.getKeysIterator();

        while (newIterator.hasNext()) {
            int polyKey = (int) newIterator.next();
            expression.merge(polyKey, newPolynomial.get(polyKey), (oldTerm, newTerm) -> addTwoEqualPowerTerms(oldTerm, newTerm));

            if (expression.get(polyKey).getCoefficient() == 0) expression.remove(polyKey);
        }
        
    }

    @SuppressWarnings("rawtypes")
    public Iterator getKeysIterator() {
        return expression.keySet().iterator();
    }

    private Term addTwoEqualPowerTerms(Term oldTerm, Term newTerm) {
        return new Term(oldTerm.getCoefficient() + newTerm.getCoefficient(), oldTerm.getPower());
    }

    public String print() {
        String polynomial = "";
        Term aTerm = null;
        for (Integer key : expression.keySet()) {
            aTerm = expression.get(key);
            polynomial = "("+ aTerm.getCoefficient() +","+ aTerm.getPower() +"),"+ polynomial;
        }

        return polynomial.substring(0, polynomial.length() - 1 );
    }

    public String toString() {
        return "Polynomial ["+ print() +"]";
    }
    
}
