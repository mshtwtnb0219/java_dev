package atCoderProject;

import java.util.Scanner;

public class ABC086A {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 標準入力
		Scanner sc = new Scanner(System.in);
		
		
		// 数値の入力
		int a = sc.nextInt();
		
		// 数値の入力2
		
		int b = sc.nextInt();
		
		// 積
		int c = a * b;
		
		if (c % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		

	}

}
