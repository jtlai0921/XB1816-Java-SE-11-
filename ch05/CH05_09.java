/*檔案:CH05_09.java
 *說明:Arrays.fill方法實例
 */

import java.util.Arrays;
public class CH05_09{
    public static void main(String[] args){
        int A[]=new int[5];
        System.out.println("預定初始值");
		
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        Arrays.fill(A, 5); 
        System.out.println("修正後初始值");
		
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}