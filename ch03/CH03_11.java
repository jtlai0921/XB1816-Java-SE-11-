/*檔案:CH03_11.java
 *說明:do while敘述的應用
 */
public class CH03_11{
    public static void main(String args[]){
        int n=40,m=180;
        int temp=0;//作為交換n與m的功能
        System.out.println("n="+n+",m="+m); 
        //do while迴圈開始		
        do{
            temp=m%n;
            m=n;
            n=temp;
        }while(n!=0 );//檢查條件運算式
        System.out.println("兩數的最大公因數="+m);
    }	
}