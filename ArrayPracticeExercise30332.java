import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayPracticeExercise30332 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println(" Question 1");
		System.out.println("");
Question1();
System.out.println("");
System.out.println(" Question 2");
System.out.println("");
Question2();
System.out.println("");
System.out.println(" Question 3");
System.out.println("");
Question3();
System.out.println("");
System.out.println(" Question 4");
System.out.println("");
Question4();
System.out.println("");
System.out.println(" Question 5");
System.out.println("");
Question5();
System.out.println("");
System.out.println(" Question 6");
System.out.println("");
Question6();
System.out.println("");
System.out.println(" Question 7");
System.out.println(""); 
Question7();
System.out.println("");
System.out.println(" Question 8");
System.out.println("");
Question8();
System.out.println("");
System.out.println(" Question 9");
System.out.println("");
Question9();
System.out.println("");
System.out.println(" Question 10");
System.out.println("");
Question10();
System.out.println("");
System.out.println(" Question 11");
System.out.println("");
Question11();

	}
public static void Question1() {
	/*
	 * Write a program that creates an array of integers with a length of 3. Assign
	 * the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	int [] arr = {1,2,3};
	for (int i =0; i < arr.length;i++)
	System.out.println("Element at index " + i
            + " : " + arr[i]);
}
public static void Question2() {
	
	/*
	 * Write a program that returns the middle element in an array. Give the
	 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
	 * following output: 7
	 */
int [] arr = {13, 5, 7, 68, 2};
int FirstIndex = 0, LastIndex = arr.length-1;
int MiddleIndex = FirstIndex + (LastIndex - FirstIndex)/2;
System.out.println("The element at the middle of the array is " +arr[MiddleIndex]);
}
public static void Question3() {
	/*
	 * Write a program that creates an array of String type and initializes it with
	 * the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
	 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
	 * the new array to verify that the original array was copied.
	 */
	String [] arr ={"red","green", "blue","yellow"};
	System.out.println("the lenght of the arry is " +arr.length);
	String [] arr2 = arr.clone();
	System.out.println("The new array is " +Arrays.toString(arr2));
}
public static void Question4() {
	/*
	 * Write a program that creates an integer array with 5 elements (i.e.,
	 * numbers). The numbers can be any integers. Print out the value at the first
	 * index and the last index using length - 1 as the index. Now try printing the
	 * value at index = length ( e.g., myArray[myArray.length ] ). Notice the type
	 * of exception which is produced. Now try to assign a value to the array index
	 * 5. You should get the same type of exception.
	 */
	int []arr = {1,2,3,4,5};
	int FirstIndex = 0, LastIndex = arr.length-1;
	
	System.out.println("The value  at the first index is "+ arr[FirstIndex]+ " the value at the last index is "+arr[LastIndex]);
	//System.out.println("The value at the index = length is " +arr[arr.length]);
	
}
public static void Question5() {
	/*
	 * Write a program where you create an integer array with a length of 5. Loop
	 * through the array and assign the value of the loop control variable (e.g., i)
	 * to the corresponding index in the array.
	 */
	int []arr = {1,2,3,4,5,6};
	for (int i : arr) {
		System.out.println(i);
	}
}
public static void Question6() {
	/*
	 * Write a program where you create an integer array of 5 numbers. Loop through
	 * the array and assign the value of the loop control variable multiplied by 2
	 * to the corresponding index in the array.
	 */
	int []arr = {1,2,3,4,5};
	for (int i : arr) {
		i = i*2;
		System.out.println(i);
	}
}
public static void Question7() {
	
	/*
	 * Write a program where you create an array of 5 elements. Loop through the
	 * array and print the value of each element, except for the middle (index 2)
	 * element.
	 */
	int []arr = {1,2,3,4,5};
	for (int i : arr ) {
		
		if (i !=3) {        
			System.out.println(i);
		}
		
	}
}
public static void Question8() {
	
	/*
	 * Write a program that creates a String array of 5 elements and swaps the first
	 * element with the middle element without creating a new array.
	 */
	String [] arr ={"red","green", "blue","yellow","black"};
	int FirstIndex = 0;
	int middle = 2;
	int temp = FirstIndex;
	FirstIndex = middle ;
	middle = temp;

		System.out.println(Arrays.toString(arr));
	}
	
public static void Question9() {
	
	/*
	 * Write a program to sort the following int array in ascending order: {4, 2, 9,
	 * 13, 1, 0}. Print the array in ascending order, and print the smallest and the
	 * largest element of the array. The output will look like the following: Array
	 * in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is 0 The biggest
	 * number is 13
	 */
int [] array = {4,2,9,13,1,0};
int small = array[0];
int large = array[0];

Arrays.sort(array);

System.out.println("\nThe array in ascending order is  ");
for (int arr: array)
{
	System.out.print(arr + "  ");
}
for (int i = 1; i < array.length; i++) {
	
	if (array[i] > large)
		large = array[i];
	else if (array[i]<small)
		small = array[i];
}
System.out.println("");

System.out.println("The smallest number is " +small+ " and the largest number is " +large);
}		
public static void Question10() {
	//Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	Object [] elements = new Object [5];
	elements [0] = 1;
	elements [1] = "string1";
	elements [2] = "string2";
	elements [3] = "string3";
	elements [4] = 2.3;
	
	for (int i = 0; i < elements.length; i++) {
		System.out.println(elements[i]);
	}




  
}
public static void Question11() {
	/*
	 * Write some Java code that asks the user how many favorite things they have.
	 * Based on their answer, you should create a String array of the correct size.
	 * Then ask the user to enter the things and store them in the array you
	 * created. Finally, print out the contents of the array. Example
	 * 
	 * How many favorite things do you have? 7
	 * 
	 * Enter your thing: phone Enter your thing: tv Enter your thing: xbox Enter
	 * your thing: wine Enter your thing: beer Enter your thing: sofa Enter your
	 * thing: book Your favorite things are: phone tv xbox wine beer sofa book
	 */
	Scanner sc = new Scanner(System.in);
	System.out.println("How many favorite things do you have? ");
	int num = sc.nextInt();
	System.out.println("Enter the 1st thing ");
	String thing1 = sc.next();
	System.out.println("Enter the 2nd thing ");
	String thing2 = sc.next();
	System.out.println("Enter the 3rd thing ");
	String thing3 = sc.next();
	System.out.println("Enter the 4th thing ");
	String thing4 = sc.next();
	System.out.println("Enter the 5th thing ");
	String thing5 = sc.next();
	System.out.println("Enter the 6th thing ");
	String thing6 = sc.next();
	System.out.println("Enter the last thing ");
	String thing7 = sc.next();
	
	String [] array = {thing1,thing2,thing3,thing4,thing5,thing6,thing7};
	
		System.out.print("your favorites things are: ");
		for (String arr: array)
		{
			System.out.print(arr + "  ");
		}
	
}
}

