/*檔案:CH06_08.java
 *說明:字串串接
 */

public class CH06_08{
    public static void main(String[] args) {
        // 宣告字串物件
        String str1="Power";
        String str2="Point";
		
        // 串接字串方式一
        String str3=str1+str2;
        String str4="Power"+"Point";
		
        // 串接字串方式二
        String str5=str1.concat(str2);
        String str6=str1.concat("Point");
		
        System.out.println("串接字串方式一：");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();
		
        System.out.println("串接字串方式二：");
        System.out.println(str5);
        System.out.println(str6);

    }
}