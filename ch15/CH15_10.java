/*�ɮ�:CH15_10
 *����:Ū���ɮ����O�]FileReader�^�ϥΤ�k
 */

import java.io.*;
class CH15_10{
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("FileReader.txt");  //�إ�FileReader����
        BufferedReader bf=new BufferedReader(f);  //Ū�J�w�ľ���
        String x;
        while((x=bf.readLine())!=null){
            System.out.println(x);  //�}�lŪ�����e�r��
        }
        f.close();
    }
}