//����:FileInputStream�ϥ�
import java.io.*;
public class WORK15_01
{
    private static String myPath, myFileData;
    public static void main(String args[]) throws IOException 
    {       
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("�ɮצW�١G");
        myPath = buf.readLine();
        System.out.println("\n�ɮ׸�Ƥ��e�p�U\n");
        //��@FileInputStream����
        FileInputStream myFileIS = new FileInputStream(myPath);
        int myDataSize = myFileIS.available();
        byte[] myData = new byte[myDataSize];
        myFileIS.read(myData);
        myFileData = new String (myData, 0, myDataSize);
        //��ܸ��
        System.out.println(myFileData);
        myFileIS.close();
    }
}