/*�{��:CH14_10.java
 *����:�ۭq�ҥ~���O����@
 **/

public class CH14_10{
    public static void main(String[] args){
        try{
            int day;			
            for(day=1; day<10; day++){
                if(day > 7)//�@�P���W�L�C�ѫh���ͨҥ~
                    throw new myException("�P�� "+day+", �@�ӬP���u���C��!!!");					
                }				
            }
		
            catch(myException myE){
                System.out.println(myE.toString());
            }			
    }
}
//�ۭq�ҥ~���O
class myException extends Exception{
    private static final long serialVersionUID = 1L;

    public myException(){
        super();
    }
	
    public myException(String message){
        super(message);
    }
}