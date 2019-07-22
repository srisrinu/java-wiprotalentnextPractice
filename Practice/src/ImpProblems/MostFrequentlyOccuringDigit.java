package ImpProblems;
import  java.util.*;

// Read only region start
class MostFrequentlyOccurringDigit {

	public int mostFrequentlyOccurringDigit(int[] input1,int input2){
		// Read only region end
		StringBuilder input = new StringBuilder();
		for (int ip : input1) input.append(ip);

		int[] freq = new int[10];
		for (int j = 0; j < input.length(); j++) {
			freq[Integer.parseInt(String.valueOf(input.charAt(j)))]++;
		}

        	int maxFreqIndex = 0;
		int maxFreq = 0;
		
		for (int i = 9; i >= 0; i--) {
			if (freq[i] > maxFreq) {
				maxFreqIndex = i;
				maxFreq = freq[i];
			}
		}
		
		//System.out.println(Arrays.toString(freq) + " max i: " + maxFreqIndex);			
		return maxFreqIndex;
	}
	public static void main(String []args) {
		MostFrequentlyOccurringDigit mfod=new MostFrequentlyOccurringDigit ();
		int input1[]= {123,556,110,110,120};
		System.out.println(mfod. mostFrequentlyOccurringDigit(input1,5));
	}}