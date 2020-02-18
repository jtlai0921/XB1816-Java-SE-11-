//陣列的應用-樂透彩號產生器
public class WORK05_03{
    public static void main(String[] args){
        //資料宣告
        int[] intArray=new int[6];//存放產生的亂數號碼
        int intRandCount=0;       //產生亂數計數器
        int intBackCount=0;       //產生亂數時返回檢查用計數器
        boolean boolRepeat=false; //返回檢查時判斷是否重複
		
        //利用迴圈產生6個號碼
        for(int i=0;i<6;i++){
            intRandCount++;
            intArray[i]=(int)(Math.random()*42+1);
            intBackCount=i-1;
            boolRepeat=false;
            while(i>0 && intBackCount>=0){
                if(intArray[i]==intArray[intBackCount]){
                    i--;
                    boolRepeat=true;
                    break;
                }	
                intBackCount--;	
            }
            //當檢查無重複時，印出該數字
            if(!boolRepeat)
                System.out.println("第 "+(i+1)+" 個數字為："+intArray[i]);
        }
        System.out.println("亂數總共產生了 "+intRandCount+" 次");
    }
}