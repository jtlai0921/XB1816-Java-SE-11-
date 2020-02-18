/*程式：CH15_02 System.err物件應用*/
public class CH15_02{
    public static void main(String args[]){
        //宣告變數
        int divisor = 5;
        int dividend = 100;
        //設置無限迴圈
        while(true){
            if(divisor == 0){
                //列出錯誤訊息
                System.err.println("程式錯誤,中斷執行..除數不得為零!!");
                break;
            }
            //輸出執行結果
            System.out.println(dividend + " 除以 " + divisor 
	                   + " 等於 " + (dividend / divisor));
            divisor --;
        }
    }
}