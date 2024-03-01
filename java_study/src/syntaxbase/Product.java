package syntaxbase;

public class Product {

	// フィールド値
	private String name = ""; // 商品名
	private int price = 0; // 価格
	private int stock = 0; //在庫数

	// コンストラクタ
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;

		System.out.println("【商品データ生成】" + this.name);
		System.out.println("価格：" + this.price +
				"円（税込）／在庫数：" + this.stock);

	}
	
	// 注文を受けて在庫数を更新する
	public void takeOrder(final int number) {
        System.out.println("【注文処理開始】");
        System.out.println("商品名：" + this.name );
        System.out.println("単品価格：" + this.price + "円（税込）" );
        System.out.println("注文数：" + number +
                           "／在庫数：" + this.stock );
        
        // 注文が在庫数を超えていたら購入を不可
        if (this.stock < number) {
        	System.out.println("購入不可");
        	return;
        }
        
        // 購入金額の計算
        int total = this.price * number;
        System.out.println("合計金額：" + total);
        
        // 在庫数の更新
        this.stock -= number;
        System.out.println("在庫数："+ this.stock);
        
        
        
		
	}

}
