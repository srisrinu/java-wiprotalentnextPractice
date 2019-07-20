package strings;

public class SecondUpper {
	public static String getSecondWordInUppercase(String input1) {
		if (input1.equals(" ")) return("LESS");
		StringBuilder sb=new StringBuilder(input1.trim());
		try {
			int startIndex=sb.indexOf(" ");
			if(startIndex==-1) return("LESS");
			try {
				int endIndex=sb.indexOf(" ",startIndex+1)+1;
				return(sb.substring(startIndex+1,endIndex).toUpperCase().trim());
			}catch(StringIndexOutOfBoundsException e) {
				return(sb.substring(startIndex+1).toUpperCase().trim());
			}
			}catch(StringIndexOutOfBoundsException e) {
				return("LESS");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondUpper s=new SecondUpper();
		System.out.println(s.getSecondWordInUppercase("Hello "));

	}

}
