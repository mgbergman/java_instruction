import java.util.Scanner;

public class hacker {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int n = in.nextInt();
        int ans = 0;
        int t = 2;
        int a = 0;
        int b = 2;
        int n = 10;
		int num0 = a + (1 * b);
		System.out.print (num0 + " ");
		for(int i=0;i<t;i++){
            while (a<=n) {
                num0 = num0 + (((a+1)*2) * b);
                System.out.print (num0 + " ");
                a++;
 //               System.out.print (a);
            }

        }
  
    }
}