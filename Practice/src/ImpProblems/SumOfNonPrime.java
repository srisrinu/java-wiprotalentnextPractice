package ImpProblems;
public class SumOfNonPrime {
	public static boolean isPrime (int input1) {
		if (input1==0 || input1==1) return false;
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int non_prime_sum(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(!isPrime(i)) {
				sum+=arr[i];
			}
		}
		return(sum);
	}
	public static void main(String[] args) {
		SumOfNonPrime s=new SumOfNonPrime();
		int arr[]= {11,22,33,44,1,99,55,97};
		 System.out.println(s.non_prime_sum(arr));
		
	}

}
