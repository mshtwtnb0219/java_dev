package atCoderProject;

import java.util.Scanner;

public class PracticeA {

	public PracticeA() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		// 標準入力
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		String s = sc.next();

		// 出力
		System.out.println((a+b+c) + " " + s);
	}

}

