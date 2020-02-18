import java.net.*;
import java.io.*;

public class CH18_07{
    public static void main(String args[]){
        try{
            URL myURL = new URL("http://www.hinet.net");
            System.out.println("Protocol: " + myURL.getProtocol());
            System.out.println("Port    : " + myURL.getPort());
            System.out.println("Host    : " + myURL.getHost());
            System.out.println("Path    : " + myURL.getPath());
            System.out.println("File    : " + myURL.getFile());
        }
        catch(MalformedURLException urle){
            System.out.println(urle);
        }
        /* catch(IOException ioe){
            System.out.println(ioe);  
        }  */
    }
}