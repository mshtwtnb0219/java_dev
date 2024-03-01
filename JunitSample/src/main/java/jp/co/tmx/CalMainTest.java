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
		assertAll(
				() -> assertEquals(20, result),
				() -> assertEquals(35, result)
				);
	}
}

