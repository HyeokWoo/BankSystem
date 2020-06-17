import java.util.Scanner;

public class account_Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int money = 10000;
		char check = 'o';

		System.out.print("성명을입력해주세요:");
		String name = sc.nextLine();
		System.out.print("계좌를 입력해주세요:");
		int account = sc.nextInt();
		System.out.println("계좌" + " " + account + " " + "(예금주:" + name + ")");

		System.out.print("o:입금 x:출금으로 표시해 주세요");
		char respone = sc.next().charAt(0);

		if (check == respone) {
			System.out.print("얼마를 입금 하시겠습니까?:");
			int deposit = sc.nextInt();
			if (deposit < 0) {
				System.out.println("0원 이상의 금액을 입력하여 주십시오");
			} else {
				System.out.println(deposit + "원을 입금합니다.");
				int increase_money = money + deposit;
				System.out.print("잔액:" + increase_money);
			}
		} else {
			System.out.print("얼마를 출금 하시겠습니까?:");
			int withdraw = sc.nextInt();
			if (withdraw < 0) {
				System.out.println("0원 이상의 금액을 입력하여 주십시오");
			} else {
				if (money < withdraw) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 보유잔액:" + money);
				} else {
					System.out.println(withdraw + "원을 출력합니다.");
					int decrease_money = money - withdraw;
					System.out.println("잔여 잔액:" + decrease_money);
				}
			}
		}
		System.out.print("업무를 종료합니다.");
	}
}
