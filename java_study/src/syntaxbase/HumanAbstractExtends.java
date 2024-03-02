package syntaxbase;

public class HumanAbstractExtends extends HumanAbstract {
	
	public static void main(String[] args) {
		HumanAbstractExtends aaa = new HumanAbstractExtends();
		aaa.method();
	}
	

	// 抽象メソッドを具体化
	void method() {
		System.out.println("具体化");
	}
}
