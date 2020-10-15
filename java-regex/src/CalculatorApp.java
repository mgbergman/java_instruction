
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println(sum(2,4,6,8,10));

	
	
		
	}
	private static int sum (int a, int b ) {
		return a + b;
	
	}
	private static int sum(int ...n) {
		int sum = 0;
		for (int a: n) {
			sum += a;
		}
		return sum;
			
		}
	}

