/* CH18_03：實作非靜態（non-static）方法 */
import java.net.*;
class CH18_03{
    public static void main (String args[]){
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            System.out.println(address);
        }catch (UnknownHostException e){
            System.out.println("找不到 address");
        }
    }
}