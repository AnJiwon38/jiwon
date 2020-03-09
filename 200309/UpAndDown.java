import java.util.*;

public class UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		//난수 인스턴스 생성
		Random rand = new Random();
		
		
		//성공/실패 여부 저장 변수
		boolean success = false;
		
		//맞출 번호 생성(1~100 사이의 값 생성), rand(100)으로 하면 0~99사이에서 나오기 때문에
		int num = rand.nextInt(100) + 1;
		
		//사용자 입력값 저장 변수
		int inNum = 0;
		
		//사용자 입력 값과 생성값 비교 후 판단 출력
		for(int i = 1; i <= 10; i++) {
			//입력 안내
			System.out.print("입력 > ");
			inNum = scan.nextInt();
			
			//비교 판정
			if(num == inNum) {
				//결과 출력
				System.out.printf("시도 횟수 [%d]번 성공", i);
				//반복 종료 처리
				//i = 10;
				//성공/실패 여부 저장
				success = true;
				break;//일반적으로 break을 사용하여 반복 종료
			}else if(num > inNum) {
				System.out.println("UP!");
			}else if(num < inNum) {//else로 처리해도 상관없는데 명확하게 처리하기 위해서
				System.out.println("DOWN!");
			}
			
		}
		if(success == false) {
			//10번 시도 실패 후 게임 종료
			//정답 알려주기
			System.out.println("실패! 정답" + num);			
		}
	}//main 끝

}//클래스 끝
