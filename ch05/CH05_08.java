/*檔案:CH05_08.java
 *說明:物件陣列
 */

public class CH05_08{
    public static void main(String[] args){
        String A[]={"忠孝","仁愛","信義","和平"};
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(" A[0]="+A[0]);
        System.out.println(" A[1]="+A[1]);
        System.out.println();
		
        A[1]=A[2];
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(" A[1]="+A[1]);
        System.out.println();
    }
}