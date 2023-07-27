package control_statements.conditional_statements;

public class IfElseIfExample1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 2;
		
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c){
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
}
