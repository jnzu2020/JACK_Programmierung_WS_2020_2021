public class Fibonacci {
	//Hier koennen Sie Ihre Ergebnisse Testen.
	public static void main(String[] args) {
		// Testaufruf
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(12));
	}
	//Aufgabe 1
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}