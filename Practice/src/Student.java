
class StudentDetails{
	public int roll_no;
	public String name;
	StudentDetails(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class Student {
public static void main(String []args) {
	StudentDetails st[]=new StudentDetails[2];
	st[0]=new StudentDetails(1,"srinu");
	st[1]=new StudentDetails(2,"prudvi");
	for(int i=0;i<st.length;i++) {
		System.out.println(st[i].roll_no+" "+st[i].name);
	}
	
}
}
