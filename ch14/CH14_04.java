/*�{��:CH14_04.java 
 *����:throws����@
 **/
public class CH14_04{
    public static void main(String[] args){
        try{		
            int month;
			
            for(month=1; month<=12; month++){
                if(month == 3)
                    message();
                else
                    System.out.println("�{�b��"+ month+ "���");
                }
            }
		
            catch(IllegalAccessException iae){
                System.out.println(iae.toString());
            }
        }
	
        static void message() throws IllegalAccessException{
            //�]�w�o�ͤFIllegalAccessException�ҥ~
            throw new IllegalAccessException("�T����O�K�Ѩ��{���u�`...");
    }
}