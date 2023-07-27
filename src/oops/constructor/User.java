package oops.constructor;

public class User {
	
	//instance/object variable
	String userName;
	String password;

	void printUser() {
		System.out.println("UserName = " + userName);
		System.out.println("Password = " + password);
	}

	// =======================default Constructor=======================
	User() {
		userName = "Deepak";
		password = "test1234";
	}

	// =======================parameterized constructor=======================
	/*
	User(String un, String psw) {
		userName = un;
		password = psw;
	}
	*/
	User(String userName, String password) {
		this.userName = userName;
		this.password = password;   
	}
	
	/*
	 * 	this:
	 * 		# 'this' keyword represents current objet.
	 * 		# we can call instance variables, instance methods and instance constructors using this keyword.
	 * 		
	 * 
	 * 	example: 	
	 * 	1>	this.userName = userName; //calling instance variable
	 *  2> this.printUser(); 		//calling instance methods
	 *  
	 *  3> User() {
	 *  		this();			//calling default constructor
				userName = "Deepak";
				password = "test1234";
			}
			
	 *  4> User(String userName, String password) {
	 *  		this();			//calling parameterized constructor
	 *  
	 *  
				this.userName = userName;
				this.password = password;
			}
	 * 
	 * 		
	 */
	
	
	// arko class ma main method banayera lekhda ni hunxa. eg: UserTest.java class
	public static void main(String[] args) {
		User u1 = new User();
		u1.printUser();
		
		User u2 = new User("Sandy", "sandy@123");
		u2.printUser();
	}
}
