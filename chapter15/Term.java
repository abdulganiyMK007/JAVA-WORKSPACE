package chapter15;

import java.util.Objects;

public class Term {

    private int coefficient;
    private int power;

    public Term(int coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getPower() {
        return power;
    }

    public int hashCode() {
        return Objects.hash(coefficient, power);
    }

    public boolean equals(Term otherTerm) {
        return (otherTerm.getCoefficient() == coefficient) && (otherTerm.getPower() == power);
    }

    public String toString() {
        return "Term[coefficient: "+ coefficient +", power: "+ power +"]";
    }
    
    
}
