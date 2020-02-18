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
        System.out.println("Server端開始接受請求！");
        //透過迴圈讓Server端能持續運作
        for(;;){
            data = new DatagramPacket(buffer, buffer.length);
            server = new DatagramSocket(PORT_NUMBER);
            server.receive(data);  //Server端等待Client端請求
            msg = new String(buffer, 0, data.getLength());
            System.out.print("收到訊息為：" + msg);
            System.out.println();
            server.close();
      }
   }
}