/* �{���GCH18_01.java
 * �����G�ϥΪ̿�J���}�A�öǦ^IP��}
 */

import java.net.*; //�פJjava.net
public class CH18_01{
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("�п�JIP��}�κ��}");
            System.exit(1);
        }
        String host = args[0];
        try {
            InetAddress inet = InetAddress.getByName(host);
            System.out.println("IP: " + inet.getHostAddress());
            System.out.println("HostName: " + inet.getHostName());
        }
        catch(UnknownHostException e) {   //�ϥΪ̿�J�@�ӥ��Q�䴩�������s��
            System.out.println("Could not find: ' " + host + "'");
        }
    }
}