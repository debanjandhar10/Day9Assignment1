@FunctionalInterface
interface Arithmatic {
	double cube(double a);
	default double square(double a) {
		return a*a;
	}
	default double add(double a, double b) {
		return a+b;
	}
	static double sub(double a, double b) {
		return a-b;
	}
	static double mul(double a, double b) {
		return a*b;
	}
	static double div(double a, double b) {
		return a/b;
	}
}

// Implement cube and test 
public class Question1 implements Arithmatic {
	@Override
	public double cube(double a) {
		return a*a*a;
	}
	
	public static void main(String[] args) {
		Question1 c = new Question1();
		System.out.println("1+1="+c.add(1, 1));
		System.out.println("2^2="+c.square(2));
		System.out.println("2^3="+c.cube(2));
		System.out.println("2-1="+Arithmatic.sub(2, 1));
		System.out.println("2*3="+Arithmatic.mul(2,3));
		System.out.println("4/2="+Arithmatic.div(4, 2));
	}

}
