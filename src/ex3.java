
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력해주세요:");
		int number = sc.nextInt();
		
		int result;
		int i = 1;
		
		while(i <= 9) {
			result = number * i;
			System.out.println(number + "x" + i + "=" + result);
			i++;
		}
	

	}

}
