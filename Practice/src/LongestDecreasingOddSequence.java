import java.io.*;
import  java.util.*;

// Read only region start
class LongestDecreasingOddSequence {

	
	
    public int decreasingSeq(int[] input1,int input2){
    	// Read only region end
        int oddCount = 0;
		int longestLen = 0;
		
		boolean flag = false;
		
		for (int i = 0; i < input2; i++) {			
			if (input1[i]%2==1) {
				if (flag == false) {
					flag = true;
					
				}
				
				oddCount++;
				
				longestLen = oddCount > longestLen ? oddCount : longestLen; 
			} else {
				if (flag == true) {
					flag = false;
					oddCount = 0;
				}
			}
		}
		return(longestLen);
    }
    public static void main(String []args) {
    	LongestDecreasingOddSequence l=new LongestDecreasingOddSequence();
    	int []input1= {11,20,15,2,1,0,-1,15,7,3,9,11,13};
    	System.out.println(l.decreasingSeq(input1,input1.length));
    }
}