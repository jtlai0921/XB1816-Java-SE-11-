/*檔案:CH08_01.java 類別重複使用範例*/
public class CH08_01{
    //主程式
    public static void main(String[] args){
        new TotalSum();
        //呼叫TotalSum.java的成員方法totalSum
        TotalSum.totalSum(100, 30);
    }	
}