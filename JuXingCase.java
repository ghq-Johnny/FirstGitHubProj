package LianXi;

import java.util.Scanner;

//��̬��ӡһ�����Σ�Ҫ�󳤺Ϳ�ľ���ֵ���ǴӼ��������
public class JuXingCase {
	public static void main(String[] args) {
		//�ȴӿ���̨������εĳ��Ϳ�
		Scanner input = new Scanner(System.in);
		System.out.println("��������εĳ���");
		int Chang = input.nextInt();
		System.out.println("��������εĿ�");
		int Kuan = input.nextInt();
		//��ʼ��ӡ���ε�ͼ����ʹ�á�*������ʾ���Ϳ�ı�
		//ʵ�ĵ�
		for (int i = 0; i < Kuan; i++) {
			for (int j = 0; j < Chang; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------�ָ���-------------------------");
		//���ĵ�
		for (int i = 0; i < Kuan; i++) {
			if (i==0 || i==(Kuan-1)) {
				for (int j = 0; j < Chang; j++) {
					System.out.print("*");
				}
			}else {
				for (int j = 0; j < Chang; j++) {
					if (j==0 || j==(Chang-1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
