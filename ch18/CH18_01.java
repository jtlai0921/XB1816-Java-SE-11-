/* 程式：CH18_01.java
 * 說明：使用者輸入網址，並傳回IP位址
 */

import java.net.*; //匯入java.net
public class CH18_01{
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("請輸入IP位址或網址");
            System.exit(1);
        }
        String host = args[0];
        try {
            InetAddress inet = InetAddress.getByName(host);
            System.out.println("IP: " + inet.getHostAddress());
            System.out.println("HostName: " + inet.getHostName());
        }
        catch(UnknownHostException e) {   //使用者輸入一個未被支援的網路連絡
            System.out.println("Could not find: ' " + host + "'");
        }
    }
}