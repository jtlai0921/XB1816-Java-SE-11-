/*檔案:CH06_09.java
 *說明:擷取字串字元
 */

public class CH06_09{
    public static void main(String[] args){
        // 宣告字串物件
        String str1="Java Script";
        System.out.println(str1+'\n');  //'\n'是換行
		
        //擷取指定位置的字元
        char a1=str1.charAt(5);
        char a2=str1.charAt(4);
        System.out.println("指定位置[5]，並取得其字元是："+a1);
        System.out.println("指定位置[4]，並取得其字元是："+a2+'\n');
		
        //取得子字串
        String str2=str1.substring(5,11);
        System.out.println("指定取得字串的範圍，(5,11)其子字串是："+str2+'\n');
		
        //分離字串並存入指定陣列中
        String str3="Java2";
        char b[]=str3.toCharArray();
        System.out.println("轉存入之陣列內容：");
        System.out.println(b[0]+"、"+b[1]+"、"+b[2]+"、"+b[3]+'\n');
		
        //依索引值轉入
        char c[]=new char[6];   //先宣告字元陣列
        str3.getChars(0,4,c,2);
        System.out.println("陣列內容：");
        System.out.println(c[0]+"、"+c[1]+"、"+c[2]+"、"+c[3]+"、"+c[4]+ "、"+c[5]+'\n');
    }
}