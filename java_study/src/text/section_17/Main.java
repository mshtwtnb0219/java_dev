package text.section_17;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		// （　＾ω＾）・・・大事やで
		// メソッドの実行は子クラスのインスタンスのメソッドが実行される
		// Keisyo_Kato6インスタンスを親クラスのKeisyo_Human6へ代入	
		Keisyo_Human6 k = new Keisyo_Kato6();
		// Keisyo_Tanaka6インスタンスを親クラスのKeisyo_Human6へ代入	
		Keisyo_Human6 t = new Keisyo_Tanaka6();

		//Keisyo_Kato7インスタンスのoutputメソッドを実行	
		k.output();
		//Keisyo_Tanaka7インスタンスのoutputメソッドを実行
		t.output();

	}

}
