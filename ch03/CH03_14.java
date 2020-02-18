 /*檔案:CH03_14.java
 *說明:return敘述的應用
 */
public class CH03_14{
    public static void main(String args[]){
        int ans;
        ans=sum(10);//呼叫sum方法
        System.out.println("1~10的加總");
        System.out.println("ans="+ans);
    }
 	
    //sum方法
    static int sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;	
        }
        return sum; //回傳sum變數值
    }	
}