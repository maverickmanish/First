package shweta;

/*Here we will deal with different data members of super and sub classes w.r.t Inherience 
*/
class A {

	int a = 45, b = 65, c = 76;

	void fn() {
		System.out.println("parent fuction");
	}

}

class B extends A {

	int d, e;

	void fn2() {
		System.out.println("child fuction");
	}

}

public class Abstraction_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new B();
		B b = new B();
		System.out.printf(" I've made few changes in the report  for which we're going to Pull the changes !!!! ");
		System.out.printf("The value of instance parameters are as follows : %d : %d : %d : %d : %d  -- ", a.a, a.b,
				a.c/* these variables are out of it's scope ,a.d,a.e */);
		// a.fn2(); as it is out of it's scope
		System.out.printf("The value of instance parameters are as follows : %d : %d : %d : %d : %d  -- ", b.a, b.b,
				b.c, b.d, b.e);
		b.fn2();

		System.out.println(" Demonstration of Downcastng which takes place Indirectly :---");
		B bb = (B) a;
		System.out.printf("The value of instance parameters are as follows : %d : %d : %d : %d : %d :  -- ", bb.a, bb.b,
				bb.c, bb.d, bb.e);

	}

}
