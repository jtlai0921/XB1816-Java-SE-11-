/*檔案:CH05_04.java
 *說明:各種陣列使用方法
 */ 

public class CH05_04 {
    public static void main(String[] args) {
        int twoDarr[][]={{15,48,44,11},
		         {12,78,56,49},
		         {55,24,31,98}};
        int threeDarr[][][]={{{2,4,6,8},{1,3,5,7},{5,10,15,20}},
		              {{3,6,9,18},{4,8,12,16},{0,0,0,0}}};
		
        System.out.println("二維陣列輸出結果");
        System.out.println(twoDarr[0][0]+" "+twoDarr[0][1]+" "+twoDarr[0][2]);
        System.out.println(twoDarr[1][0]+" "+twoDarr[1][1]+" "+twoDarr[1][2]);
        System.out.println(twoDarr[2][0]+" "+twoDarr[2][1]+" "+twoDarr[2][2]);
        System.out.println("隨機挑選二維陣列元素");
        System.out.println("twoDarr[2][0]="+twoDarr[2][0]);
        System.out.println("twoDarr[1][2]="+twoDarr[1][2]);
        System.out.println();
        System.out.println("三維陣列輸出結果");
        System.out.println("隨機挑選三維陣列元素");
        System.out.println("threeDarr[1][0][1]="+threeDarr[1][0][1]);
        System.out.println("threeDarr[1][2][3]="+threeDarr[1][2][3]);
        System.out.println("threeDarr[0][2][0]="+threeDarr[0][2][0]);
    }
}