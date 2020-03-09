import java.util.Scanner;

public class InfiniteLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("메뉴 출력");
		
		while(true) {//초기화식, 조건식(항상 참인걸로 간주하겠다), 증가식
					//for(;;) = while(true) 동일하게 사용
			System.out.println("1. 입력하기");
			System.out.println("2. 불러오기");
			System.out.println("3. 저장하기");
			System.out.println("4. 출력하기");
			System.out.println("5. 종료하기");
			System.out.print("입력 > ");
			menu = scan.nextInt();
			
			if(menu == 5) {
				break;//반복문을 종료해라!   break은 if에서는 의미없음
			}
			//switch 안의 break는 switch문만 종료하게 되는거라 반복문은 계속 진행됨
			//
			//5번이 switch 안에 있으면 switch문 한번 처리하고 프로그램처리를 진행을 해야되는데
			//5번을 먼저 처리하면 switch문을 처리할 필요가 없기 때문에 먼저 처리해준다.
			
		switch(menu) {
		case 1:
			System.out.println("입력하기 처리");
			break;
		case 2:
			System.out.println("불러오기 처리");
			break;
		case 3:
			System.out.println("저장하기 처리");
			break;
		case 4:
			System.out.println("출력하기 처리");
			break;	
		default:
			System.out.println("입력오류!!");
			break;	
			}
		}		
	}//main 끝
}//class 끝
