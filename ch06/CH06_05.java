/*檔案:CH06_05.java
 *說明:各種字串類別的基本使用方法
 */ 
 
public class CH06_05{
    public static void main(String[] args){
 		
        String str="Happy Birthday to you";
 		
        //取代字串
        String str_new=str.replace("you","Joe");
        System.out.println("取代前："+str);
        System.out.println("取代後："+str_new+'\n');
 		
        //去除空白部份
        String str2="   Happy Birthday to you  ";
        System.out.println("去除空白前，字串長度："+str2.length());
        String str2_new=str.trim();
        System.out.println("去除前："+str2);
        System.out.println("去除後："+str2_new);
        System.out.println("去除空白後，字串長度："+str2_new.length());
    }	
}