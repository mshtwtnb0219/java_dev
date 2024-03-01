package jp.co.tmx;

import java.util.Base64;

import sun.misc.BASE64Encoder;

public class test {

	public test() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String a = "あああ";
		String e = Base64.getEncoder().encode(a.getBytes());
	}

}
