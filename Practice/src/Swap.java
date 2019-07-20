import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int a,b,t;
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		//a=a+b;
		//b=a-b;
		//a=a-b;
		t=a;
		a=b;
		b=t;
		System.out.print(a+" "+b);
		
		// TODO Auto-generated method stub

	}

}
