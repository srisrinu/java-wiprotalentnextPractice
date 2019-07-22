import java.io.*;
import  java.util.*;

// Read only region start
class LongestDecreasingSubSequence {

	
	
    public int decreasingSeq(int[] input1,int input2){
    	// Read only region end
        int dcrCount = 0;
		int longestLen = 0;
		
		boolean flag = false;
		
		for (int i = 0; i < input2 - 1; i++) {			
			if (input1[i] > input1[i + 1]) {
				if (flag == false) {
					flag = true;
					
				}
				
				dcrCount++;
				
				longestLen = dcrCount > longestLen ? dcrCount : longestLen; 
			} else {
				if (flag == true) {
					flag = false;
					dcrCount = 0;
				}
			}
		}
		return(longestLen+1);
    }
    public static void main(String []args) {
    	LongestDecreasingSubSequence l=new LongestDecreasingSubSequence();
    	int []input1= {11,5,15,20,15,2,1,0,-1};
    	System.out.println(l.decreasingSeq(input1,input1.length));
    }
}