/*�{��CH14_03.java
 *����:throw����@
 **/
import java.io.*;

public class CH14_03{
    public static void main(String[] args) throws IOException{
        try{
            int month;
            BufferedReader buf;
            buf = new BufferedReader(new InputStreamReader(System.in));			
			
            System.out.print("�п�J��� : ");
            month = Integer.parseInt(buf.readLine());			

            if(month<0 | month>12)
                throw new ArithmeticException("�S���o�Ӥ����!!!");
                System.out.println("�z��J������� = "+ month+ "���");				
            }
            catch(ArithmeticException ae){
                System.out.println("catch ArithmeticException...");
                System.out.println(ae.toString());
            }

	}
}