/* CH18_03�G��@�D�R�A�]non-static�^��k */
import java.net.*;
class CH18_03{
    public static void main (String args[]){
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            System.out.println(address);
        }catch (UnknownHostException e){
            System.out.println("�䤣�� address");
        }
    }
}