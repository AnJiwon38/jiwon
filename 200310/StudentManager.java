import java.util.Scanner;

public class StudentManager {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생 관리 프로그램
		// 1. 이름
		// 2. 학과
		// 3. 연락처
		// 4. 학번
		// 5. 평균
		final int MAX = 3;
		// final 더 이상 변경할 수 없다는 의미의 상수. 상수 - 고정된 값
				
		String names[] = new String[MAX];
		String major[] = new String[MAX];
		String phone[] = new String[MAX];
		String sNumber[] = new String[MAX];
		float avg[] = new float[MAX];
		// final Max 값을 하나만 바꿔줌으로써 다른 변수들도 다 변경되므로 상수를 사용한다.
		
		int select = 0;//메뉴 입력값 저장 변수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- 학생 관리 프로그램 --");
		
		while(true) {
			System.out.println("<< 메뉴 >>");
			System.out.println("1. 정보 입력 ");// 입력 처리 메소드
			System.out.println("2. 정보 출력 ");// 출력 처리 메소드
			System.out.println("3. 종료 ");
			System.out.print("선택> ");
			select = scan.nextInt();
//			String selstr = scan.nextLine();
//			int select = Integer.parseInt(selstr);//parse - 해석하다. 문자열을 숫자로 해석 후 추출해서 사용. 문자열 -> 정수

			//문자열로 받은거 다
			//0이 아니라 select를 return하도록
//			while(true) {
//				select = printMenu();
			
			
			//먼저 처리할 메뉴 : 종료
			if(select == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
			switch(select) {
			case 1://입력메뉴
				//서브 타이틀 출력 
				System.out.println("학생 등록");
				for(int i = 0; i < MAX; i++) {
					System.out.println("-------------------");
					//scan.nextLine();//enter skip해줌
					System.out.print("이름 : ");
					names[i] = scan.nextLine();
					System.out.print("학과 : ");
					major[i] = scan.nextLine();
					System.out.print("연락처 : ");
					phone[i] = scan.nextLine();
					System.out.print("학번 : ");
					sNumber[i] = scan.nextLine();
					System.out.print("평균 : ");
					//avg[i] = scan.nextFloat();
					String fStr = scan.nextLine();
					avg[i] = Float.parseFloat(fStr);
					//문자열 -> 실수 변환하는 방법
					//avg[i] = (데이터 자료형).parseFloat(fStr);
				}
				//숫자라면 1, 2, 3 따로따로 들어가게됨
				//키보드에 임시로 저장하는 버퍼가 있음. 잠깐 시간의 텀을 둬서
				//숫자형만 취급함. a~z, A~Z는 취급을 안 함. enter가 눌리면 입력이 끝났다고 인지함
				//nextLine에서 문자열 받는 것들은 enter도 문자라고 인식을 함
				//scan에서 enter가 들어오면 입력이 끝났다고 인식을 하기 때문에 오류가 발생함
				//숫자를 받고 문자를 받게되면 enter가 남아서 입력처리가 되지 않음
				//=> enter를 없애면 문제 해결됨(1.scan.nextLine(); 2.문자열로만 전부다 입력 받음, 숫자일 경우에는 변환해줌)
				break;
			case 2://출력메뉴
				System.out.println();
				for(int i = 0; i < MAX; i++) {
					System.out.println("-------------------");
					//scan.nextLine();//enter skip해줌
					System.out.print(" 이름 : " + names[i]);
					System.out.print(" 학과 : " + major[i]);
					System.out.print(" 연락처 : " + phone[i]);
					System.out.print(" 학번 : " + sNumber);
					System.out.print(" 평균 : " + avg[i]);
				}
				break;
			default://잘못된 메뉴 입력
				System.out.println("잘못 누르셨습니다.");
				break;
			}
		
	}
	
}//main method

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
