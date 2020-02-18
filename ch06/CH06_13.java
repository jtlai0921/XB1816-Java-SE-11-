/*檔案:CH06_13.java
 *說明:字串緩衝區--取得部份字串
 */ 

public class CH06_13{
    public static void main(String[] args){
        StringBuffer  sb=new StringBuffer("Hello Java"); 
			
		
        char a[]=new char[12];
        sb.getChars(6,10,a,0);
        System.out.println("取得部份字串="+sb);
    }
}