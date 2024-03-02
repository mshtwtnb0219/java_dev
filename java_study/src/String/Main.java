package String;

public class Main {

	public static void main(String[] args) {

	     String moji1 = "かきく";
	      String moji2 = "かきく";
	      String moji3 = "あいう";
	      String moji4 = "さしす";

	      Integer val1 = 5;
		Integer val2 = 5;
		Integer val3 = 3;
		Integer val4 = 7;

		String moji5 = "ああああ";
		String moji6 = "あああ";
		String moji7 = "いいい";
		String moji8 = "いいいい";

	      //文字列を比較する場合
		System.out.println("文字列を比較する場合");
		System.out.println(moji1.compareTo(moji2));
		System.out.println(moji1.compareTo(moji3));
		System.out.println(moji1.compareTo(moji4));
		   
		//数値を比較する場合
		System.out.println("数値を比較する場合");
		System.out.println(val1.compareTo(val2));
		System.out.println(val1.compareTo(val3));
		System.out.println(val1.compareTo(val4));

	      //文字数が異なる場合
		System.out.println("文字数が異なる場合");
		System.out.println(moji5.compareTo(moji6));
		System.out.println(moji7.compareTo(moji8));

	   }

	}
