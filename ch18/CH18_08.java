import java.net.*;
import java.io.*;
import java.util.Date;

public class CH18_08{
    public static void main(String args[]){
        int ch;
        try{
            URL myURL = new URL("https://www.w3schools.com/html/");
            URLConnection myCnn = myURL.openConnection();

            System.out.println("Date: " + new Date(myCnn.getDate()));
            System.out.println("Content-Type: " + myCnn.getContentType());
            System.out.println("Expires: " + myCnn.getExpiration());

            int len = myCnn.getContentLength();
            System.out.println("Content-Length: " + len);
            if(len > 0){
                System.out.println("---Content---");
                InputStream in = myCnn.getInputStream();
                int num = len;
                while(((ch = in.read())!= -1) && (--num > 0)){
                    System.out.print((char)ch);
                }
                in.close();
            }
            else
                System.out.println("沒有任何參數");
        }
        catch(MalformedURLException urle){
            System.out.println(urle);
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}