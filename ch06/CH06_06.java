/*檔案:CH06_06.java
 *說明:字串類別的比較方法
 */  
 
public class CH06_06{
    public static void main(String[] args){
		
        String str1="Java2";
        String str2="Java2";
        String str3="JAVA2";
		
        //比較字串是否相同
        boolean a1=str1.equals(str2);
        boolean a2=str2.equals(str3);
        boolean a3=str3.equals(str1);
		
        //比較字串是否相同，但忽略大小寫
        boolean b1=str1.equalsIgnoreCase(str2);
        boolean b2=str2.equalsIgnoreCase(str3);
        boolean b3=str3.equalsIgnoreCase(str1);
		
        //完整比較
        int c1=str1.compareTo(str2);
        int c2=str2.compareTo(str3);
        int c3=str3.compareTo(str1);
		
        //比較字串開頭
        boolean d1=str1.startsWith("Ja");
        boolean d2=str2.startsWith("Ja");
        boolean d3=str3.startsWith("Ja");
		
        //比較字串結尾
        boolean e1=str1.endsWith("a2");
        boolean e2=str2.endsWith("a2");
        boolean e3=str3.endsWith("A2");

        System.out.println("比較字串是否相同："+a1+" "+a2+" "+a3+'\n');
        System.out.println("比較字串是否相同，但忽略大小寫："+b1+" "+b2+" "+b3+'\n');
        System.out.println("完整比較："+c1+" "+c2+" "+c3+'\n');
        System.out.println("比較字串開頭："+d1+" "+d2+" "+d3+'\n');
        System.out.println("比較字串結尾："+e1+" "+e2+" "+e3+'\n');
    }
}