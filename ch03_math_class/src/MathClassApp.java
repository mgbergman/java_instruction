
public class MathClassApp {

	public static void main(String[] args) {
	
		long result1=Math.round(1.667);
		;

		int result2=Math.round(1.49F);
		System.out.println(result2);
		
		long result3=Math.round(1.667);
		System.out.println(result3);
		
		double x = 10.315;
		System.out.println(x);
		x= (double)Math.round(x*100) / 100;
		System.out.println(x);
		
		System.out.println("Generate Random");
		double r = Math.random();
		System.out.println(r);
		r = Math.random() *10;
		System.out.println(r);
		
		int die = (int)(Math.random()*6)+1;
		System.out.println("die roll is "+die);
		
		
	}
	

}
 