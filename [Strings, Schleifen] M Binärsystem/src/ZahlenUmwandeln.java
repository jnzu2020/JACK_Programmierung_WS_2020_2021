public class ZahlenUmwandeln
{
	// Aufgabe 1
	public static int binaryToDecimal(String number)
	{
		char[] chars = number.toCharArray();
		int pow = 1;
		int sum = 0;
		for (int i = chars.length - 1 ; i >= 0 ; i--) {
			sum += (pow * Integer.parseInt(chars[i] + ""));
			pow *= 2;
		}
		return sum;
	}
	
	//Aufgabe 2
	public static String decimalToBinary(int number)
	{
		if (number == 0) {
			return "0";
		}
		StringBuilder stringBuilder = new StringBuilder();
		while (number != 0) {
			int rest = number % 2;
			stringBuilder.append(rest);
			number /= 2;
		}
		return stringBuilder.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(binaryToDecimal("101010"));
		System.out.println(decimalToBinary(42));
	}
}
