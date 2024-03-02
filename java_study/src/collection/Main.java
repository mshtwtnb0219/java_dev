package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		// ArrayListの宣言
		ArrayList<String> array = new ArrayList<>();
		// 要素の追加
		array.add("test");
		array.add("test1");
		array.add("test2");
		
		// 要素の削除
		array.remove(0);
		
		// ArrayListの中身を取得
		for(int i=0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		
		// HashMapの宣言
		HashMap<Integer ,String> map = new HashMap<Integer,String>();
		// 要素の追加と取得
		map.put(0,"テスト" );
		System.out.println(map.get(0));
		// 要素の削除
		map.remove(0);
		System.out.println(map.get(0));

		
	}

}