package control_statements.conditional_statements;

public class SwitchExample1 {
	public static void main(String[] args) {
		int day = 4;

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Day");
			break;

		// break; is optional in default
		}
	}

}


/*

	//syntax of switch statement
	switch(variable to be tested) {
	
	case value1:
		//body(statements)
		break;
		
	case value2:
		//body(statements)
		break;
		
	case value3:
		//body(statements)
		break;
	'
	'
	'
	'
	default:
		//body(statements)
		break;
		
		//note: break; is optional in default case
	}
	
*/