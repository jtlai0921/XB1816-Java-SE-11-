/* 程式：CH18_04.java
 * 說明：建立伺服端的應用程式
 */

import java.net.*;
import java.io.*;

public class CH18_04{

    public static void main(String args[]) throws Exception{
        goServer server;
        int port;
        BufferedReader reader;
        PrintWriter writer;
        //取得通訊埠，如果沒有取得則結束程式的執行
        if(args.length == 0){
            System.out.println("請輸入伺服端的埠號[port]");
            System.exit(1);   //結束執行的執行
        }
        port = Integer.parseInt(args[0]); //將輸入的port轉換為數值
        server = new goServer(port);      //建立server物件
        reader = new BufferedReader(new InputStreamReader(server.in));
        writer = new PrintWriter(new
                OutputStreamWriter(server.out), true);
    }
}

//建立取得port的類別
class goServer {
    ServerSocket server; //建立ServerSocket物件變數
    Socket client;//建立Socket物件變數
    InputStream in;
    OutputStream out;
    public goServer(int port) {
        try{
            server = new ServerSocket(port);  //建立ServerSocket物件
            while(true){      //判斷是否有客戶端的連線請求
                client = server.accept();   //以accept()方法來接受客戶端的請求
                //取得客戶端的主機位址
                System.out.println("連線來自於：" +
                client.getInetAddress().getHostAddress());
                //以資料流方式取得客戶端的資料
                in = client.getInputStream();
                out = client.getOutputStream();
                //在顯示訊息中加入換行
                String SepLine = System.getProperty("line.separator");
                InetAddress addr = server.getInetAddress().getLocalHost();
                String outData = "Server information: " + SepLine +
                             "Local Host        : " +
                             server.getInetAddress().getLocalHost() + SepLine +
                             "Port              : " + server.getLocalPort();
                byte[] outByte = outData.getBytes();
                out.write(outByte, 0, outByte.length);
            }
        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}