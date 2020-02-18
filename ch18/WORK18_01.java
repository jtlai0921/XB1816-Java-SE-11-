//查詢IP位址並判斷網域
import java.net.*;
public class WORK18_01{
    public static void main(String[] args){
        try{
            //依使用者輸入的網域名稱建立一個InetAddress物件
            InetAddress[] ip=InetAddress.getAllByName(args[0]);
            System.out.println("網域名稱："+ip[0].getHostName());
            //印出該網域所屬IP位址
            for(int i=0;i<ip.length;i++){
                System.out.println("第"+(i+1)+"個IP位址："+ip[i].getHostAddress());
            }
            System.out.print("是否為本機網域：");
            if(ip[0].isSiteLocalAddress())
                System.out.println("是");
            else
                System.out.println("不是");
            //例外處理
        }catch(UnknownHostException e){
            System.out.println("找不到所指定的網域名稱。");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("請輸入網域名稱。");
        }	
    }
}
