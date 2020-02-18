import java.io.*;
import java.net.*;

//UDP Client
public class CH18_06{
    private static final int PORT_NUMBER = 8888;

    public static void main(String args[]) throws Exception{
        System.out.print("�п�JIP��}�G");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        String serverIP = in.readLine();
        InetAddress addr = InetAddress.getByName(serverIP);
        while(true){
            System.out.print("�e�X�T��(��J'quit'�����s�u)�G");
            String msgs = in.readLine();
            int myLength = msgs.length();
            byte[] buffer = new byte[myLength];
            buffer = msgs.getBytes();
            DatagramPacket pkt = new DatagramPacket(
                  buffer, myLength, addr, PORT_NUMBER);
            DatagramSocket skt = new DatagramSocket();
            if(msgs.equalsIgnoreCase("quit"))
                break;
            skt.send(pkt);
            skt.close();
        }
    }
}