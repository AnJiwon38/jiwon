import java.util.*;

public class UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է� �ν��Ͻ� ����
		Scanner scan = new Scanner(System.in);
		//���� �ν��Ͻ� ����
		Random rand = new Random();
		
		
		//����/���� ���� ���� ����
		boolean success = false;
		
		//���� ��ȣ ����(1~100 ������ �� ����), rand(100)���� �ϸ� 0~99���̿��� ������ ������
		int num = rand.nextInt(100) + 1;
		
		//����� �Է°� ���� ����
		int inNum = 0;
		
		//����� �Է� ���� ������ �� �� �Ǵ� ���
		for(int i = 1; i <= 10; i++) {
			//�Է� �ȳ�
			System.out.print("�Է� > ");
			inNum = scan.nextInt();
			
			//�� ����
			if(num == inNum) {
				//��� ���
				System.out.printf("�õ� Ƚ�� [%d]�� ����", i);
				//�ݺ� ���� ó��
				//i = 10;
				//����/���� ���� ����
				success = true;
				break;//�Ϲ������� break�� ����Ͽ� �ݺ� ����
			}else if(num > inNum) {
				System.out.println("UP!");
			}else if(num < inNum) {//else�� ó���ص� ������µ� ��Ȯ�ϰ� ó���ϱ� ���ؼ�
				System.out.println("DOWN!");
			}
			
		}
		if(success == false) {
			//10�� �õ� ���� �� ���� ����
			//���� �˷��ֱ�
			System.out.println("����! ����" + num);			
		}
	}//main ��

}//Ŭ���� ��
