import java.util.Scanner;

public class account_Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int money = 10000;
		char check = 'o';

		System.out.print("�������Է����ּ���:");
		String name = sc.nextLine();
		System.out.print("���¸� �Է����ּ���:");
		int account = sc.nextInt();
		System.out.println("����" + " " + account + " " + "(������:" + name + ")");

		System.out.print("o:�Ա� x:������� ǥ���� �ּ���");
		char respone = sc.next().charAt(0);

		if (check == respone) {
			System.out.print("�󸶸� �Ա� �Ͻðڽ��ϱ�?:");
			int deposit = sc.nextInt();
			if (deposit < 0) {
				System.out.println("0�� �̻��� �ݾ��� �Է��Ͽ� �ֽʽÿ�");
			} else {
				System.out.println(deposit + "���� �Ա��մϴ�.");
				int increase_money = money + deposit;
				System.out.print("�ܾ�:" + increase_money);
			}
		} else {
			System.out.print("�󸶸� ��� �Ͻðڽ��ϱ�?:");
			int withdraw = sc.nextInt();
			if (withdraw < 0) {
				System.out.println("0�� �̻��� �ݾ��� �Է��Ͽ� �ֽʽÿ�");
			} else {
				if (money < withdraw) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("���� �����ܾ�:" + money);
				} else {
					System.out.println(withdraw + "���� ����մϴ�.");
					int decrease_money = money - withdraw;
					System.out.println("�ܿ� �ܾ�:" + decrease_money);
				}
			}
		}
		System.out.print("������ �����մϴ�.");
	}
}
