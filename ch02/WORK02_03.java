// 自動型態轉換與強制型態轉換的比較
public class WORK02_03 {
    public static void main (String args[]) {
        int i=100, j=3; /* 定義整數變數 i 與 j */
        float Result;      /* 定義浮點數變數 Result */
        System.out.println("自動型態轉換的執行結果");
        Result=i/j;       /* 自動型態轉換 */
        System.out.println("Result=i/j="+i+"/"+j+"="+Result);
        System.out.println("-----------------------------------------");    
        System.out.println("強制型態轉換的執行結果");
        Result=(float) i / j;  /* 強制型態轉換 */
        System.out.println("Result=(float)i/(float)j="+i+"/"+j+"="+Result);
        System.out.println("-----------------------------------------");   
    }
}