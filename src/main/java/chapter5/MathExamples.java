package chapter5;

public class MathExamples {

	public static void main(String[] args) {

		int intNumA = 5;
		int intNumB = 3;

		// System.out.println(intNumA + " + " + intNumB + " = "
		//	    + (intNumA + intNumB));
		System.out.println(intNumA + " + " + intNumB + " = "
			    + add(intNumA,intNumB));

		System.out.println(intNumA + " - " + intNumB + " = "
			    + subtract(intNumA,intNumB));
		
		System.out.println(intNumA + " x " + intNumB + " = "
			    + multiply(intNumA,intNumB));

		System.out.println(intNumA + " " + (char)247 + " " + intNumB + " = "
			    + divide(intNumA,intNumB));

		System.out.println(intNumA + " mod " + intNumB + " = "
			    + modulo(intNumA,intNumB));

		System.out.println(intNumA + " to the power of " + intNumB + " = "
			    + exponent(intNumA,intNumB));

		System.out.println();
		
		double dblNumC = 3.1;
		double dblNumD = 5.2;
		
		System.out.println(dblNumC + " + " + dblNumD + " = "
				+ add(dblNumC,dblNumD));

		double dblNumE = 0.1;
		double dblNumF = 0.2;

		System.out.println(dblNumE + " + " + dblNumF + " = "
				+ add(dblNumE,dblNumF));

	}

	public static int add(int intNum1, int intNum2) {
		return intNum1 + intNum2;
	}
	
	public static int subtract(int intNum1, int intNum2) {
		return intNum1 - intNum2;
	}

	public static int multiply(int intNum1, int intNum2) {
		return intNum1 * intNum2;
	}

	public static int divide(int intDividend, int intDivisor) {
		return intDividend / intDivisor;
	}

	public static int modulo(int intDividend, int intDivisor) {
		return intDividend % intDivisor;
	}
	
	public static int exponent(int base, int power) {
		return (int) Math.pow(base, power);
	}
	
	public static double add(double dblNum1, double dblNum2) {
		return dblNum1 + dblNum2;
	}
}
