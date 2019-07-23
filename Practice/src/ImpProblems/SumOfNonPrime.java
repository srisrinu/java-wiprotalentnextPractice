package ImpProblems;

public class SumOfNonPrime {
	public static boolean isPrime(int input) {
		boolean prime=true;
		for(int i=2;i<=input/2;i++) {
			if(input%i==0) {
				prime=false;
				break;
			}
		}
		return(prime);
	}
	public int non_prime_sum(int []arr) {
		int sum=0;
		for(int i=2;i<arr.length;i++) {
			if(isPrime(i)) {
				sum+=arr[i];
			}
		}
		return(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNonPrime s=new SumOfNonPrime();
		int arr[]= {11,22,33,44,5555,99};
		System.out.println(s.non_prime_sum(arr));
		
	}

}
