/*檔案:CH05_07.java
 *說明:陣列的複製方法
 */ 
public class CH05_07{
    public static void main(String[] args){
  		
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[5];
        //迴圈的方式
        for(int i=0; i<arr1.length; i++)
            arr2[i]=arr1[i];
        //輸出
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr2[i]+" ");
        }System.out.println();	
        char[] arr3=new char[]{'a','r','r','a','y'};
        char[] arr4=new char[arr3.length];//以arr3的陣列長度為大小
        arr4=(char[])arr3.clone();//clone方式
        //輸出
        for(int i=0; i<arr1.length; i++) {
        System.out.print(arr4[i]+" ");
        }System.out.println();
        //建立字串陣列
        String[] str1=new String[]{"勸君莫惜金縷衣",
				   "勸君惜取少年時",
				   "花開堪折直須折",
				   "莫待無花空折枝"};
        System.out.println("金縷衣 (杜秋娘)");
        for(int i=0; i<str1.length; i++)
            System.out.println(str1[i]);
        System.out.println();
        String[] str2=new String[]{"1","2","3","4"};//建立字串陣列
        System.arraycopy(str1,0,str2,1,2);//arraycopy方式
        //輸出
        for(int i=0; i<str2.length; i++)
            System.out.println(str2[i]);
    }	
}