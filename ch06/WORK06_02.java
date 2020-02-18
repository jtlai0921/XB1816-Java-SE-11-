//使用endsWith()方法來過濾檔案名稱
public class WORK06_02 {  
    public static void main(String[] args) {  
        String[] extension = {"文宣.doc", "廣告信.pdf", 
               "新聞稿.doc", "演講.ppt", "邀請函.doc"};
        System.out.println("使用endsWith()方法來過濾屬於Word文件的檔案"); 
        for(int i = 0; i < extension.length; i++) 
            if(extension[i].endsWith("doc")) 
                System.out.println(extension[i]);  
   }
}