/*檔案:CH06_12.java
 *說明:字串緩衝區--長度和容量
 */ 

public class CH06_12{
    public static void main(String[] args){
        StringBuffer  sb=new StringBuffer("Programming is funny."); 
			
        System.out.println("示範字串："+sb);
        // 計算字串長度
        System.out.println("字串長度="+sb.length());
        // 計算字串容量
        System.out.println("字串容量="+sb.capacity());
    }
}