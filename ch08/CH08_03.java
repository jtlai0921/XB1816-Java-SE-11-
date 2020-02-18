/*檔案:CH08_03.java 繼承外部類別範例*/
//宣告程式主要類別並繼承於外部程式的TotalSum類別
public class CH08_03 extends TotalSum{
    //加入自訂類別方法
    //主程式
    public void average(int x, int y){
        int total = (x + y) / 2;
        System.out.println(x + " 與 " + y + " 的平均值為： " + total);
    }
    public static void main(String[] args){
        //實作主程式類別物件
        CH08_03 myObject = new CH08_03();
        //呼叫繼承TotalSum類別的成員方法
  	TotalSum.totalSum(100, 30);
  	//呼叫自訂的成員方法
  	myObject.average(100, 30);
    }
}