 /*檔案:CH03_16.java
 *說明:實作 for-each-- 多維陣列
 */

public class CH03_16{
    public static void main(String[] ages){
        int A[][]=new int[2][3];   //宣告多維陣列
        for (int i=0;i<2;i++){    //設定陣列中的值，並且讀取陣列值
            for (int j=0;j<3;j++){
                A[i][j]=i+j;
                System.out.print(A[i][j]+" ");
            }
        }
        System.out.println('\n');
        for (int i[]:A){     // 改用for-each迴圈讀取陣列資料
            for (int j:i){
                System.out.print(j+" ");
            }
        }
        System.out.println('\n');
    }
}