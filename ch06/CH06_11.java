/*檔案:CH06_11.java
 *說明:字串緩衝區的各種功能方法
 */ 
public class CH06_11{
    public static void main(String[ ] args){
        StringBuffer sb1=new StringBuffer("Java");//建立一個字串緩衝區物件
        System.out.println("原始字串="+sb1);
        char ch[]={'字','串','緩','衝','區'};//建立一字元陣列
        //新增
        sb1.append(ch,2,3);
        System.out.println("新增字串陣列: "+sb1);
        //刪除
        sb1.delete(4,7);
        System.out.println("刪除字串: "+sb1); 
        //新增
        sb1.append("教學實務");
        System.out.println("新增字串: "+sb1);
        //插入
        sb1.insert(6,"與");
        System.out.println("插入字串: "+sb1); 
        int num=9;
        //插入		
        sb1.insert(4,num);
        System.out.println("插入數字: "+sb1);
        //取代
        sb1.replace(4,8,"取代字串");
        System.out.println("字串取代: "+sb1);
        //反轉
        sb1.reverse();
        System.out.println("字串反轉: "+sb1);				
    }	
}
