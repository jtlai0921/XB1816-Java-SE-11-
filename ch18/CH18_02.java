/* CH18_02�G��@�R�A�]static�^��k 
 */
import java.net.*;
class CH18_02{
    public static void main (String args[]){
        try{
            InetAddress address = InetAddress.getByName("www.hinet.net");
            System.out.println(address);
        }catch (UnknownHostException e){
            System.out.println("�䤣�� www.hinet.net");
        }
    }
}
