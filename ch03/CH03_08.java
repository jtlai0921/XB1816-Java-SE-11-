/*檔案:CH03_08.java
 *說明:for迴圈應用
 */
public class CH03_08{
    public static void main(String args[]){
        System.out.println("1~10間奇數的和");
        int sum=0;//設定總和的起始值為0
        System.out.println("所有的奇數:");
        for(int i=1; i<=10;i++){
            if(i%2!=0){//利用if敘述確定i為奇數
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("答案="+sum);//輸出答案	
    }	
}