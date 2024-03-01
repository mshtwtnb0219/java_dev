package jp.co.tmx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalMainTest {

	@Test
	void test() {
		

		CalMain calMain = new CalMain();
		
		int op = 1; // 加算
		int val1 = 10;
		int val2 = 25;
		
		// テスト対象メソッド実行
		int result = calMain.Cal(op, val1, val2);
		
		// 実行結果確認
		assertEquals(35, result);
	}
	
	@Test
	void test1() {
		

		CalMain calMain = new CalMain();
		
		int op = 2; // 減算
		int val1 = 50;
		int val2 = 25;
		
		// テスト対象メソッド実行
		int result = calMain.Cal(op, val1, val2);
		
		// 実行結果確認
		assertEquals(25, result);
	}
	
	@Test
	void test2() {
		

		CalMain calMain = new CalMain();
		
		int op = 3; // 乗算
		int val1 = 10;
		int val2 = 25;
		
		// テスト対象メソッド実行
		int result = calMain.Cal(op, val1, val2);
		
		// 実行結果確認
		assertEquals(250, result);
	}
	
	@Test
	void test3() {
		

		CalMain calMain = new CalMain();
		
		int op = 4; // 徐算
		int val1 = 100;
		int val2 = 25;
		
		// テスト対象メソッド実行
		int result = calMain.Cal(op, val1, val2);
		
		// 実行結果確認
		assertEquals(4, result);
	}
	
	@Test
	void test4() {
		

		CalMain calMain = new CalMain();
		
		int op = 5; // default
		int val1 = 100;
		int val2 = 25;
		
		// テスト対象メソッド実行
		int result = calMain.Cal(op, val1, val2);
		
		// 実行結果確認
		assertEquals(100, result);
	}

}
