package Exception;

public class main {

	public static void main(String[] args) {

		int[] in = new int[3];

		try {
			in[0] = 100;
			in[1] = 100;
			in[2] = 100;
			in[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("配列のインデックスが範囲外");
		} finally {
			System.out.println("処理の終了");
		}

	}

}
