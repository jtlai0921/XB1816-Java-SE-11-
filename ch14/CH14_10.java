/*程式:CH14_10.java
 *說明:自訂例外類別的實作
 **/

public class CH14_10{
    public static void main(String[] args){
        try{
            int day;			
            for(day=1; day<10; day++){
                if(day > 7)//一星期超過七天則產生例外
                    throw new myException("星期 "+day+", 一個星期只有七天!!!");					
                }				
            }
		
            catch(myException myE){
                System.out.println(myE.toString());
            }			
    }
}
//自訂例外類別
class myException extends Exception{
    private static final long serialVersionUID = 1L;

    public myException(){
        super();
    }
	
    public myException(String message){
        super(message);
    }
}