/*�{���GCH15_04 CharArrayReader/Writer����*/
//���JIO�M��
import java.io.*;
public class CH15_04{
    //�إߦ������
    private static String inputStr = "Test String";
    private static char[] inputChar = {'T','e','s','t',' ','C','h','a','r','A','r','r','a','y'};
    public static void main(String args[]) throws IOException{
        //�إ�Writer����
        CharArrayWriter myWriter = new CharArrayWriter();
        //�N�r��P�r���}�C�����g�J�w�İϤ�
        myWriter.write(inputStr);
        myWriter.write(" & ");
        myWriter.write(inputChar);
        //�N�w�İϤ��e��X��s��myChar�ܼ�
        char[] myChar = myWriter.toCharArray();
        System.out.println("���U�O��CharArrayWriter�Ҽg�J���r���}�C���e�G");
        System.out.println(myChar);
        //�ѷ�myChar�ܼƫإߨ��Reader����
        CharArrayReader readerCounter = new CharArrayReader(myChar);
        CharArrayReader myReader = new CharArrayReader(myChar);
        System.out.println("\n���U�O��CharArrayReader��Ū�����r���}�C���e�G");
        //Ū���ȩ̀ǿ�X�r���}�C���e��
        while(readerCounter.read() != -1){
            System.out.print((char)(myReader.read()));
        }
        System.out.println("\n");
    }
}