/* CH18_02：實作靜態（static）方法 
 */
import java.net.*;
class CH18_02{
    public static void main (String args[]){
        try{
            InetAddress address = InetAddress.getByName("www.hinet.net");
            System.out.println(address);
        }catch (UnknownHostException e){
            System.out.println("找不到 www.hinet.net");
        }
    }
}
