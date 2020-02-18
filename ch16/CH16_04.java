//程式：CH16_04.java
//利用陣列集合加入不同資料型態
import java.util.*;
public class CH16_04{
    public static void main(String[] args){
        //宣告變數
        ArrayList<String> alArray =new ArrayList<String> ();		
    
        //新增資料至陣列集合
        alArray.add("忠孝");
        alArray.add("仁愛");
        alArray.add("信義");
        alArray.add("和平");
		
        //陣列集合方法的應用
        System.out.print("檢查alArray集合中有無指定物件：");
        System.out.println(alArray.contains("仁愛"));
        for(int i=0;i<alArray.size();i++){
            System.out.print("alArray集合中索引值 "+i+" 的物件值為：");
            System.out.println(alArray.get(i));
        }
    }
}