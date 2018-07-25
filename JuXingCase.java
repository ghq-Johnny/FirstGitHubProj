package LianXi;

import java.util.Scanner;

//动态打印一个矩形，要求长和宽的具体值都是从键盘输入的
public class JuXingCase {
	public static void main(String[] args) {
		//先从控制台输入矩形的长和宽
		Scanner input = new Scanner(System.in);
		System.out.println("请输入矩形的长：");
		int Chang = input.nextInt();
		System.out.println("请输入矩形的宽：");
		int Kuan = input.nextInt();
		//开始打印矩形的图案，使用“*”来显示长和宽的边
		//实心的
		for (int i = 0; i < Kuan; i++) {
			for (int j = 0; j < Chang; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------分割线-------------------------");
		//空心的
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
