
public class Array {

	int speedLimit;
	public static void main(String args[]) {
		
		int num;
		byte age;
		
		int array[]  = new int[10];//int []array; int[] array;  //decla 1d 
		int marks[] = {23,78,90,56,56,0}; //length
		short values[] = {23,78,90,56,56,0};
		byte arrValues[] = {23,78,90,56,56,0};
		
		array[2] = 23;
	
		boolean array1[] = {true, false, true};
		char ch[] = {'a','b'};
		//System.out.println(marks.length);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		//System.out.println(marks[6]);
		
		System.out.println(array.length);  //[I@372f7a8d //[S@372f7a8d ,[Z@372f7a8d	[B@2f92e0f4
		System.out.println(array[4]);
		//System.out.println(arrValues); 
		
		//cn obj = new cn();
		Array firstObject = new Array();
	}
}
