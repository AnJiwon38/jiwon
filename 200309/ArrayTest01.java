import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열(Array)
		// 만약에 한 반의 학생이 30명일 때
		// 각 학생의 국어 성적을 저장하고 싶다.
		// 어떻게 하면 될까?
		
		// 선언은 한번에 여러개로 할 수 있지만 사용은 개별적으로할 수 있다.
		int score[] = new int[5];//5개짜리 배열을 만드는 방법. 0~4번까지 있음.
		// 배열의 공간 사용(대입)
		//score[0] = 80;//첫번재 공간을 0번방
		//score[10] = 93;//특정한 공간에 넣고 싶을 때  
		
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
		
		double avg = 0;
		avg = (double)sum/5;
		
		
		System.out.println();
		System.out.println("총점은 " + sum);
		System.out.println("평균은 " + avg);
	}
}
