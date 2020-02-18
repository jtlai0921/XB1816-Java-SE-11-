/*檔案:CH10_01.java
 *說明:亂數的使用方法
 */ 
public class CH10_01{
    public static void main(String[] args){
        double a=Math.random();//產生一個double型態的數字
        System.out.println("預設的亂數型態 a="+a);
        System.out.println();
        int[] num=new int[6];
        System.out.println("自己設定大樂透號碼的產生器");
        for(int i=0; i<num.length;i++){
            num[i]=(int)(Math.random()*49+1);//產生號碼
            System.out.print(num[i]+" ");
        }
        System.out.println("\n恭喜中了頭獎2億!!!");
    }	
}