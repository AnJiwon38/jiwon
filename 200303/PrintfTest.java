import java.util.Scanner;

public class PrintfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printf : ������� ���� ���
		//("����� ����", �������� ����..)
		
		//System.out.println("���ڿ�");   			//println - �޼ҵ�  System Ŭ�����̸�
/*		Scanner scan = new Scanner(System.in);		//System.in : Ű����κ��� �Է¹��� �� �ִ� ��ġ
		//��ü = �ν��Ͻ�(instance)  
		//new Ű����� �ν��Ͻ��� �����ϴ� ��ɾ�
				
		int num = 10;
		
		num = scan.nextInt();						//�޼ҵ�� �Է��� �ʿ��� �Ͱ� �ʿ���� �� ����
													//Ŭ���� ������ ���赵, ���赵�� ���� ����� �ν��Ͻ�
		
		System.out.printf("num ������ ���� %d", num); //������ ��쿡�� %d ���
*/		
		
		
		//������ 2�� ���
		int dan = 2;
		int m = 1;
		System.out.printf("2��%n");							//%n�� �ٹٲ� ����
		System.out.printf("================%n");
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);//%nd n�ڸ� ���ڿ� ���缭 �迭����
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d%n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %-5d*%n", dan, m, dan*m);//%-nd �ڿ����� n�ڸ� ���ڿ� ���缭 �迭����
		
		
		//�ݾ� ���
		System.out.printf("��÷ %,d��%n",100000000);
		//���� ��ü(0����) ��� => 10�ڸ� �ȿ��� ������� 0���� ä����
		System.out.printf("%010d%n", 123);
		//10���� -> 16���� ���			//octa
		System.out.printf("%x%n", 123);
		//10���� -> 8���� ���				//hexa
		System.out.printf("%o%n", 123);
		
		
		//�Ǽ� ���
		System.out.printf("%5.3f", 103.14);//�տ� �ִ� ���ں��� �ڿ� �ִ� ���ڸ� �켱ó���ؾ���
		
		//System.out.printf("%f", 3.14);		//�⺻ 6�ڸ����� ���ڸ��� 0���� ä����
		
		System.out.print("dd");
	}

}
