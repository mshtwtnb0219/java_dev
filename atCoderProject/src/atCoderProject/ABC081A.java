package atCoderProject;

import java.util.Scanner;

public class ABC081A {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 0;

		// 標準にゅりょく
		Scanner sc = new Scanner(System.in);

		while(true) {
			int a1 = sc.nextInt();
			if(Integer.toString(a1).length() == 3) {
				
				for (char a2 : String.valueOf(a1).toCharArray()) {
					if(a2 == 1) {
						a = a +1;
					}
					
				}
				break;
			}
			
			
		}
		System.out.println(a);
	
		
		
	
//		int mas = sc.nextInt();
//		// 3桁入力されるまで繰り返し
//		while (Integer.toString(mas).length() == 3) {
//			// マス目の入力
//			int mas1 = sc.nextInt();
//			if(Integer.toString(mas1).length() == 3) {
//				// ビー玉判定
//				for (char c: String.valueOf(mas1).toCharArray()) {
//					if(c == 1) {
//						a++;				
//					}
//				}
//			}
//			break;
//		}
//
//		System.err.println(a);

	}
}

