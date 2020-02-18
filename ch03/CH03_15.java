 /*檔案:CH03_15.java
 *說明:實作 for-each
 */

public class CH03_15{
    public static void main(String[] ages){
        int A[]={1,2,3,4,5,6,7,8,9};
        char B[]={'H','a','p','p','y'};
        System.out.println("數字陣列"); // 傳統for迴圈讀取陣列資料
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println('\n');
        System.out.println("字元陣列");
        for (int i=0;i<B.length;i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println('\n');
        System.out.println("數字陣列"); // 新增for-each迴圈讀取陣列資料
        for (int i:A){
            System.out.print(i+" ");  //直接讀取陣列中的元素值
        }
        System.out.println('\n');
        System.out.println("字元陣列");
        for (char i:B){
            System.out.print(i+" ");// 因為陣列B的元素是字元，所以i必須宣告成char
        }
        System.out.println('\n');
    }
}