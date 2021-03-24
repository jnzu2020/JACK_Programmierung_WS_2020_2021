public class GoldbachscheVermutung {
	/*
	 * Die main-Methode. Wie immer kannst du hier eigene Testfaelle schreiben,
	 * es sind aber auch schon ein paar Testfaelle vorgegeben.
	 */
	public static void main(String[] args)	{
		int[] numbers = primeNumbers(4);
		System.out.println("4 = " + numbers[0] + " + " + numbers[1] + ".");
		numbers = primeNumbers(8);
		System.out.println("8 = " + numbers[0] + " + " + numbers[1] + ".");
		numbers = primeNumbers(10);
		System.out.println("10 = " + numbers[0] + " + " + numbers[1] + ".");
		numbers = primeNumbers(12);
		System.out.println("12 = " + numbers[0] + " + " + numbers[1] + ".");
	}
	
	// Aufgabe 1
	public static int[] primeNumbers(int number) {
		int[] numbers = new int[2];
		PrimeNumbers primes = new PrimeNumbers(number);
		for (int i = 0 ; i < number ; i++) {
			for (int j = 0 ; j < number ; j++) {
				if (primes.getPrimeNumber(i) + primes.getPrimeNumber(j) == number) {
					numbers[0] = primes.getPrimeNumber(i);
					numbers[1] = primes.getPrimeNumber(j);
					return numbers;
				}
			}
		}
		return null;
	}
}