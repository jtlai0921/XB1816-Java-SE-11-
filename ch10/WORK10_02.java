//利用陣列集合加入不同資料型態
import java.util.*;
public class WORK10_02{
    public static void main(String[] args){
        //宣告變數
        int intVal=2019;
        String strVal1=new String("Happy");
        String strVal2=new String("New");
        String strVal3=new String("Year");
        double doubleVal=99999;
        ArrayList<Comparable> multipleType=new ArrayList<Comparable>();
		
        //新增資料字陣列集合
        multipleType.add(intVal);
        multipleType.add(strVal1);
        multipleType.add(strVal2);
        multipleType.add(strVal3);
        multipleType.add(doubleVal);
		
        //陣列集合方法的應用
        System.out.print("檢查multipleType集合中有無doubleVal物件：");
        System.out.println(multipleType.contains(doubleVal));
        for(int i=0;i<multipleType.size();i++){
            System.out.print("multipleType集合中索引值 "+i+" 的物件值為：");
            System.out.println(multipleType.get(i));
        }
    }
}