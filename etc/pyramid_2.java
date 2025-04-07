package pyramid_oo;
public class pyramid_2 {

	static int i=0,j=0,space=0,k=0;
	static String blank="";
	static void left_p(int lines) {
	space = lines/2 +1;
	 blank="";
	   for (k=1;k<=space;k++)
		blank=blank + " ";
	
		for (i=1;i<=lines;i++) {
			System.out.print(blank);
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	static void left_p_reverse(int lines) {
		space = lines/2 +1;
		 blank="";
		   for (k=1;k<=space;k++)
			blank=blank + " ";
		   
		   
		for (i=1;i<=lines;i++) {
			System.out.print(blank);
			for (j=1;j<=lines-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	static void normal_p_reverse(int lines) {
		
		   
		for (i=1;i<=lines;i++) {
			for (k=1;k<=i-1;k++)
				System.out.print(" ");
			for (j=1;j<=(lines-i+1)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args) {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("How Many Lines?");
			
			int num = input.nextInt();
				left_p(num);
				left_p_reverse(num-1);
				normal_p_reverse(num);
		}
	}

