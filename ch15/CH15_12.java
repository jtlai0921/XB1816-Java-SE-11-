/*�{���GCH15_12 �޽u��Ƭy����*/
//���JIO�M��
import java.io.*;
public class CH15_12{
    //��Ǧ^�Ȫ����O������k
    public byte setByte(){
        byte myByte = 32;
        System.out.println("myOutput�����X���줸�ո�Ƭ��G " + myByte);
        return (myByte);
    }
    //��ѼƦC�����O������k
    public void showByte(byte myByte){
        System.out.println("myInput���󱵦��쪺�줸�ո�Ƭ��G " + myByte);
    }
    public static void main(String args[]) throws IOException{
        //�إߺ޽u��X�J����
        PipedOutputStream myOutput = new PipedOutputStream();
        PipedInputStream myInput = new PipedInputStream(myOutput);
        //�إߥD���O����
        CH15_12 myObject = new CH15_12();
        //�N�D���O������k���Ǧ^�ȳz�LmyOutput�����X
        myOutput.write(myObject.setByte());
        //�NmyInput��������ƾɤJshowByte()��k���ѼƦC��
        myObject.showByte((byte)(myInput.read()));
        myInput.close();
    }
}