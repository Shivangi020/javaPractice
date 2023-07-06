package methods;

/* Static methods can be access directly in static and non-static methods */


public class StaticMethod3 {

	static void funcStatic() {
		System.out.println("I am a static method");
	}
	void funcNonStatic() {
		System.out.println("This is non static method , accessing static method ");
		StaticMethod3.funcStatic();
	}
	public static void main(String[] args) {
		StaticMethod3 st = new StaticMethod3();
		st.funcNonStatic();

	}

}

