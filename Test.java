package test;//???

public class Test {//This is a a class called "Test".
	
	public static void main(String[] args) {//???
		System.out.println("This is a program for creating kettles.");//This is saying to print out the text.
		Kettle Nathan = new Kettle ("Chrome", "Hotpoint", 500);//This is setting a kettle called Nathan with those attributes.
		System.out.println(Nathan);//This is saying to print out Nathan.
		Nathan.fillup(25);//This is saying to fillup Nathan kettle by 25.
		System.out.println(Nathan);//This is saying to print out Nathan kettle.
		Nathan.pour();//This is saying to pour.
		System.out.println(Nathan);//This is saying to print out Nathan.
	}
	
}