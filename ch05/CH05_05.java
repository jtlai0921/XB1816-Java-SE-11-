/*檔案:CH05_05.java
 *說明:重新配置陣列
 */ 

public class CH05_05{
    public static void main(String[] args){
        int A[]={2,4,6,8,10,12};
        System.out.println("顯示為改變前陣列元素的內容");
        for (int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
		
        A=new int[A.length+1]; 
        System.out.println("顯示為改變後陣列元素的內容");
	for (int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}