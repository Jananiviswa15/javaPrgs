
public class ThirdProgram {

	private static void toCheckLogicalOperators() {
		int num = 10;
		int number1 = 100;
		int number2 = 1000;
		
		
		//&& ,||
		System.out.println((number1 >= num || num >= number2) && number2 >= num);
	}
	
	private static void toUnderstandRealtionalOperators() {
		byte age = 34;
		byte age1 = 100;
		
		System.out.println(age > age1);
		System.out.println(age >= age1);
		System.out.println(age <= age1);
		System.out.println(age < age1);
		System.out.println(age == age1);
		System.out.println(age != age1);
		
	}
	private static void performUnaryOperations() {
		//++ --> increment by 1  //num++ --post incre ++num --> pre inc
		//-- --> decrement by 1  //num-- --post decre --num --> pre dec
		
	/*	int num = 1000;
	//	System.out.println(num);
		System.out.println(++num);  //1st inc by 1 and then assign to the var
		//System.out.println(num);
		System.out.println(num++);// 1st assign val to the var and then inc by 1
		System.out.println(num);
		
		
		System.out.println(--num); //1001
		System.out.println(num--);
	*/	
		short speedLimt = 100;
		//99+99(98)+99+99

		System.out.println(--speedLimt + speedLimt-- + ++speedLimt + speedLimt--);
	}
	private static void performMathOperations() {
		int num = 10; 
		int num1 = 20;
		System.out.println(num+num1);
		System.out.println(num-num1);
		System.out.println(num*num1);
		
		System.out.println((float) num / num1);  //10.0 / 20 = 0.5
		System.out.println(20%2);  //90 / 10 = 9 remai = 0
	}
	
	
	public static void main(String args[]) {
		
		//performMathOperations();
		//performUnaryOperations();
		//toUnderstandRealtionalOperators();
		toCheckLogicalOperators();
	}
}

