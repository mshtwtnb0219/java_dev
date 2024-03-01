package jp.co.tmx;

public class CalMain {


	/**
	 * 四則演算用のメソッド
	 * 
	 * @param op 四則演算の内容
	 * @param valL 計算値1
	 * @param valR 計算値2
	 * @return 計算結果
	 */

	public int Cal(int op, int val1 ,int val2) {

		int result = 0;  
		switch(op) {

		case 1:
			// 加算
			result = val1 + val2;
			break;

		case 2:
			// 減算
			result = val1 - val2;
			break;

		case 3:
			// 乗算
			result = val1 * val2;
			break;

		case 4:
			// 除算 
			result = val1 / val2;
			break;

		default:
			result = 100;
		}
		
		// 計算結果をコンソールの出力
		System.out.println(result);
		return result;
	}
}
