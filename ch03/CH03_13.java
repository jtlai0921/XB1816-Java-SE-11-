/*檔案:CH03_13.java
 *說明:continue中斷敘述的應用
 */
public class CH03_13{
    public static void main(String args[]){
        int i ,j;
        for(i=1; i<10; i++){
            for(j=1; j<=i; j++){
                if(j==5) continue ;//跳過下面敘述繼續執行迴圈
                System.out.print(j);
            }
            System.out.println();
        }System.out.println();
        out1:
        //設定標籤
           for(i=1; i<10; i++){
               for(j=1; j<=i; j++){
                   if(j==5) continue out1;//回到標籤處繼續
                   System.out.print(j);
               }System.out.println();
           }System.out.println();	
    }	
}