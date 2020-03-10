import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열(Array)
		// 만약에 한 반의 학생이 30명일 때
		// 각 학생의 국어 성적을 저장하고 싶다.
		// 어떻게 하면 될까?
		// 배열이란 변수의 묶음
		// 배열의 선언
		int size = 10;
		
		int score[] = new int[size];
		String grade[];
		
		grade = new String[size];
		
		int num[] = {1, 2, 3, 4, 5};
		//0~4까지 1, 2, 3, 4, 5 바로 대입하는 형태 
		
		// 선언은 한번에 여러개로 할 수 있지만 사용은 개별적으로할 수 있다.
//		int score[] = new int[5];//5개짜리 배열을 만드는 방법. 0~4번까지 있음.
		// 배열의 공간 사용(대입)
		score[0] = 80;//첫번재 공간을 0번방
		score[10] = 93;//특정한 공간에 넣고 싶을 때  
		
		//System.out.println(score[0]);
		//System.out.println(score[10]);
		//System.out.println(score[1]);
		//위에서 넣어준 0, 10번을 제외하고는 전부 0번이 들어가있음
		
		System.out.println("성적 입력 프로그램");
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5 ; i++) {//0~4번까지
			System.out.print((i+1) + "번째 학생 성적 : ");//i+1을 먼저 해주기 위해서 괄호로 묶어줌
			score[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int j = 0; j < 5 ; j++) {
			sum += score[j];
		}
		
		for(int s : score) {//향상된 for문. 읽기 전용
			//변수자체를 없앴다가 다시 생성했다가 반복해서 for문 안에서만 사용함
			//따로 변수 선언 후 사용은 불가능
			//
			//0번부터 s에 집어넣음 목표가 score에 있는 값을 s에 임시저장하는 목적으로 사용.
			//데이터가 없을 때까지 배열의 마지막까지 내부적으로 작업을 처리해줌
			//
			//일단 시작하면 처음부터 끝까지 다 처리가 되므로 중간에 멈출 수 없는 제약이 있음.
			//중간에 예외가 필요하면 if문으로 예외처리를 해주어야함
			sum += s;
		}
		
		double avg = 0;
		avg = (double)sum/5;
		
		
		System.out.println();
		System.out.println("총점은 " + sum);
		System.out.println("평균은 " + avg);
	}
}
