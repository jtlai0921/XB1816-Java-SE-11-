//�d��IP��}�çP�_����
import java.net.*;
public class WORK18_01{
    public static void main(String[] args){
        try{
            //�̨ϥΪ̿�J������W�٫إߤ@��InetAddress����
            InetAddress[] ip=InetAddress.getAllByName(args[0]);
            System.out.println("����W�١G"+ip[0].getHostName());
            //�L�X�Ӻ������IP��}
            for(int i=0;i<ip.length;i++){
                System.out.println("��"+(i+1)+"��IP��}�G"+ip[i].getHostAddress());
            }
            System.out.print("�O�_����������G");
            if(ip[0].isSiteLocalAddress())
                System.out.println("�O");
            else
                System.out.println("���O");
            //�ҥ~�B�z
        }catch(UnknownHostException e){
            System.out.println("�䤣��ҫ��w������W�١C");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("�п�J����W�١C");
        }	
    }
}
