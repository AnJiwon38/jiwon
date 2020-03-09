import java.util.Scanner;

public class OperationTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제) -1이 입력될 때까지 반복적으로점수를 입력받아서 평균을 출력하는 프로그램
		//1. 스캐너 만들기
		Scanner scan = new Scanner(System.in);
		
		//2. 사용할 변수 만들기
		//	 점수 입력용 변수 score
		//	 평균 저장 변수 avg
		//	 총점 저장 변수 totalScore
		//	 카운트 변수(입력 횟수 저장 변수) cnt
		int inNum = 0, total = 0, cnt = 0;
		double avg = 0.0f;
		
		//3. 점수 입력
		inNum = scan.nextInt();
		//	 -1이라면/아니라면
		//	 -1이라면 총점을 카운트변수 나눗셈하여 평균 계산.		
		
		while(inNum != -1) {
		// 	 -1이 아니라면 총점에 입력한 점수 더하기.(반복)
				total += inNum;
				inNum = scan.nextInt();
				cnt++;
		}
		
		cnt = -1;
		
		do {//while은 조건을 따지고 실행. do while은 먼저하고, 조건을 따지는것
			total += inNum;
			cnt++;
			inNum = scan.nextInt();
		}while(inNum != -1);
		//원래 while 뒤에는 ; 안 붙는데 do while에서는 ; 붙여줘야함
		
		//4. 평균 출력		
		avg = (double)total/cnt;//정수 연산 -> 실수 연산 형변환해줘야함. 사용하지 않으면 오류 발생.
		System.out.println(cnt + "명 평균은" + avg);
		System.out.printf("%d 명 평균은 %f", cnt, avg);
		//System.out.printf("%d 명 평균은 %d", cnt, avg);로 하면 오류 발생함.
		//printf에서 double을 표현하기 위해서는 %d가 아닌 %f를 사용해줘야함
		
		
		//오류가 많이 발생하는 부분
		//1. 오타(80%)
		//2. ';' 미스
		//	if(조건식); { .... }
		//	switch(정수식); { ... }
		// 	for(초기식;조건식;증감식); { ... }
		//	while(조건식); { ... }
		//	;은 문장이 끝났다는 의미기 때문에
	}
}
