import java.util.Scanner;

public class MoneyBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가계부 프로그램
		// 1. 내역 등록
		// 2. 수입
		// 3. 지출
		// 4. 잔액
		// 5. 전체 수입 금액
		// 6. 전체 지출 금액
		final int MAX = 2;
				
		String date[] = new String[MAX];
		int inMoney[] = new int[MAX];
		int outMoney[] = new int[MAX];
		String list[] = new String[MAX];
		int balance = 0;
		int totalInMoney = 0;
		int totalOutMoney = 0;
		
		int select = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- 가계부 프로그램 --");
			
			while(true) {
				System.out.println("------------------------");
				System.out.println("<< 메뉴 >>");
				System.out.println("1. 내역 등록 ");
				System.out.println("2. 전체 출력 ");
				System.out.println("3. 수입 출력 ");
				System.out.println("4. 지출 출력 ");
				System.out.println("5. 종료 ");
				System.out.print("선택> ");
				select = scan.nextInt();
				
				if(select == 5) {
					System.out.println("프로그램을 종료합니다.");
						break;}
				
				switch(select) {
					case 1:
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							
							scan.nextLine();
							System.out.println("날짜 : ");
							date[i] = scan.nextLine();
							
							System.out.println("수입 금액 : ");
							inMoney[i] = scan.nextInt();	
							totalInMoney += inMoney[i];
							
							System.out.println("지출 금액 : ");
							outMoney[i] = scan.nextInt();
							totalOutMoney += outMoney[i];
							
							System.out.println("내역 : ");
							list[i] = scan.next();		
						}	
						balance = totalInMoney - totalOutMoney;
						break;
					case 2:
						System.out.println();
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							System.out.println(" 날짜 : " + date[i]);
							System.out.println(" 수입 : " + inMoney[i] + "원");
							System.out.println(" 지출 : " + outMoney[i] + "원");
							System.out.println(" 내역 : " + list[i]);
							System.out.println();
						}//1~MAX까지의 내역이 전체 출력되야 하므로 배열로 받음
						System.out.println("--------------------------");
						System.out.println(" 전체 수입 금액 : " + totalInMoney + "원");
						System.out.println(" 전체 지출 금액 : " + totalOutMoney + "원");
						System.out.println(" 전체 잔액 : " + balance + "원");
						break;
					case 3:
						System.out.println();
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							System.out.println(" 날짜 : " + date[i]);
							System.out.println(" 수입 : " + inMoney[i] + "원");
							System.out.println(" 잔액 : " + balance + "원");
							System.out.println(" 내역 : " + list[i]);
							System.out.println();
						}
						System.out.println(" 전체 수입 금액 : " + totalInMoney + "원");
						break;
					case 4:
						totalOutMoney = -(totalOutMoney);
						System.out.println();
						for(int i = 0; i < MAX; i++) {
							System.out.println("--------------------------");
							System.out.println(" 날짜 : " + date[i]);
							System.out.println(" 지출 : " + (0 - outMoney[i]) + "원");
							System.out.println(" 잔액 : " + balance + "원");
							System.out.println(" 내역 : " + list[i]);
							System.out.println();
						}
						System.out.println(" 전체 지출 금액 : " + totalOutMoney + "원");
						break;
					default://잘못된 메뉴 입력
						System.out.println("잘못 누르셨습니다.");
						break;						
				}
			}		
	}

}
