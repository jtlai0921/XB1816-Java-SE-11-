/*檔案:CH10_05.java
 *說明:數值與字串的轉換
 */ 
public class CH10_05{
    public static void main(String[] args){
 		
        System.out.println("數值轉字串");
        Integer I1=20;
        Double D2=4.56;
        String str1=I1.toString();
        String str2=D2.toString();
        String str3=Integer.toBinaryString(20);
        String str4=Integer.toString(20,8);
		
        System.out.println("[Integer -> Sting] str1="+str1);
        System.out.println("[Double -> String] str2="+str2);
        System.out.println("[20的二進位] -> str3="+str3);
        System.out.println("[20的八進位] -> str4="+str4);
        Double a=123.9870;
        System.out.println("將數字轉換成字串:"+String.valueOf(a));//字串類別裡介紹過
		
        System.out.println("\n字串轉數字");
        String s1=new String("123");
        int i1=Integer.parseInt(s1);//將s1字串轉換成int資料型別
        String s2=new String("456");
        int i2=Integer.valueOf(s2).intValue();//將s2字串轉換成int資料型別
        System.out.println("s1="+s1+"\t"+"s2="+s2);
        System.out.println("i1="+i1+"\t"+"i2="+i2);
        System.out.println("s1+5="+(s1+5));
        System.out.println("i1+5="+(i1+5) );
        System.out.println("i2+i1="+(i2+i1));
    }	
}