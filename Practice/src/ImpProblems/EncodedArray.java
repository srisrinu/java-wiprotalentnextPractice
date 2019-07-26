package ImpProblems;
import java.io.*;
import  java.util.*;
class EncodedArray {
    public int findOriginalFirstAndSum(int[] input1){
		int[] out = new int[input1.length];
		out[out.length - 1] = input1[input1.length - 1];
		for (int i = input1.length - 1; i > 0; i--) {
			out[i - 1] = input1[i - 1] - out[i];}
		int sum = 0;
		for (int item : out)
			sum += item;
		/*for(int i=0;i<out.length;i++) {
			System.out.println(out[i]+"\t ");
		}*/
		return(sum);}
    public static void main(String []args) {
    	EncodedArray e=new EncodedArray();
    	int input1[]= {2,5,1,7,9,3};
    	System.out.println(e.findOriginalFirstAndSum(input1)); }}