/*程式:CH14_04.java 
 *說明:throws的實作
 **/
public class CH14_04{
    public static void main(String[] args){
        try{		
            int month;
			
            for(month=1; month<=12; month++){
                if(month == 3)
                    message();
                else
                    System.out.println("現在為"+ month+ "月份");
                }
            }
		
            catch(IllegalAccessException iae){
                System.out.println(iae.toString());
            }
        }
	
        static void message() throws IllegalAccessException{
            //設定發生了IllegalAccessException例外
            throw new IllegalAccessException("三月份是春天來臨的季節...");
    }
}