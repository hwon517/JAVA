
public class right_knot {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("몇줄 피라미드 만들지 입력하세요.");
		
		int num_line = input.nextInt();
		System.out.println("줄수: " + num_line);
		int i=0,j=0;
		
		for (i=1;i<=num_line;i++)
		{
			for (j=1;j<=i ;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=2;i<=num_line;i++)
		{
			for (j=1;j<=num_line-i+1 ;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}


}
