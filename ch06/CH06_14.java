/*檔案:CH06_14.java
 *說明:字串緩衝區--刪除字串或字元
 */ 

public class CH06_14{
    public static void main(String[ ] args){
        StringBuffer  sb=new StringBuffer("Hello Java"); 
        System.out.println("示範字串："+sb);
        System.out.println("刪除前面[0~5]的部份字串="+sb.delete(0,5)+'\n');	
		
        StringBuffer  sb2=new StringBuffer("Hello Javaa");
        System.out.println("示範字串："+sb2);
		
        System.out.println("刪除指定字元="+sb2.deleteCharAt(10)+'\n');	
    }
}