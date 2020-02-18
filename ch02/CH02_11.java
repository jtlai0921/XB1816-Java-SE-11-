/*檔名：CH02_11.java	
*說明：邏輯運算
*/
public class CH02_11 {
    public static void main(String args[]) {
        int a=15,b=3;
        System.out.println("(a>10)&&(b>5)的傳回值為 "+(a>10&&b>5));
        System.out.println("(a>10)||(b>5)的傳回值為 "+(a>10||b>5));
        System.out.println("(a>10)&(b>5)的傳回值為 "+(a>10&b>5));
        System.out.println("(a>10)|(b>5)的傳回值為 "+(a>10|b>5));
        System.out.println("(a>10)^(b>5)的傳回值為 "+(a>10^b>5));
        System.out.println(" 15 & 3 的傳回值為 "+(a&b));
        System.out.println(" 15 | 3 的傳回值為 "+(a|b));
        System.out.println(" 15 ^ 3 的傳回值為 "+(a^b));
        System.out.println(" ~3 的傳回值為"+(~b));
    }
}