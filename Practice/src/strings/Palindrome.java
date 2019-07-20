package strings;

public class Palindrome {
	public static void main(String []args) {
		int n=18981;
		String s="";
		while(n!=0) {
			s+=n%10;
			n/=10;
		}
		System.out.println(s);
		if(Integer.valueOf(s)==n) {
			System.out.println(5);
		}
		else if(Integer.valueOf(s)!=n) {
			System.out.println(4);
		}
	}
}
