/*�{��:CH14_02.java
 *����:�ҥ~�B�z����@
 **/
import java.io.*;

public class CH14_02{
    public static void main(String[] args) throws IOException{
        try{
            int i;
            BufferedReader buf;
            buf = new BufferedReader(new InputStreamReader(System.in));
			
            System.out.print("�п�J��� i : ");
            i = Integer.parseInt(buf.readLine());//�NŪ��������নint���O
			
            System.out.println("i = "+ i);		
        }
        //�ҥ~�B�z���Ĥ@��catch�϶�
        catch(NumberFormatException nfe){
            System.out.println("catch NumberFormatException...");
            System.out.println(nfe.toString());//��XNumberFormatException���T��		
        }
        //�ҥ~�B�z���ĤG��catch�϶�
        catch(Exception e){
            System.out.println("catch Exception...");
            System.out.println(e.toString());//��XException���T��		
        }	
        //�̫ᥲ�w�|���檺�϶�
        finally{
            System.out.println("\n����finally�϶�...");
            System.out.println("�{�����浲��!!!");
        }
    }
}