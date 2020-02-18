/*檔案:CH06_07.java
 *說明:字串類別的轉換方法
 */ 
 
public class CH06_07{
    public static void main(String[] args){
  		
        String str=new String("Time creates Hero");//宣告字串
        System.out.println("原來的字串:"+str);	
        System.out.println("轉換後的字串: "+str.toUpperCase());
        char[] ch={'S','t','r','i','n','g',' ','a','r','r','a','y'};//宣告字元陣列
        System.out.println("將字元陣列轉換成字串:"+String.copyValueOf(ch, 7, 5));
        double a=78.54;//宣告double數字
        System.out.println("將數字轉換成字串:"+String.valueOf(a)); 
    }	
}