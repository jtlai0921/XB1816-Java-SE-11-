/*檔案:CH06_03.java
 *說明:各種字串類別的基本使用方法
 */ 
 
public class CH06_03{
    public static void main(String[] args){
 		
        String str="天助自助者"; //建立字串物件並初始化
        System.out.println("字串："+str);
        System.out.println("常用方式：length()");
        System.out.println("字串長度："+str.length()+'\n');
 		
        //另一種計算字串物件的方法：字面法
        System.out.println("字面法：");
        int a="天助自助者".length();
        System.out.println("字串長度："+a);
    }	
}