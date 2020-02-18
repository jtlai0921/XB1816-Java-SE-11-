/*檔案:CH06_10.java
 *說明:字串緩衝區的基本應用方法
 */ 
public class CH06_10{
    public static void main(String[ ] args){
        StringBuffer sb2=new StringBuffer(30);//建立一個容量為30的字串緩衝區物件
        String str=new String("Java Coffer");
        StringBuffer sb3=new StringBuffer(str);//利用字串物件建立字串緩衝區物件
        //取得長度與容量資料
        System.out.println("sb2的長度:"+sb2.length());
        System.out.println("sb2的容量"+sb2.capacity());
        System.out.println("sb3字串緩衝區的內容:"+sb3);
        System.out.println("sb3的長度:"+sb3.length());
        System.out.println("sb3的容量"+sb3.capacity());
 		
        sb3.setCharAt(4,'-');//設定特定字元
        System.out.println("\n重新設定字串緩衝區內第4個字元:"+sb3);
    }	
}