
public class ArrayCopyXpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]= {1,4,5,3};
int x1[]=new int[x.length];
System.arraycopy(x, 0, x1, 0, x.length);
for(int i=0;i<x1.length;i++) {
	System.out.print(x1[i]+" ");
}
	}

}
