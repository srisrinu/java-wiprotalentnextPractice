package arrays;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,9,9};
		int res=1;
		for(int i=1;i<a.length;i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(a[i]==a[j]) {
					break;
				}
			}
			if(i==j) {
				res++;
			}
				
			}
		System.out.print(res);
		}

}
