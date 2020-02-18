// 多重邏輯運算子的應用與範例實作
public class WORK02_02 {
    public static void main (String args[]) {
        int bit_test=12;/* 定義整數變數 (00001100) */
        int bit_test1=7;/* 定義整數變數 (00000111)*/
        System.out.println("bit_test= "+bit_test+"  bit_test1= "+bit_test1);
        System.out.println("----------------------------------------------");
        /* 執行 AND,OR,XOR 位元運算 */ 
        System.out.println("執行 AND 運算的結果:"+(bit_test & bit_test1));
        System.out.println("執行 OR  運算的結果:"+(bit_test | bit_test1));
        System.out.println("執行 XOR 運算的結果:"+(bit_test ^ bit_test1));
    }
}