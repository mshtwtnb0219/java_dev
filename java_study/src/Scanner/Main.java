package Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scannerクラスのオブジェクトを生成する
		Scanner sc = new Scanner(System.in);
		// 空白文字手前まで入力した内容を取得する
		String str = sc.next();
		// 空白文字まで入力した内容を取得する
		String str1 = sc.nextLine();
		// 入力した数値の内容を取得する
		int str2 = sc.nextInt();
		// 入力した小数点を含む数値の内容を取得する
		double str3 = sc.nextDouble();
		// 入力内容を出力する
		System.out.println(str);
		// Scannerオブジェクトをクローズする
		sc.close();
		
		
		

	}

}
