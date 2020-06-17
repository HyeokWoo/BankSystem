import java.util.Scanner;

class BankAccount {
	String mUserName;
	int mUserAccountNumber = 0;
	int mUserAmount = 0;

	public void information() {

		System.out.println(mUserName + "��");
		System.out.println("���¹�ȣ:" + mUserAccountNumber);
		System.out.println("�ܿ� �ݾ�:" + mUserAmount);
	}

}

public class BankAccountManagementSystem {
	static Scanner sc = new Scanner(System.in);
	static BankAccount bankAccount = new BankAccount();

	public static void ResisterUser() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������Է����ּ���:");
		bankAccount.mUserName = sc.nextLine();

		System.out.print("���¸� �Է����ּ���:");
		bankAccount.mUserAccountNumber = sc.nextInt();

	}

	public static void changeAmount() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������� �Ͻðڽ��ϱ�: ��/�ƴϿ�");
		char select = sc.next().charAt(0);
		if (select == '��') {

			System.out.println("�Ա� > o ,��� > x");
			char choice = sc.next().charAt(0);

			if (choice == 'o') {

				System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�?:");
				int deposit = sc.nextInt();
				if (deposit <= 0) {
					System.out.println("1�� �̻��� �Է����ּ���");
				} else {
					bankAccount.mUserAmount += deposit;
					System.out.println(deposit + "���� �ԱݵǾ����ϴ�.");
				}

			} else {

				System.out.print("�󸶸����Ա��Ͻðڽ��ϱ�?:");
				int withdraw = sc.nextInt();
				if (withdraw < bankAccount.mUserAmount) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else {
					bankAccount.mUserAmount -= withdraw;
				}
				System.out.println("�ܾ�:" + bankAccount.mUserAmount);
				System.out.println(CommonMessage.MSG_SYSTEM_SHUTDOWN);
			}

		} else {
			System.out.println(CommonMessage.MSG_SYSTEM_SHUTDOWN);
		}

	}

	public static void inquiry() {
		Scanner sc = new Scanner(System.in);

		bankAccount.information();

	}

	public static void operate() {
		ResisterUser();
		changeAmount();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char check;

		operate();

		System.out.print(CommonMessage.MSG_QUERY_USER_INFO);
		check = sc.next().charAt(0);
		if (check == '��') {
			inquiry();
		}
		System.out.println(CommonMessage.MSG_SYSTEM_SHUTDOWN);

	}

}
