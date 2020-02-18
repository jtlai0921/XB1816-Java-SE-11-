/*檔案:CH03_10.java
 *說明:while敘述應用
 */
public class CH03_10{
    public static void main(String args[ ]){
        int n=1,sum=0;//宣告n的起始值和累加值sum
        //while迴圈開始
        while(n<=10){
            System.out.print("n="+n);
            sum+=n;//計算n的累加值
            System.out.println("\t累加值="+sum);
            n++;
        }
        System.out.println("迴圈結束");	
    }	
}