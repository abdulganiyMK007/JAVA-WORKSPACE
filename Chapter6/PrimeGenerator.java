package Chapter6;


/*
Prime numbers. Write a program that prompts the user for an integer and then prints out all prime numbers up to that integer. For example, when the user enters 20, the program should print 

2 
3 
5 
7 
11 
13 
17 
19 

Recall that a number is a prime number if it is not divisible by any number except 1 and itself. Use a class PrimeGenerator with methods nextPrime and isPrime. Supply a class PrimePrinter whose main method reads a user input, constructs a Prime Generator object, and prints the primes.
*/
public class PrimeGenerator {

	private final int MAX_PRIME_RANGE = 1000;

	private int nextPrimePosition;

	public PrimeGenerator() {
	  nextPrimePosition = 0;
	}
	
	public boolean isPrime(int digit) {
		boolean isPrime = true;
	  
	  if (digit == 2) return true;
	  if (digit % 2 == 0) return false;
	  if (digit < 2) return false;
	  
  	
  	for (int i = 1; i < digit / 2; i += 2) {
  		if (i == 1) continue;
  		
  		if (digit % i == 0) {
  			isPrime = false;  
  			break;
  		}
  	}
  	
  	return isPrime;
	}
	
	public int nextPrime() {
		nextPrimePosition++;
		return getPrimeAt(nextPrimePosition);
	}
	
	
	private int getPrimeAt(int digit) {
	  
	  boolean isPrime = true;
  	int primeCounter = 1;
  	int nextPrime = 0;
  	
  	if (digit == 1) return 2;
  	
  	for (int i = 3; i < MAX_PRIME_RANGE; i += 2) {
  		for (int j = 3; j < i; j += 2) {
  			if (i % j == 0) {
  			  isPrime = false;
  			  break;
  			}
  		}
  	  
  	  if (isPrime) primeCounter++;
  	  
  	  if (primeCounter == digit) {
  	  	nextPrime = i;
  	  	break;
  	  }
  	  	
  	  isPrime = true;
  	}
	  
	  return nextPrime;
	}






}
