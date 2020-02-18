/*檔案:CH05_06.java
 *說明:Arrayclone 陣列複製
 */ 

public class CH05_06{
    public static void main(String[] args){
        int A[]={2,4,6,8,10,12};
        System.out.println("複製前陣列元素的內容");
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int B[]=new int[A.length];
        B=(int[])A.clone();
        System.out.println("複製後陣列元素的內容");
        for (int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}