import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭(Array)
		// ���࿡ �� ���� �л��� 30���� ��
		// �� �л��� ���� ������ �����ϰ� �ʹ�.
		// ��� �ϸ� �ɱ�?
		// �迭�̶� ������ ����
		// �迭�� ����
		int size = 10;
		
		int score[] = new int[size];
		String grade[];
		
		grade = new String[size];
		
		int num[] = {1, 2, 3, 4, 5};
		//0~4���� 1, 2, 3, 4, 5 �ٷ� �����ϴ� ���� 
		
		// ������ �ѹ��� �������� �� �� ������ ����� ������������ �� �ִ�.
//		int score[] = new int[5];//5��¥�� �迭�� ����� ���. 0~4������ ����.
		// �迭�� ���� ���(����)
		score[0] = 80;//ù���� ������ 0����
		score[10] = 93;//Ư���� ������ �ְ� ���� ��  
		
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
		
		for(int s : score) {//���� for��. �б� ����
			//������ü�� ���ݴٰ� �ٽ� �����ߴٰ� �ݺ��ؼ� for�� �ȿ����� �����
			//���� ���� ���� �� ����� �Ұ���
			//
			//0������ s�� ������� ��ǥ�� score�� �ִ� ���� s�� �ӽ������ϴ� �������� ���.
			//�����Ͱ� ���� ������ �迭�� ���������� ���������� �۾��� ó������
			//
			//�ϴ� �����ϸ� ó������ ������ �� ó���� �ǹǷ� �߰��� ���� �� ���� ������ ����.
			//�߰��� ���ܰ� �ʿ��ϸ� if������ ����ó���� ���־����
			sum += s;
		}
		
		double avg = 0;
		avg = (double)sum/5;
		
		
		System.out.println();
		System.out.println("������ " + sum);
		System.out.println("����� " + avg);
	}
}
