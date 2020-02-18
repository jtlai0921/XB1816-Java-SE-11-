/*�{���GCH15_05 StringReader/Writer����*/
//���JIO�M��
import java.io.*;
public class CH15_05{
    //�إߦ������
    private static String inputStr = "Test String";
    private static char[] inputChar = {'T','e','s','t',' ','C','h','a','r','A','r','r','a','y'};
    public static void main(String args[]) throws IOException{
        //�إ�Writer����
        StringWriter myWriter = new StringWriter();
        //�N�r��P�r���}�C�����g�J�w�İϤ�
        myWriter.write(inputStr);
        myWriter.write(" & ");
        myWriter.write(inputChar);
        //�N�w�İϤ��e��X��s��myStr�ܼ�
        String myStr = myWriter.toString();
        System.out.println("���U�O��StringWriter�Ҽg�J���r�ꤺ�e�G");
        System.out.println(myStr);
        //�ѷ�myStr�ܼƫإߨ��Reader����
        StringReader readerCounter = new StringReader(myStr);
        StringReader myReader = new StringReader(myStr);
        System.out.println("\n���U�O��StringReader��Ū�����r�ꤺ�e�G");
        //Ū���ȩ̀ǿ�X�r�ꤺ�e��
        while(readerCounter.read() != -1){
            System.out.print((char)(myReader.read()));
        }
        System.out.println("\n");
    }
}