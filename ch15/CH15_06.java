/*�{���GCH15_06 BufferedReader����*/
//���JIO�M��
import java.io.*;
public class CH15_06{
    private static String myStr;
    public static void main(String args[])throws IOException{
        //�إ�BufferedReader����å[�H��@
        BufferedReader myReader;
        myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("�п�J��r�G  ");
        //�N�Ȧs�Ϥ������s���ܼƤ���
        myStr = myReader.readLine();
        System.out.println("�z�ҿ�J����r���G " + myStr);
    }
}