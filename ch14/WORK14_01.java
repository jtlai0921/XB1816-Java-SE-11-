//����:finally�϶��ϥ�
import java.io.*;
public class WORK14_01
{
    static int count = 1;
    static int sum = 0;
    public static void main(String args[]) throws IOException
    {
        //�L���j��
        while(true)
        {
            int value;
            //try�϶�
            try
            {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("�п�J��"+count+"�ӼƦr�G");
                value = Integer.parseInt(buf.readLine());
                sum = sum + value;
                System.out.println("�ثe���`�Ƭ��G"+ sum);
                ++count;
            }
            //catch�϶�
            catch(NumberFormatException Object)
            {
                System.out.println("�п�J��ƫ��A�ƭȮ榡�A�_�h�L�k�i��p��");
            }
            //finally�϶�
            finally
            {
                //�j�餤�_�P�_
                if (count > 5)
                {
                    System.out.println("�w�s��֥[5�ӼƦr�A�{�����`����");
                    break;
                }
            }
        }
    }
}