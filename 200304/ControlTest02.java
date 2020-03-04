import java.util.Scanner;

public class ControlTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건문 switch
		//다중 분기를 위해 태어난 제어문.
		//case, default(else) - switch 문을 쓰려면 꼭 사용해야함
		//기타 제어문인 break. - 필요한 경우에만 사용
		
		Scanner scan = new Scanner(System.in);
		//11 - sk, 16 - kt, 19 - LG
//		System.out.print("번호 입력 : ");
//		int num = scan.nextInt();
//		
//		switch(num) {
//		case 11: 
//			System.out.println("SK입니다.");
//			//추가 명령어 작성
//			break;							//중괄호로 묶어주지 않아도 됨. break는 항상 case의 마지막에 사용해야 함.
//		case 16:
//			System.out.println("KT입니다.");
//			//추가 명령어 작성
//			break;
//		case 19:
//			System.out.println("LG입니다.");
//			//추가 명령어 작성
//			break;
//		default:							//case문에 해당되지 않은 나머지는 default에 처리됨
//			System.out.println("기타 등등입니다.");
//			//추가 명령어 작성
//			break;
//		}
			


		//학점 변환 프로그램(switch문)
		//성적 -> 학점
		//90점 이상 : A
		//80점 이상 : B
		//70점 이상 : C
		//60점 이상 : D
		//나머지 : F
		
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		String grade = null;
		
		
		switch(score/10) {
		case 10:
			grade ="A+";
			break;
		case 9:
			if(score%10>=5) {
				grade ="A+";
			}
			else {
				grade ="A0";
			}
			break;
		case 8:
			if(score%10>=5) {
				grade ="B+";
			}
			else {
				grade ="B0";
			}
			break;
		case 7:
			if(score%10>=5) {
				grade ="C+";
			}
			else {
				grade ="C0";
			}
			break;
		case 6:
			if(score%10>=5) {
				grade ="D+";
			}
			else {
				grade ="D0";
			}
			break;
		default :
			grade = "F";
			break;
		}
		
		
		System.out.println("학점 : " + grade);
		//case1, case2, case3, default가 있을 때 break이 없는데 case1에 해당하는 경우 
		//case1, case2, case3, default에 해당하는 내용이 다 포함된다.
		//case2나 3에 해당하는 경우는 앞의 case를 건너 뛰고 해당 내용부터 default값까지 포함된다.
		//그러므로 break을 써주지 않으면 필요없는 내용도 포함이 되기 때문에 사용을 해주어야한다.
		
		//수업시간에 했던 정답
		System.out.print("점수 입력 : ");
		int score1 = scan.nextInt();
		String grade1 = null;
		
		switch(score1/10) {
		case 10:
		case 9:
			grade1 = "A";
			break;
		case 8:
			grade1 = "B";
			break;
		case 7:
			grade1 = "C";
			break;
		case 6:
			grade1 = "D";
			break;
		default :
			grade1 = "F";
			break;
		}
		System.out.println("학점 : " + grade1);
	}

}
