/*檔案:CH10_06.java
 *說明:Vector類別的使用方法
 */ 
import java.util.Vector;
public class CH10_06{
    public static void main(String[] args){
        Vector<Comparable> ve=new Vector<Comparable>();//建立一個空Vector物件
        int I=5;
        float F=(float) 12.23;
        //新增元素
        ve.addElement("Java");
        ve.add(I);
        ve.addElement(F);
        ve.addElement(45.68);
        System.out.println("Vector目前的內容= "+ve);
        System.out.println("Vector目前的容量= "+ve.capacity());
        System.out.println("Vectour目前的大小= "+ve.size());
        System.out.println("Vector中第3個索引值的元素= "+ve.elementAt(3));
        System.out.println("移除元素F的結果為: "+ve.removeElement(F));
        System.out.println("Vector目前的內容= "+ve);
        ve.insertElementAt("Hello",2);//插入元素
        System.out.println("Vector目前的內容= "+ve);
        ve.trimToSize();//整合容量與大小
        System.out.println("Vector目前的容量= "+ve.capacity());
        System.out.println("Vectour目前的大小= "+ve.size());
        System.out.println("Vector中最後一個元素= "+ve.lastElement());
        String str=ve.toString();
        System.out.println("字串的內容= "+str);
    } 	
}