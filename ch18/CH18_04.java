/* �{���GCH18_04.java
 * �����G�إߦ��A�ݪ����ε{��
 */

import java.net.*;
import java.io.*;

public class CH18_04{

    public static void main(String args[]) throws Exception{
        goServer server;
        int port;
        BufferedReader reader;
        PrintWriter writer;
        //���o�q�T��A�p�G�S�����o�h�����{��������
        if(args.length == 0){
            System.out.println("�п�J���A�ݪ���[port]");
            System.exit(1);   //�������檺����
        }
        port = Integer.parseInt(args[0]); //�N��J��port�ഫ���ƭ�
        server = new goServer(port);      //�إ�server����
        reader = new BufferedReader(new InputStreamReader(server.in));
        writer = new PrintWriter(new
                OutputStreamWriter(server.out), true);
    }
}

//�إߨ��oport�����O
class goServer {
    ServerSocket server; //�إ�ServerSocket�����ܼ�
    Socket client;//�إ�Socket�����ܼ�
    InputStream in;
    OutputStream out;
    public goServer(int port) {
        try{
            server = new ServerSocket(port);  //�إ�ServerSocket����
            while(true){      //�P�_�O�_���Ȥ�ݪ��s�u�ШD
                client = server.accept();   //�Haccept()��k�ӱ����Ȥ�ݪ��ШD
                //���o�Ȥ�ݪ��D����}
                System.out.println("�s�u�Ӧ۩�G" +
                client.getInetAddress().getHostAddress());
                //�H��Ƭy�覡���o�Ȥ�ݪ����
                in = client.getInputStream();
                out = client.getOutputStream();
                //�b��ܰT�����[�J����
                String SepLine = System.getProperty("line.separator");
                InetAddress addr = server.getInetAddress().getLocalHost();
                String outData = "Server information: " + SepLine +
                             "Local Host        : " +
                             server.getInetAddress().getLocalHost() + SepLine +
                             "Port              : " + server.getLocalPort();
                byte[] outByte = outData.getBytes();
                out.write(outByte, 0, outByte.length);
            }
        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}