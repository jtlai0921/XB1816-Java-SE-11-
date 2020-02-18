//閏年的判斷與應用
public class WORK03_02 {
    public static void main(String args[]) {
        int year=2008;//西元年
        //宣告整數變數
	if(year % 4 !=0) /*如果year不是4的倍數*/
	    System.out.println(year+" 年不是潤年。"); /*則顯示year不是潤年*/
	else if(year % 100 ==0)  /*如果year是100的倍數*/
        {
            if(year % 400 ==0)   /*且year是400的倍數*/
	        System.out.println(year+" 年是潤年。"); 
                /*顯示year是潤年*/
            else      /*否則*/
                System.out.println(year+" 年不是潤年。"); 
                /*則顯示year不是潤年*/
        }	
        else  /*否則*/
            System.out.println(year+" 年是潤年。"); /*則顯示year是潤年*/
   }
}
