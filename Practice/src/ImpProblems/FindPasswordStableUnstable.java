package ImpProblems;
import java.util.Arrays;
import java.util.Scanner;

class FindPasswordStableUnstable {
	public int findpassword(int input1,int input2,int input3,int input4) {
		int SumOfStable=0;int SumOfUnstable=0;
	
		if(isStable(input1))SumOfStable+=input1;
		else SumOfUnstable+=input1;
		if(isStable(input2))SumOfStable+=input2;
		else SumOfUnstable+=input2;
		if(isStable(input3))SumOfStable+=input3;
		else SumOfUnstable+=input3;
		if(isStable(input4))SumOfStable+=input4;
		else SumOfUnstable+=input4;
		
		return(SumOfStable-SumOfUnstable);
	}
	public static boolean isStable(int input) {
		int freq[]=new int[10];
		String num=String.valueOf(input);
		boolean isStable=true;
		for(int i=0;i<num.length();i++) {
			freq[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
		}
		int firstFreq=0;
		for(int i=0;i<10;i++) {
			if(freq[i]>0) {
				 firstFreq=freq[i];
				break;
			}
		}
		//Arrays.toString(freq);
		for(int i=0;i<10;i++) {
			if(freq[i]!=0 && freq[i]!=firstFreq) {
				isStable=false;
				break;
				
			}
		}
		return(isStable);
	}
	public static void main(String []args) {
		FindPasswordStableUnstable find=new FindPasswordStableUnstable();
		System.out.println(find.findpassword(11,122,55,12));
	}
}