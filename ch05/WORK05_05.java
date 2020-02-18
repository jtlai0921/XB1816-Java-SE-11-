/*檔案:WORK05_05.java
 *說明:Arrays類別的使用方法
 */ 
import java.util.Arrays;
public class WORK05_05{
    public static void main(String[] args){
        //建立一字串陣列
        String[] name={"王建民","陳金鋒","曹錦輝","郭泓志",
 		       "羅國輝","胡金龍","陳鏞基","彭政閔"};
        String[] copyname=new String[name.length];
        System.out.println("原始陣列= ");
        for(int i=0; i<name.length; i++)
            System.out.print("["+name[i]+"] ");
        System.out.println();
 		
        System.out.println("\n[複製陣列]....");
        System.arraycopy(name,0,copyname,0,8);//複製陣列
        System.out.println("\n比較兩陣列");
        //比較陣列
        if(Arrays.equals(name,copyname))
            System.out.println("原始與複製陣列相等");
        else 
            System.out.println("原始與複製陣列不等");
        Arrays.sort(name);//陣列排序
        System.out.println("\n原始陣列排序後= ");
        for(int i=0; i<name.length; i++)
            System.out.print("["+name[i]+"] ");
        System.out.println();
        if(Arrays.equals(name,copyname))
            System.out.println("原始與複製陣列相等");
        else 
            System.out.println("原始與複製陣列不等");
        //陣列搜尋
        int index=Arrays.binarySearch(name,"李奕詩");
        if(index>0) System.out.println("\n在陣列中第"+(index+1)+"個元素找到[李奕詩]");
        System.out.println("\n將元素填入陣列");
        Arrays.fill(name,4,5,"謝佳賢");//將字串填入name陣列中的第4個索引值
        for(int i=0; i<name.length; i++)
            System.out.print("["+name[i]+"] ");
        System.out.println();
    } 	
}