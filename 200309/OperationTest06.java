import java.util.Scanner;

public class OperationTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����) -1�� �Էµ� ������ �ݺ������������� �Է¹޾Ƽ� ����� ����ϴ� ���α׷�
		//1. ��ĳ�� �����
		Scanner scan = new Scanner(System.in);
		
		//2. ����� ���� �����
		//	 ���� �Է¿� ���� score
		//	 ��� ���� ���� avg
		//	 ���� ���� ���� totalScore
		//	 ī��Ʈ ����(�Է� Ƚ�� ���� ����) cnt
		int inNum = 0, total = 0, cnt = 0;
		double avg = 0.0f;
		
		//3. ���� �Է�
		inNum = scan.nextInt();
		//	 -1�̶��/�ƴ϶��
		//	 -1�̶�� ������ ī��Ʈ���� �������Ͽ� ��� ���.		
		
		while(inNum != -1) {
		// 	 -1�� �ƴ϶�� ������ �Է��� ���� ���ϱ�.(�ݺ�)
				total += inNum;
				inNum = scan.nextInt();
				cnt++;
		}
		
		cnt = -1;
		
		do {//while�� ������ ������ ����. do while�� �����ϰ�, ������ �����°�
			total += inNum;
			cnt++;
			inNum = scan.nextInt();
		}while(inNum != -1);
		//���� while �ڿ��� ; �� �ٴµ� do while������ ; �ٿ������
		
		//4. ��� ���		
		avg = (double)total/cnt;//���� ���� -> �Ǽ� ���� ����ȯ�������. ������� ������ ���� �߻�.
		System.out.println(cnt + "�� �����" + avg);
		System.out.printf("%d �� ����� %f", cnt, avg);
		//System.out.printf("%d �� ����� %d", cnt, avg);�� �ϸ� ���� �߻���.
		//printf���� double�� ǥ���ϱ� ���ؼ��� %d�� �ƴ� %f�� ����������
		
		
		//������ ���� �߻��ϴ� �κ�
		//1. ��Ÿ(80%)
		//2. ';' �̽�
		//	if(���ǽ�); { .... }
		//	switch(������); { ... }
		// 	for(�ʱ��;���ǽ�;������); { ... }
		//	while(���ǽ�); { ... }
		//	;�� ������ �����ٴ� �ṉ̀� ������
	}
}
