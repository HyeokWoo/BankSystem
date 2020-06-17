import java.util.Random;

public class ex5 {

	public static void main(String[] args) {
		Random random = new Random();

		int[] arr = new int[5];
		int i = 0;
		int sum = 0;

		while (i < 5) {
			arr[i] = random.nextInt(100);
			System.out.println(arr[i]);
			i++;
		}

		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}

		System.out.print("¹è¿­ÀÇ ÃÑ ÇÕ:" + sum);
	}

}
