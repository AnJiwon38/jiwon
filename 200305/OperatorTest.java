import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		//반복문
		//특정 명령문(들)을 반복처리 해주는 명령.
		//for문, while문이 있음.
		
		//1. for문
		//지정된 횟수만큼 반복
		//for(초기식;조건식;증감식){ ... }
		
		//현재 i가 10 이하인지 확인하고 조건에 맞았으면 반복해야될 내용을 실행하고, 그 다음에 증가해준다.
		//		  1      2        4 
		for(int a = 1; a <= 10 ; a++) {//2씩 증가시킬 때 2+=i 사용하고 실행하면 홀수만 나옴
			System.out.println(a);//3
		}
		//1 -> 2 -> 3 -> 4 -> 
		
		//구구단 출력 프로그램
		//2단 출력
				
//		for(int i = 1; i <= 9; i++){
//			 	System.out.printf("2 * %d = %d%n", i, 2*i);
		
			 	
		System.out.println("구구단");
		for(int i = 1; i<= 9; i++) {
			for(int j = 2; j<= 9; j++) {
				System.out.printf("%d * %d = %2d  ",  j, i, i*j);
			}
			System.out.println();
			
		}
		
		//5명의 성적을 입력하는 프로그램
		int a01 = 0;
		int a02 = 0;
		int a03 = 0;
		int a04 = 0;
		int a05 = 0;
		
		Scanner scan = new Scanner(System.in);
		

		//예제
		//1~100까지의 합 구하기
		//
//		int sum = 0;//합을 저장할 변수
//		for( i = 1; i <= 100 ; i++) {
//			sum += i;
//		}
//		System.out.printf("1부터 100까지의 합 : %d%n\n", sum);
		
		
		
		//중첩된 for문
//		for(int k = 0; k < 5; k++) {
//			for(int l = 0; l < 5 ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("숫자 : ");
//		int num = scan.nextInt();
//		
//		for(int k = 0; k <= num ; k++) {
//			for(int l = 0; l < k ; l++) {
//				System.out.print("☎");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("숫자 : ");
//		num = scan.nextInt();
//		for(int k = num; k > 0 ; k--) {
//			for(int l = 1; l <= k ; l++) {
//				System.out.print("☏");
//			}
//			System.out.println();
//		}
		
//		System.out.println("숫자 : ");
//		num = scan.nextInt();
		
		int num=5;
		for(int i=0;i<num;i++){
		    for(int j=num-1;j>i;j--){
		        System.out.printf(" ");
		    }
			    
		    for(int j=0;j<2*i+1;j++){
			System.out.printf("*");
		    }
		    System.out.printf("\n");
		    
		}
	}}


	
	//초기화를 해주는 경우 : 대입보다 꺼내쓰는게 먼저일 경우


