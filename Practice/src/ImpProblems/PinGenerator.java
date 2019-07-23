package ImpProblems;

public class PinGenerator {
	public static int getPin(int input1, int input2, int input3) {
		int pin = 0;
		int ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(2)));
		int ip2 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(2)));
		int ip3 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(2)));
		
		if (ip1 < ip2 && ip1 < ip3) {
			pin = ip1;
		} else if (ip2 < ip3 && ip2<ip1) {
			pin = ip2;
		} else {
			pin = ip3;
		}
		ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(1)));
		ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(1)));
		ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(1)));
		
		if (ip1 < ip2 && ip1 < ip3) {
			pin = ip1 * 10 + pin;
		} else if (ip2 < ip3 &&ip2<ip1) {
			pin = ip2 * 10 + pin;
		} else {
			pin = ip3 * 10 + pin;
		}
		ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(0)));
		ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(0)));
		ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(0)));
		if (ip1 < ip2 && ip1 < ip3) {
			pin = ip1 * 100 + pin;
		} else if (ip2 < ip3&ip2<ip3) {
			pin = ip2 * 100 + pin;
		} else {
			pin = ip3 * 100 + pin;
		}
		int maxOfAll = 0;
		for (int i = 0; i < 3; i++) {
			ip1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(i)));
			ip2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(i)));
			ip3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(i)));
			if (ip1 > ip2 && ip1 > ip3) {
				maxOfAll = ip1 > maxOfAll ? ip1 : maxOfAll;
			} else if (ip2 > ip3 &ip2>ip1) {
				maxOfAll = ip2 > maxOfAll ? ip2 : maxOfAll;
			} else {
				maxOfAll = ip3 > maxOfAll ? ip3 : maxOfAll;
			}
		}
		pin = maxOfAll * 1000 + pin;
		return pin;
	}
	
	public static void main(String[] args) {
		System.out.println(getPin(123, 582, 175));
	}
}