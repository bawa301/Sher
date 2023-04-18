package oopsConcept;

public class driverAB {
	public static void main(String[] args) {
	 
	   B.test();                  //From B test(), Calling by using class name
	   B obj1=new B();
	   obj1.test();               //From B test() because obj1 is of B type
	   A obj2=obj1;               //upcasting 
	   obj2.test();               //From A test() because obj2 is of A type
	   System.out.println(obj2.a);//10
	   System.out.println(obj1.a);//20
	   System.out.println(B.a);   //20
	}

}
