package syntaxbase;

public class Houman {

	// 体重
	double wighat;
	// 身長
	double hight;

	//年齢フィールド
	int age = 100;
	//体重フィールド
	double weight;

	// BMIを計算するメソッド
	public double calBmi(double wi, double hi) {
		return this.wighat / (this.hight * this.hight);
	}

	//出力メソッド
	public void output(int paramAge, double paramWeight) {
		System.out.println(paramAge);
		System.out.println(paramWeight);
	}
	
	// 体重を出力する
	public void wightOutput() {
		System.out.println(this.age);
	}

}