package strings;
public class NonRepeated{
	public static void main(String []args) {
		//int input1=1015;
		int repeated[]= new int[10];
		int dc=0;
		int n=121;
		while(n!=0) {
			int d=n%10;
			 repeated[d]++;
			n/=10;
		
		
	}
		for(int i=0;i<10;i++) {
			if(repeated[i]==1) {
				dc++;
			}
		}
		System.out.print(dc);
}
}
