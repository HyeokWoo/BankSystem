import java.util.Scanner;

class BankAccount {
	String mUserName;
	int mUserAccountNumber = 0;
	int mUserAmount = 0;

	public void information() {

		System.out.println(mUserName + "님");
		System.out.println("계좌번호:" + mUserAccountNumber);
		System.out.println("잔여 금액:" + mUserAmount);
	}

}

public class BankAccountManagementSystem {
	static Scanner sc = new Scanner(System.in);
	static BankAccount bankAccount = new BankAccount();

	public static void ResisterUser() {
		Scanner sc = new Scanner(System.in);

		System.out.print("성명을입력해주세요:");
		bankAccount.mUserName = sc.nextLine();

		System.out.print("계좌를 입력해주세요:");
		bankAccount.mUserAccountNumber = sc.nextInt();

	}

	public static void changeAmount() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입출금을 하시겠습니까: 네/아니오");
		char select = sc.next().charAt(0);
		if (select == '네') {

			System.out.println("입금 > o ,출금 > x");
			char choice = sc.next().charAt(0);

			if (choice == 'o') {

				System.out.print("얼마를 입금하시겠습니까?:");
				int deposit = sc.nextInt();
				if (deposit <= 0) {
					System.out.println("1원 이상을 입력해주세요");
				} else {
					bankAccount.mUserAmount += deposit;
					System.out.println(deposit + "원이 입금되었습니다.");
				}

			} else {

				System.out.print("얼마를출입금하시겠습니까?:");
				int withdraw = sc.nextInt();
				if (withdraw < bankAccount.mUserAmount) {
					System.out.println("잔액이 부족합니다.");
				} else {
					bankAccount.mUserAmount -= withdraw;
				}
				System.out.println("잔액:" + bankAccount.mUserAmount);
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
		if (check == '네') {
			inquiry();
		}
		System.out.println(CommonMessage.MSG_SYSTEM_SHUTDOWN);

	}

}
