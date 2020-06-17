
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("온도를 입력하세요:");
		int c = sc.nextInt();
		float f = (float) 9 / 5 * c + 32;
		
		System.out.printf("%.1f", f);

	}

}
