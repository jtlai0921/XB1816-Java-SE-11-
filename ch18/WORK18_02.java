//�Q��URLŪ���ɮפ��e
import java.net.*;
import java.io.*;
public class WORK18_02{
    public static void main(String[] args){
    //�����ҥ~
    try{
        //�إߤ@��URL����
        URL url=new URL("https://www.hinet.net/");
        BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream()));

        String str;
        //�NŪ����ƦL�X
        while((str=in.readLine())!=null)
            System.out.println(str);
        //�ҥ~�B�z
        }catch(MalformedURLException e){
            System.out.println("URL��}���~�C");
        }catch(IOException e){
            System.out.println("���Ū�����~���~�C");
        }
    }
}