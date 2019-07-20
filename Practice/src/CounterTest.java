
public class CounterTest {
public static int Count;
public CounterTest() {
	Count++;
}
public static void main(String []args) {
	CounterTest c1=new CounterTest();
	System.out.println("Number of objects before counter test:"+CounterTest.Count);
	CounterTest c2=new CounterTest();
	System.out.println("Number of objects after counter test:"+CounterTest.Count);
	Runtime r=Runtime.getRuntime();
	c1=null;
	c2=null;
	r.gc();
}
public void finalize() {
	System.out.println("Program about to terminate");
	CounterTest.Count--;
	System.out.println("Number of objects:"+CounterTest.Count);
	
	
}
}
