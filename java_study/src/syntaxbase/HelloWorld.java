package syntaxbase;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		Product apple = new Product("りんご", 1000, 10);
		Product cofee = new Product("り珈琲", 500, 10);
		
		apple.takeOrder(9);
		cofee.takeOrder(100);
		
		
		
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(100);
		System.out.println(0);
		System.out.println(-123);

		System.out.println(2147483648L);

		System.out.println("aaa" + 123);

		System.out.println("テストの平均点:" + ((100 + 90 + 80 + 70 + 30) / 5));

		// 変数の宣言 データ型 変数名
		int test = 123;
		System.out.println(test);

		// 整数型の変数を宣言
		byte testByte = 1;
		short testShort = 12;
		int testInt = 123;
		long testLong = 1234;

		// 浮動小数点型の変数を宣言
		float testFloat = 0.123F; // 代入する値の末尾にはFが必要
		double testDouble = 0.123456;

		// 論理型の変数を宣言
		boolean testBoolean = true;

		// 文字列型・文字型の変数を宣言
		String testString = "Samurai";
		char testChar = 'S';

		// 変数testの値を表示
		System.out.println(testByte);
		System.out.println(testShort);
		System.out.println(testInt);
		System.out.println(testLong);
		System.out.println(testFloat);
		System.out.println(testDouble);
		System.out.println(testBoolean);
		System.out.println(testString);
		System.out.println(testChar);

		int roudomNum = (int) (Math.random() * 10);

		if (roudomNum == 9) {
			System.out.println("あたり");
		} else {
			System.out.println("はずれ");
		}

		switch (roudomNum) {
		case 1, 2, 3, 4, 5, 6, 7, 8 -> System.out.println("あたり");
		default -> System.out.println("はずれ");
		}

		switch (roudomNum) {
		case 1, 2, 3, 4, 5, 6, 7, 8 -> {
			System.out.println("あたり");
			System.out.println("あたり");
		}
		default -> System.out.println("はずれ");
		}

		int ranking = 1; // 順位
		String award;

		// 順位に応じた賞品名を取得
		award = switch (ranking) {
		case 1 -> "金メダル";
		case 2 -> "銀メダル";
		case 3 -> "銅メダル";
		default -> "参加賞";
		};

		// 賞品名を表示
		System.out.println(award);

		// 年齢
		int age = 101;
		String pay;

		pay = switch (age) {
		case 10 -> "100円";
		case 20 -> "200円";
		case 30 -> "300円";
		case 40, 101 -> "400円";
		default -> "500円";
		};
		System.out.println(pay);

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;
			} else {
				System.err.println(i);
			}
		}

		//配列
		int[] a = new int[2];

		a[0] = 100;
		int[] b = { 1, 2, 3, 4, 5, 6, 7, };

		System.out.println(b[2]);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		//拡張for分
		for (int tmp : b) {
			System.out.println(tmp);
		}

		getGreeting();
		cal(100, 200);
		int i = call("あ");
		System.out.println(i);
	}

	// クラス名
	public static void getGreeting() {
		System.out.println("こ");

	}

	// 引数あり
	public static void cal(final int price, int tax) {

		int total = price + 100 + tax;
		System.out.println(total);
	}

	// 戻り値あり
	public static int call(String txt) {

		if (txt.equals("あ")) {
			return 1;
		} else {
			return 2;
		}

	}
	

	
	
	
}
