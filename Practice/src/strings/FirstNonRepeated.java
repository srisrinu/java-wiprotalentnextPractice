package strings;

public class FirstNonRepeated {
	static final int NO_OF_CHARS=256;
	static char count[]=new char[NO_OF_CHARS];
	static void getcountArray(String str) {
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}
	static int frstnonrepeated(String str) {
		getcountArray(str);
		int index=-1;
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1) {
				index=i;
				break;
			}
		}
		return(index);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str="geeks for geeks";
		int index=frstnonrepeated(str);
		System.out.print(index==-1?"Either all the characters are repeating or string"+"is empty":"frst non-repeated character in a string:"+str.charAt(index));

	}

}
