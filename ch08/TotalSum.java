/*檔案:TotalSum.java 
 *說明:加總計算*/

public class TotalSum{
    //類別方法
    public static void totalSum(int x, int y){
        int Total = x + y;
        System.out.println(x + " + " + y + " = " + Total);
    }
    //主程式
    public static void main(String [ ] args){
        new TotalSum();
        TotalSum.totalSum(3, 5);
    }
}