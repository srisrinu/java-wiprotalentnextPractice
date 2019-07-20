
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {65,78,97,100};
		char t[]=new char[ar.length];
		for(int i=0,j=0;i<ar.length;i++,j++) {
			t[j]=(char)ar[i];
			
		}
		for(int i=0;i<t.length;i++) {
			System.out.print(t[i]+" ");
		}

	}

}
