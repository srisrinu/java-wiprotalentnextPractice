package strings;
public class Mobile{
	public int NNgenerator(String input1){
		StringBuilder numbiarNo = new StringBuilder();
		for (int i = 0; i < input1.length(); i++) {
			int firstDigit = Integer.parseInt(String.valueOf(input1.charAt(i)));
			int firstDigitEvenOrOdd = firstDigit % 2 == 0 ? 0 : 1; // even=0; odd=1
			int sum = firstDigit;
			int j = i + 1;
			if (j == input1.length()) {
				numbiarNo.append(firstDigit);
				break;
			}
			while (true) {
				sum += Integer.parseInt(String.valueOf(input1.charAt(j++)));
				if (sum % 2 != firstDigitEvenOrOdd || j >= input1.length()) {
					numbiarNo.append(sum);
					i = j - 1;
					break;}}}
		return Integer.parseInt(numbiarNo.toString());}
     public static void main(String []args) {
		Mobile m=new Mobile();
		System.out.println(m.NNgenerator("9880127431"));}}