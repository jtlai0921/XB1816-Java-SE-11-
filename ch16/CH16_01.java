class First<T>{   // 泛型資料
    private T num1;
    private T num2;
		
    void set(T data1, T data2) { // 設定泛型
        this.num1 = data1; 
        this.num2 = data2; 
    }
    public T get() {
        return this.num1; // 回傳第一個參數值
    }
}
public class CH16_01 {	
    public static void main(String[] args) {
        First<Integer> m = new First<Integer>();// 建立整數物件
        m.set(101,7); 
        System.out.println(m.get());	 
        First<Double> d = new First<Double>(); // 建立雙倍經度浮點數物件
        d.set(8.93,9.67);	 
        System.out.println(d.get());	
    }
}