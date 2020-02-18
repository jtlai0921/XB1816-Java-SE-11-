/*程式：CH15_12 管線資料流應用*/
//載入IO套件
import java.io.*;
public class CH15_12{
    //具傳回值的類別成員方法
    public byte setByte(){
        byte myByte = 32;
        System.out.println("myOutput物件輸出的位元組資料為： " + myByte);
        return (myByte);
    }
    //具參數列的類別成員方法
    public void showByte(byte myByte){
        System.out.println("myInput物件接收到的位元組資料為： " + myByte);
    }
    public static void main(String args[]) throws IOException{
        //建立管線輸出入物件
        PipedOutputStream myOutput = new PipedOutputStream();
        PipedInputStream myInput = new PipedInputStream(myOutput);
        //建立主類別物驗
        CH15_12 myObject = new CH15_12();
        //將主類別成員方法的傳回值透過myOutput物件輸出
        myOutput.write(myObject.setByte());
        //將myInput接收的資料導入showByte()方法的參數列中
        myObject.showByte((byte)(myInput.read()));
        myInput.close();
    }
}