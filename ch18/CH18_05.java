import java.io.*;
import java.net.*;

//UDP Server
public class CH18_05{
    private static final int PORT_NUMBER = 8888;

    public static void main(String args[]) throws Exception{
        DatagramPacket data;
        DatagramSocket server;
        byte[] buffer = new byte[20];
        String msg;
        System.out.println("Server�ݶ}�l�����ШD�I");
        //�z�L�j����Server�ݯ����B�@
        for(;;){
            data = new DatagramPacket(buffer, buffer.length);
            server = new DatagramSocket(PORT_NUMBER);
            server.receive(data);  //Server�ݵ���Client�ݽШD
            msg = new String(buffer, 0, data.getLength());
            System.out.print("����T�����G" + msg);
            System.out.println();
            server.close();
      }
   }
}