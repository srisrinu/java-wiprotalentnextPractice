package strings;

public class UniqueDigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1015,ud=0;
		boolean unique[]=new boolean[10];
		while(n!=0) {
			int d=n%10;
			if(unique[d]==false) {
				unique[d]=true;
				ud++;
				
			}
			n/=10;
		}
		System.out.print(ud);


	}
	
}
