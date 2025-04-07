
public class weatherif {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("온도를 입력하세요.");
		
		int degree = input.nextInt();
		System.out.println( );
		
		if (30 <= degree)
			System.out.println("날씨가 덥습니다.");
		
		else
			System.out.println("날씨가 안덥습니다.");
		
		System.out.println("날씨 예보였습니다.");

	}

}
