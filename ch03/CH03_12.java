/*檔案:CH03_12.java
 *說明:break中斷敘述的應用
 */
public class CH03_12{
    public static void main(String args[]){
        int i ,j;
        System.out.println("跳出單層迴圈");
        for(i=1; i<10; i++){
            for(j=1; j<=i; j++){
                if(j==5) break ;//跳出單層迴圈
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();

        System.out.println("跳出雙層迴圈");
        out1://設定標籤
        for(i=1; i<10; i++){
            for(j=1; j<=i; j++){
                if(j==5) break out1;//跳出標籤
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();
    }	
}