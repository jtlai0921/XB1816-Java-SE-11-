/*檔案:CH06_02.java
 *說明:字元陣列建構法
 */ 

public class CH06_02{
    public static void main(String[] args){
			
        //字元陣列建構法建立字串
        char a[]={'I','L','o','v','e','j','a','v','a'};  //建立字元陣列
        String str1=new String(a);    
        String str2=new String(a,5,4);     
        System.out.println("完整顯示字元陣列a："+str1);
        System.out.println("只顯示a[5]之後的4個字元："+str2+'\n');
		
        char b[]={'I',' ','L','o','v','e',' ','J','a','v','a'};  //建立字元陣列
        String str3=new String(b);    
        String str4=new String(b,6,5);     
        System.out.println("完整顯示字元陣列b："+str3);
        System.out.println("只顯示a[6]之後的4個字元："+str4);

    }
}