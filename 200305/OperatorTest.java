import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		//�ݺ���
		//Ư�� ��ɹ�(��)�� �ݺ�ó�� ���ִ� ���.
		//for��, while���� ����.
		
		//1. for��
		//������ Ƚ����ŭ �ݺ�
		//for(�ʱ��;���ǽ�;������){ ... }
		
		//���� i�� 10 �������� Ȯ���ϰ� ���ǿ� �¾����� �ݺ��ؾߵ� ������ �����ϰ�, �� ������ �������ش�.
		//		  1      2        4 
		for(int a = 1; a <= 10 ; a++) {//2�� ������ų �� 2+=i ����ϰ� �����ϸ� Ȧ���� ����
			System.out.println(a);//3
		}
		//1 -> 2 -> 3 -> 4 -> 
		
		//������ ��� ���α׷�
		//2�� ���
				
//		for(int i = 1; i <= 9; i++){
//			 	System.out.printf("2 * %d = %d%n", i, 2*i);
		
			 	
		System.out.println("������");
		for(int i = 1; i<= 9; i++) {
			for(int j = 2; j<= 9; j++) {
				System.out.printf("%d * %d = %2d  ",  j, i, i*j);
			}
			System.out.println();
			
		}
		
		//5���� ������ �Է��ϴ� ���α׷�
		int a01 = 0;
		int a02 = 0;
		int a03 = 0;
		int a04 = 0;
		int a05 = 0;
		
		Scanner scan = new Scanner(System.in);
		

		//����
		//1~100������ �� ���ϱ�
		//
//		int sum = 0;//���� ������ ����
//		for( i = 1; i <= 100 ; i++) {
//			sum += i;
//		}
//		System.out.printf("1���� 100������ �� : %d%n\n", sum);
		
		
		
		//��ø�� for��
//		for(int k = 0; k < 5; k++) {
//			for(int l = 0; l < 5 ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("���� : ");
//		int num = scan.nextInt();
//		
//		for(int k = 0; k <= num ; k++) {
//			for(int l = 0; l < k ; l++) {
//				System.out.print("��");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("���� : ");
//		num = scan.nextInt();
//		for(int k = num; k > 0 ; k--) {
//			for(int l = 1; l <= k ; l++) {
//				System.out.print("��");
//			}
//			System.out.println();
//		}
		
//		System.out.println("���� : ");
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


	
	//�ʱ�ȭ�� ���ִ� ��� : ���Ժ��� �������°� ������ ���


