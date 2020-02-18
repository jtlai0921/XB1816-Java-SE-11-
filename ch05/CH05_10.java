/*檔案:CH05_10.java
 *說明:Arrays.equals方法實例
 */

import java.util.Arrays;

public class CH05_10{
    public static void main(String[] args){
        int A[]={55,24,31,98};
        int B[]={55,24,31,98};
        int C[]={45,2,3,88,77};
		
        System.out.println(" A[]和B[]是否相同："+Arrays.equals(A,B));
        System.out.println(" A[]和C[]是否相同："+Arrays.equals(A,C));
        System.out.println(" C[]和B[]是否相同："+Arrays.equals(C,B));
		
    }
}