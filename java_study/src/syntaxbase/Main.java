package syntaxbase;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		Capsule_Tanaka1 aa = new Capsule_Tanaka1();
		aa.setI(12345);
		aa.output();
		int b =aa.getI();
		
		System.out.println(b);
		
		// 継承関係を確認する
		Human1 human = new Human1();
		
		human.wighat = 70.0;
		human.hight = 1.6;
		
		// BMIを計測
		double bmi = human.calBmi(human.wighat, human.hight);
		System.out.println(bmi);
		
		human.age = 10;
		human.weight = 100;
		
		human.output(human.age, human.weight);
		
		HumanAbstractExtends aaa = new HumanAbstractExtends();
		aaa.method();
		
		

		

	}

}
