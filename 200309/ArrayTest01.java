import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭(Array)
		// ���࿡ �� ���� �л��� 30���� ��
		// �� �л��� ���� ������ �����ϰ� �ʹ�.
		// ��� �ϸ� �ɱ�?
		
		// ������ �ѹ��� �������� �� �� ������ ����� ������������ �� �ִ�.
		int score[] = new int[5];//5��¥�� �迭�� ����� ���. 0~4������ ����.
		// �迭�� ���� ���(����)
		//score[0] = 80;//ù���� ������ 0����
		//score[10] = 93;//Ư���� ������ �ְ� ���� ��  
		
		//System.out.println(score[0]);
		//System.out.println(score[10]);
		//System.out.println(score[1]);
		//������ �־��� 0, 10���� �����ϰ�� ���� 0���� ������
		
		System.out.println("���� �Է� ���α׷�");
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5 ; i++) {//0~4������
			System.out.print((i+1) + "��° �л� ���� : ");//i+1�� ���� ���ֱ� ���ؼ� ��ȣ�� ������
			score[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int j = 0; j < 5 ; j++) {
			sum += score[j];
		}
		
		double avg = 0;
		avg = (double)sum/5;
		
		
		System.out.println();
		System.out.println("������ " + sum);
		System.out.println("����� " + avg);
	}
}
