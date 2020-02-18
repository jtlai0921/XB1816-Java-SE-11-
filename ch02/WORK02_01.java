// 多重邏輯運算子的應用與範例實作
public class WORK02_01 {
    public static void main (String args[] ) {
        int a=7,b=8,c=9; /*宣告a、b及c三個整數變數，並指定初始值*/
        System.out.println("a<b && b<c || c<a = "+(a<b && b<c || c<a)); 
        /* 先計算「a<b && b<c」，然後再將結果與「c<a」進行OR的運算 */  
        System.out.println("!(a<b) && b<c || c<a = "+(!(a<b) && b<c || c<a));
    }
}