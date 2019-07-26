package ImpProblems;
import  java.util.*;
class SumOfPowersOfDigits {
public int sumOfPowerOfDigits(int input1){
	if (input1 <= 9 && input1!=0) return 1;
		String num = String.valueOf(input1);
		int sum = 0;
		for(int i=0;i<num.length();i+=2) {
			if(i==num.length()-1) {
				sum+=1;
			}
			else {
				sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))), Integer.parseInt(String.valueOf(num.charAt(i + 1))));
			}}
		return(sum);}
public static void main(String []args) {
	SumOfPowersOfDigits s=new SumOfPowersOfDigits();
	System.out.println(s.sumOfPowerOfDigits(201));
}}