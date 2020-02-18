/* 示範兩種呼叫類別方法的方式 */
public class CH04_01 {
	// 類別方法: 輸出 Hello World 字串
	private static void sayhello() {
		System.out.println("Hello World") ;
	}
    // 主程式
	public static void main(String[] args) {
		sayhello();
		CH04_01.sayhello();
	}
}