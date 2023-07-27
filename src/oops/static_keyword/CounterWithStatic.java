//What is the output of this program? Make your Mind as JVM, first think output then run the program to check your output match or not

package oops.static_keyword;

public class CounterWithStatic {

	static int count = 0; // will get memory only once & retain its value.

	
	CounterWithStatic() {
		
		count++;
	}

	
	private void showCount() {
		System.out.println(count);
	}

	
	public static void main(String[] args) {
		new CounterWithStatic().showCount();
		new CounterWithStatic().showCount();
		new CounterWithStatic().showCount();
	}

}
